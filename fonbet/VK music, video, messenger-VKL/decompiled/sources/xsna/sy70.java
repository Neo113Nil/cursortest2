package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import kotlin.NotImplementedError;
import one.video.streaming.oktp.OktpJNI;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.media.LiveStreamStatReporterDebugLog;
import ru.ok.media.NativeAACCaptureAndEncode;
import ru.ok.media.OkmpStreamer;
import ru.ok.media.ReachabilityServiceImpl;
import ru.ok.media.StreamerPacketsInfo;
import ru.ok.media.StreamerStatistic;
import ru.ok.media.StreamingLaunchScheduler;
import ru.ok.media.StreamingStatisticsHandler;
import ru.ok.media.api.AACAudioProvider;
import ru.ok.media.api.LiveStreamStatReporter;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.StreamerState;
import ru.ok.media.api.VideoCBRMode;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.StreamerDebugUtils;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.AudioAdaptationConfig;
import ru.ok.proto.BitrateConfiguration;
import ru.ok.proto.PublisherConfiguration;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: OkLiveRecorder.kt */
/* loaded from: classes3.dex */
public final class sy70 extends com.vk.media.recorder.f implements Streamer.Listener, StreamingLaunchScheduler.Listener {
    public static final VideoCBRMode c0 = VideoCBRMode.ENABLED;
    public static final bpn0 d0 = new bpn0(new uz(19));
    public static final bpn0 e0 = new bpn0(new ku70(1));
    public final Context H;
    public final JSONObject I;
    public syf0 J;
    public sk9 K;
    public final ReachabilityServiceImpl M;
    public PublisherConfiguration N;
    public NativeAACCaptureAndEncode O;
    public OkmpStreamer P;
    public StreamingLaunchScheduler Q;
    public StreamingStatisticsHandler R;
    public final b S;
    public Boolean T;
    public nv70 U;
    public final boolean V;
    public boolean X;
    public int Y;
    public Integer Z;
    public VideoSize b0;
    public final tto0 L = new tto0();
    public int W = -1;
    public int a0 = io9.a();

    /* compiled from: OkLiveRecorder.kt */
    public static final class a {
        public static String a(sk9 sk9Var, Streamer streamer, StreamingLaunchScheduler streamingLaunchScheduler) {
            StringBuilder sb = new StringBuilder();
            khu0 khu0Var = sk9Var != null ? sk9Var.i0 : null;
            MediaUtils.e j = sk9Var != null ? sk9Var.j() : null;
            StringBuilder sb2 = new StringBuilder("Camera: ");
            if (khu0Var != null) {
                sb2.append(khu0Var.c() ? "v2" : "v1");
                sb2.append(" ");
                sb2.append(khu0Var.a() == 0 ? "back" : "front");
            } else {
                sb2.append("null");
            }
            if (j != null) {
                sb2.append(" " + j.a + 'x' + j.b + '@' + j.d);
            }
            if (khu0Var != null) {
                sb2.append(" " + khu0Var.getOrientation() + "° (" + io9.a() + "°)");
            }
            sb.append(sb2.toString());
            sb.append("\n");
            sb.append(StreamerDebugUtils.getDebugString(streamer));
            if (streamingLaunchScheduler != null) {
                sb.append("\nLauncher: ");
                sb.append(streamingLaunchScheduler.getDebugInfo());
            }
            return sb.toString();
        }

        public static void b(Streamer streamer) {
            StreamerState state = streamer.getState();
            if (!state.isFinal()) {
                ne7.t("OkLiveRecorder", "Waiting streamer (now " + state.name() + "))");
                ((Handler) sy70.e0.getValue()).postDelayed(new b04(streamer, 10), 1000L);
                return;
            }
            ne7.t("OkLiveRecorder", "Streamer is in final state");
            LiveStreamStatReporter statsReporter = streamer.getStatsReporter();
            if (statsReporter != null) {
                StreamerStatistic statistic = streamer.getStatistic();
                statsReporter.streamLink(statistic.getState(), statistic.getLinkStats());
                statsReporter.streamEnded("");
            }
        }
    }

    /* compiled from: OkLiveRecorder.kt */
    public static final class b implements LoggerInterface {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // ru.ok.media.logging.LoggerInterface
        public final boolean detailedEnabled() {
            return true;
        }

        @Override // ru.ok.media.logging.LoggerInterface
        public final String getNetType() {
            c cVar = this.a;
            NetworkInfo a = cVar.a();
            String subtypeName = a != null ? a.getType() == 0 ? a.getSubtypeName() : a.getTypeName() : "unknown";
            if (a != null && a.getType() == 1) {
                return subtypeName;
            }
            StringBuilder b = v1v.b(subtypeName, JwtParser.SEPARATOR_CHAR);
            b.append(cVar.getNetworkOperatorName());
            return b.toString();
        }

        @Override // ru.ok.media.logging.LoggerInterface
        public final void logDetailed(String str) {
            ne7.t("OkLiveRecorder", "logDetailed() - ".concat(str));
        }

        @Override // ru.ok.media.logging.LoggerInterface
        public final void logEvent(String str, String str2, String str3) {
            StringBuilder a = xe9.a("logEvent() - ", str, " statType= ", str2, " param= ");
            a.append(str3);
            ne7.t("OkLiveRecorder", a.toString());
        }
    }

    /* compiled from: OkLiveRecorder.kt */
    public interface c {
        NetworkInfo a();

        String getNetworkOperatorName();
    }

