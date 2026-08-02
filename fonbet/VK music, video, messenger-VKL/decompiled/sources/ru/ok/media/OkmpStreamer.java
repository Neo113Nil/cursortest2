package ru.ok.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.microedition.khronos.opengles.GL10;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.media.OkmpStreamPublisher;
import ru.ok.media.OkmpStreamer;
import ru.ok.media.StreamerBase;
import ru.ok.media.StreamerLinkState;
import ru.ok.media.api.AACAudioProvider;
import ru.ok.media.api.LiveStreamStatReporter;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.StreamerState;
import ru.ok.media.api.VideoCBRMode;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.PublisherConfiguration;
import xsna.bk9;
import xsna.ekh;
import xsna.epx;
import xsna.f10;
import xsna.ft5;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.n6j;
import xsna.ne7;
import xsna.rl3;
import xsna.s3q0;
import xsna.sl9;
import xsna.tvo0;
import xsna.xw1;
import xsna.zcl;
import xsna.zr;
import xsna.zu3;

/* compiled from: OkmpStreamer.kt */
/* loaded from: classes9.dex */
public final class OkmpStreamer extends StreamerBase implements OkmpStreamPublisher.Delegate {
    private static final Companion Companion = new Companion(null);
    private static final String PUBLISHER_NAME = "OKMP/C++";
    private static final String TAG = "Publisher";
    private final int _dbgBandwidthDropKBps;
    private final int _dbgBandwidthDropPeriodSeconds;
    private volatile OkmpStreamPublisher _publisher;
    private final AACAudioProvider aacEncode;
    private final VideoCBRMode cbrMode;
    private final PublisherConfiguration config;
    private int connectionId;
    private final Context context;
    private Integer firstCapturedFrameRotation;
    private long initialBandwidth;
    private final LoggerInterface logger;
    private final izs<gzs<s3q0>, s3q0> runOnGLThread;
    private boolean startCalled;
    private final boolean useRelativeTimestamps;
    private final int videoBitrateMarginPercent;

    /* compiled from: OkmpStreamer.kt */
    public static final class Companion {

        /* compiled from: OkmpStreamer.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OkmpStreamPublisher.State.values().length];
                try {
                    iArr[OkmpStreamPublisher.State.preparing.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OkmpStreamPublisher.State.starting.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OkmpStreamPublisher.State.started.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OkmpStreamPublisher.State.paused.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OkmpStreamPublisher.State.stopped.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OkmpStreamPublisher.State.failed.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OkmpStreamPublisher.State.unrecoverableFailure.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OkmpConnectionConfig createConnectionConfig(URI uri) {
            String str;
            Collection collection;
            String host = uri.getHost();
            int port = uri.getPort();
            if (port <= 0) {
                port = 2020;
            }
            String path = uri.getPath();
            String str2 = null;
            if (path != null) {
                List a = n6j.a(0, DomExceptionUtils.SEPARATOR, path);
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (Object obj : a) {
                    if (z) {
                        arrayList.add(obj);
                    } else if (((String) obj).length() != 0) {
                        arrayList.add(obj);
                        z = true;
                    }
                }
                if (!arrayList.isEmpty()) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collection = j5g.H0(arrayList, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = EmptyList.b;
                String[] strArr = (String[]) collection.toArray(new String[0]);
                if (strArr.length > 0) {
                    String str3 = strArr[strArr.length - 1];
                    if (strArr.length > 1) {
                        int length = strArr.length - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        String[] strArr2 = (String[]) rl3.n0(length, strArr).toArray(new String[0]);
                        str2 = String.join(BundleUtil.UNDERLINE_TAG, (CharSequence[]) Arrays.copyOf(strArr2, strArr2.length));
                    }
                    str = str2;
                    str2 = str3;
                    return new OkmpConnectionConfig(host, port, str2, str);
                }
            }
            str = null;
            return new OkmpConnectionConfig(host, port, str2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final StreamerState fromOkmpState(OkmpStreamPublisher.State state) {
            switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                case 1:
                    return StreamerState.preparing;
                case 2:
                    return StreamerState.starting;
                case 3:
                    return StreamerState.started;
                case 4:
                    return StreamerState.paused;
                case 5:
                    return StreamerState.finished;
                case 6:
                    return StreamerState.failed;
                case 7:
                    return StreamerState.unrecoverableFailure;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private Companion() {
        }
    }

    /* compiled from: OkmpStreamer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OkmpQualityControllerState.values().length];
            try {
                iArr[OkmpQualityControllerState.blocked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkmpQualityControllerState.noDatagramsReceived.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OkmpQualityControllerState.bufferTooLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OkmpQualityControllerState.switchedDown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OkmpQualityControllerState.initial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OkmpQualityControllerState.noClient.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OkmpQualityControllerState.paused.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OkmpQualityControllerState.idle.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OkmpQualityControllerState.bitrateTrial.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OkmpQualityControllerState.switchedUp.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OkmpQualityControllerState.maxQuality.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OkmpQualityControllerState.closed.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StreamerState.values().length];
            try {
                iArr2[StreamerState.preparing.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[StreamerState.starting.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StreamerState.started.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[StreamerState.paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OkmpStreamPublisher.State.values().length];
            try {
                iArr3[OkmpStreamPublisher.State.preparing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[OkmpStreamPublisher.State.starting.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[OkmpStreamPublisher.State.started.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[OkmpStreamPublisher.State.paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[OkmpStreamPublisher.State.stopped.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[OkmpStreamPublisher.State.failed.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[OkmpStreamPublisher.State.unrecoverableFailure.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public /* synthetic */ OkmpStreamer(Context context, HandlerThread handlerThread, PublisherConfiguration publisherConfiguration, LoggerInterface loggerInterface, AACAudioProvider aACAudioProvider, izs izsVar, LiveStreamStatReporter liveStreamStatReporter, boolean z, long j, int i, int i2, VideoCBRMode videoCBRMode, int i3, int i4, zcl zclVar) {
        this(context, handlerThread, publisherConfiguration, loggerInterface, aACAudioProvider, izsVar, liveStreamStatReporter, z, (i4 & 256) != 0 ? -1L : j, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) != 0 ? 0 : i2, (i4 & 2048) != 0 ? VideoCBRMode.DISABLED : videoCBRMode, (i4 & 4096) != 0 ? 0 : i3);
    }

