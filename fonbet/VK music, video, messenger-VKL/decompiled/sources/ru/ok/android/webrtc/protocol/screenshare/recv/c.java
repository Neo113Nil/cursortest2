package ru.ok.android.webrtc.protocol.screenshare.recv;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.screenshare.Codec;
import ru.ok.android.webrtc.protocol.screenshare.DataChannelUtils;
import ru.ok.android.webrtc.protocol.screenshare.recv.stat.FreezeStatEstimator;
import ru.ok.android.webrtc.utils.TimedEvent;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.aw5;
import xsna.efz;
import xsna.h5z0;
import xsna.ji;
import xsna.o93;
import xsna.tdf;
import xsna.z3z0;

/* loaded from: classes9.dex */
public final class c {
    public static final long E;
    public static final String[] F;
    public static final long G;
    public final AtomicInteger A;
    public final FreezeStatEstimator B;
    public boolean C;
    public volatile boolean D;
    public final RTCLog a;
    public final DecoderWrapper$DecodedFrameCallback b;
    public final byte[] c = new byte[8192];
    public final HandlerThread d;
    public final Handler e;
    public b f;
    public h5z0 g;
    public Codec h;
    public final long i;
    public long j;
    public Integer k;
    public Integer l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public final TimedEvent v;
    public final TimedEvent w;
    public final TimedEvent x;
    public final TimedEvent y;
    public final AtomicInteger z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        E = timeUnit.toNanos(1L) / 10;
        F = new String[]{"OMX.google.", "OMX.SEC.", "c2.android"};
        G = timeUnit.toMillis(3L);
    }

    public c(RTCLog rTCLog, Future future, TimeProvider timeProvider, DecoderWrapper$DecodedFrameCallback decoderWrapper$DecodedFrameCallback) {
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperControl");
        this.d = handlerThread;
        this.f = null;
        this.i = -1L;
        this.j = 0L;
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new AtomicInteger(0);
        this.v = new TimedEvent(0.3d);
        this.w = new TimedEvent(0.3d);
        this.x = new TimedEvent(0.3d);
        this.y = new TimedEvent(0.3d);
        this.z = new AtomicInteger(0);
        this.A = new AtomicInteger(0);
        this.C = false;
        this.a = rTCLog;
        this.b = decoderWrapper$DecodedFrameCallback;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        this.B = new FreezeStatEstimator(timeProvider, 1000L);
    }

    public final void a(z3z0 z3z0Var) {
        h5z0 h5z0Var;
        this.m.incrementAndGet();
        this.v.fire();
        int i = z3z0Var.h;
        ByteBuffer byteBuffer = z3z0Var.k;
        int i2 = z3z0Var.h;
        long j = i;
        long j2 = this.i;
        if (j != 1 + j2 && j2 != -1 && i != 0) {
            this.a.log("DecoderWrapper", efz.b(this.i, ")", ji.b(i2, "dropping ", " due to seq (")));
            this.o.incrementAndGet();
            return;
        }
        if (z3z0Var.isStart()) {
            this.B.onFrameStart();
            if (this.f != null) {
                RTCLog rTCLog = this.a;
                StringBuilder b = ji.b(i2, "received start @ seq ", " queue: ");
                b.append(this.f.d);
                rTCLog.log("DecoderWrapper", b.toString());
                this.o.incrementAndGet();
            }
            this.n.incrementAndGet();
            f();
            this.f = new b(this, z3z0Var);
        } else {
            b bVar = this.f;
            if (bVar != null) {
                z3z0Var.isStart();
                z3z0Var.isEnd();
                z3z0Var.isEos();
                bVar.c |= z3z0Var.isKeyFrame();
                while (true) {
                    int min = Math.min(byteBuffer.remaining(), bVar.e.c.length);
                    if (min == 0) {
                        break;
                    }
                    byteBuffer.get(bVar.e.c, 0, min);
                    bVar.b.write(bVar.e.c, 0, min);
                }
                bVar.d++;
            }
        }
        if (z3z0Var.isEnd()) {
            this.p.incrementAndGet();
            this.w.fire();
            a();
            f();
        }
        if (!z3z0Var.isEos() || (h5z0Var = this.g) == null) {
            return;
        }
        h5z0Var.release();
        this.g = null;
        this.h = null;
    }

    public final void b(z3z0 z3z0Var) {
        this.e.post(new aw5(7, this, z3z0Var));
    }

    public final void d() {
        h5z0 h5z0Var = this.g;
        if (h5z0Var != null) {
            h5z0Var.release();
            this.g = null;
            this.h = null;
        }
        f();
    }

    public final void e() {
        if (this.D) {
            return;
        }
        this.D = true;
        DataChannelUtils.releaseHandlerThread(this.d, this.e, new o93(this, 29));
    }

    public final void f() {
        b bVar = this.f;
        if (bVar != null) {
            try {
                bVar.b.close();
            } catch (IOException unused) {
            }
        }
        this.f = null;
    }

    public final ScreenshareRecvStat b() {
        h5z0 h5z0Var = this.g;
        long j = this.m.get();
        long j2 = this.n.get();
        long j3 = this.o.get();
        long j4 = this.p.get();
        long j5 = this.q.get();
        long j6 = this.r.get();
        long j7 = this.s.get();
        long j8 = this.t.get();
        long j9 = this.u.get();
        long j10 = this.z.get();
        long j11 = this.A.get();
        TimedEvent timedEvent = this.v;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new ScreenshareRecvStat(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, timedEvent.rate(timeUnit), this.w.rate(timeUnit), this.x.rate(timeUnit), this.y.rate(timeUnit), h5z0Var == null ? null : h5z0Var.codec(), h5z0Var != null ? h5z0Var.implName() : null, h5z0Var == null ? 0 : h5z0Var.frameWidth(), h5z0Var != null ? h5z0Var.frameHeight() : 0, this.B.getFreezeStat());
    }

    public static /* synthetic */ void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0091, code lost:
    
        if (r11 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0093, code lost:
    
        r11 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        String str;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        h5z0 h5z0Var;
        b bVar = this.f;
        if (bVar == null) {
            this.a.log("DecoderWrapper", "unexpected: trying to deliver 0 packets as frame");
            return;
        }
        Codec codec = bVar.a;
        int i = 0;
        if (codec != this.h || (h5z0Var = this.g) == null || h5z0Var.isReleased()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.j;
            if (j == 0 || elapsedRealtime - j >= G) {
                this.j = elapsedRealtime;
                if (a.a[codec.ordinal()] != 1) {
                    str = MimeTypes.VIDEO_VP8;
                } else {
                    str = MimeTypes.VIDEO_VP9;
                }
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                int length = codecInfos.length;
                int i2 = 0;
                MediaCodecInfo mediaCodecInfo = null;
                MediaCodecInfo mediaCodecInfo2 = null;
                while (i2 < length) {
                    MediaCodecInfo mediaCodecInfo3 = codecInfos[i2];
                    if (!mediaCodecInfo3.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo3.getSupportedTypes();
                        int length2 = supportedTypes.length;
                        for (int i3 = i; i3 < length2; i3++) {
                            if (supportedTypes[i3].equalsIgnoreCase(str)) {
                                String name = mediaCodecInfo3.getName();
                                String[] strArr = F;
                                int length3 = strArr.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 < length3) {
                                        int i5 = i4;
                                        if (name.startsWith(strArr[i5])) {
                                            break;
                                        } else {
                                            i4 = i5 + 1;
                                        }
                                    } else if (mediaCodecInfo == null) {
                                        mediaCodecInfo = mediaCodecInfo3;
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                    i = 0;
                }
                if (mediaCodecInfo == null) {
                    mediaCodecInfo = mediaCodecInfo2;
                }
                if (mediaCodecInfo != null) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                        this.a.log("DecoderWrapper", "selecting " + mediaCodecInfo.getName());
                        Integer upper = videoCapabilities.getSupportedWidths().getUpper();
                        Integer upper2 = videoCapabilities.getSupportedHeightsFor(upper.intValue()).getUpper();
                        if (upper2 == null) {
                            upper2 = Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK);
                        }
                        this.k = upper;
                        this.l = upper2;
                        this.a.log("DecoderWrapper", "supports up to " + upper + "x" + upper2);
                    }
                    h5z0 h5z0Var2 = this.g;
                    if (h5z0Var2 != null) {
                        h5z0Var2.release();
                        this.g = null;
                        this.h = null;
                    }
                    this.h = codec;
                    this.g = new DecoderWrapper$VpxDecoder(this, codec, this.b, this.a);
                }
            }
        }
        if (this.g == null) {
            return;
        }
        if (this.A.get() > 4000000) {
            this.g.handleFrameDropStarted();
            this.s.incrementAndGet();
            this.C = true;
            return;
        }
        b bVar2 = this.f;
        boolean z = bVar2.c;
        if (this.C && !z) {
            this.s.incrementAndGet();
            return;
        }
        this.C = false;
        byte[] byteArray = bVar2.b.toByteArray();
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(byteArray.length);
        nativeAllocateByteBuffer.limit(byteArray.length);
        nativeAllocateByteBuffer.put(byteArray);
        nativeAllocateByteBuffer.rewind();
        this.z.incrementAndGet();
        this.A.addAndGet(nativeAllocateByteBuffer.capacity());
        EncodedImage createEncodedImage = EncodedImage.builder().setBuffer(nativeAllocateByteBuffer, new tdf(2)).setCaptureTimeNs(SystemClock.elapsedRealtimeNanos()).setEncodedWidth(this.k.intValue()).setEncodedHeight(this.l.intValue()).setFrameType(z ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta).createEncodedImage();
        h5z0 h5z0Var3 = this.g;
        if (h5z0Var3 != null) {
            h5z0Var3.submitFrame(createEncodedImage);
            if (createEncodedImage.frameType == EncodedImage.FrameType.VideoFrameKey) {
                this.q.incrementAndGet();
            }
            if (createEncodedImage.frameType == EncodedImage.FrameType.VideoFrameDelta) {
                this.r.incrementAndGet();
                return;
            }
            return;
        }
        this.z.decrementAndGet();
        nativeAllocateByteBuffer.rewind();
        this.A.addAndGet(-nativeAllocateByteBuffer.capacity());
        JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
        this.s.incrementAndGet();
    }
}
