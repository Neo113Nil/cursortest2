package ru.ok.proto.rtmp;

import android.net.Uri;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.player.LivePlayerSource;
import ru.ok.media.utils.SampleQueue;
import ru.ok.media.utils.TimedEvent;
import ru.ok.media.video.H264Util;
import ru.ok.proto.rtmp.RtmpClient;
import ru.ok.proto.rtmp.RtmpMessages;
import ru.ok.proto.rtmp.RtmpPlayer;
import ru.ok.proto.rtmp.amf.AmfConstants;
import ru.ok.proto.rtmp.amf.AmfEntry;
import ru.ok.proto.rtmp.amf.AmfUtil;
import ru.ok.proto.rtmp.amf.entries.AmfNumber;
import ru.ok.proto.rtmp.amf.entries.AmfObject;
import xsna.m06;
import xsna.ne7;
import xsna.tto0;
import xsna.wr;

/* loaded from: classes9.dex */
public class RtmpPlayer {
    private static final int INITIAL_RETRY_INTERVAL = 2000;
    private static final int MAX_RETRY_COUNT = 2;
    private static final String TAG = "RtmpPlayer";
    private volatile SampleQueue<Sample> bufferAudio;
    private final int bufferDeepness;
    private volatile SampleQueue<Sample> bufferVideo;
    private byte[] bufferedFrame;
    private final Map<Byte, byte[]> decoderHeaders;
    private boolean firstFrame;
    private int firstFrameSentCount;
    private int h264LengthSize;
    private final HandlerThread handlerThread;
    private final TimedEvent lastRetryEvent;

    @NonNull
    private final LoggerInterface logger;
    private boolean opusDecoderEnabled;
    private Thread packetProcessorThread;
    private int prevVideoTimestamp;
    private int retryCount;
    private int retryInterval;

    @NonNull
    private PlayerRtmpClient rtmpClient;
    private volatile boolean stopping;

    public static class Sample extends SampleQueue.Sample {
        private final ByteBuffer data;
        private final byte[] headers;
        private final int timestamp;
        private final byte type;

        public Sample(int i, boolean z, byte b, ByteBuffer byteBuffer, byte[] bArr) {
            super(i, z);
            this.timestamp = i;
            this.type = b;
            this.data = byteBuffer;
            this.headers = bArr;
        }

        public ByteBuffer getData() {
            return this.data;
        }

        public byte[] getHeaders() {
            return this.headers;
        }

        @Override // ru.ok.media.utils.SampleQueue.Sample
        public int getTimestamp() {
            return this.timestamp;
        }

        public byte getType() {
            return this.type;
        }
    }

    public RtmpPlayer(@NonNull List<LivePlayerSource> list, @NonNull HandlerThread handlerThread, int i, boolean z, @NonNull LoggerInterface loggerInterface) {
        TimedEvent timedEvent = new TimedEvent();
        this.lastRetryEvent = timedEvent;
        this.retryInterval = 2000;
        this.decoderHeaders = new HashMap(4);
        this.prevVideoTimestamp = -10000;
        this.firstFrame = true;
        this.handlerThread = handlerThread;
        this.opusDecoderEnabled = z;
        LivePlayerSource hQSource = getHQSource(list);
        timedEvent.signal();
        this.bufferDeepness = i;
        this.logger = loggerInterface;
        createClient(hQSource);
    }