    private final void createPublisher() {
        ne7.m(TAG, "createPublisher() - state= " + get_state());
        if (this._publisher != null) {
            releasePublisher();
        }
        this.connectionId++;
        OkmpStreamPublisher okmpStreamPublisher = new OkmpStreamPublisher(this.context, getWorkerThread(), this.config, this.connectionId, this.aacEncode, this.cbrMode, this.videoBitrateMarginPercent, this.initialBandwidth, this.useRelativeTimestamps, this.runOnGLThread, this.logger, new zu3(this, 12), new bk9(this, 1), new ekh(this, 22), this._dbgBandwidthDropPeriodSeconds, this._dbgBandwidthDropKBps);
        this._publisher = okmpStreamPublisher;
        okmpStreamPublisher.setDelegate(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 createPublisher$lambda$10(OkmpStreamer okmpStreamer, int i, gzs gzsVar) {
        okmpStreamer.queueJob(i, new f10(1, gzsVar));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 createPublisher$lambda$12(OkmpStreamer okmpStreamer, int i, long j, gzs gzsVar) {
        okmpStreamer.queueJobDelayed(i, j, new xw1(gzsVar, 9));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 createPublisher$lambda$13(OkmpStreamer okmpStreamer, int i) {
        okmpStreamer.debugJobStarted(i);
        return s3q0.a;
    }

    private final void doStart() {
        updateState(StreamerState.starting);
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher == null || !okmpStreamPublisher.start()) {
            LiveStreamStatReporter liveStreamStatReporter = get_statsReporter();
            if (liveStreamStatReporter != null) {
                liveStreamStatReporter.streamStartFailed("Failed to start publisher!");
            }
            ne7.n(TAG, "Failed to start publisher!");
            updateState(StreamerState.failed);
        }
    }

    private final StreamerLinkState getNetworkState(StreamerLinkStats streamerLinkStats) {
        StreamerLinkState streamerLinkState;
        StreamerLinkState.Companion companion = StreamerLinkState.Companion;
        StreamerLinkState combine = companion.combine(streamerLinkStats.getAudio().getState(), streamerLinkStats.getVideo().getState());
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[okmpStreamPublisher.getQualityControllerState().ordinal()]) {
                case 1:
                case 2:
                    streamerLinkState = StreamerLinkState.stalled;
                    break;
                case 3:
                case 4:
                    streamerLinkState = StreamerLinkState.unstable;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return companion.combine(combine, streamerLinkState);
        }
        streamerLinkState = combine;
        return companion.combine(combine, streamerLinkState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStateChanged$lambda$15(int i, OkmpStreamer okmpStreamer, OkmpStreamPublisher.State state) {
        String str;
        LiveStreamStatReporter liveStreamStatReporter;
        String str2;
        String interfaceName;
        int i2 = okmpStreamer.connectionId;
        if (i != i2) {
            ne7.n(TAG, sl9.c(i, i2, "OkmpPublisherImpl.onStateChanged() - (closure) connectionID ", " does NOT match our connectionID ", ", ignored"));
            return;
        }
        OkmpStreamPublisher okmpStreamPublisher = okmpStreamer._publisher;
        String str3 = "";
        if (okmpStreamPublisher == null || (str = okmpStreamPublisher.getDisconnectReasonString()) == null) {
            str = "";
        }
        switch (WhenMappings.$EnumSwitchMapping$2[state.ordinal()]) {
            case 1:
            case 2:
                return;
            case 3:
                if (okmpStreamer.get_state() == StreamerState.starting) {
                    OkmpStreamPublisher okmpStreamPublisher2 = okmpStreamer._publisher;
                    LiveStreamStatReporter liveStreamStatReporter2 = okmpStreamer.get_statsReporter();
                    if (liveStreamStatReporter2 != null) {
                        if (okmpStreamPublisher2 == null || (str2 = okmpStreamPublisher2.getBoundAddress()) == null) {
                            str2 = "";
                        }
                        if (okmpStreamPublisher2 != null && (interfaceName = okmpStreamPublisher2.getInterfaceName()) != null) {
                            str3 = interfaceName;
                        }
                        liveStreamStatReporter2.streamConnected(str2, str3);
                    }
                    if (!okmpStreamer.getWasStarted() && (liveStreamStatReporter = okmpStreamer.get_statsReporter()) != null) {
                        liveStreamStatReporter.streamStarted();
                    }
                }
                okmpStreamer.get_wasConnected();
                okmpStreamer.setWasStarted(true);
                okmpStreamer.updateState(StreamerState.started);
                return;
            case 4:
                okmpStreamer.updateState(StreamerState.paused);
                return;
            case 5:
                if (okmpStreamer.get_state() == StreamerState.started || okmpStreamer.get_state() == StreamerState.paused || okmpStreamer.get_state() == StreamerState.starting) {
                    LiveStreamStatReporter liveStreamStatReporter3 = okmpStreamer.get_statsReporter();
                    if (liveStreamStatReporter3 != null) {
                        liveStreamStatReporter3.streamDisconnected("stopped [" + str + X3.j.e);
                    }
                    okmpStreamer.updateState(StreamerState.finished);
                } else {
                    LiveStreamStatReporter liveStreamStatReporter4 = okmpStreamer.get_statsReporter();
                    if (liveStreamStatReporter4 != null) {
                        liveStreamStatReporter4.streamDisconnected("publisher (unexpected) [" + str + X3.j.e);
                    }
                    okmpStreamer.updateState(StreamerState.failed);
                }
                okmpStreamer.stop();
                return;
            case 6:
                LiveStreamStatReporter liveStreamStatReporter5 = okmpStreamer.get_statsReporter();
                if (liveStreamStatReporter5 != null) {
                    liveStreamStatReporter5.streamDisconnected("publisher [" + str + X3.j.e);
                }
                okmpStreamer.updateState(StreamerState.failed);
                okmpStreamer.stop();
                return;
            case 7:
                LiveStreamStatReporter liveStreamStatReporter6 = okmpStreamer.get_statsReporter();
                if (liveStreamStatReporter6 != null) {
                    liveStreamStatReporter6.streamDisconnected("publisher unrecoverable [" + str + X3.j.e);
                }
                okmpStreamer.updateState(StreamerState.unrecoverableFailure);
                okmpStreamer.stop();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void releasePublisher() {
        ne7.m(TAG, "releasePublisher() - state= " + get_state());
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher != null) {
            setTotalPacketsInfo(getTotalPacketsInfo().plus(okmpStreamPublisher.getPacketStats()));
            getFramesDropped().addAndGet(okmpStreamPublisher.getVideoFramesDropped());
            this.initialBandwidth = okmpStreamPublisher.getCurrentBandwidth();
            okmpStreamPublisher.setDelegate(null);
            okmpStreamPublisher.stop();
            this._publisher = null;
            this.firstCapturedFrameRotation = null;
        }
    }

    @Override // ru.ok.media.api.Streamer
    public String getDebugInfo() {
        URI uri = getUri();
        String a = uri != null ? zr.a("Target: ", uri.getHost(), "\n") : "";
        String str = ((Object) a) + "State: " + get_state() + "\n";
        if (this._publisher != null) {
            str = ((Object) str) + "ConnId: " + this.connectionId + "\n";
        }
        String str2 = ((Object) str) + "wasConnected: " + get_wasConnected() + ", wasStarted: " + getWasStarted() + "\n";
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher == null) {
            return str2;
        }
        return ((Object) str2) + okmpStreamPublisher.getDebugInfo();
    }

    @Override // ru.ok.media.StreamerBase
    public int[] getLastBlocksNative() {
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher == null) {
            return null;
        }
        return okmpStreamPublisher.getRecentQueueBlocks();
    }

    @Override // ru.ok.media.api.Streamer
    public StreamerPacketsInfo getPacketsInfo() {
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        return okmpStreamPublisher == null ? getTotalPacketsInfo() : getTotalPacketsInfo().plus(okmpStreamPublisher.getPacketStats());
    }

    @Override // ru.ok.media.api.Streamer
    public StreamerStatistic getStatistic() {
        Integer num;
        Integer num2;
        Integer num3;
        Double d;
        Integer num4;
        Integer num5;
        double d2;
        Integer num6;
        String str;
        Integer num7;
        StreamerStatistic streamerStatistic;
        synchronized (getAverageBitrateEstimator()) {
            try {
                Long lastPresentationTime = getLastPresentationTime();
                Long valueOf = lastPresentationTime != null ? Long.valueOf(lastPresentationTime.longValue() / 1000) : null;
                OkmpStreamPublisher okmpStreamPublisher = this._publisher;
                if (okmpStreamPublisher != null) {
                    VideoSize videoLastFrameSize = okmpStreamPublisher.getVideoLastFrameSize();
                    num3 = videoLastFrameSize != null ? Integer.valueOf(videoLastFrameSize.getWidth()) : null;
                    num2 = videoLastFrameSize != null ? Integer.valueOf(videoLastFrameSize.getHeight()) : null;
                    Integer videoLastFrameRotationAngle = okmpStreamPublisher.getVideoLastFrameRotationAngle();
                    Double valueOf2 = Double.valueOf(okmpStreamPublisher.getFps());
                    Integer valueOf3 = Integer.valueOf(okmpStreamPublisher.getBitrate());
                    num = Integer.valueOf((int) okmpStreamPublisher.getCurrentBandwidth());
                    num5 = videoLastFrameRotationAngle;
                    num4 = valueOf3;
                    d = valueOf2;
                } else {
                    num = null;
                    num2 = null;
                    num3 = null;
                    d = null;
                    num4 = null;
                    num5 = null;
                }
                StreamerPacketsInfo packetsInfo = getPacketsInfo();
                StreamerLinkStats stats = getLinkTracker().getStats();
                StreamerBase.DebugQueueInfo debugQueueInfo = getDebugQueueInfo();
                Integer num8 = num2;
                Integer num9 = num3;
                StreamerState streamerState = get_state();
                ft5 averageFpsEstimator = getAverageFpsEstimator();
                averageFpsEstimator.getClass();
                double b = tvo0.b(averageFpsEstimator);
                int i = this.connectionId;
                long videoFramesDropped = getVideoFramesDropped();
                int averageBitrate = (int) getAverageBitrate();
                int intValue = num != null ? num.intValue() : 0;
                int averageOverheadBitrate = (int) getAverageOverheadBitrate();
                if (num9 == null || num9.intValue() <= 0) {
                    d2 = b;
                    num6 = null;
                } else {
                    d2 = b;
                    num6 = num9;
                }
                if (num8 == null || num8.intValue() <= 0) {
                    str = PUBLISHER_NAME;
                    num7 = null;
                } else {
                    num7 = num8;
                    str = PUBLISHER_NAME;
                }
                streamerStatistic = new StreamerStatistic(str, streamerState, d2, d, i, packetsInfo, videoFramesDropped, averageBitrate, num4, intValue, averageOverheadBitrate, valueOf, num6, num7, num5, getDebugInfo(), stats, getNetworkState(stats), StreamerBase.getQuality(stats), debugQueueInfo.getTicks(), debugQueueInfo.getLastBlocksNative(), debugQueueInfo.getTicks2(), debugQueueInfo.getLastBlocks());
            } catch (Throwable th) {
                throw th;
            }
        }
        return streamerStatistic;
    }

    @Override // ru.ok.media.StreamerBase
    public long getTicksNative() {
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher == null) {
            return 0L;
        }
        return okmpStreamPublisher.getTicks();
    }

    @Override // ru.ok.media.StreamerBase
    public long getVideoFramesDropped() {
        long j = getFramesDropped().get();
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        return j + (okmpStreamPublisher != null ? okmpStreamPublisher.getVideoFramesDropped() : 0L);
    }

    @Override // ru.ok.media.OkmpStreamPublisher.Delegate
    public void onAudioFailed(int i, String str, String str2) {
        ne7.t(TAG, "OkmpPublisherImpl.onAudioFailed() - in streamer state= " + get_state() + ", connectionID= " + i + " eventName= " + str + " error= " + str2);
        int i2 = this.connectionId;
        if (i != i2) {
            ne7.n(TAG, sl9.c(i, i2, "OkmpPublisherImpl.onAudioFailed() - connectionID ", " does NOT match our connectionID ", ", ignored"));
            return;
        }
        LiveStreamStatReporter liveStreamStatReporter = get_statsReporter();
        if (liveStreamStatReporter != null) {
            liveStreamStatReporter.streamAudioFailed(str, str2);
        }
    }

    @Override // ru.ok.media.OkmpStreamPublisher.Delegate
    public void onHandshaked(int i) {
        ne7.t(TAG, "OkmpPublisherImpl.onHandshaked() - in streamer state= " + get_state() + ", connectionID= " + i);
        int i2 = this.connectionId;
        if (i != i2) {
            ne7.n(TAG, sl9.c(i, i2, "OkmpPublisherImpl.onHandshaked() - connectionID ", " does NOT match our connectionID ", ", ignored"));
        } else {
            set_wasConnected(true);
        }
    }

    @Override // ru.ok.media.OkmpStreamPublisher.Delegate
    public void onNoNetwork(int i) {
        ne7.t(TAG, "OkmpPublisherImpl.onNoNetwork() - in streamer state= " + get_state() + ", connectionID= " + i);
        int i2 = this.connectionId;
        if (i != i2) {
            ne7.n(TAG, sl9.c(i, i2, "OkmpPublisherImpl.onNoNetwork() - connectionID ", " does NOT match our connectionID ", ", ignored"));
        } else {
            set_wasBound(false);
        }
    }

    @Override // ru.ok.media.OkmpStreamPublisher.Delegate
    public void onStateChanged(final int i, final OkmpStreamPublisher.State state, OkmpStreamPublisher.State state2) {
        ne7.t(TAG, "OkmpPublisherImpl.onStateChanged() - in streamer state= " + get_state() + ", connectionID= " + i + ", state= " + state + " oldState= " + state2);
        int i2 = this.connectionId;
        if (i != i2) {
            ne7.n(TAG, sl9.c(i, i2, "connectionID ", " does NOT match our connectionID ", ", ignored"));
        } else {
            getMainQueue().post(new Runnable() { // from class: xsna.lz70
                @Override // java.lang.Runnable
                public final void run() {
                    OkmpStreamer.onStateChanged$lambda$15(i, this, state);
                }
            });
        }
    }

    @Override // ru.ok.media.OkmpStreamPublisher.Delegate
    public void onVideoFailed(int i, String str, String str2) {
        ne7.t(TAG, "OkmpPublisherImpl.onVideoFailed() - in streamer state= " + get_state() + ", connectionID= " + i + " eventName= " + str + " error= " + str2);
        int i2 = this.connectionId;
        if (i != i2) {
            ne7.n(TAG, sl9.c(i, i2, "OkmpPublisherImpl.onVideoFailed() - connectionID ", " does NOT match our connectionID ", ", ignored"));
            return;
        }
        LiveStreamStatReporter liveStreamStatReporter = get_statsReporter();
        if (liveStreamStatReporter != null) {
            liveStreamStatReporter.streamVideoFailed(str, str2);
        }
    }

    @Override // ru.ok.media.api.Streamer
    public void pause() {
        ne7.t(TAG, "pause() in state= " + get_state());
        epx.f(Looper.myLooper(), Looper.getMainLooper());
        if (this._publisher == null) {
            LiveStreamStatReporter statsReporter = getStatsReporter();
            if (statsReporter != null) {
                statsReporter.streamPauseFailed("No publisher");
            }
            ne7.m(TAG, "No publisher");
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[get_state().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            LiveStreamStatReporter liveStreamStatReporter = get_statsReporter();
            if (liveStreamStatReporter != null) {
                liveStreamStatReporter.streamPaused("");
            }
            OkmpStreamPublisher okmpStreamPublisher = this._publisher;
            if (okmpStreamPublisher != null) {
                okmpStreamPublisher.pause();
            }
            updateState(StreamerState.paused);
            return;
        }
        if (i == 4) {
            ne7.m(TAG, "pause() - Already paused");
            return;
        }
        String str = "Won't do in state= " + get_state();
        LiveStreamStatReporter liveStreamStatReporter2 = get_statsReporter();
        if (liveStreamStatReporter2 != null) {
            liveStreamStatReporter2.streamPauseFailed(str);
        }
        ne7.m(TAG, str);
    }

    @Override // ru.ok.media.api.Streamer
    public void prepare(URI uri) {
        ne7.t(TAG, "prepare() - uri= " + uri + ", state= " + get_state());
        epx.f(Looper.myLooper(), Looper.getMainLooper());
        if (get_state() != StreamerState.waiting && !get_state().isFinal()) {
            ne7.p(TAG, "prepare() - won't prepare in state= " + get_state());
            return;
        }
        setUri(uri);
        if (this._publisher != null) {
            releasePublisher();
        }
        createPublisher();
        set_wasConnected(false);
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher == null || !okmpStreamPublisher.prepare(Companion.createConnectionConfig(uri))) {
            LiveStreamStatReporter statsReporter = getStatsReporter();
            if (statsReporter != null) {
                statsReporter.streamStartFailed("Failed to prepare publisher!");
            }
            ne7.n(TAG, "Failed to prepare publisher!");
            updateState(StreamerState.failed);
            return;
        }
        updateState(StreamerState.preparing);
        LiveStreamStatReporter statsReporter2 = getStatsReporter();
        if (statsReporter2 != null) {
            statsReporter2.streamConnecting(uri.toString());
        }
    }

    @Override // ru.ok.media.api.Streamer
    public void processVideoFrame(GL10 gl10, Streamer.VideoFrame videoFrame) {
        Streamer.VideoFrame copyWith$default;
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        boolean z = (this.config.dump_flags & 256) != 0;
        if (get_state() != StreamerState.started || okmpStreamPublisher == null) {
            if (z) {
                ne7.m(TAG, "OkmpStreamer.processVideoFrame() - dropped, state= " + get_state() + " publisher= " + this._publisher + " frame= " + videoFrame);
            }
            onFrameDropped();
            return;
        }
        if (z) {
            ne7.m(TAG, "OkmpStreamer.processVideoFrame() - frame= " + videoFrame);
        }
        logDroppedFramesIfNeeded();
        Integer num = this.firstCapturedFrameRotation;
        if (num == null) {
            this.firstCapturedFrameRotation = Integer.valueOf(videoFrame.getVideoRotationAngle());
            copyWith$default = Streamer.VideoFrame.copyWith$default(videoFrame, null, 0, null, 0L, 13, null);
        } else {
            copyWith$default = Streamer.VideoFrame.copyWith$default(videoFrame, null, ((videoFrame.getVideoRotationAngle() + 360) - num.intValue()) % 360, null, 0L, 13, null);
        }
        setLastPresentationTime(Long.valueOf(copyWith$default.getTimestampMs()));
        if (okmpStreamPublisher.processVideoFrame(gl10, copyWith$default)) {
            ft5 averageFpsEstimator = getAverageFpsEstimator();
            averageFpsEstimator.getClass();
            tvo0.a(averageFpsEstimator, 1);
        }
    }

    @Override // ru.ok.media.api.Streamer
    public void resume() {
        ne7.t(TAG, "resume() in state= " + get_state() + ".");
        epx.f(Looper.myLooper(), Looper.getMainLooper());
        if (get_state() != StreamerState.paused) {
            String str = "Won't do in state= " + get_state();
            LiveStreamStatReporter liveStreamStatReporter = get_statsReporter();
            if (liveStreamStatReporter != null) {
                liveStreamStatReporter.streamResumeFailed(str);
            }
            ne7.m(TAG, "resume() - " + str);
            return;
        }
        OkmpStreamPublisher okmpStreamPublisher = this._publisher;
        if (okmpStreamPublisher == null) {
            LiveStreamStatReporter liveStreamStatReporter2 = get_statsReporter();
            if (liveStreamStatReporter2 != null) {
                liveStreamStatReporter2.streamResumeFailed("No publisher");
            }
            ne7.m(TAG, "No publisher");
            return;
        }
        if (!okmpStreamPublisher.resume()) {
            LiveStreamStatReporter liveStreamStatReporter3 = get_statsReporter();
            if (liveStreamStatReporter3 != null) {
                liveStreamStatReporter3.streamResumeFailed("publisher resume failed");
            }
            updateState(StreamerState.failed);
            stop();
            return;
        }
        LiveStreamStatReporter liveStreamStatReporter4 = get_statsReporter();
        if (liveStreamStatReporter4 != null) {
            liveStreamStatReporter4.streamResumed();
        }
        if (!this.startCalled) {
            updateState(StreamerState.preparing);
        } else {
            if (!getWasStarting()) {
                doStart();
                return;
            }
            OkmpStreamPublisher.State state = okmpStreamPublisher.getState();
            OkmpStreamPublisher.State state2 = OkmpStreamPublisher.State.preparing;
            updateState(Companion.fromOkmpState(state));
        }
    }

    @Override // ru.ok.media.api.Streamer
    public void start() {
        ne7.K(TAG, "start() - state= " + get_state(), new Exception());
        epx.f(Looper.myLooper(), Looper.getMainLooper());
        this.startCalled = true;
        if (getUri() == null) {
            ne7.p(TAG, "start() - URI not set");
            return;
        }
        if (get_state() == StreamerState.paused) {
            ne7.t(TAG, "start() - Won't start until resumed");
            return;
        }
        if (this._publisher != null && get_state().isFinal()) {
            releasePublisher();
        }
        if (this._publisher != null) {
            get_state().isFinal();
        }
        if (this._publisher == null) {
            createPublisher();
        }
        doStart();
    }

    @Override // ru.ok.media.api.Streamer
    public void stop() {
        ne7.t(TAG, "stop() in state= " + get_state());
        if (get_state().isFinal()) {
            return;
        }
        epx.f(Looper.myLooper(), Looper.getMainLooper());
        this.startCalled = false;
        setWasStarting(false);
        releasePublisher();
        setUri(null);
        if (get_state().isFinal()) {
            return;
        }
        updateState(StreamerState.finished);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OkmpStreamer(Context context, HandlerThread handlerThread, PublisherConfiguration publisherConfiguration, LoggerInterface loggerInterface, AACAudioProvider aACAudioProvider, izs<? super gzs<s3q0>, s3q0> izsVar, LiveStreamStatReporter liveStreamStatReporter, boolean z, long j, int i, int i2, VideoCBRMode videoCBRMode, int i3) {
        super(handlerThread, liveStreamStatReporter);
        this.context = context;
        this.config = publisherConfiguration;
        this.logger = loggerInterface;
        this.aacEncode = aACAudioProvider;
        this.runOnGLThread = izsVar;
        this.useRelativeTimestamps = z;
        this.initialBandwidth = j;
        this._dbgBandwidthDropPeriodSeconds = i;
        this._dbgBandwidthDropKBps = i2;
        this.cbrMode = videoCBRMode;
        this.videoBitrateMarginPercent = i3;
        this.connectionId = 1000;
        ne7.m(TAG, "OkmpPublisherImpl init - useRelativeTimestamps= " + z + " config= " + publisherConfiguration);
    }
}
