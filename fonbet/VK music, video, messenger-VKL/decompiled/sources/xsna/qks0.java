package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: VideoFeaturesRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class qks0 implements fks0 {
    public final boolean A;
    public final bpn0 A0;
    public final bpn0 A1;
    public final bpn0 B;
    public final bpn0 B0;
    public final bpn0 B1;
    public final bpn0 C;
    public final bpn0 C0;
    public final bpn0 C1;
    public final bpn0 D;
    public final bpn0 D0;
    public final bpn0 D1;
    public final bpn0 E;
    public final boolean E0;
    public final bpn0 E1;
    public final bpn0 F;
    public final bpn0 F0;
    public final boolean G;
    public final bpn0 G0;
    public final bpn0 H;
    public final bpn0 H0;
    public final bpn0 I;
    public final bpn0 I0;
    public final boolean J;
    public final Object J0;
    public final bpn0 K;
    public final bpn0 K0;
    public final bpn0 L;
    public final bpn0 L0;
    public final bpn0 M;
    public final bpn0 M0;
    public final bpn0 N;
    public final bpn0 N0;
    public final bpn0 O;
    public final bpn0 O0;
    public final bpn0 P;
    public final bpn0 P0;
    public final bpn0 Q;
    public final bpn0 Q0;
    public final bpn0 R;
    public final bpn0 R0;
    public final bpn0 S;
    public final bpn0 S0;
    public final bpn0 T;
    public final bpn0 T0;
    public final bpn0 U;
    public final bpn0 U0;
    public final boolean V;
    public final bpn0 V0;
    public final bpn0 W;
    public final boolean W0;
    public final bpn0 X;
    public final boolean X0;
    public final bpn0 Y;
    public final boolean Y0;
    public final bpn0 Z;
    public final bpn0 Z0;
    public final boolean a;
    public final bpn0 a0;
    public final bpn0 a1;
    public final boolean b;
    public final bpn0 b0;
    public final bpn0 b1;
    public final bpn0 c;
    public final bpn0 c0;
    public final bpn0 c1;
    public final boolean d;
    public final bpn0 d0;
    public final bpn0 d1;
    public final bpn0 e;
    public final bpn0 e0;
    public final bpn0 e1;
    public final bpn0 f;
    public final bpn0 f0;
    public final bpn0 f1;
    public final boolean g;
    public final bpn0 g0;
    public final bpn0 g1;
    public final bpn0 h;
    public final bpn0 h0;
    public final bpn0 h1;
    public final bpn0 i;
    public final bpn0 i0;
    public final bpn0 i1;
    public final boolean j;
    public final bpn0 j0;
    public final bpn0 j1;
    public final bpn0 k;
    public final bpn0 k0;
    public final bpn0 k1;
    public final bpn0 l;
    public final bpn0 l0;
    public final bpn0 l1;
    public final bpn0 m;
    public final bpn0 m0;
    public final bpn0 m1;
    public final bpn0 n;
    public final bpn0 n0;
    public final bpn0 n1;
    public final bpn0 o;
    public final boolean o0;
    public final bpn0 o1;
    public final bpn0 p;
    public final bpn0 p0;
    public final bpn0 p1;
    public final boolean q;
    public final bpn0 q0;
    public final bpn0 q1;
    public final bpn0 r;
    public final bpn0 r0;
    public final bpn0 r1;
    public final boolean s;
    public final bpn0 s0;
    public final bpn0 s1;
    public final boolean t;
    public final bpn0 t0;
    public final bpn0 t1;
    public final boolean u;
    public final bpn0 u0;
    public final bpn0 u1;
    public final boolean v;
    public final boolean v0;
    public final bpn0 v1;
    public final boolean w;
    public final bpn0 w0;
    public final bpn0 w1;
    public final bpn0 x;
    public final boolean x0;
    public final bpn0 x1;
    public final bpn0 y;
    public final bpn0 y0;
    public final bpn0 y1;
    public final bpn0 z;
    public final bpn0 z0;
    public final bpn0 z1;

    public qks0() {
        boolean q = BuildInfo.q();
        this.a = q;
        boolean s = BuildInfo.s();
        this.b = s;
        this.c = new bpn0(new uia(this, 11));
        new bpn0(new o66(this, 6));
        boolean z = true;
        this.d = q || s;
        this.e = new bpn0(new k55(11));
        this.f = new bpn0(new yg9(this, 10));
        this.g = q;
        final int i = 1;
        this.h = new bpn0(new gzs(this) { // from class: xsna.gks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_PROFILE_CLIPS_PUBLISHED_MORE_MENU;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        qks0 qks0Var = this.c;
                        if (qks0Var.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_CONTROLS;
                            videoFeatures2.getClass();
                            z3 = com.vk.toggle.b.A.a(videoFeatures2);
                        } else if (qks0Var.b) {
                            VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_NEW_CONTROLS_SUPERAPP;
                            videoFeatures3.getClass();
                            z3 = com.vk.toggle.b.A.a(videoFeatures3);
                        } else {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i2 = 1;
        new bpn0(new gzs(this) { // from class: xsna.jks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i2) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_AUTOPLAY_AND_SCROLL;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_MVI_CATALOG_LEGACY;
                            videoFeatures2.getClass();
                            z3 = com.vk.toggle.b.A.a(videoFeatures2);
                        } else {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i3 = 1;
        this.i = new bpn0(new gzs(this) { // from class: xsna.oks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i3) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_PRODUCT_ACTION_LOG;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        qks0 qks0Var = this.c;
                        return Boolean.valueOf(qks0Var.a || qks0Var.b);
                }
            }
        });
        this.j = q;
        final int i4 = 0;
        this.k = new bpn0(new gzs(this) { // from class: xsna.hks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i4) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_FILE_OFFLINE_STORAGE;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        return Boolean.valueOf(this.c.a);
                }
            }
        });
        final int i5 = 0;
        this.l = new bpn0(new gzs(this) { // from class: xsna.kks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                Long z2;
                boolean z3;
                switch (i5) {
                    case 0:
                        qks0 qks0Var = this.c;
                        Long l = null;
                        b.a aVar = qks0Var.a ? VideoFeatures.NEW_SLOW_NETWORK_SNACKBAR : qks0Var.b ? Features.Type.FEATURE_VIDEO_SLOW_NETWORK_SNACK : null;
                        b.d i6 = aVar != null ? com.vk.toggle.b.A.i(aVar) : null;
                        if (i6 != null && p1p0.a(i6)) {
                            JSONObject g = i6.g();
                            l = Long.valueOf((g == null || (z2 = f370.z(g, "timer_seconds")) == null) ? 7L : z2.longValue());
                        }
                        return new kht0(l, i6 != null && p1p0.a(i6), aVar == VideoFeatures.NEW_SLOW_NETWORK_SNACKBAR);
                    default:
                        if (this.c.b) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_MOVIES_SERIES_LISTING;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i6 = 0;
        this.m = new bpn0(new gzs(this) { // from class: xsna.pks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i6) {
                    case 0:
                        qks0 qks0Var = this.c;
                        if (qks0Var.a) {
                            z2 = true;
                        } else if (qks0Var.b) {
                            VideoFeatures videoFeatures = VideoFeatures.QUALITY_NEW_SETTINGS_SUPERAPP;
                            videoFeatures.getClass();
                            z2 = com.vk.toggle.b.A.a(videoFeatures);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_PROFILE_CLIPS_DRAFTS_AND_DELAYED_NEW_MORE_MENU;
                            videoFeatures2.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i7 = 0;
        this.n = new bpn0(new gzs(this) { // from class: xsna.iks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i7) {
                    case 0:
                        z2 = this.c.a;
                        break;
                    default:
                        z2 = this.c.a;
                        break;
                }
                return Boolean.valueOf(z2);
            }
        });
        this.o = new bpn0(new zfl(10));
        this.p = new bpn0(new dia(this, 9));
        this.q = q;
        this.r = new bpn0(new tb8(this, 10));
        this.s = q;
        this.t = q;
        new bpn0(new ub8(this, 7));
        this.u = q;
        this.v = q;
        this.w = q;
        this.x = new bpn0(new lq6(8));
        this.y = new bpn0(new p03(9));
        this.z = new bpn0(new hia(this, 5));
        this.A = q;
        this.B = new bpn0(new r03(12));
        this.C = new bpn0(new n66(this, 10));
        this.D = new bpn0(new dr4(this, 9));
        this.E = new bpn0(new f53(this, 12));
        this.F = new bpn0(new sq6(17));
        new bpn0(new fr4(this, 9));
        this.G = q;
        this.H = new bpn0(new r30(this, 9));
        this.I = new bpn0(new lnf(13));
        this.J = q;
        this.K = new bpn0(new wh(this, 4));
        this.L = new bpn0(new apf(this, 8));
        new bpn0(new bpf(this, 6));
        this.M = new bpn0(new cpf(this, 3));
        this.N = new bpn0(new u94(12));
        this.O = new bpn0(new bn(this, 7));
        this.P = new bpn0(new gbl(this, 7));
        this.Q = new bpn0(new hbl(this, 5));
        this.R = new bpn0(new a68(14));
        this.S = new bpn0(new ug9(12));
        this.T = new bpn0(new i1q(this, 5));
        this.U = new bpn0(new wg9(this, 6));
        this.V = q;
        this.W = new bpn0(new t0f(13));
        this.X = new bpn0(new ps0(11));
        this.Y = new bpn0(new zg9(14));
        new bpn0(new b63(15));
        new bpn0(new v0f(12));
        new bpn0(new w0f(13));
        this.Z = new bpn0(new yaa(this, 8));
        this.a0 = new bpn0(new wa3(17));
        this.b0 = new bpn0(new xa3(12));
        this.c0 = new bpn0(new fat(this, 9));
        this.d0 = new bpn0(new y0f(11));
        this.e0 = new bpn0(new qy8(this, 16));
        final int i8 = 1;
        this.f0 = new bpn0(new gzs(this) { // from class: xsna.hks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i8) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_FILE_OFFLINE_STORAGE;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        return Boolean.valueOf(this.c.a);
                }
            }
        });
        this.g0 = new bpn0(new bb3(12));
        this.h0 = new bpn0(new hu2(14));
        this.i0 = new bpn0(new s63(13));
        this.j0 = new bpn0(new pxv(this, 9));
        new bpn0(new qxv(this, 5));
        this.k0 = new bpn0(new dr6(17));
        this.l0 = new bpn0(new gb3(this, 14));
        this.m0 = new bpn0(new g3o(this, 9));
        final int i9 = 1;
        this.n0 = new bpn0(new gzs(this) { // from class: xsna.iks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i9) {
                    case 0:
                        z2 = this.c.a;
                        break;
                    default:
                        z2 = this.c.a;
                        break;
                }
                return Boolean.valueOf(z2);
            }
        });
        this.o0 = q || s;
        final int i10 = 1;
        this.p0 = new bpn0(new gzs(this) { // from class: xsna.kks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                Long z2;
                boolean z3;
                switch (i10) {
                    case 0:
                        qks0 qks0Var = this.c;
                        Long l = null;
                        b.a aVar = qks0Var.a ? VideoFeatures.NEW_SLOW_NETWORK_SNACKBAR : qks0Var.b ? Features.Type.FEATURE_VIDEO_SLOW_NETWORK_SNACK : null;
                        b.d i62 = aVar != null ? com.vk.toggle.b.A.i(aVar) : null;
                        if (i62 != null && p1p0.a(i62)) {
                            JSONObject g = i62.g();
                            l = Long.valueOf((g == null || (z2 = f370.z(g, "timer_seconds")) == null) ? 7L : z2.longValue());
                        }
                        return new kht0(l, i62 != null && p1p0.a(i62), aVar == VideoFeatures.NEW_SLOW_NETWORK_SNACKBAR);
                    default:
                        if (this.c.b) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_MOVIES_SERIES_LISTING;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        this.q0 = new bpn0(new kb3(11));
        final int i11 = 1;
        this.r0 = new bpn0(new gzs(this) { // from class: xsna.lks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i11) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_REPEATED_TAP_TO_DEFAULT_STATE;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_META_CHANNEL_SCREEN;
                            videoFeatures2.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        new bpn0(new xu2(12));
        this.s0 = new bpn0(new ap(this, 6));
        this.t0 = new bpn0(new ox4(10));
        this.u0 = new bpn0(new jvg(11));
        this.v0 = q;
        final int i12 = 1;
        this.w0 = new bpn0(new gzs(this) { // from class: xsna.mks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i12) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_RULES_SYNC;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_PROFILE_NEW_CATALOG_HEADER;
                            videoFeatures2.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        this.x0 = q;
        this.y0 = new bpn0(new t3a(this, 6));
        final int i13 = 1;
        this.z0 = new bpn0(new gzs(this) { // from class: xsna.nks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i13) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_PRODUCT_ACTION;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        return Boolean.valueOf(this.c.a);
                }
            }
        });
        this.A0 = new bpn0(new ho4(this, 8));
        this.B0 = new bpn0(new v0f(11));
        this.C0 = new bpn0(new u35(15));
        this.D0 = new bpn0(new sx2(this, 9));
        this.E0 = q || s;
        this.F0 = new bpn0(new via(13));
        this.G0 = new bpn0(new wa3(16));
        this.H0 = new bpn0(new xa3(11));
        this.I0 = new bpn0(new x0f(11));
        this.J0 = msy.a(LazyThreadSafetyMode.PUBLICATION, new y0f(10));
        this.K0 = new bpn0(new cu2(12));
        this.L0 = new bpn0(new fu2(this, 8));
        this.M0 = new bpn0(new vbp(this, 7));
        this.N0 = new bpn0(new nxv(this, 5));
        this.O0 = new bpn0(new oxv(this, 9));
        this.P0 = new bpn0(new sw1(18));
        this.Q0 = new bpn0(new lu2(12));
        this.R0 = new bpn0(new mu2(this, 8));
        this.S0 = new bpn0(new er6(14));
        this.T0 = new bpn0(new fr6(19));
        final int i14 = 0;
        this.U0 = new bpn0(new gzs(this) { // from class: xsna.jks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i14) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_AUTOPLAY_AND_SCROLL;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_MVI_CATALOG_LEGACY;
                            videoFeatures2.getClass();
                            z3 = com.vk.toggle.b.A.a(videoFeatures2);
                        } else {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        this.V0 = new bpn0(new mn8(13));
        new bpn0(new bky(this, 7));
        this.W0 = q;
        if (!q && !s) {
            z = false;
        }
        this.X0 = z;
        this.Y0 = q;
        final int i15 = 0;
        this.Z0 = new bpn0(new gzs(this) { // from class: xsna.lks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i15) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_REPEATED_TAP_TO_DEFAULT_STATE;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_META_CHANNEL_SCREEN;
                            videoFeatures2.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        this.a1 = new bpn0(new uy2(this, 11));
        this.b1 = new bpn0(new mb3(18));
        this.c1 = new bpn0(new bp(this, 7));
        this.d1 = new bpn0(new cp(this, 6));
        final int i16 = 0;
        new bpn0(new gzs(this) { // from class: xsna.mks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i16) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_RULES_SYNC;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_PROFILE_NEW_CATALOG_HEADER;
                            videoFeatures2.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i17 = 0;
        this.e1 = new bpn0(new gzs(this) { // from class: xsna.nks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i17) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_PRODUCT_ACTION;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        return Boolean.valueOf(this.c.a);
                }
            }
        });
        final int i18 = 0;
        this.f1 = new bpn0(new gzs(this) { // from class: xsna.oks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                switch (i18) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_PRODUCT_ACTION_LOG;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        qks0 qks0Var = this.c;
                        return Boolean.valueOf(qks0Var.a || qks0Var.b);
                }
            }
        });
        this.g1 = new bpn0(new rwe(12));
        this.h1 = new bpn0(new nb8(20));
        this.i1 = new bpn0(new vb8(this, 6));
        this.j1 = new bpn0(new knf(16));
        this.k1 = new bpn0(new z58(13));
        this.l1 = new bpn0(new u35(16));
        this.m1 = new bpn0(new r63(14));
        this.n1 = new bpn0(new mn8(14));
        final int i19 = 1;
        this.o1 = new bpn0(new gzs(this) { // from class: xsna.pks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i19) {
                    case 0:
                        qks0 qks0Var = this.c;
                        if (qks0Var.a) {
                            z2 = true;
                        } else if (qks0Var.b) {
                            VideoFeatures videoFeatures = VideoFeatures.QUALITY_NEW_SETTINGS_SUPERAPP;
                            videoFeatures.getClass();
                            z2 = com.vk.toggle.b.A.a(videoFeatures);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        if (this.c.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_PROFILE_CLIPS_DRAFTS_AND_DELAYED_NEW_MORE_MENU;
                            videoFeatures2.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i20 = 0;
        this.p1 = new bpn0(new gzs(this) { // from class: xsna.gks0
            public final /* synthetic */ qks0 c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2;
                boolean z3;
                switch (i20) {
                    case 0:
                        if (this.c.a) {
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_PROFILE_CLIPS_PUBLISHED_MORE_MENU;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        qks0 qks0Var = this.c;
                        if (qks0Var.a) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_CONTROLS;
                            videoFeatures2.getClass();
                            z3 = com.vk.toggle.b.A.a(videoFeatures2);
                        } else if (qks0Var.b) {
                            VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_NEW_CONTROLS_SUPERAPP;
                            videoFeatures3.getClass();
                            z3 = com.vk.toggle.b.A.a(videoFeatures3);
                        } else {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        this.q1 = new bpn0(new aq0(11));
        this.r1 = new bpn0(new xh6(15));
        new bpn0(new y56(11));
        this.s1 = new bpn0(new kb0(10));
        new bpn0(new ihg(12));
        this.t1 = new bpn0(new exw(7));
        this.u1 = new bpn0(new ag7(11));
        new bpn0(new wfl(4));
        new bpn0(new hb8(11));
        this.v1 = new bpn0(new y45(13));
        this.w1 = new bpn0(new m(14));
        this.x1 = new bpn0(new yp6(14));
        this.y1 = new bpn0(new s65(14));
        this.z1 = new bpn0(new jb8(this, 9));
        this.A1 = new bpn0(new l67(13));
        this.B1 = new bpn0(new jbw(13));
        this.C1 = new bpn0(new mb8(12));
        this.D1 = new bpn0(new bia(this, 9));
        new bpn0(new b55(10));
        new bpn0(new cia(this, 13));
        new bpn0(new k03(17));
        new bpn0(new vv8(10));
        this.E1 = new bpn0(new sb8(this, 10));
    }

    @Override // xsna.fks0
    public final boolean A() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean A0() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean A1() {
        return ((Boolean) this.A1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean B() {
        return ((Boolean) this.i0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean B0() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean B1() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean C() {
        if (!this.a) {
            return false;
        }
        VideoFeatures videoFeatures = VideoFeatures.WARMUP_ONBOARDING;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures);
    }

    @Override // xsna.fks0
    public final boolean C0() {
        return ((Boolean) this.M.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean C1() {
        return ((Boolean) this.S0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean D() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean D0() {
        return ((Boolean) this.Y.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean D1() {
        return ((Boolean) this.w0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean E() {
        return this.E0;
    }

    @Override // xsna.fks0
    public final boolean E0() {
        return this.g;
    }

    @Override // xsna.fks0
    public final boolean E1() {
        return ((Boolean) this.I.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean F() {
        return this.J;
    }

    @Override // xsna.fks0
    public final boolean F0() {
        return ((Boolean) this.z1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean F1() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean G() {
        return ((Boolean) this.u0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean G0() {
        return ((Boolean) this.U.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean G1() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean H() {
        return ((Boolean) this.Z0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean H0() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean H1() {
        return ((Boolean) this.D1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean I() {
        return ((Boolean) this.m1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean I0() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean I1() {
        return this.a || this.b;
    }

    @Override // xsna.fks0
    public final boolean J() {
        return this.x0;
    }

    @Override // xsna.fks0
    public final boolean J0() {
        return this.X0;
    }

    @Override // xsna.fks0
    public final boolean J1() {
        return this.d;
    }

    @Override // xsna.fks0
    public final sah0 K() {
        return (sah0) this.d0.getValue();
    }

    @Override // xsna.fks0
    public final boolean K0() {
        return ((Boolean) this.Q.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean K1() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean L() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean L0() {
        return ((Boolean) this.z.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean L1() {
        return ((Boolean) this.a0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean M() {
        return ((Boolean) this.m0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean M0() {
        return ((Boolean) this.W.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean M1() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean N() {
        return ((Boolean) this.V0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean N0() {
        return this.Y0;
    }

    @Override // xsna.fks0
    public final boolean N1() {
        return ((Boolean) this.j1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean O() {
        return ((Boolean) this.X.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean O0() {
        return ((Boolean) this.s0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean O1() {
        return ((Boolean) this.e0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean P() {
        return ((Boolean) this.S.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean P0() {
        return this.j;
    }

    @Override // xsna.fks0
    public final boolean P1() {
        return ((Boolean) this.C1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean Q() {
        return ((Boolean) this.n0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean Q0() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean Q1() {
        return ((Boolean) this.t0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean R() {
        return ((Boolean) this.O.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean R0() {
        return this.w;
    }

    @Override // xsna.fks0
    public final boolean R1() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_ALTERNATIVE_ALBUM_BADGE;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures);
    }

    @Override // xsna.fks0
    public final boolean S() {
        return ((Boolean) this.F0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean S0() {
        return ((Boolean) this.y.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean S1() {
        return ((Boolean) this.D0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean T() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean T0() {
        return ((Boolean) this.i1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean T1() {
        return this.v0;
    }

    @Override // xsna.fks0
    public final boolean U() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean U0() {
        return ((Boolean) this.Q0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean U1() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean V() {
        return ((Boolean) this.b0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean V0() {
        return ((Boolean) this.c0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean V1() {
        return ((Boolean) this.P0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean W() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean W0() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean W1() {
        return ((Boolean) this.A0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final xps0 X() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_IMAGE_SCALE_CONFIG;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            return null;
        }
        wps0 b = com.vk.toggle.d.e0.b();
        if (b == null) {
            wps0.d.getClass();
            b = wps0.e;
        }
        Float f = b.a;
        Integer num = b.b;
        Integer num2 = b.c;
        if (f == null || num == null || num2 == null) {
            return null;
        }
        return new xps0(f.floatValue(), num.intValue(), num2.intValue());
    }

    @Override // xsna.fks0
    public final boolean X0() {
        return ((Boolean) this.T0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean X1() {
        return ((Boolean) this.t1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean Y() {
        return ((Boolean) this.Z.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean Y0() {
        return ((Boolean) this.h1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean Y1() {
        return ((Boolean) this.T.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean Z() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean Z0() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean Z1() {
        return ((Boolean) this.n1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean a0() {
        return ((Boolean) this.K.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean a1() {
        return ((Boolean) this.q0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean a2() {
        return this.A;
    }

    @Override // xsna.fks0
    public final boolean b() {
        return ((Boolean) this.x1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean b0() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean b1() {
        return ((Boolean) this.z0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean b2() {
        return ((Boolean) this.U0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean c() {
        return ((Boolean) this.R.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean c0() {
        return ((Boolean) this.l0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean c1() {
        return ((Boolean) this.s1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean c2() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean d(Context context) {
        HashSet hashSet = iah0.a;
        return fnj.d(context);
    }

    @Override // xsna.fks0
    public final boolean d0() {
        if (!this.a) {
            return false;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_ADS_SUSPEND_COLD;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(videoFeatures)) {
            return true;
        }
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_ADS_TRIAL_SUSPEND;
        videoFeatures2.getClass();
        if (bVar.a(videoFeatures2)) {
            return true;
        }
        VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_ADS_SUSPEND_SAA_UNUSED;
        videoFeatures3.getClass();
        return bVar.a(videoFeatures3);
    }

    @Override // xsna.fks0
    public final boolean d1() {
        return ((Boolean) this.k0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean e() {
        return ((Boolean) this.B0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final kht0 e0() {
        return (kht0) this.l.getValue();
    }

    @Override // xsna.fks0
    public final boolean e1() {
        return ((Boolean) this.R0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean f() {
        return this.V;
    }

    @Override // xsna.fks0
    public final boolean f0() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fks0
    public final etn f1() {
        return (etn) this.J0.getValue();
    }

    @Override // xsna.fks0
    public final boolean g() {
        return ((Boolean) this.G0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean g0() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean g1() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean h() {
        return this.q;
    }

    @Override // xsna.fks0
    public final boolean h0() {
        return ((Boolean) this.M0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean h1() {
        return this.o0;
    }

    @Override // xsna.fks0
    public final boolean i() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean i0() {
        return ((Boolean) this.f0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean i1() {
        return this.G;
    }

    @Override // xsna.fks0
    public final boolean j() {
        return ((Boolean) this.H0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean j0() {
        return this.t;
    }

    @Override // xsna.fks0
    public final boolean j1() {
        return ((Boolean) this.B1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean k() {
        return this.a || this.b;
    }

    @Override // xsna.fks0
    public final boolean k0() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean k1() {
        return this.u;
    }

    @Override // xsna.fks0
    public final boolean l() {
        return ((Boolean) this.a1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean l0() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean l1() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean m(boolean z) {
        if (!this.a) {
            return false;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_NEW_DIALOG;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(videoFeatures) && !z) {
            return true;
        }
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_SHARING_NEW_DIALOG_CLIPS;
        videoFeatures2.getClass();
        return bVar.a(videoFeatures2) && z;
    }

    @Override // xsna.fks0
    public final boolean m0() {
        return ((Boolean) this.g1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean m1() {
        return ((Boolean) this.I0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean n() {
        return ((Boolean) this.w1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean n0() {
        return ((Boolean) this.l1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean n1() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean o() {
        return ((Boolean) this.p1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean o0() {
        return ((Boolean) this.d1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean o1() {
        return this.W0;
    }

    @Override // xsna.fks0
    public final boolean p() {
        return this.s;
    }

    @Override // xsna.fks0
    public final boolean p0() {
        return this.v;
    }

    @Override // xsna.fks0
    public final boolean p1() {
        return ((Boolean) this.O0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean q() {
        return ((Boolean) this.f1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean q0() {
        return ((Boolean) this.k1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean q1() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean r() {
        return ((Boolean) this.j0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean r0() {
        return ((Boolean) this.g0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean r1() {
        return ((Boolean) this.h0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean s() {
        return ((Boolean) this.o1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean s0() {
        return ((Boolean) this.E1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean s1() {
        return ((Boolean) this.r1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean t() {
        return ((Boolean) this.c1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean t0() {
        return ((Boolean) this.y1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean t1() {
        return ((Boolean) this.N0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean u() {
        return ((Boolean) this.N.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean u0() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean u1() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_ALTERNATIVE_SHOW_BADGE;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures);
    }

    @Override // xsna.fks0
    public final boolean v() {
        return ((Boolean) this.p0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean v0() {
        return ((Boolean) this.b1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean v1() {
        return ((Boolean) this.q1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean w() {
        return ((Boolean) this.u1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean w0(UserId userId) {
        return !this.a && fkq0.b(userId);
    }

    @Override // xsna.fks0
    public final boolean w1() {
        return ((Boolean) this.L0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean x() {
        return ((Boolean) this.y0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean x0() {
        return this.a;
    }

    @Override // xsna.fks0
    public final boolean x1() {
        return ((Boolean) this.P.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean y() {
        return ((Boolean) this.r0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean y0() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean y1() {
        return ((Boolean) this.C0.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean z() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean z0() {
        return ((Boolean) this.e1.getValue()).booleanValue();
    }

    @Override // xsna.fks0
    public final boolean z1() {
        return ((Boolean) this.v1.getValue()).booleanValue();
    }
}