    private synchronized void createClient(LivePlayerSource livePlayerSource) {
        Throwable th;
        LivePlayerSource livePlayerSource2;
        try {
            try {
                if (this.opusDecoderEnabled) {
                    try {
                        String str = livePlayerSource.url;
                        try {
                            str = Uri.parse(str).buildUpon().appendQueryParameter("audioFormats", "opus").build().toString();
                        } catch (Throwable unused) {
                        }
                        livePlayerSource2 = new LivePlayerSource(str, livePlayerSource.bitrate, livePlayerSource.isTransparent);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    livePlayerSource2 = livePlayerSource;
                }
                int audioQueueDeepness = getAudioQueueDeepness();
                int max = Math.max(100, this.bufferDeepness - audioQueueDeepness);
                int max2 = Math.max(this.bufferDeepness, audioQueueDeepness + max);
                this.bufferAudio = new SampleQueue<>(500, max, 20);
                this.bufferVideo = new SampleQueue<>(400, max2, 1);
                this.rtmpClient = new PlayerRtmpClient(this.handlerThread, livePlayerSource2, this.bufferAudio, this.bufferVideo);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doProcessPacket(int i, byte b, ByteBuffer byteBuffer, byte[] bArr) throws ProtocolException {
        ByteBuffer allocateVideoBuffer;
        resetRetry();
        if (bArr == null || bArr == this.decoderHeaders.get(Byte.valueOf(b))) {
            bArr = null;
        } else {
            this.decoderHeaders.put(Byte.valueOf(b), bArr);
        }
        if (b == 8) {
            int i2 = (byteBuffer.get() & 255) >>> 4;
            if (i2 == 10) {
                byteBuffer.get();
            }
            if (bArr != null) {
                handleAudioHeader(i2, i, ByteBuffer.wrap(bArr));
            }
            ByteBuffer allocateAudioBuffer = allocateAudioBuffer(i2, byteBuffer.remaining());
            if (allocateAudioBuffer == null) {
                return;
            }
            allocateAudioBuffer.put(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            int position = allocateAudioBuffer.position();
            allocateAudioBuffer.rewind();
            allocateAudioBuffer.limit(position);
            handleAudioFrame(i2, i, byteBuffer);
            sendStoredFrame(i);
            return;
        }
        if (b == 9) {
            byte b2 = byteBuffer.get();
            int i3 = (b2 & 255) >>> 4;
            int i4 = b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
            if (i4 != 7) {
                return;
            }
            int i5 = byteBuffer.getInt();
            int i6 = i5 >> 24;
            int i7 = (i5 << 8) >> 8;
            if (bArr != null) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                int peekLengthSize = H264Util.peekLengthSize(wrap);
                ByteBuffer configFromMP4 = H264Util.configFromMP4(wrap);
                if (configFromMP4 != null) {
                    this.h264LengthSize = peekLengthSize;
                    handleVideoHeader(i4, configFromMP4);
                }
            }
            this.bufferedFrame = null;
            if (i6 != 1 || this.h264LengthSize <= 0 || (allocateVideoBuffer = allocateVideoBuffer(i4, byteBuffer.remaining() + 10)) == null) {
                return;
            }
            allocateVideoBuffer.rewind();
            allocateVideoBuffer.limit(allocateVideoBuffer.capacity());
            H264Util.mp4ToAnnexB(this.h264LengthSize, byteBuffer, allocateVideoBuffer);
            int position2 = allocateVideoBuffer.position();
            allocateVideoBuffer.rewind();
            allocateVideoBuffer.limit(position2);
            boolean z = i3 == 1;
            if (this.firstFrame && z) {
                this.firstFrame = false;
                byte[] bArr2 = new byte[position2];
                this.bufferedFrame = bArr2;
                allocateVideoBuffer.get(bArr2);
                allocateVideoBuffer.rewind();
            }
            handleVideoFrame(i4, i, i7, z, allocateVideoBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getAppUrl(LivePlayerSource livePlayerSource) {
        String str = livePlayerSource.url;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            return str.substring(0, lastIndexOf);
        }
        throw new RuntimeException("Invalid RTMP url:".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStreamName(LivePlayerSource livePlayerSource) {
        String str = livePlayerSource.url;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            return str.substring(lastIndexOf + 1);
        }
        throw new RuntimeException("Invalid RTMP url:".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayerError(PlayerRtmpClient playerRtmpClient, final int i, @Nullable final Throwable th) {
        if (playerRtmpClient != this.rtmpClient) {
            return;
        }
        Objects.toString(th);
        PlayerRtmpClient playerRtmpClient2 = this.rtmpClient;
        if (playerRtmpClient == playerRtmpClient2) {
            int i2 = this.retryCount;
            this.retryCount = i2 + 1;
            if (i2 > 2) {
                handleError(i, th);
                return;
            }
            createClient(playerRtmpClient2.getSourceInfo());
            int elapsed = (int) this.lastRetryEvent.elapsed();
            int i3 = this.retryInterval;
            if (elapsed <= i3) {
                this.rtmpClient.executeOnWorker(new Runnable() { // from class: xsna.nqg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RtmpPlayer.this.lambda$handlePlayerError$0(i, th);
                    }
                }, i3 - elapsed);
            } else {
                if (retry()) {
                    return;
                }
                handleError(i, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDataEqual(byte[] bArr, ByteBuffer byteBuffer) {
        if (bArr == null || byteBuffer == null || bArr.length != byteBuffer.remaining()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != byteBuffer.get(byteBuffer.position() + i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handlePlayerError$0(int i, Throwable th) {
        if (retry()) {
            return;
        }
        handleError(i, th);
    }

    private void resetRetry() {
        this.retryCount = 0;
        this.retryInterval = 2000;
    }

    private boolean retry() {
        handleRetry();
        try {
            this.retryInterval *= 2;
            this.lastRetryEvent.signal();
            this.rtmpClient.start();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void sendStoredFrame(int i) {
        byte[] bArr = this.bufferedFrame;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        int i2 = this.firstFrameSentCount + 1;
        this.firstFrameSentCount = i2;
        if (i2 > 20) {
            this.bufferedFrame = null;
            return;
        }
        ByteBuffer allocateVideoBuffer = allocateVideoBuffer(7, bArr.length + 10);
        allocateVideoBuffer.rewind();
        allocateVideoBuffer.limit(this.bufferedFrame.length);
        allocateVideoBuffer.put(this.bufferedFrame);
        allocateVideoBuffer.rewind();
        handleVideoFrame(7, i, 0, true, allocateVideoBuffer);
    }

    public ByteBuffer allocateAudioBuffer(int i, int i2) {
        return null;
    }

    public ByteBuffer allocateVideoBuffer(int i, int i2) {
        return null;
    }

    public int getAudioQueueDeepness() {
        return 500;
    }

    public int getAudioQueuedMS() {
        return 250;
    }

    public long getAverageBitrate() {
        PlayerRtmpClient playerRtmpClient = this.rtmpClient;
        if (playerRtmpClient != null) {
            return (long) playerRtmpClient.minBandwidth.f;
        }
        return 0L;
    }

    public LivePlayerSource getHQSource(@NonNull List<LivePlayerSource> list) {
        LivePlayerSource livePlayerSource = null;
        for (LivePlayerSource livePlayerSource2 : list) {
            if (livePlayerSource2.isTransparent) {
                return livePlayerSource2;
            }
            if (livePlayerSource == null || livePlayerSource2.bitrate > livePlayerSource.bitrate) {
                livePlayerSource = livePlayerSource2;
            }
        }
        return livePlayerSource;
    }

    public boolean isMuted() {
        return false;
    }

    public void notifyStopping() {
        this.stopping = true;
    }

    public void start() {
        this.rtmpClient.start();
        Thread thread = new Thread("RtmpPlayer packet processor") { // from class: ru.ok.proto.rtmp.RtmpPlayer.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                boolean z;
                boolean z2;
                int i;
                Sample sample;
                Sample sample2;
                TimedEvent timedEvent = new TimedEvent();
                TimedEvent timedEvent2 = new TimedEvent();
                int i2 = 0;
                int i3 = 0;
                boolean z3 = false;
                int i4 = 1;
                long j = 100;
                boolean z4 = true;
                while (!RtmpPlayer.this.stopping) {
                    try {
                        SampleQueue sampleQueue = RtmpPlayer.this.bufferAudio;
                        SampleQueue sampleQueue2 = RtmpPlayer.this.bufferVideo;
                        int audioQueueDeepness = RtmpPlayer.this.getAudioQueueDeepness();
                        int audioQueuedMS = RtmpPlayer.this.getAudioQueuedMS();
                        if (sampleQueue.getBufferedTime() + audioQueuedMS < (sampleQueue.getDeepnessMS() > 500 ? 30 : i2) && i4 == 0) {
                            if (timedEvent.elapsed(i2) < 4000) {
                                j = Math.min(j * 2, 1000L);
                            }
                            timedEvent.signal();
                            i4 = 1;
                        }
                        int bufferedTime = sampleQueue.getBufferedTime() + audioQueuedMS;
                        int i5 = i4;
                        j = Math.min(j, sampleQueue.getDeepnessMS() / 2);
                        if (i5 == 0) {
                            RtmpPlayer.this.handleBuffering(false, 100);
                        } else if (j == 0 || bufferedTime >= j) {
                            RtmpPlayer.this.handleBuffering(true, 100);
                        } else {
                            RtmpPlayer.this.handleBuffering(true, (int) ((Math.max(bufferedTime, 0) * 100.0f) / j));
                        }
                        if (i5 != 0 && bufferedTime < j) {
                            Thread.sleep(Math.min(j, 100L));
                            i4 = i5;
                            i2 = 0;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (audioQueueDeepness - audioQueuedMS <= 75 || (sample2 = (Sample) sampleQueue.poll()) == null) {
                            z = z4;
                            z2 = false;
                        } else {
                            i3 = sample2.getTimestamp();
                            timedEvent2.signal();
                            RtmpPlayer.this.doProcessPacket(sample2.getTimestamp(), sample2.getType(), sample2.getData(), sample2.getHeaders());
                            z = false;
                            z2 = true;
                            z3 = true;
                        }
                        if (z3) {
                            if (z) {
                                sample = (Sample) sampleQueue2.poll();
                                if (sample != null) {
                                    i3 = sample.getTimestamp();
                                    timedEvent2.signal();
                                    z = false;
                                }
                                i = 0;
                            } else {
                                i = 0;
                                sample = (Sample) sampleQueue2.pollIfDue((i3 - audioQueuedMS) + Math.min((int) timedEvent2.elapsed(0), 25));
                            }
                            if (sample != null) {
                                RtmpPlayer.this.doProcessPacket(sample.getTimestamp(), sample.getType(), sample.getData(), sample.getHeaders());
                                z2 = true;
                            }
                        } else {
                            i = 0;
                        }
                        if (!z2) {
                            Thread.sleep(20L);
                        }
                        i4 = i;
                        z4 = z;
                        i2 = i4;
                    } catch (Exception e) {
                        RtmpPlayer.this.handleError(13, e);
                        return;
                    }
                }
            }
        };
        this.packetProcessorThread = thread;
        thread.start();
    }

    public void stop() {
        this.rtmpClient.stop();
    }

    public void handleRetry() {
    }

    public void handleStarted() {
    }

    public void handleStopped() {
    }

    public void handleUnpublished() {
    }

    public class PlayerRtmpClient extends RtmpClient {
        private final SampleQueue<Sample> bufferAudio;
        private final SampleQueue<Sample> bufferVideo;
        private final TimedEvent firstPacketEvent;
        private final Map<Byte, byte[]> headers;
        private final m06 minBandwidth;
        private final LivePlayerSource sourceInfo;

        public PlayerRtmpClient(HandlerThread handlerThread, LivePlayerSource livePlayerSource, SampleQueue<Sample> sampleQueue, SampleQueue<Sample> sampleQueue2) {
            super(handlerThread, RtmpPlayer.getAppUrl(livePlayerSource));
            m06 m06Var = new m06(10000L, new tto0());
            this.minBandwidth = m06Var;
            this.firstPacketEvent = new TimedEvent();
            this.headers = new HashMap(4);
            this.sourceInfo = livePlayerSource;
            this.bufferAudio = sampleQueue;
            this.bufferVideo = sampleQueue2;
            m06Var.j = new m06.a() { // from class: ru.ok.proto.rtmp.RtmpPlayer.PlayerRtmpClient.1
                @Override // xsna.m06.a
                public void onBandwidthEstimatorBitrateChanged(long j, long j2) {
                    RtmpPlayer.this.handleBitrateChanged(j, j2);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleError$0(int i, Throwable th) {
            RtmpPlayer.this.handlePlayerError(this, i, th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleStopped$1() {
            if (this != RtmpPlayer.this.rtmpClient) {
                return;
            }
            if (RtmpPlayer.this.packetProcessorThread != null) {
                try {
                    RtmpPlayer.this.packetProcessorThread.join(5000L);
                } catch (InterruptedException unused) {
                    ne7.J(RtmpPlayer.TAG, "interrupted while waiting for packet processor thread");
                }
            }
            RtmpPlayer.this.handleStopped();
        }

        private void playStream() {
            sendMessage(new RtmpMessages.PlayMessage(RtmpPlayer.getStreamName(this.sourceInfo)), null);
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void abort() {
            super.abort();
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void afterHandshake() {
            super.afterHandshake();
            RtmpMessages.ConnectRequest connectRequest = new RtmpMessages.ConnectRequest();
            connectRequest.getCommandObject().setApp(getAppName());
            connectRequest.getCommandObject().setTcUrl(getLink());
            connectRequest.getCommandObject().setNetType(RtmpPlayer.this.logger.getNetType());
            sendMessage(connectRequest, new RtmpClient.ReactionRunnable() { // from class: ru.ok.proto.rtmp.RtmpPlayer.PlayerRtmpClient.2
                @Override // ru.ok.proto.rtmp.RtmpClient.ReactionRunnable
                public void handle(String str, ByteBuffer byteBuffer) throws ProtocolException {
                    RtmpMessages.ServerResponse serverResponse = new RtmpMessages.ServerResponse();
                    serverResponse.deserialize(byteBuffer);
                    if (serverResponse.isError()) {
                        throw new ProtocolException("Failed to connect: response = " + serverResponse.toString());
                    }
                    if (serverResponse.getInformation().getCode().equals("NetConnection.Connect.Success")) {
                        return;
                    }
                    throw new ProtocolException("Unexpected connect response: " + serverResponse.toString());
                }
            });
            playStream();
        }

        public LivePlayerSource getSourceInfo() {
            return this.sourceInfo;
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleError(final int i, @Nullable final Throwable th) {
            super.handleError(i, th);
            executeOnWorker(new Runnable() { // from class: ru.ok.proto.rtmp.b
                @Override // java.lang.Runnable
                public final void run() {
                    RtmpPlayer.PlayerRtmpClient.this.lambda$handleError$0(i, th);
                }
            });
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleMetadata(ByteBuffer byteBuffer) {
            AmfEntry amfEntry;
            try {
                AmfObject readObject = AmfUtil.readObject(byteBuffer);
                if (readObject == null || (amfEntry = readObject.getProperties().get("rotation")) == null || !(amfEntry instanceof AmfNumber)) {
                    return;
                }
                RtmpPlayer.this.handleRotation(((AmfNumber) amfEntry).getValue());
            } catch (ProtocolException unused) {
            }
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleStatus(RtmpMessages.ServerResponse serverResponse) {
            String code = serverResponse.getInformation().getCode();
            code.getClass();
            if (code.equals("NetStream.Play.UnpublishNotify")) {
                RtmpPlayer.this.handleUnpublished();
            }
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleStopped() {
            super.handleStopped();
            this.handler.post(new Runnable() { // from class: ru.ok.proto.rtmp.a
                @Override // java.lang.Runnable
                public final void run() {
                    RtmpPlayer.PlayerRtmpClient.this.lambda$handleStopped$1();
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
        @Override // ru.ok.proto.rtmp.RtmpClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void processPacket(int i, int i2, int i3, byte b, ByteBuffer byteBuffer) throws ProtocolException {
            boolean z;
            if (RtmpPlayer.this.stopping) {
                return;
            }
            if (b != 8 && b != 9) {
                super.processPacket(i, i2, i3, b, byteBuffer);
                return;
            }
            this.firstPacketEvent.signalOnce();
            this.minBandwidth.a(byteBuffer.remaining());
            int position = byteBuffer.position();
            if (b == 8) {
                if (byteBuffer.remaining() >= 2) {
                    int i4 = (byteBuffer.get() & 255) >>> 4;
                    if (i4 == 10) {
                        if (byteBuffer.get() == 0) {
                            r2 = true;
                        }
                    } else if (i4 != 11 && i4 != 12) {
                        return;
                    }
                }
            } else if (b == 9) {
                byte b2 = byteBuffer.get();
                z = ((b2 & 255) >>> 4) == 1;
                if ((b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER) != 7) {
                    return;
                }
                byte b3 = byteBuffer.get();
                wr.c(3, byteBuffer);
                r2 = b3 == 0;
                if (i3 == RtmpPlayer.this.prevVideoTimestamp) {
                    i3 = RtmpPlayer.this.prevVideoTimestamp + 1;
                }
                RtmpPlayer.this.prevVideoTimestamp = i3;
                int i5 = i3;
                if (!r2) {
                    if (RtmpPlayer.this.isDataEqual(this.headers.get(Byte.valueOf(b)), byteBuffer)) {
                        return;
                    }
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    this.headers.put(Byte.valueOf(b), bArr);
                    return;
                }
                byteBuffer.position(position);
                Sample sample = new Sample(i5, z, b, byteBuffer, this.headers.get(Byte.valueOf(b)));
                if (b == 8) {
                    this.bufferAudio.add(sample);
                    return;
                } else {
                    this.bufferVideo.add(sample);
                    return;
                }
            }
            z = true;
            int i52 = i3;
            if (!r2) {
            }
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleNetworkPing(int i) {
        }
    }

    public void handleRotation(double d) {
    }

    public void handleBitrateChanged(long j, long j2) {
    }

    public void handleBuffering(boolean z, int i) {
    }

    public void handleError(int i, @Nullable Throwable th) {
    }

    public void handleVideoHeader(int i, ByteBuffer byteBuffer) {
    }

    public void handleAudioFrame(int i, int i2, ByteBuffer byteBuffer) {
    }

    public void handleAudioHeader(int i, int i2, ByteBuffer byteBuffer) {
    }

    public void handleVideoFrame(int i, int i2, int i3, boolean z, ByteBuffer byteBuffer) {
    }
}
