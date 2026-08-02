package one.video.calls.sdk.experiments;

import android.os.Build;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import org.webrtc.PeerConnection;
import ru.ok.android.webrtc.mediarecord.AudioFormat;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.stat.NegotiationError;
import xsna.fpf0;
import xsna.g4;
import xsna.gm70;
import xsna.p5j;
import xsna.p7f0;
import xsna.pz;
import xsna.qc1;
import xsna.qcy;

/* compiled from: MutableExperiments.kt */
/* loaded from: classes8.dex */
public final class c implements ExperimentsInterface {
    public static final /* synthetic */ qcy<Object>[] j0 = {new MutablePropertyReference1Impl(c.class, "isCamera2ApiEnabled", "isCamera2ApiEnabled()Z", 0), p5j.a(0, c.class, "maxCameraFrameDimension", "getMaxCameraFrameDimension()I", fpf0.a), new MutablePropertyReference1Impl(c.class, "timeouts", "getTimeouts()Lru/ok/android/webrtc/CallParams$Timeouts;", 0), new MutablePropertyReference1Impl(c.class, "isNonOpusRemovalEnabled", "isNonOpusRemovalEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isEnqueuedCommandMergeEnabled", "isEnqueuedCommandMergeEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isDynamicScreenShareSizeUpdateEnabled", "isDynamicScreenShareSizeUpdateEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isBackendRenderVmojiEnabled", "isBackendRenderVmojiEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isFilterCallMuteStateInitForAdmins", "isFilterCallMuteStateInitForAdmins()Z", 0), new MutablePropertyReference1Impl(c.class, "isInCallAnalyticsUploadEnabled", "isInCallAnalyticsUploadEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "callAnalyticsUploadMaxLoss", "getCallAnalyticsUploadMaxLoss()Ljava/lang/Double;", 0), new MutablePropertyReference1Impl(c.class, "callAnalyticsUploadMinBitrate", "getCallAnalyticsUploadMinBitrate()Ljava/lang/Double;", 0), new MutablePropertyReference1Impl(c.class, "userFieldTrials", "getUserFieldTrials()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(c.class, "vpnPreference", "getVpnPreference()Lorg/webrtc/PeerConnection$VpnPreference;", 0), new MutablePropertyReference1Impl(c.class, "emulatedNegotiationErrorType", "getEmulatedNegotiationErrorType()Lru/ok/android/webrtc/stat/NegotiationError$Type;", 0), new MutablePropertyReference1Impl(c.class, "skipRequestReallocEnabled", "getSkipRequestReallocEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isWebTransportEnabled", "isWebTransportEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "wtToWsFallbackParams", "getWtToWsFallbackParams()Lru/ok/android/webrtc/signaling/transport/SignalingTransport$FallbackParams;", 0), new MutablePropertyReference1Impl(c.class, "isIdsMappersLoggingEnabled", "isIdsMappersLoggingEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "emulatedApiError", "getEmulatedApiError()Lone/video/calls/sdk/experiments/ExperimentsInterface$EmulatedApiError;", 0), new MutablePropertyReference1Impl(c.class, "isDtxDenoiseEnabled", "isDtxDenoiseEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isSummaryStatsEnabled", "isSummaryStatsEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isSignalingLogThrottlingEnabled", "isSignalingLogThrottlingEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "aiOpusBweConfig", "getAiOpusBweConfig()Lone/video/calls/sdk/experiments/models/AiOpusBweConfig;", 0), new MutablePropertyReference1Impl(c.class, "isTokenInvalidationEnabled", "isTokenInvalidationEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isH265Prioritized", "isH265Prioritized()Z", 0), new MutablePropertyReference1Impl(c.class, "isLinearBweEnabled", "isLinearBweEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isAdaptiveOpusComplexityEnabled", "isAdaptiveOpusComplexityEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isAudioRecordEnabledOnStart", "isAudioRecordEnabledOnStart()Z", 0), new MutablePropertyReference1Impl(c.class, "isAudioPipelineDisabled", "isAudioPipelineDisabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isAudioCaptureLoggingEnabled", "isAudioCaptureLoggingEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isCorruptWsEndpointEnabled", "isCorruptWsEndpointEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "simulcastState", "getSimulcastState()Lone/video/calls/sdk/experiments/ExperimentsInterface$SimulcastState;", 0), new MutablePropertyReference1Impl(c.class, "emulatedSignalingError", "getEmulatedSignalingError()Lone/video/calls/sdk/experiments/ExperimentsInterface$EmulatedSignalingError;", 0), new MutablePropertyReference1Impl(c.class, "emulatedIceCandidateError", "getEmulatedIceCandidateError()Lone/video/calls/sdk/experiments/ExperimentsInterface$EmulatedIceCandidatesError;", 0), new MutablePropertyReference1Impl(c.class, "isSignalingByIpEnabled", "isSignalingByIpEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isSNIEnabled", "isSNIEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isReplaceParametersInEndpointEnabled", "isReplaceParametersInEndpointEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isUseGeneratedPeerIdEnabled", "isUseGeneratedPeerIdEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isDirectICERestartEnabled", "isDirectICERestartEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "bitrateDumpGatheringState", "getBitrateDumpGatheringState()Lone/video/calls/sdk/experiments/ExperimentsInterface$BitrateDumpGatheringState;", 0), new MutablePropertyReference1Impl(c.class, "isEarlyApplyRemoteOfferEnabled", "isEarlyApplyRemoteOfferEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isVideoTransformV2Enabled", "isVideoTransformV2Enabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isEarlyCreatePeerConnectionEnabled", "isEarlyCreatePeerConnectionEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "preferredIceCandidatesPoolSize", "getPreferredIceCandidatesPoolSize()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(c.class, "isDoNothingOnIceFailureEnabled", "isDoNothingOnIceFailureEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isLowLatencyAudioEnabled", "isLowLatencyAudioEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "nsConfig", "getNsConfig()Lone/video/calls/sdk/experiments/models/NsConfig;", 0), new MutablePropertyReference1Impl(c.class, "pcapLabelConfig", "getPcapLabelConfig()Lone/video/calls/sdk/experiments/models/PcapLabelConfig;", 0), new MutablePropertyReference1Impl(c.class, "isNoIdsResolutionForPrepareEnabled", "isNoIdsResolutionForPrepareEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "h265BitrateScale", "getH265BitrateScale()Ljava/lang/Float;", 0), new MutablePropertyReference1Impl(c.class, "audioFormatConfig", "getAudioFormatConfig()Lru/ok/android/webrtc/mediarecord/AudioFormat$Config;", 0), new MutablePropertyReference1Impl(c.class, "isOnlySoftwareEncodersEnabled", "isOnlySoftwareEncodersEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "signalingTransportTimeouts", "getSignalingTransportTimeouts()Lru/ok/android/webrtc/signaling/transport/SignalingTransport$Timeouts;", 0), new MutablePropertyReference1Impl(c.class, "isDeprecatedStatDisabled", "isDeprecatedStatDisabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isFastConnectByIpEnabled", "isFastConnectByIpEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isSignalingCommandSmartModeEnabled", "isSignalingCommandSmartModeEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isAudioSessionMonitorEnabled", "isAudioSessionMonitorEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isNetworkSensorEnabled", "isNetworkSensorEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isMediaStatFixEnabled", "isMediaStatFixEnabled()Z", 0), new MutablePropertyReference1Impl(c.class, "isEarlyVideoEnabled", "isEarlyVideoEnabled()Z", 0)};
    public final a A;
    public final a B;
    public final a C;
    public final a D;
    public final a E;
    public final a F;
    public final a G;
    public final a H;
    public final a I;
    public final a J;
    public final a K;
    public final a L;
    public final a M;
    public final a N;
    public final a O;
    public final a P;
    public final a Q;
    public final a R;
    public final a S;
    public final a T;
    public final a U;
    public final a V;
    public final a W;
    public final a X;
    public final a Y;
    public final a Z;
    public final pz a;
    public final a a0;
    public final a b;
    public final a b0;
    public final a c;
    public final a c0;
    public final a d;
    public final a d0;
    public final a e;
    public final a e0;
    public final a f;
    public final a f0;
    public final a g;
    public final a g0;
    public final a h;
    public final a h0;
    public final a i;
    public final a i0;
    public final a j;
    public final a k;
    public final a l;
    public final a m;
    public final a n;
    public final a o;
    public final a p;
    public final a q;
    public final a r;
    public final a s;
    public final a t;
    public final a u;
    public final a v;
    public final a w;
    public final a x;
    public final a y;
    public final a z;

    /* compiled from: MutableExperiments.kt */
    public final class a<T> implements p7f0<c, T> {
        public final T b;
        public volatile boolean c;
        public volatile T d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj) {
            this.b = obj;
            this.d = obj;
        }

        public final Object a(qcy qcyVar) {
            c.this.a.invoke(new g4(15, this, qcyVar));
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Object obj) {
            this.c = true;
            this.d = obj;
        }

        @Override // xsna.i7f0
        public final /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
            return a(qcyVar);
        }