    public sy70(Context context, JSONObject jSONObject, c cVar, boolean z) {
        this.H = context;
        this.I = jSONObject;
        this.S = new b(cVar);
        this.V = jSONObject.optBoolean("unflip", false);
        if (z || jSONObject.optBoolean("log")) {
            axi axiVar = new axi(new boolean[]{true, true, true, true, true}, jSONObject.optBoolean("logMsgOktp", false), jSONObject.optBoolean("logMsgOkmp", false));
            if (!axiVar.equals(jfe0.b)) {
                ne7.i = new jfe0(axiVar);
                jfe0.b = axiVar;
            }
        } else if (!epx.f(null, jfe0.b)) {
            ne7.i = null;
            jfe0.b = null;
        }
        this.A = RecorderBase.RecordingType.LIVE;
        this.F.b = true;
        this.k = false;
        this.z = 0L;
        this.r = RecorderBase.State.PREPARED;
        this.M = new ReachabilityServiceImpl(new tto0(), (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"));
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void A() {
        ne7.t("OkLiveRecorder", "stop()");
        StreamingLaunchScheduler streamingLaunchScheduler = this.Q;
        if (streamingLaunchScheduler != null) {
            streamingLaunchScheduler.setForeground(false);
        }
    }

    @Override // com.vk.media.recorder.f
    public final void D() {
        nv70 nv70Var = this.U;
        if (nv70Var != null) {
            ((FrameBuffer) nv70Var.c).release();
            ((SimpleGLProgram) nv70Var.d).release();
            this.U = null;
        }
    }

    @Override // com.vk.media.recorder.f
    public final void L(pes pesVar, fap fapVar) {
        OkmpStreamer okmpStreamer;
        if (this.r != RecorderBase.State.IDLE) {
            PublisherConfiguration publisherConfiguration = this.N;
            boolean z = false;
            int i = (publisherConfiguration != null ? publisherConfiguration.dump_flags : 0) & 256;
            oj9 oj9Var = this.c;
            if (i != 0) {
                ne7.m("OkLiveRecorder", "recordFrame() - config.config= " + oj9Var.e + " isPrepared= " + H());
            }
            if (!H()) {
                nv70 nv70Var = this.U;
                if (nv70Var != null) {
                    ((FrameBuffer) nv70Var.c).release();
                    ((SimpleGLProgram) nv70Var.d).release();
                    this.U = null;
                }
            } else if (oj9Var.e != null) {
                P();
                long nanoTime = H() ? System.nanoTime() : 0L;
                try {
                    yk9 yk9Var = this.e;
                    if (yk9Var != null) {
                        xk9 xk9Var = yk9Var.a;
                        int i2 = xk9Var.b.e;
                        MediaUtils.d dVar = xk9Var.d;
                        int i3 = dVar.a;
                        int i4 = dVar.b;
                        uyf0 uyf0Var = new uyf0(i2, true, i3, i4, xk9Var.g, xk9Var.c);
                        if (uyf0Var.a >= 0 && uyf0Var.b > 0 && uyf0Var.c > 0) {
                            z = true;
                        }
                        if (z) {
                            VideoSize videoSize = new VideoSize(i3, i4);
                            MediaUtils.d dVar2 = this.E;
                            VideoSize newWithSameOrientation = new VideoSize(dVar2.a, dVar2.b).newWithSameOrientation(videoSize);
                            nv70 a2 = nv70.a(this.U, newWithSameOrientation.getWidth(), newWithSameOrientation.getHeight());
                            this.U = a2;
                            if (a2 != null) {
                                FrameBuffer frameBuffer = (FrameBuffer) a2.c;
                                frameBuffer.bind();
                                xk9Var.h(newWithSameOrientation.getWidth(), newWithSameOrientation.getHeight());
                                yk9Var.a(pesVar);
                                frameBuffer.unbind();
                                this.F.a(nanoTime);
                                Streamer.VideoFrame Q = Q();
                                if (Q != null && (okmpStreamer = this.P) != null) {
                                    okmpStreamer.processVideoFrame((GL10) ((EGL10) EGLContext.getEGL()).eglGetCurrentContext().getGL(), Q);
                                }
                            } else {
                                ne7.n("OkLiveRecorder", "recordFrame() - bad offscreenBuffer= " + a2);
                            }
                        } else {
                            ne7.n("OkLiveRecorder", "recordFrame() - bad renderTextureInfo= " + uyf0Var);
                        }
                    } else {
                        ne7.n("OkLiveRecorder", "recordFrame() - onRenderFrameListener= " + yk9Var);
                    }
                } catch (Throwable th) {
                    ne7.n("RecorderBase", "can't record frame " + th);
                }
            }
            super.r(System.nanoTime());
        }
    }

    @Override // com.vk.media.recorder.f
    public final void M(syf0 syf0Var) {
        this.J = syf0Var;
    }

    public final Streamer.VideoFrame Q() {
        int i;
        yk9 yk9Var = this.e;
        if (yk9Var == null) {
            ne7.m("OkLiveRecorder", "buildVideoFrame() - unexpected onRenderFrameListener= " + yk9Var);
            return null;
        }
        nv70 nv70Var = this.U;
        if (nv70Var == null) {
            ne7.m("OkLiveRecorder", "buildVideoFrame() - unexpected offscreenBuffer= " + nv70Var);
            return null;
        }
        Integer num = this.Z;
        if (num == null) {
            ne7.m("OkLiveRecorder", "buildVideoFrame() - unexpected deviceOrientationAtLiveStart= " + num);
            return null;
        }
        FrameBuffer frameBuffer = (FrameBuffer) nv70Var.c;
        uyf0 uyf0Var = frameBuffer == null ? null : new uyf0(frameBuffer.getTextureId(), false, frameBuffer.getWidth(), frameBuffer.getHeight(), null, null);
        if (uyf0Var == null || uyf0Var.a < 0 || uyf0Var.b <= 0 || uyf0Var.c <= 0) {
            ne7.m("OkLiveRecorder", "buildVideoFrame() - bad textureInfo= " + uyf0Var);
            return null;
        }
        int a2 = io9.a();
        sk9 sk9Var = this.K;
        khu0 khu0Var = sk9Var != null ? sk9Var.i0 : null;
        VideoSize videoSize = new VideoSize(uyf0Var.b, uyf0Var.c);
        if (!videoSize.equals(this.b0)) {
            this.b0 = videoSize;
            this.a0 = a2;
        }
        int i2 = this.a0;
        Integer num2 = this.Z;
        boolean z = this.V;
        if (num2 != null) {
            int intValue = num2.intValue();
            i = (((i2 + 360) - intValue) + ((z && this.X && i2 != intValue) ? 180 : 0)) % 360;
        } else {
            i = 0;
        }
        yis0 yis0Var = new yis0(uyf0Var.a, uyf0Var.d, uyf0Var.b, uyf0Var.c, uyf0Var.e, uyf0Var.f);
        if (z && this.X) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            float[] fArr2 = yis0Var.e;
            Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr2, 0);
        }
        if (i != 0) {
            videoSize = videoSize.rotate(i);
            float[] fArr3 = new float[16];
            Matrix.setRotateM(fArr3, 0, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
            float[] fArr4 = yis0Var.e;
            Matrix.multiplyMM(fArr4, 0, fArr3, 0, fArr4, 0);
        }
        this.L.getClass();
        Streamer.VideoFrame videoFrame = new Streamer.VideoFrame(videoSize, yis0Var, i, SystemClock.elapsedRealtime());
        PublisherConfiguration publisherConfiguration = this.N;
        if (((publisherConfiguration != null ? publisherConfiguration.dump_flags : 0) & 256) != 0) {
            StringBuilder sb = new StringBuilder("buildVideoFrame() - orientation ");
            cgn.a(this.a0, a2, " (", ") angle= ", sb);
            sb.append(i);
            sb.append(" vkCameraInfo= { orientation: ");
            sb.append(khu0Var != null ? Integer.valueOf(khu0Var.getOrientation()) : null);
            sb.append(" facing: ");
            sb.append(khu0Var != null ? Integer.valueOf(khu0Var.a()) : null);
            sb.append(" isCamera2: ");
            sb.append(khu0Var != null ? Boolean.valueOf(khu0Var.c()) : null);
            sb.append(" } cameraConfig: { ");
            oj9 oj9Var = this.c;
            sb.append(oj9Var != null ? oj9Var.e : null);
            sb.append(" } cameraRenderConfig: ");
            sk9 sk9Var2 = this.K;
            sb.append(sk9Var2 != null ? sk9Var2.j() : null);
            sb.append(" videoFrame= ");
            sb.append(videoFrame);
            ne7.m("OkLiveRecorder", sb.toString());
        }
        return videoFrame;
    }

    public final int R(int i, khu0 khu0Var) {
        int orientation = khu0Var.getOrientation();
        if (1 == khu0Var.a()) {
            orientation = -orientation;
        }
        return (((((orientation - this.Y) + PublisherConfiguration.DEFAULT_MAX_RES) % 360) + 360) - i) % 360;
    }

    public final void S(boolean z) {
        ne7.m("OkLiveRecorder", "reportConnected() - " + this.T + " -> " + z);
        this.T = Boolean.valueOf(z);
        f(z ? -1005 : -1006);
    }

    public final void T() {
        ne7.t("OkLiveRecorder", "stopRecord() - state= " + this.r + " recording= " + this.q);
        this.q = false;
        StreamingLaunchScheduler streamingLaunchScheduler = this.Q;
        if (streamingLaunchScheduler != null) {
            streamingLaunchScheduler.setDelegate(null);
            streamingLaunchScheduler.close();
            this.Q = null;
        }
        OkmpStreamer okmpStreamer = this.P;
        if (okmpStreamer != null) {
            okmpStreamer.stop();
            okmpStreamer.removeListener(this);
            this.P = null;
        }
        NativeAACCaptureAndEncode nativeAACCaptureAndEncode = this.O;
        if (nativeAACCaptureAndEncode != null) {
            nativeAACCaptureAndEncode.release();
            this.O = null;
        }
        StreamingStatisticsHandler streamingStatisticsHandler = this.R;
        if (streamingStatisticsHandler != null) {
            streamingStatisticsHandler.cleanup();
            this.R = null;
        }
        if (okmpStreamer != null) {
            ((Handler) e0.getValue()).post(new u12(okmpStreamer, 9));
        }
        this.Z = null;
        this.r = RecorderBase.State.PREPARED;
    }

    public final void U() {
        if (this.q) {
            sk9 sk9Var = this.K;
            khu0 khu0Var = sk9Var != null ? sk9Var.i0 : null;
            if (khu0Var == null) {
                ne7.J("OkLiveRecorder", "updateCameraRotation - no VkCameraInfo");
                return;
            }
            int a2 = io9.a();
            int R = R(a2, khu0Var);
            boolean z = 1 == khu0Var.a();
            int i = this.W;
            if (this.X) {
                i = 180 - i;
            }
            if (((((i + 3600) % 360) - (((z ? 180 - R : R) + 3600) % 360)) + 360) % 360 == 180) {
                this.Y = (this.Y + 180) % 360;
                R = R(a2, khu0Var);
            }
            if (R == this.W && z == this.X) {
                StringBuilder b2 = ji.b(a2, "updateCameraRotation - NO changes, deviceOrientation = ", ", camera = ");
                b2.append(khu0Var.getOrientation());
                b2.append(", rotation = ");
                b2.append(R);
                b2.append(", isFront = ");
                b2.append(z);
                ne7.m("OkLiveRecorder", b2.toString());
                return;
            }
            StringBuilder b3 = ji.b(a2, "updateCameraRotation - VKCameraInfo available, deviceOrientation = ", ", camera = ");
            b3.append(khu0Var.getOrientation());
            b3.append(", rotation = ");
            b3.append(R);
            b3.append(", isFront = ");
            b3.append(z);
            ne7.m("OkLiveRecorder", b3.toString());
            this.W = R;
            this.X = z;
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void c() {
        T();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final oom0 d() {
        AACAudioProvider.Params currentParams;
        OkmpStreamer okmpStreamer = this.P;
        if (okmpStreamer == null) {
            return null;
        }
        StreamerStatistic statistic = okmpStreamer.getStatistic();
        StreamerPacketsInfo packetsInfo = statistic.getPacketsInfo();
        NativeAACCaptureAndEncode nativeAACCaptureAndEncode = this.O;
        int bitrate = (nativeAACCaptureAndEncode == null || (currentParams = nativeAACCaptureAndEncode.getCurrentParams()) == null) ? 0 : currentParams.getBitrate();
        int bandwidth = statistic.getBandwidth() - bitrate;
        String proto = statistic.getProto();
        int connectionId = statistic.getConnectionId();
        long bytesSent = packetsInfo.getBytesSent();
        long bytesReceived = packetsInfo.getBytesReceived();
        long audioPacketsLost = packetsInfo.getAudioPacketsLost();
        long audioPacketsSent = packetsInfo.getAudioPacketsSent();
        double fps = statistic.getFps();
        long videoPacketsLost = packetsInfo.getVideoPacketsLost();
        long videoPacketsSent = packetsInfo.getVideoPacketsSent();
        int bitrate2 = statistic.getBitrate();
        Integer width = statistic.getWidth();
        int intValue = width != null ? width.intValue() : 0;
        Integer height = statistic.getHeight();
        int intValue2 = height != null ? height.intValue() : 0;
        Integer rotationAngle = statistic.getRotationAngle();
        int intValue3 = rotationAngle != null ? rotationAngle.intValue() : -1;
        Long lastPresentationTimeInSeconds = statistic.getLastPresentationTimeInSeconds();
        return new oom0(proto, connectionId, bytesSent, bytesReceived, audioPacketsLost, audioPacketsSent, fps, videoPacketsLost, videoPacketsSent, bitrate2, bitrate, bandwidth, intValue, intValue2, intValue3, lastPresentationTimeInSeconds != null ? lastPresentationTimeInSeconds.longValue() : 0L, a.a(this.K, okmpStreamer, this.Q));
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void h(jhu0 jhu0Var) {
        ne7.m("OkLiveRecorder", "onCameraUpdated() - " + jhu0Var);
        sk9 sk9Var = this.K;
        if (jhu0Var != null && sk9Var != null) {
            jhu0Var.a();
            int i = sk9Var.h0;
        }
        U();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void i() {
        LiveStreamStatReporter statsReporter;
        OkmpStreamer okmpStreamer = this.P;
        if (okmpStreamer == null || (statsReporter = okmpStreamer.getStatsReporter()) == null) {
            return;
        }
        statsReporter.setApplicationState(LiveStreamStatReporter.ApplicationState.inactive);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void j() {
        LiveStreamStatReporter statsReporter;
        OkmpStreamer okmpStreamer = this.P;
        if (okmpStreamer == null || (statsReporter = okmpStreamer.getStatsReporter()) == null) {
            return;
        }
        statsReporter.setApplicationState(LiveStreamStatReporter.ApplicationState.active);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void k() {
        U();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean l() {
        ne7.t("OkLiveRecorder", "prepare() - state= " + this.r);
        if (this.r == RecorderBase.State.RECORDING) {
            return true;
        }
        this.r = RecorderBase.State.PREPARED;
        f(-1000);
        return true;
    }

    @Override // com.vk.media.recorder.f, com.vk.media.recorder.RecorderBase
    public final void m() {
        ne7.t("OkLiveRecorder", "release() - state= " + this.r);
        super.m();
        T();
        this.r = RecorderBase.State.IDLE;
        this.M.release();
    }

    @Override // ru.ok.media.api.Streamer.Listener
    public final void onStreamerStateChanged(StreamerState streamerState, StreamerState streamerState2) {
        ne7.t("OkLiveRecorder", "onStreamerStateChanged() - " + streamerState2 + " -> " + streamerState);
        if (streamerState2 == StreamerState.starting && streamerState == StreamerState.started) {
            S(true);
            J();
            f(-1004);
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean r(long j) {
        throw null;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void s(MediaUtils.e eVar) {
        MediaUtils.e eVar2 = this.c.e;
        boolean e = io9.e(eVar2, eVar);
        ne7.m("OkLiveRecorder", "setProfile() - " + eVar2 + " -> " + eVar);
        this.c.e = eVar;
        if (!e && this.q) {
            U();
        }
    }

    @Override // ru.ok.media.StreamingLaunchScheduler.Listener
    public final void streamLaunchFailed() {
        ne7.n("OkLiveRecorder", "streamLaunchFailed()");
        T();
        S(false);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void t(sk9 sk9Var) {
        this.K = sk9Var;
        this.J = (syf0) sk9Var.l.b;
        super.t(sk9Var);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void u(boolean z) {
        ne7.t("OkLiveRecorder", "setSilence() - isSilence= " + z);
        if (z) {
            throw new NotImplementedError("An operation is not implemented: OkLiveRecorder.setSilence() is not implemented yet");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b3  */
    @Override // com.vk.media.recorder.RecorderBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z() {
        long j;
        boolean z;
        long j2;
        int i;
        int i2;
        BitrateConfiguration bitrateConfiguration;
        BitrateConfiguration bitrateConfiguration2;
        AudioAdaptationConfig audioAdaptationConfig;
        AudioAdaptationConfig audioAdaptationConfig2;
        int i3;
        long j3;
        int i4;
        boolean z2;
        long j4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str;
        String str2;
        int i8;
        String str3;
        int i9;
        int i10;
        String str4;
        boolean z4;
        boolean z5;
        boolean z6;
        long j5;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j6;
        boolean z8;
        boolean z9;
        boolean z10;
        long j7;
        BitrateConfiguration bitrateConfiguration3;
        boolean z11;
        long j8;
        int i17;
        boolean z12;
        String str5;
        int length;
        LiveStreamStatReporter liveStreamStatReporter;
        String optString;
        ne7.t("OkLiveRecorder", "start()");
        if (!TextUtils.isEmpty(this.n) || !TextUtils.isEmpty(this.o)) {
            ne7.m("OkLiveRecorder", "start called state=" + this.r);
            if (this.q) {
                StreamingLaunchScheduler streamingLaunchScheduler = this.Q;
                if (streamingLaunchScheduler != null) {
                    streamingLaunchScheduler.setForeground(true);
                }
            } else {
                this.q = true;
                ne7.t("OkLiveRecorder", "startRecord() - state= " + this.r + " recording= " + this.q + " rtmp_url=" + this.n + " okmp_url=" + this.o);
                if (!this.q || this.r == RecorderBase.State.RECORDING) {
                    ne7.o("OkLiveRecorder", "startRecord() - inconsistent state, check the caller's logic!", new Exception());
                } else {
                    pj9 pj9Var = this.h;
                    if (pj9Var != null) {
                        pj9Var.b(this.c);
                    }
                    if (this.c.e == null) {
                        ne7.n("OkLiveRecorder", "startRecord() - can't create recorder on empty profile");
                    } else {
                        if (this.Z == null) {
                            this.Z = Integer.valueOf(io9.a());
                            ne7.m("OkLiveRecorder", "startRecord() - deviceOrientationAtLiveStart= " + this.Z);
                        }
                        Context context = this.H;
                        JSONObject jSONObject = this.I;
                        int i18 = 300;
                        int i19 = 4;
                        LiveStreamStatReporter liveStreamStatReporter2 = null;
                        if (jSONObject == null) {
                            str4 = PublisherConfiguration.DEFAULT_AUDIO_CONFIG;
                            str3 = PublisherConfiguration.DEFAULT_VENC_SETTINGS;
                            str5 = PublisherConfiguration.DEFAULT_MIC_TYPE;
                            z2 = true;
                            z3 = true;
                            z11 = true;
                            z4 = true;
                            z12 = true;
                            j5 = 40000;
                            j8 = 60000;
                            j4 = -1;
                            bitrateConfiguration3 = null;
                            audioAdaptationConfig2 = null;
                            str = "";
                            str2 = str;
                            i17 = PublisherConfiguration.DEFAULT_MAX_MTU;
                            z5 = false;
                            z6 = false;
                            i8 = PublisherConfiguration.DEFAULT_MAX_RES;
                            j6 = PublisherConfiguration.DEFAULT_MAX_VIDEO_BITRATE;
                            z7 = false;
                            i7 = PublisherConfiguration.DEFAULT_AUDIO_DSHIFT;
                            i11 = -1;
                            i6 = PublisherConfiguration.DEFAULT_MAX_DELAY_MS;
                            i12 = 3;
                            i13 = -1;
                            i14 = -1;
                            i15 = 0;
                            i16 = 0;
                            j7 = PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK;
                            z8 = false;
                            z9 = false;
                            z10 = false;
                            i10 = 0;
                            i3 = 0;
                            j3 = 0;
                            i4 = 3;
                            i5 = 0;
                            i9 = 0;
                        } else {
                            long optLong = jSONObject.optLong("reconnect_timeout", 60000L);
                            long optLong2 = jSONObject.optLong("reconnection_count", -1L);
                            long optLong3 = jSONObject.optLong("resume_timeout", PublisherConfiguration.DEFAULT_RESUME_TIMEOUT);
                            i19 = jSONObject.optInt("creation_strategy", 4);
                            i18 = jSONObject.optInt("min_mtu", 300);
                            int optInt = jSONObject.optInt("max_mtu", PublisherConfiguration.DEFAULT_MAX_MTU);
                            boolean optBoolean = jSONObject.optBoolean("agc", true);
                            boolean optBoolean2 = jSONObject.optBoolean(UcumUtils.UCUM_NANOSECONDS, true);
                            boolean optBoolean3 = jSONObject.optBoolean("16k", true);
                            String optString2 = jSONObject.optString("audio_config", PublisherConfiguration.DEFAULT_AUDIO_CONFIG);
                            boolean optBoolean4 = jSONObject.optBoolean("encrypt_sig", true);
                            boolean optBoolean5 = jSONObject.optBoolean("encrypt_audio", false);
                            boolean optBoolean6 = jSONObject.optBoolean("encrypt_video", false);
                            int optInt2 = jSONObject.optInt("max_res", PublisherConfiguration.DEFAULT_MAX_RES);
                            long optLong4 = jSONObject.optLong("max_video_bitrate", PublisherConfiguration.DEFAULT_MAX_VIDEO_BITRATE);
                            String optString3 = jSONObject.optString("venc_settings", PublisherConfiguration.DEFAULT_VENC_SETTINGS);
                            String optString4 = jSONObject.optString("mic_type", PublisherConfiguration.DEFAULT_MIC_TYPE);
                            boolean optBoolean7 = jSONObject.optBoolean("sn", false);
                            int optInt3 = jSONObject.optInt("dshift", PublisherConfiguration.DEFAULT_AUDIO_DSHIFT);
                            int optInt4 = jSONObject.optInt("tos", -1);
                            int optInt5 = jSONObject.optInt("delay_ms", PublisherConfiguration.DEFAULT_MAX_DELAY_MS);
                            int optInt6 = jSONObject.optInt("keyframe_interval", 3);
                            int optInt7 = jSONObject.optInt("emulate_send_error_period_millis", -1);
                            int optInt8 = jSONObject.optInt("emulate_recv_error_period_millis", -1);
                            int optInt9 = jSONObject.optInt("emulate_packet_loss", 0);
                            int optInt10 = jSONObject.optInt("max_enobufs_millis", 0);
                            long optLong5 = jSONObject.optLong("low_bandwidth_mark", PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK);
                            String str6 = "";
                            String str7 = "";
                            boolean z13 = jSONObject.optInt("save_flv", 0) != 0;
                            boolean z14 = jSONObject.optInt("save_sent_flv", 0) != 0;
                            boolean z15 = jSONObject.optInt("save_audio", 0) != 0;
                            boolean z16 = jSONObject.optInt("clean_saved_on_startup", 1) != 0;
                            if (z13 || z14 || z15) {
                                j = optLong5;
                                boolean z17 = z16;
                                z = optBoolean3;
                                synchronized (yiz.b) {
                                    try {
                                        if (yiz.c) {
                                            j2 = optLong;
                                            i = optInt;
                                        } else {
                                            j2 = optLong;
                                            StringBuilder sb = new StringBuilder();
                                            i = optInt;
                                            sb.append(context.getCacheDir().getAbsolutePath());
                                            sb.append(File.separator);
                                            sb.append("_live_pub_dbg");
                                            File file = new File(sb.toString());
                                            if (z17) {
                                                try {
                                                    if (file.exists() && !nbr.l(file)) {
                                                        ne7.n("Publisher", "LiveDebugFileStorage.init() failed to delete '" + file.getAbsolutePath() + '\'');
                                                    }
                                                } catch (Exception e) {
                                                    ne7.n("Publisher", "LiveDebugFileStorage.init() failed to prepare the folder '" + file.getAbsolutePath() + "' for Live Publisher debug files, error: " + e);
                                                }
                                            }
                                            if (file.mkdirs()) {
                                                yiz.d = file;
                                                yiz.c = true;
                                                ne7.t("Publisher", "LiveDebugFileStorage.init() prepared the folder '" + file.getAbsolutePath() + "' for Live Publisher debug files");
                                            } else {
                                                ne7.n("Publisher", "LiveDebugFileStorage.init() failed to create folder '" + file.getAbsolutePath() + "' for Live Publisher debug files");
                                            }
                                            s3q0 s3q0Var = s3q0.a;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                File file2 = yiz.d;
                                if (file2 != null) {
                                    str6 = file2.getAbsolutePath() + File.separator;
                                    str7 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HHmmss"));
                                }
                            } else {
                                j = optLong5;
                                z = optBoolean3;
                                j2 = optLong;
                                i = optInt;
                            }
                            int optInt11 = jSONObject.optInt("fix_audio_sr", 0);
                            int optInt12 = jSONObject.optInt("fix_audio_br_kbps", 0);
                            long optLong6 = jSONObject.optLong("override_initial_bitrate", 0L);
                            int optInt13 = jSONObject.optInt("send_over_delivery_threshold", 3);
                            int optInt14 = jSONObject.optInt("send_over_delivery_millis", 0);
                            int optInt15 = jSONObject.optInt("dump_flags", 0);
                            JSONObject optJSONObject = jSONObject.optJSONObject(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
                            if (optJSONObject != null) {
                                BitrateConfiguration.Builder builder = new BitrateConfiguration.Builder();
                                i2 = optInt11;
                                kfe0.b(builder, optJSONObject.optJSONArray("fullhd"), VideoSize.FULLHD_VIDEO_SIZE);
                                kfe0.b(builder, optJSONObject.optJSONArray("hd"), VideoSize.HD_VIDEO_SIZE);
                                kfe0.b(builder, optJSONObject.optJSONArray("fast"), VideoSize.FAST_VIDEO_SIZE);
                                kfe0.b(builder, optJSONObject.optJSONArray("faster"), VideoSize.FASTER_VIDEO_SIZE);
                                kfe0.b(builder, optJSONObject.optJSONArray("fastest"), VideoSize.FASTEST_VIDEO_SIZE);
                                bitrateConfiguration = builder.build();
                            } else {
                                i2 = optInt11;
                                bitrateConfiguration = null;
                            }
                            JSONArray optJSONArray = jSONObject.optJSONArray("audio");
                            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                                bitrateConfiguration2 = bitrateConfiguration;
                            } else {
                                try {
                                    AudioAdaptationConfig.Builder builder2 = new AudioAdaptationConfig.Builder();
                                    int i20 = 0;
                                    while (i20 < length) {
                                        bitrateConfiguration2 = bitrateConfiguration;
                                        try {
                                            kfe0.a(builder2, optJSONArray.getJSONObject(i20));
                                            i20++;
                                            bitrateConfiguration = bitrateConfiguration2;
                                        } catch (JSONException e2) {
                                            e = e2;
                                            ne7.n("Publisher", "Failed to parse \"audio\", will use the default, error: " + e);
                                            audioAdaptationConfig = null;
                                            audioAdaptationConfig2 = audioAdaptationConfig;
                                            i3 = optInt12;
                                            j3 = optLong6;
                                            i4 = optInt13;
                                            z2 = optBoolean;
                                            j4 = optLong2;
                                            z3 = optBoolean2;
                                            i5 = optInt14;
                                            i6 = optInt5;
                                            i7 = optInt3;
                                            str = str6;
                                            str2 = str7;
                                            i8 = optInt2;
                                            str3 = optString3;
                                            i9 = optInt15;
                                            i10 = i2;
                                            str4 = optString2;
                                            z4 = optBoolean4;
                                            z5 = optBoolean5;
                                            z6 = optBoolean6;
                                            j5 = optLong3;
                                            z7 = optBoolean7;
                                            i11 = optInt4;
                                            i12 = optInt6;
                                            i13 = optInt7;
                                            i14 = optInt8;
                                            i15 = optInt9;
                                            i16 = optInt10;
                                            j6 = optLong4;
                                            z8 = z13;
                                            z9 = z14;
                                            z10 = z15;
                                            j7 = j;
                                            bitrateConfiguration3 = bitrateConfiguration2;
                                            z11 = z;
                                            j8 = j2;
                                            i17 = i;
                                            z12 = false;
                                            str5 = optString4;
                                            int i21 = i18;
                                            int i22 = i19;
                                            if (str4 == null) {
                                            }
                                            String str8 = str4;
                                            if (str3 == null) {
                                            }
                                            String str9 = str3;
                                            if (str5 == null) {
                                            }
                                            PublisherConfiguration publisherConfiguration = new PublisherConfiguration(j8, j4, j5, i22, bitrateConfiguration3, audioAdaptationConfig2, i21, i17, z2, z3, z11, str8, z4, z5, z6, i8, j6, str9, str5, z7, i7, i11, i6, 4000, i12, i13, i14, i15, i16, j7, str, str2, z8, z9, z10, z12, i10, i3, j3, i4, i5, i9);
                                            Context applicationContext = this.H.getApplicationContext();
                                            if (hpt0.d == -1) {
                                            }
                                            OktpJNI.setPublisherLogger(ne7.i);
                                            this.N = publisherConfiguration;
                                            Context context2 = this.H;
                                            bpn0 bpn0Var = e0;
                                            NativeAACCaptureAndEncode nativeAACCaptureAndEncode = new NativeAACCaptureAndEncode(context2, (Handler) bpn0Var.getValue(), publisherConfiguration.systemAudioCfg, publisherConfiguration.microphoneType, publisherConfiguration.agc, publisherConfiguration.ns, publisherConfiguration.suppress16K, publisherConfiguration.disguiseAudioShift, 128 != (publisherConfiguration.dump_flags & 128), this.L, this.I.optLong("dbg_audio_fail_after_ms", -1L));
                                            this.O = nativeAACCaptureAndEncode;
                                            if (this.C) {
                                            }
                                            liveStreamStatReporter = liveStreamStatReporter2;
                                            Context context3 = this.H;
                                            HandlerThread handlerThread = (HandlerThread) d0.getValue();
                                            b bVar = this.S;
                                            bq00 bq00Var = new bq00(this, 19);
                                            int optInt16 = this.I.optInt("dbg_bw_drop_sec", 0) * 1000;
                                            int optInt17 = this.I.optInt("dbg_bw_drop_kbps", 0);
                                            optString = this.I.optString("cbr");
                                            VideoCBRMode videoCBRMode = c0;
                                            if (optString != null) {
                                            }
                                            OkmpStreamer okmpStreamer = new OkmpStreamer(context3, handlerThread, publisherConfiguration, bVar, nativeAACCaptureAndEncode, bq00Var, liveStreamStatReporter, true, -1L, optInt16, optInt17, videoCBRMode, this.I.optInt("vbm", 15));
                                            this.P = okmpStreamer;
                                            okmpStreamer.addListener(this);
                                            StreamingLaunchScheduler streamingLaunchScheduler2 = new StreamingLaunchScheduler(okmpStreamer, this.M, new Handler(Looper.getMainLooper()));
                                            this.Q = streamingLaunchScheduler2;
                                            streamingLaunchScheduler2.setDelegate(this);
                                            if (liveStreamStatReporter != null) {
                                            }
                                            this.R = new StreamingStatisticsHandler(okmpStreamer, (Handler) bpn0Var.getValue(), this.L);
                                            U();
                                            if (TextUtils.isEmpty(this.o)) {
                                            }
                                            ne7.n("OkLiveRecorder", "startRecord() - failed due to OKMP URI (" + this.o + ") or key (" + this.p + ") are empty!");
                                            T();
                                            S(false);
                                            return this.q;
                                        }
                                    }
                                    bitrateConfiguration2 = bitrateConfiguration;
                                    audioAdaptationConfig = builder2.build();
                                } catch (JSONException e3) {
                                    e = e3;
                                    bitrateConfiguration2 = bitrateConfiguration;
                                }
                                audioAdaptationConfig2 = audioAdaptationConfig;
                                i3 = optInt12;
                                j3 = optLong6;
                                i4 = optInt13;
                                z2 = optBoolean;
                                j4 = optLong2;
                                z3 = optBoolean2;
                                i5 = optInt14;
                                i6 = optInt5;
                                i7 = optInt3;
                                str = str6;
                                str2 = str7;
                                i8 = optInt2;
                                str3 = optString3;
                                i9 = optInt15;
                                i10 = i2;
                                str4 = optString2;
                                z4 = optBoolean4;
                                z5 = optBoolean5;
                                z6 = optBoolean6;
                                j5 = optLong3;
                                z7 = optBoolean7;
                                i11 = optInt4;
                                i12 = optInt6;
                                i13 = optInt7;
                                i14 = optInt8;
                                i15 = optInt9;
                                i16 = optInt10;
                                j6 = optLong4;
                                z8 = z13;
                                z9 = z14;
                                z10 = z15;
                                j7 = j;
                                bitrateConfiguration3 = bitrateConfiguration2;
                                z11 = z;
                                j8 = j2;
                                i17 = i;
                                z12 = false;
                                str5 = optString4;
                            }
                            audioAdaptationConfig = null;
                            audioAdaptationConfig2 = audioAdaptationConfig;
                            i3 = optInt12;
                            j3 = optLong6;
                            i4 = optInt13;
                            z2 = optBoolean;
                            j4 = optLong2;
                            z3 = optBoolean2;
                            i5 = optInt14;
                            i6 = optInt5;
                            i7 = optInt3;
                            str = str6;
                            str2 = str7;
                            i8 = optInt2;
                            str3 = optString3;
                            i9 = optInt15;
                            i10 = i2;
                            str4 = optString2;
                            z4 = optBoolean4;
                            z5 = optBoolean5;
                            z6 = optBoolean6;
                            j5 = optLong3;
                            z7 = optBoolean7;
                            i11 = optInt4;
                            i12 = optInt6;
                            i13 = optInt7;
                            i14 = optInt8;
                            i15 = optInt9;
                            i16 = optInt10;
                            j6 = optLong4;
                            z8 = z13;
                            z9 = z14;
                            z10 = z15;
                            j7 = j;
                            bitrateConfiguration3 = bitrateConfiguration2;
                            z11 = z;
                            j8 = j2;
                            i17 = i;
                            z12 = false;
                            str5 = optString4;
                        }
                        int i212 = i18;
                        int i222 = i19;
                        if (str4 == null) {
                            str4 = PublisherConfiguration.DEFAULT_AUDIO_CONFIG;
                        }
                        String str82 = str4;
                        if (str3 == null) {
                            str3 = PublisherConfiguration.DEFAULT_VENC_SETTINGS;
                        }
                        String str92 = str3;
                        if (str5 == null) {
                            str5 = PublisherConfiguration.DEFAULT_MIC_TYPE;
                        }
                        PublisherConfiguration publisherConfiguration2 = new PublisherConfiguration(j8, j4, j5, i222, bitrateConfiguration3, audioAdaptationConfig2, i212, i17, z2, z3, z11, str82, z4, z5, z6, i8, j6, str92, str5, z7, i7, i11, i6, 4000, i12, i13, i14, i15, i16, j7, str, str2, z8, z9, z10, z12, i10, i3, j3, i4, i5, i9);
                        Context applicationContext2 = this.H.getApplicationContext();
                        if (hpt0.d == -1) {
                            int i23 = ((ActivityManager) applicationContext2.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
                            hpt0.d = i23 >= 196608 ? 3 : i23 >= 131072 ? 2 : 1;
                        }
                        OktpJNI.setPublisherLogger(ne7.i);
                        this.N = publisherConfiguration2;
                        Context context22 = this.H;
                        bpn0 bpn0Var2 = e0;
                        NativeAACCaptureAndEncode nativeAACCaptureAndEncode2 = new NativeAACCaptureAndEncode(context22, (Handler) bpn0Var2.getValue(), publisherConfiguration2.systemAudioCfg, publisherConfiguration2.microphoneType, publisherConfiguration2.agc, publisherConfiguration2.ns, publisherConfiguration2.suppress16K, publisherConfiguration2.disguiseAudioShift, 128 != (publisherConfiguration2.dump_flags & 128), this.L, this.I.optLong("dbg_audio_fail_after_ms", -1L));
                        this.O = nativeAACCaptureAndEncode2;
                        if (this.C) {
                            String str10 = this.B;
                            if (str10 != null) {
                                liveStreamStatReporter = new imz(str10);
                                Context context32 = this.H;
                                HandlerThread handlerThread2 = (HandlerThread) d0.getValue();
                                b bVar2 = this.S;
                                bq00 bq00Var2 = new bq00(this, 19);
                                int optInt162 = this.I.optInt("dbg_bw_drop_sec", 0) * 1000;
                                int optInt172 = this.I.optInt("dbg_bw_drop_kbps", 0);
                                optString = this.I.optString("cbr");
                                VideoCBRMode videoCBRMode2 = c0;
                                if (optString != null) {
                                    if (optString.equalsIgnoreCase("off")) {
                                        videoCBRMode2 = VideoCBRMode.DISABLED;
                                    } else if (optString.equalsIgnoreCase("on")) {
                                        videoCBRMode2 = VideoCBRMode.ENABLED;
                                    } else if (optString.equalsIgnoreCase("force")) {
                                        videoCBRMode2 = VideoCBRMode.ENFORCED;
                                    } else {
                                        ne7.n("OkLiveRecorder", "parseCBRMode(): incorrect CBR parameter value '" + optString + "', using default CBR value " + videoCBRMode2);
                                    }
                                }
                                OkmpStreamer okmpStreamer2 = new OkmpStreamer(context32, handlerThread2, publisherConfiguration2, bVar2, nativeAACCaptureAndEncode2, bq00Var2, liveStreamStatReporter, true, -1L, optInt162, optInt172, videoCBRMode2, this.I.optInt("vbm", 15));
                                this.P = okmpStreamer2;
                                okmpStreamer2.addListener(this);
                                StreamingLaunchScheduler streamingLaunchScheduler22 = new StreamingLaunchScheduler(okmpStreamer2, this.M, new Handler(Looper.getMainLooper()));
                                this.Q = streamingLaunchScheduler22;
                                streamingLaunchScheduler22.setDelegate(this);
                                if (liveStreamStatReporter != null) {
                                    liveStreamStatReporter.streamCreated(LiveStreamStatReporter.PublisherType.okmp_cpp);
                                }
                                this.R = new StreamingStatisticsHandler(okmpStreamer2, (Handler) bpn0Var2.getValue(), this.L);
                                U();
                                if (!TextUtils.isEmpty(this.o) || TextUtils.isEmpty(this.p)) {
                                    ne7.n("OkLiveRecorder", "startRecord() - failed due to OKMP URI (" + this.o + ") or key (" + this.p + ") are empty!");
                                } else {
                                    StreamingLaunchScheduler streamingLaunchScheduler3 = this.Q;
                                    if (streamingLaunchScheduler3 != null) {
                                        try {
                                            this.r = RecorderBase.State.RECORDING;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(this.o);
                                            sb2.append(brm0.v(this.o, DomExceptionUtils.SEPARATOR, false) ? "" : DomExceptionUtils.SEPARATOR);
                                            sb2.append(this.p);
                                            streamingLaunchScheduler3.setUrl(new URI(sb2.toString()));
                                            streamingLaunchScheduler3.launch();
                                            streamingLaunchScheduler3.start();
                                        } catch (URISyntaxException e4) {
                                            ne7.n("OkLiveRecorder", "startRecord() - failed to parse OKMP URI " + this.o + " error= " + e4);
                                        }
                                    }
                                }
                                T();
                                S(false);
                            } else {
                                liveStreamStatReporter2 = new LiveStreamStatReporterDebugLog();
                            }
                        }
                        liveStreamStatReporter = liveStreamStatReporter2;
                        Context context322 = this.H;
                        HandlerThread handlerThread22 = (HandlerThread) d0.getValue();
                        b bVar22 = this.S;
                        bq00 bq00Var22 = new bq00(this, 19);
                        int optInt1622 = this.I.optInt("dbg_bw_drop_sec", 0) * 1000;
                        int optInt1722 = this.I.optInt("dbg_bw_drop_kbps", 0);
                        optString = this.I.optString("cbr");
                        VideoCBRMode videoCBRMode22 = c0;
                        if (optString != null) {
                        }
                        OkmpStreamer okmpStreamer22 = new OkmpStreamer(context322, handlerThread22, publisherConfiguration2, bVar22, nativeAACCaptureAndEncode2, bq00Var22, liveStreamStatReporter, true, -1L, optInt1622, optInt1722, videoCBRMode22, this.I.optInt("vbm", 15));
                        this.P = okmpStreamer22;
                        okmpStreamer22.addListener(this);
                        StreamingLaunchScheduler streamingLaunchScheduler222 = new StreamingLaunchScheduler(okmpStreamer22, this.M, new Handler(Looper.getMainLooper()));
                        this.Q = streamingLaunchScheduler222;
                        streamingLaunchScheduler222.setDelegate(this);
                        if (liveStreamStatReporter != null) {
                        }
                        this.R = new StreamingStatisticsHandler(okmpStreamer22, (Handler) bpn0Var2.getValue(), this.L);
                        U();
                        if (TextUtils.isEmpty(this.o)) {
                        }
                        ne7.n("OkLiveRecorder", "startRecord() - failed due to OKMP URI (" + this.o + ") or key (" + this.p + ") are empty!");
                        T();
                        S(false);
                    }
                }
            }
        }
        return this.q;
    }
}
