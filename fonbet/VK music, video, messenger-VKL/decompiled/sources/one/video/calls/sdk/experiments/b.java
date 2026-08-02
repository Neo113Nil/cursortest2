package one.video.calls.sdk.experiments;

import one.video.calls.sdk.experiments.ExperimentsInterface;
import one.video.calls.sdk.experiments.models.PcapLabelConfig;
import org.webrtc.PeerConnection;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.mediarecord.AudioFormat;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.stat.NegotiationError;
import xsna.de;
import xsna.epx;
import xsna.gm70;
import xsna.gsi0;
import xsna.qc1;
import xsna.wn4;

/* loaded from: classes8.dex */
public final class b implements ExperimentsInterface {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final ExperimentsInterface.SimulcastState F;
    public final ExperimentsInterface.EmulatedSignalingError G;
    public final ExperimentsInterface.EmulatedIceCandidatesError H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final ExperimentsInterface.a N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final Integer R;
    public final boolean S;
    public final boolean T;
    public final gm70 U;
    public final boolean V;
    public final Float W;
    public final AudioFormat.Config X;
    public final boolean Y;
    public final SignalingTransport.Timeouts Z;
    public final boolean a;
    public final boolean a0;
    public final int b;
    public final boolean b0;
    public final CallParams.Timeouts c;
    public final boolean c0;
    public final boolean d;
    public final boolean d0;
    public final boolean e;
    public final boolean e0;
    public final boolean f;
    public final boolean f0;
    public final boolean g;
    public final boolean g0;
    public final boolean h;
    public final PcapLabelConfig h0;
    public final boolean i;
    public final Double j;
    public final Double k;
    public final String l;
    public final PeerConnection.VpnPreference m;
    public final NegotiationError.Type n;
    public final boolean o;
    public final boolean p;
    public final SignalingTransport.FallbackParams q;
    public final boolean r;
    public final ExperimentsInterface.b s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final qc1 w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public b(boolean z, int i, CallParams.Timeouts timeouts, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Double d, Double d2, String str, PeerConnection.VpnPreference vpnPreference, NegotiationError.Type type, boolean z8, boolean z9, SignalingTransport.FallbackParams fallbackParams, boolean z10, ExperimentsInterface.b bVar, boolean z11, boolean z12, boolean z13, qc1 qc1Var, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ExperimentsInterface.SimulcastState simulcastState, ExperimentsInterface.EmulatedSignalingError emulatedSignalingError, ExperimentsInterface.EmulatedIceCandidatesError emulatedIceCandidatesError, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, ExperimentsInterface.a aVar, boolean z27, boolean z28, boolean z29, Integer num, boolean z30, boolean z31, gm70 gm70Var, boolean z32, Float f, AudioFormat.Config config, boolean z33, SignalingTransport.Timeouts timeouts2, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, PcapLabelConfig pcapLabelConfig) {
        this.a = z;
        this.b = i;
        this.c = timeouts;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = d;
        this.k = d2;
        this.l = str;
        this.m = vpnPreference;
        this.n = type;
        this.o = z8;
        this.p = z9;
        this.q = fallbackParams;
        this.r = z10;
        this.s = bVar;
        this.t = z11;
        this.u = z12;
        this.v = z13;
        this.w = qc1Var;
        this.x = z14;
        this.y = z15;
        this.z = z16;
        this.A = z17;
        this.B = z18;
        this.C = z19;
        this.D = z20;
        this.E = z21;
        this.F = simulcastState;
        this.G = emulatedSignalingError;
        this.H = emulatedIceCandidatesError;
        this.I = z22;
        this.J = z23;
        this.K = z24;
        this.L = z25;
        this.M = z26;
        this.N = aVar;
        this.O = z27;
        this.P = z28;
        this.Q = z29;
        this.R = num;
        this.S = z30;
        this.T = z31;
        this.U = gm70Var;
        this.V = z32;
        this.W = f;
        this.X = config;
        this.Y = z33;
        this.Z = timeouts2;
        this.a0 = z34;
        this.b0 = z35;
        this.c0 = z36;
        this.d0 = z37;
        this.e0 = z38;
        this.f0 = z39;
        this.g0 = z40;
        this.h0 = pcapLabelConfig;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean A() {
        return this.b0;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Float B() {
        return this.W;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean C() {
        return this.h;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean D() {
        return this.L;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.EmulatedSignalingError E() {
        return this.G;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean F() {
        return this.d;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean G() {
        return this.P;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Integer H() {
        return this.R;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean I() {
        return this.a0;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean J() {
        return this.e0;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean K() {
        return this.v;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.b L() {
        return this.s;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean M() {
        return this.a;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final SignalingTransport.Timeouts N() {
        return this.Z;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean O() {
        return this.f0;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean P() {
        return this.E;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final AudioFormat.Config Q() {
        return this.X;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean R() {
        return this.r;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean S() {
        return this.A;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean T() {
        return this.J;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final SignalingTransport.FallbackParams U() {
        return this.q;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean V() {
        return this.C;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean W() {
        return this.d0;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Double X() {
        return this.k;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean Y() {
        return this.u;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean Z() {
        return this.K;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean a() {
        return this.x;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean a0() {
        return this.Q;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final int b() {
        return this.b;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.EmulatedIceCandidatesError b0() {
        return this.H;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean c() {
        return this.g0;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean c0() {
        return this.e;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean d() {
        return this.S;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean d0() {
        return this.t;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean e() {
        return this.M;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean e0() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && this.m == bVar.m && this.n == bVar.n && this.o == bVar.o && this.p == bVar.p && epx.f(this.q, bVar.q) && this.r == bVar.r && epx.f(this.s, bVar.s) && this.t == bVar.t && this.u == bVar.u && this.v == bVar.v && epx.f(this.w, bVar.w) && this.x == bVar.x && this.y == bVar.y && this.z == bVar.z && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F && this.G == bVar.G && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && this.K == bVar.K && this.L == bVar.L && this.M == bVar.M && epx.f(this.N, bVar.N) && this.O == bVar.O && this.P == bVar.P && this.Q == bVar.Q && epx.f(this.R, bVar.R) && this.S == bVar.S && this.T == bVar.T && epx.f(this.U, bVar.U) && this.V == bVar.V && epx.f(this.W, bVar.W) && epx.f(this.X, bVar.X) && this.Y == bVar.Y && epx.f(this.Z, bVar.Z) && this.a0 == bVar.a0 && this.b0 == bVar.b0 && this.c0 == bVar.c0 && this.d0 == bVar.d0 && this.e0 == bVar.e0 && this.f0 == bVar.f0 && this.g0 == bVar.g0 && epx.f(this.h0, bVar.h0);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean f() {
        return this.z;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.a f0() {
        return this.N;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean g() {
        return this.O;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final ExperimentsInterface.SimulcastState h() {
        return this.F;
    }

    public final int hashCode() {
        int v = de.v(this.b, Boolean.hashCode(this.a) * 31);
        CallParams.Timeouts timeouts = this.c;
        int b = wn4.b(this.i, wn4.b(this.h, wn4.b(this.g, wn4.b(this.f, wn4.b(this.e, wn4.b(this.d, (v + (timeouts == null ? 0 : timeouts.hashCode())) * 31))))));
        Double d = this.j;
        int hashCode = (b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.k;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PeerConnection.VpnPreference vpnPreference = this.m;
        int hashCode4 = (hashCode3 + (vpnPreference == null ? 0 : vpnPreference.hashCode())) * 31;
        NegotiationError.Type type = this.n;
        int b2 = wn4.b(this.p, wn4.b(this.o, (hashCode4 + (type == null ? 0 : type.hashCode())) * 31));
        SignalingTransport.FallbackParams fallbackParams = this.q;
        int b3 = wn4.b(this.r, (b2 + (fallbackParams == null ? 0 : fallbackParams.hashCode())) * 31);
        if (this.s != null) {
            throw null;
        }
        int b4 = wn4.b(this.Q, wn4.b(this.P, wn4.b(this.O, (this.N.hashCode() + wn4.b(this.M, wn4.b(this.L, wn4.b(this.K, wn4.b(this.J, wn4.b(this.I, (this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + wn4.b(this.E, wn4.b(this.D, wn4.b(this.C, wn4.b(this.B, wn4.b(this.A, wn4.b(this.z, wn4.b(this.y, wn4.b(this.x, (this.w.hashCode() + wn4.b(this.v, wn4.b(this.u, wn4.b(this.t, b3 * 31)))) * 31))))))))) * 31)) * 31)) * 31)))))) * 31)));
        Integer num = this.R;
        int b5 = wn4.b(this.V, (this.U.hashCode() + wn4.b(this.T, wn4.b(this.S, (b4 + (num == null ? 0 : num.hashCode())) * 31))) * 31);
        Float f = this.W;
        int hashCode5 = (b5 + (f == null ? 0 : f.hashCode())) * 31;
        AudioFormat.Config config = this.X;
        int b6 = wn4.b(this.Y, (hashCode5 + (config == null ? 0 : config.hashCode())) * 31);
        SignalingTransport.Timeouts timeouts2 = this.Z;
        int b7 = wn4.b(this.g0, wn4.b(this.f0, wn4.b(this.e0, wn4.b(this.d0, wn4.b(this.c0, wn4.b(this.b0, wn4.b(this.a0, (b6 + (timeouts2 == null ? 0 : timeouts2.hashCode())) * 31)))))));
        PcapLabelConfig pcapLabelConfig = this.h0;
        return b7 + (pcapLabelConfig != null ? pcapLabelConfig.hashCode() : 0);
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean j() {
        return this.o;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final Double k() {
        return this.j;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean l() {
        return this.B;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final String m() {
        return this.l;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean n() {
        return this.c0;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final qc1 o() {
        return this.w;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean p() {
        return this.I;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean q() {
        return this.V;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean r() {
        return this.i;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean s() {
        return this.T;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final PeerConnection.VpnPreference t() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableExperiment(isCamera2ApiEnabled=");
        sb.append(this.a);
        sb.append(", maxCameraFrameDimension=");
        sb.append(this.b);
        sb.append(", timeouts=");
        sb.append(this.c);
        sb.append(", isNonOpusRemovalEnabled=");
        sb.append(this.d);
        sb.append(", isEnqueuedCommandMergeEnabled=");
        gsi0.c(sb, this.e, ", isDynamicScreenShareSizeUpdateEnabled=", this.f, ", isBackendRenderVmojiEnabled=");
        gsi0.c(sb, this.g, ", isFilterCallMuteStateInitForAdmins=", this.h, ", isInCallAnalyticsUploadEnabled=");
        sb.append(this.i);
        sb.append(", callAnalyticsUploadMaxLoss=");
        sb.append(this.j);
        sb.append(", callAnalyticsUploadMinBitrate=");
        sb.append(this.k);
        sb.append(", userFieldTrials=");
        sb.append(this.l);
        sb.append(", vpnPreference=");
        sb.append(this.m);
        sb.append(", emulatedNegotiationErrorType=");
        sb.append(this.n);
        sb.append(", skipRequestReallocEnabled=");
        gsi0.c(sb, this.o, ", isWebTransportEnabled=", this.p, ", wtToWsFallbackParams=");
        sb.append(this.q);
        sb.append(", isIdsMappersLoggingEnabled=");
        sb.append(this.r);
        sb.append(", emulatedApiError=");
        sb.append(this.s);
        sb.append(", isDtxDenoiseEnabled=");
        sb.append(this.t);
        sb.append(", isSummaryStatsEnabled=");
        gsi0.c(sb, this.u, ", isSignalingLogThrottlingEnabled=", this.v, ", aiOpusBweConfig=");
        sb.append(this.w);
        sb.append(", isTokenInvalidationEnabled=");
        sb.append(this.x);
        sb.append(", isH265Prioritized=");
        gsi0.c(sb, this.y, ", isLinearBweEnabled=", this.z, ", isAdaptiveOpusComplexityEnabled=");
        gsi0.c(sb, this.A, ", isAudioRecordEnabledOnStart=", this.B, ", isAudioPipelineDisabled=");
        gsi0.c(sb, this.C, ", isAudioCaptureLoggingEnabled=", this.D, ", isCorruptWsEndpointEnabled=");
        sb.append(this.E);
        sb.append(", simulcastState=");
        sb.append(this.F);
        sb.append(", emulatedSignalingError=");
        sb.append(this.G);
        sb.append(", emulatedIceCandidateError=");
        sb.append(this.H);
        sb.append(", isSignalingByIpEnabled=");
        gsi0.c(sb, this.I, ", isSNIEnabled=", this.J, ", isReplaceParametersInEndpointEnabled=");
        gsi0.c(sb, this.K, ", isUseGeneratedPeerIdEnabled=", this.L, ", isDirectICERestartEnabled=");
        sb.append(this.M);
        sb.append(", bitrateDumpGatheringState=");
        sb.append(this.N);
        sb.append(", isEarlyApplyRemoteOfferEnabled=");
        gsi0.c(sb, this.O, ", isVideoTransformV2Enabled=", this.P, ", isEarlyCreatePeerConnectionEnabled=");
        sb.append(this.Q);
        sb.append(", preferredIceCandidatesPoolSize=");
        sb.append(this.R);
        sb.append(", isDoNothingOnIceFailureEnabled=");
        gsi0.c(sb, this.S, ", isLowLatencyAudioEnabled=", this.T, ", nsConfig=");
        sb.append(this.U);
        sb.append(", isNoIdsResolutionForPrepareEnabled=");
        sb.append(this.V);
        sb.append(", h265BitrateScale=");
        sb.append(this.W);
        sb.append(", audioFormatConfig=");
        sb.append(this.X);
        sb.append(", isOnlySoftwareEncodersEnabled=");
        sb.append(this.Y);
        sb.append(", signalingTransportTimeouts=");
        sb.append(this.Z);
        sb.append(", isDeprecatedStatDisabled=");
        gsi0.c(sb, this.a0, ", isFastConnectByIpEnabled=", this.b0, ", isSignalingCommandSmartModeEnabled=");
        gsi0.c(sb, this.c0, ", isAudioSessionMonitorEnabled=", this.d0, ", isNetworkSensorEnabled=");
        gsi0.c(sb, this.e0, ", isMediaStatFixEnabled=", this.f0, ", isEarlyVideoEnabled=");
        sb.append(this.g0);
        sb.append(", pcapLabelConfig=");
        sb.append(this.h0);
        sb.append(")");
        return sb.toString();
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean u() {
        return this.p;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean v() {
        return this.g;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean w() {
        return this.D;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final NegotiationError.Type x() {
        return this.n;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final gm70 y() {
        return this.U;
    }

    @Override // one.video.calls.sdk.experiments.ExperimentsInterface
    public final boolean z() {
        return this.f;
    }
}