        @Override // xsna.p7f0
        public final /* bridge */ /* synthetic */ void setValue(c cVar, qcy qcyVar, Object obj) {
            b(obj);
        }
    }

    public c(pz pzVar) {
        this.a = pzVar;
        this.b = new a(Boolean.valueOf(Build.VERSION.SDK_INT >= 29));
        this.c = new a(Integer.valueOf(VideoRecord.DEFAULT_MAX_DIMENSION));
        this.d = new a(null);
        Boolean bool = Boolean.FALSE;
        this.e = new a(bool);
        this.f = new a(bool);
        this.g = new a(bool);
        this.h = new a(bool);
        Boolean bool2 = Boolean.TRUE;
        this.i = new a(bool2);
        this.j = new a(bool2);
        this.k = new a(null);
        this.l = new a(null);
        this.m = new a(null);
        this.n = new a(null);
        this.o = new a(null);
        this.p = new a(bool);
        this.q = new a(bool);
        this.r = new a(null);
        this.s = new a(bool);
        this.t = new a(null);
        this.u = new a(bool2);
        this.v = new a(bool);
        this.w = new a(bool);
        this.x = new a(qc1.a.a);
        this.y = new a(bool);
        this.z = new a(bool);
        this.A = new a(bool);
        this.B = new a(bool);
        this.C = new a(bool);
        this.D = new a(bool);
        this.E = new a(bool);
        this.F = new a(bool);
        this.G = new a(ExperimentsInterface.SimulcastState.DISABLED);
        this.H = new a(ExperimentsInterface.EmulatedSignalingError.NONE);
        this.I = new a(ExperimentsInterface.EmulatedIceCandidatesError.NONE);
        this.J = new a(bool);
        this.K = new a(bool);
        this.L = new a(bool);
        this.M = new a(bool);
        this.N = new a(bool);
        this.O = new a(ExperimentsInterface.a.C2170a.a);
        this.P = new a(bool);
        this.Q = new a(bool);
        this.R = new a(bool);
        this.S = new a(null);
        this.T = new a(bool);
        this.U = new a(bool);
        this.V = new a(new gm70(0));
        this.W = new a(null);
        this.X = new a(bool);
        this.Y = new a(null);
        this.Z = new a(null);
        this.a0 = new a(bool);
        this.b0 = new a(null);
        this.c0 = new a(bool);
        this.d0 = new a(bool);
        this.e0 = new a(bool);
        this.f0 = new a(bool);
        this.g0 = new a(bool);
        this.h0 = new a(bool2);
        this.i0 = new a(bool);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean A() {
        return ((Boolean) this.d0.a(j0[54])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Float B() {
        return (Float) this.Y.a(j0[49]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean C() {
        return ((Boolean) this.i.a(j0[7])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean D() {
        return ((Boolean) this.M.a(j0[37])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.EmulatedSignalingError E() {
        return (ExperimentsInterface.EmulatedSignalingError) this.H.a(j0[32]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean F() {
        return ((Boolean) this.e.a(j0[3])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean G() {
        return ((Boolean) this.Q.a(j0[41])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Integer H() {
        return (Integer) this.S.a(j0[43]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean I() {
        return ((Boolean) this.c0.a(j0[53])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean J() {
        return ((Boolean) this.g0.a(j0[57])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean K() {
        return ((Boolean) this.w.a(j0[21])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.b L() {
        return (ExperimentsInterface.b) this.t.a(j0[18]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean M() {
        return ((Boolean) this.b.a(j0[0])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final SignalingTransport.Timeouts N() {
        return (SignalingTransport.Timeouts) this.b0.a(j0[52]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean O() {
        return ((Boolean) this.h0.a(j0[58])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean P() {
        return ((Boolean) this.F.a(j0[30])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final AudioFormat.Config Q() {
        return (AudioFormat.Config) this.Z.a(j0[50]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean R() {
        return ((Boolean) this.s.a(j0[17])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean S() {
        return ((Boolean) this.B.a(j0[26])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean T() {
        return ((Boolean) this.K.a(j0[35])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final SignalingTransport.FallbackParams U() {
        return (SignalingTransport.FallbackParams) this.r.a(j0[16]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean V() {
        return ((Boolean) this.D.a(j0[28])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean W() {
        return ((Boolean) this.f0.a(j0[56])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Double X() {
        return (Double) this.l.a(j0[10]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean Y() {
        return ((Boolean) this.v.a(j0[20])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean Z() {
        return ((Boolean) this.L.a(j0[36])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean a() {
        return ((Boolean) this.y.a(j0[23])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean a0() {
        return ((Boolean) this.R.a(j0[42])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final int b() {
        return ((Number) this.c.a(j0[1])).intValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.EmulatedIceCandidatesError b0() {
        return (ExperimentsInterface.EmulatedIceCandidatesError) this.I.a(j0[33]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean c() {
        return ((Boolean) this.i0.a(j0[59])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean c0() {
        return ((Boolean) this.f.a(j0[4])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean d() {
        return ((Boolean) this.T.a(j0[44])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean d0() {
        return ((Boolean) this.u.a(j0[19])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean e() {
        return ((Boolean) this.N.a(j0[38])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean e0() {
        return ((Boolean) this.z.a(j0[24])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean f() {
        return ((Boolean) this.A.a(j0[25])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.a f0() {
        return (ExperimentsInterface.a) this.O.a(j0[39]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean g() {
        return ((Boolean) this.P.a(j0[40])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.SimulcastState h() {
        return (ExperimentsInterface.SimulcastState) this.G.a(j0[31]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean j() {
        return ((Boolean) this.p.a(j0[14])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Double k() {
        return (Double) this.k.a(j0[9]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean l() {
        return ((Boolean) this.C.a(j0[27])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final String m() {
        return (String) this.m.a(j0[11]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean n() {
        return ((Boolean) this.e0.a(j0[55])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final qc1 o() {
        return (qc1) this.x.a(j0[22]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean p() {
        return ((Boolean) this.J.a(j0[34])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean q() {
        return ((Boolean) this.X.a(j0[48])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean r() {
        return ((Boolean) this.j.a(j0[8])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean s() {
        return ((Boolean) this.U.a(j0[45])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final PeerConnection.VpnPreference t() {
        return (PeerConnection.VpnPreference) this.n.a(j0[12]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean u() {
        return ((Boolean) this.q.a(j0[15])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean v() {
        return ((Boolean) this.h.a(j0[6])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean w() {
        return ((Boolean) this.E.a(j0[29])).booleanValue();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final NegotiationError.Type x() {
        return (NegotiationError.Type) this.o.a(j0[13]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final gm70 y() {
        return (gm70) this.V.a(j0[46]);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean z() {
        return ((Boolean) this.g.a(j0[5])).booleanValue();
    }
}
