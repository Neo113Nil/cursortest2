package yads;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.j8y;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class cz implements zy {
    public static final Object f = new Object();
    public final sh1 b;
    public final en0 c;
    public final u7 d;
    public final t43 e;

    public cz(sh1 sh1Var, en0 en0Var, u7 u7Var, t43 t43Var) {
        this.b = sh1Var;
        this.c = en0Var;
        this.d = u7Var;
        this.e = t43Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0600, code lost:
    
        if ((r0 instanceof kotlin.Result.Failure) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04dd, code lost:
    
        if ((r0 instanceof kotlin.Result.Failure) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu2 a() {
        qu2 qu2Var;
        Map map;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Long l;
        int i2;
        Integer num;
        Set set;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Integer num2;
        f8 f8Var;
        boolean z21;
        Object failure;
        j8y j8yVar;
        Object failure2;
        synchronized (f) {
            try {
                sh1 sh1Var = this.b;
                bz bzVar = bz.c;
                long b = ((uh1) sh1Var).b("SdkConfigurationExpiredDate");
                Boolean a = az.a(this.b, "SdkConfigurationVisibilityErrorIndicatorEnabled");
                if (b != 0) {
                    Integer b2 = az.b(this.b, "SdkConfigurationAdRequestMaxRetries");
                    Integer b3 = az.b(this.b, "SdkConfigurationPingRequestMaxRetries");
                    int a2 = ((uh1) this.b).a(0, "AdIdsStorageSize");
                    int a3 = ((uh1) this.b).a(0, "SdkConfigurationNativeWebViewPoolSize");
                    long b4 = ((uh1) this.b).b("SdkConfigurationMaxDiskCacheSizeBytesForVideo");
                    long b5 = ((uh1) this.b).b("SdkConfigurationMaxDiskCacheSizeBytesForRequestQueue");
                    Boolean a4 = az.a(this.b, "SdkConfigurationMediationSensitiveModeDisabled");
                    boolean a5 = ((uh1) this.b).a("SdkConfigurationFusedLocationProviderDisabled", false);
                    boolean a6 = ((uh1) this.b).a("SdkConfigurationLockScreenEnabled", false);
                    Boolean a7 = az.a(this.b, "SdkConfigurationUserConsent");
                    String c = ((uh1) this.b).c("SdkConfigurationLibraryVersion");
                    String c2 = ((uh1) this.b).c("SdkConfigurationHost");
                    String c3 = ((uh1) this.b).c("DivkitFont");
                    String c4 = ((uh1) this.b).c("SdkConfigurationClickHandlerType");
                    String c5 = ((uh1) this.b).c("SdkConfigurationMraidUrl");
                    String c6 = ((uh1) this.b).c("SdkConfigurationOmSdkControllerUrl");
                    boolean a8 = ((uh1) this.b).a("CustomClickHandlingEnabled", false);
                    boolean a9 = ((uh1) this.b).a("SdkConfigurationSensitiveModeDisabled", false);
                    boolean a10 = ((uh1) this.b).a("SdkConfigurationHardSensitiveModeEnabled", false);
                    boolean a11 = ((uh1) this.b).a("SdkConfigurationLegacyVastTrackingEnabled", false);
                    boolean a12 = ((uh1) this.b).a("SdkConfigurationLegacyVisibilityLogicEnabled", false);
                    boolean a13 = ((uh1) this.b).a("SdkConfigurationOverlappingVisibilityTrackingEnabled", false);
                    boolean a14 = ((uh1) this.b).a("SdkConfigurationOverlappingWindowTrackingEnabled", false);
                    boolean a15 = ((uh1) this.b).a("SdkConfigurationShowVersionValidationErrorLog", false);
                    boolean a16 = ((uh1) this.b).a("SdkConfigurationShowVersionValidationErrorIndicator", false);
                    boolean a17 = ((uh1) this.b).a("SdkConfigurationImpressionValidationOnClickEnabled", false);
                    boolean a18 = ((uh1) this.b).a("SdkConfigurationLegacySliderImpressionEnabled", false);
                    boolean a19 = ((uh1) this.b).a("SdkConfigurationFullScreenBackButtonEnabled", false);
                    boolean a20 = ((uh1) this.b).a("SdkConfigurationOpenMeasurementSdkDisabled", false);
                    boolean a21 = ((uh1) this.b).a("SdkConfigurationLocationConsent", false);
                    boolean a22 = ((uh1) this.b).a("SdkConfigurationClientBiddingStartupInitializationEnabled", false);
                    boolean a23 = ((uh1) this.b).a("SdkConfigurationHeaderBiddingStartupInitializationEnabled", false);
                    j8y j8yVar2 = jp.a;
                    hp a24 = jp.a(this.b);
                    String c7 = ((uh1) this.b).c("SdkConfigurationPublicEncryptionKey");
                    String c8 = ((uh1) this.b).c("SdkConfigurationInstreamDesign");
                    Integer b6 = az.b(this.b, "SdkConfigurationPublicEncryptionVersion");
                    boolean a25 = ((uh1) this.b).a("SdkConfigurationEcpmImpressionCallbackDisabled", false);
                    boolean a26 = ((uh1) this.b).a("SdkConfigurationDivkitisabled", false);
                    boolean a27 = ((uh1) this.b).a("SdkConfigurationLibSSLEnabled", false);
                    String c9 = ((uh1) this.b).c("LightBundleScriptUrl");
                    boolean a28 = ((uh1) this.b).a("ShouldWaitLightBundleScriptLoading", false);
                    boolean a29 = ((uh1) this.b).a("ShouldStartLightBundleScriptLoading", false);
                    boolean a30 = ((uh1) this.b).a("SdkConfigurationCloseFullscreenWithAdtuneDisabled", false);
                    boolean a31 = ((uh1) this.b).a("SdkConfigurationEncryptedRequestsEnabled", false);
                    boolean a32 = ((uh1) this.b).a("SdkConfigurationRenderAssetValidationEnabled", false);
                    boolean a33 = ((uh1) this.b).a("SdkConfigurationAutomaticSdkInitializationDelayEnabled", false);
                    Boolean a34 = az.a(this.b, "SdkConfigurationAgeRestrictedUser");
                    boolean a35 = ((uh1) this.b).a("NativeBannerEnabled", false);
                    boolean a36 = ((uh1) this.b).a("UseDivkitCloseActionInsteadSystemClick", false);
                    String c10 = ((uh1) this.b).c(bz.a0.a());
                    String c11 = ((uh1) this.b).c(bz.b0.a());
                    String c12 = ((uh1) this.b).c(bz.c0.a());
                    if (c12 != null) {
                        this.e.getClass();
                        map = t43.a(c12);
                    } else {
                        map = null;
                    }
                    boolean a37 = ((uh1) this.b).a(bz.d0.a(), false);
                    boolean a38 = ((uh1) this.b).a(bz.e0.a(), false);
                    boolean a39 = ((uh1) this.b).a(bz.f0.a(), false);
                    boolean a40 = ((uh1) this.b).a(bz.g0.a(), false);
                    boolean a41 = ((uh1) this.b).a(bz.h0.a(), false);
                    boolean a42 = ((uh1) this.b).a(bz.i0.a(), false);
                    boolean a43 = ((uh1) this.b).a(bz.j0.a(), false);
                    boolean a44 = ((uh1) this.b).a(bz.k0.a(), false);
                    sh1 sh1Var2 = this.b;
                    String a45 = bz.l0.a();
                    uh1 uh1Var = (uh1) sh1Var2;
                    if (!uh1Var.a(a45)) {
                        uh1Var = null;
                    }
                    Long valueOf = uh1Var != null ? Long.valueOf(uh1Var.b(a45)) : null;
                    sh1 sh1Var3 = this.b;
                    String a46 = bz.m0.a();
                    uh1 uh1Var2 = (uh1) sh1Var3;
                    if (!uh1Var2.a(a46)) {
                        uh1Var2 = null;
                    }
                    if (uh1Var2 != null) {
                        Long valueOf2 = Long.valueOf(uh1Var2.b(a46));
                        i = a2;
                        z = a11;
                        z2 = a13;
                        z3 = a17;
                        z4 = a19;
                        z5 = a25;
                        str = c9;
                        z6 = a29;
                        z7 = a33;
                        z8 = a38;
                        z9 = a42;
                        l = valueOf2;
                    } else {
                        i = a2;
                        z = a11;
                        z2 = a13;
                        z3 = a17;
                        z4 = a19;
                        z5 = a25;
                        str = c9;
                        z6 = a29;
                        z7 = a33;
                        z8 = a38;
                        z9 = a42;
                        l = null;
                    }
                    int i3 = i;
                    boolean a47 = ((uh1) this.b).a(bz.n0.a(), false);
                    Integer b7 = az.b(this.b, bz.o0.a());
                    Integer b8 = az.b(this.b, bz.p0.a());
                    Boolean a48 = az.a(this.b, bz.q0.a());
                    boolean a49 = ((uh1) this.b).a(bz.r0.a(), false);
                    String c13 = ((uh1) this.b).c(bz.s0.a());
                    if (c13 != null) {
                        this.c.getClass();
                        i2 = i3;
                        num = b8;
                        set = en0.a(c13);
                    } else {
                        i2 = i3;
                        num = b8;
                        set = null;
                    }
                    int i4 = i2;
                    boolean a50 = ((uh1) this.b).a(bz.t0.a(), false);
                    boolean a51 = ((uh1) this.b).a(bz.u0.a(), true);
                    boolean a52 = ((uh1) this.b).a(bz.v0.a(), false);
                    Integer b9 = az.b(this.b, bz.w0.a());
                    Integer b10 = az.b(this.b, bz.x0.a());
                    Integer b11 = az.b(this.b, bz.y0.a());
                    Integer b12 = az.b(this.b, bz.z0.a());
                    String c14 = ((uh1) this.b).c(bz.A0.a());
                    if (c14 != null) {
                        this.d.getClass();
                        z10 = a9;
                        z11 = a12;
                        z12 = a14;
                        z13 = a18;
                        z14 = a30;
                        z15 = a35;
                        z16 = a39;
                        z17 = a43;
                        z18 = a47;
                        z19 = a49;
                        z20 = a51;
                        num2 = b10;
                        f8Var = u7.a(c14);
                    } else {
                        z10 = a9;
                        z11 = a12;
                        z12 = a14;
                        z13 = a18;
                        z14 = a30;
                        z15 = a35;
                        z16 = a39;
                        z17 = a43;
                        z18 = a47;
                        z19 = a49;
                        z20 = a51;
                        num2 = b10;
                        f8Var = null;
                    }
                    String c15 = ((uh1) this.b).c(bz.L0.a());
                    if (c15 != null) {
                        try {
                            j8yVar = qe1.a;
                            j8yVar.getClass();
                            z21 = a52;
                        } catch (Throwable th) {
                            th = th;
                            z21 = a52;
                        }
                        try {
                            failure = j8yVar.a(ww0.Companion.serializer(), c15);
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                        }
                    } else {
                        z21 = a52;
                    }
                    failure = null;
                    ww0 ww0Var = (ww0) failure;
                    boolean a53 = ((uh1) this.b).a(bz.B0.a(), false);
                    List a54 = wh1.a(this.b, bz.C0.a());
                    if (a54 == null) {
                        a54 = EmptyList.b;
                    }
                    List list = a54;
                    boolean a55 = ((uh1) this.b).a(bz.D0.a(), false);
                    boolean a56 = ((uh1) this.b).a(bz.E0.a(), false);
                    boolean a57 = ((uh1) this.b).a(bz.F0.a(), false);
                    boolean a58 = ((uh1) this.b).a(bz.G0.a(), false);
                    boolean a59 = ((uh1) this.b).a(bz.H0.a(), false);
                    Integer b13 = az.b(this.b, bz.I0.a());
                    boolean a60 = ((uh1) this.b).a(bz.J0.a(), false);
                    boolean a61 = ((uh1) this.b).a(bz.K0.a(), false);
                    boolean a62 = ((uh1) this.b).a(bz.M0.a(), false);
                    boolean a63 = ((uh1) this.b).a(bz.P0.a(), false);
                    String c16 = ((uh1) this.b).c(bz.N0.a());
                    boolean a64 = ((uh1) this.b).a(bz.O0.a(), false);
                    String c17 = ((uh1) this.b).c(bz.Q0.a());
                    if (c17 != null) {
                        try {
                            j8y j8yVar3 = qe1.a;
                            j8yVar3.getClass();
                            failure2 = j8yVar3.a(ne2.Companion.serializer(), c17);
                        } catch (Throwable th3) {
                            failure2 = new Result.Failure(th3);
                        }
                    }
                    failure2 = null;
                    qu2Var = new qu2(i4, a3, b4, b5, b, a8, a5, a6, z10, a10, z11, z, z2, z12, z3, z13, a16, a15, z4, z14, z5, a26, a20, a21, a27, str, a28, z6, a31, a32, z7, z15, a36, a37, z8, z16, a40, a41, b2, b3, a7, a34, a, c10, c5, c6, c, c4, c8, c2, c3, a4, (c7 == null || b6 == null) ? null : new hm0(b6.intValue(), c7), a22, a23, a24, c11, map, z9, z17, a44, valueOf, l, z18, b7, num, a48, z19, set, a50, z20, z21, b9, num2, b11, b12, f8Var, a53, list, a55, a56, a57, a58, a59, b13, a60, a61, ww0Var, a62, a64, a63, c16 != null ? new fz2(c16) : null, (ne2) failure2);
                } else {
                    qu2Var = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return qu2Var;
    }

    public final void a(qu2 qu2Var) {
        String str;
        String str2;
        synchronized (f) {
            try {
                ((uh1) this.b).a(bz.i.a(), qu2Var.U);
                ((uh1) this.b).a(bz.S.a(), qu2Var.V);
                ((uh1) this.b).b(bz.k.a(), qu2Var.i);
                ((uh1) this.b).b(bz.T.a(), qu2Var.j);
                ((uh1) this.b).a(bz.c.a(), qu2Var.e);
                ((uh1) this.b).a(bz.d.a(), qu2Var.S);
                ((uh1) this.b).a(bz.e.a(), qu2Var.T);
                ((uh1) this.b).a(bz.y.a(), qu2Var.W);
                ((uh1) this.b).b(bz.f.a(), qu2Var.f);
                ((uh1) this.b).b(bz.w.a(), qu2Var.r);
                ((uh1) this.b).b(bz.x.a(), qu2Var.q);
                ((uh1) this.b).b(qu2Var.a, bz.g.a());
                ((uh1) this.b).b(bz.u.a(), qu2Var.g());
                ((uh1) this.b).b(bz.v.a(), qu2Var.p);
                ((uh1) this.b).b(bz.G.a(), qu2Var.u);
                ((uh1) this.b).b(bz.I.a(), qu2Var.v);
                sh1 sh1Var = this.b;
                bz bzVar = bz.H;
                ((uh1) sh1Var).b(bzVar.a(), qu2Var.t);
                ((uh1) this.b).b(bz.J.a(), qu2Var.x);
                ((uh1) this.b).b(bz.M.a(), qu2Var.y);
                ((uh1) this.b).a(bz.N.a(), qu2Var.z);
                ((uh1) this.b).b(bz.O.a(), qu2Var.A);
                ((uh1) this.b).b(bz.P.a(), qu2Var.B);
                ((uh1) this.b).b(bz.Q.a(), qu2Var.C);
                sh1 sh1Var2 = this.b;
                bz bzVar2 = bz.R;
                ((uh1) sh1Var2).b(bzVar2.a(), qu2Var.D);
                ((uh1) this.b).b(qu2Var.b, bz.B.a());
                ((uh1) this.b).a(bz.C.a(), qu2Var.c);
                ((uh1) this.b).a(bz.D.a(), qu2Var.d);
                ((uh1) this.b).a(bz.V.a(), qu2Var.X);
                ((uh1) this.b).a(bz.W.a(), qu2Var.Y);
                ((uh1) this.b).a(bz.a0.a(), qu2Var.R);
                Boolean bool = qu2Var.Q;
                Boolean bool2 = qu2Var.Z;
                boolean z = qu2Var.g;
                boolean z2 = qu2Var.h;
                Boolean bool3 = qu2Var.O;
                boolean z3 = qu2Var.l;
                boolean h = qu2Var.h();
                boolean z4 = qu2Var.m;
                boolean z5 = qu2Var.n;
                boolean z6 = qu2Var.s;
                boolean z7 = qu2Var.w;
                boolean z8 = qu2Var.b0;
                boolean z9 = qu2Var.c0;
                Integer num = qu2Var.M;
                Integer num2 = qu2Var.N;
                hp hpVar = qu2Var.d0;
                boolean z10 = qu2Var.t;
                boolean z11 = qu2Var.D;
                Boolean bool4 = qu2Var.P;
                boolean f2 = qu2Var.f();
                boolean z12 = qu2Var.F;
                boolean z13 = qu2Var.G;
                az.a(this.b, bz.h.a(), bool);
                az.a(this.b, bz.j.a(), bool2);
                az.a(this.b, bz.l.a(), Boolean.valueOf(z));
                az.a(this.b, bz.m.a(), Boolean.valueOf(z2));
                az.a(this.b, bz.n.a(), bool3);
                az.a(this.b, bz.p.a(), Boolean.valueOf(z3));
                az.a(this.b, bz.o.a(), Boolean.valueOf(h));
                az.a(this.b, bz.q.a(), Boolean.valueOf(z4));
                az.a(this.b, bz.r.a(), Boolean.valueOf(z5));
                az.a(this.b, bzVar.a(), Boolean.valueOf(z10));
                az.a(this.b, bz.z.a(), Boolean.valueOf(z6));
                az.a(this.b, bz.A.a(), Boolean.valueOf(z7));
                az.a(this.b, bz.U.a(), bool4);
                az.a(this.b, bz.X.a(), Boolean.valueOf(f2));
                az.a(this.b, bz.K.a(), Boolean.valueOf(z8));
                az.a(this.b, bz.L.a(), Boolean.valueOf(z9));
                az.a(this.b, bz.s.a(), num);
                az.a(this.b, bz.t.a(), num2);
                if (hpVar != null) {
                    j8y j8yVar = jp.a;
                    jp.a(this.b, hpVar);
                } else {
                    j8y j8yVar2 = jp.a;
                    jp.b(this.b);
                }
                hm0 hm0Var = qu2Var.a0;
                if (hm0Var != null) {
                    ((uh1) this.b).a(bz.E.a(), hm0Var.a());
                    ((uh1) this.b).b(hm0Var.b(), bz.F.a());
                }
                az.a(this.b, bzVar2.a(), Boolean.valueOf(z11));
                ((uh1) this.b).b(bz.Y.a(), z12);
                ((uh1) this.b).b(bz.Z.a(), z13);
                ((uh1) this.b).a(bz.b0.a(), qu2Var.e0);
                sh1 sh1Var3 = this.b;
                String a = bz.c0.a();
                Map map = qu2Var.f0;
                String str3 = null;
                if (map != null) {
                    this.e.getClass();
                    str = t43.a(map);
                } else {
                    str = null;
                }
                ((uh1) sh1Var3).a(a, str);
                ((uh1) this.b).b(bz.d0.a(), qu2Var.H);
                ((uh1) this.b).b(bz.e0.a(), qu2Var.I);
                ((uh1) this.b).b(bz.f0.a(), qu2Var.J);
                ((uh1) this.b).b(bz.g0.a(), qu2Var.i());
                ((uh1) this.b).b(bz.h0.a(), qu2Var.L);
                ((uh1) this.b).b(bz.i0.a(), qu2Var.g0);
                ((uh1) this.b).b(bz.j0.a(), qu2Var.h0);
                ((uh1) this.b).b(bz.k0.a(), qu2Var.i0);
                sh1 sh1Var4 = this.b;
                String a2 = bz.l0.a();
                Long l = qu2Var.j0;
                if (l != null) {
                    ((uh1) sh1Var4).a(a2, l.longValue());
                } else {
                    ((uh1) sh1Var4).d(a2);
                }
                sh1 sh1Var5 = this.b;
                String a3 = bz.m0.a();
                Long l2 = qu2Var.k0;
                if (l2 != null) {
                    ((uh1) sh1Var5).a(a3, l2.longValue());
                } else {
                    ((uh1) sh1Var5).d(a3);
                }
                ((uh1) this.b).b(bz.n0.a(), qu2Var.l0);
                az.a(this.b, bz.o0.a(), qu2Var.m0);
                az.a(this.b, bz.p0.a(), qu2Var.n0);
                az.a(this.b, bz.q0.a(), qu2Var.o0);
                ((uh1) this.b).b(bz.r0.a(), qu2Var.p0);
                sh1 sh1Var6 = this.b;
                String a4 = bz.s0.a();
                en0 en0Var = this.c;
                Set set = qu2Var.q0;
                en0Var.getClass();
                ((uh1) sh1Var6).a(a4, en0.a(set));
                ((uh1) this.b).b(bz.t0.a(), qu2Var.e());
                ((uh1) this.b).b(bz.u0.a(), qu2Var.s0);
                ((uh1) this.b).b(bz.v0.a(), qu2Var.t0);
                az.a(this.b, bz.w0.a(), qu2Var.u0);
                az.a(this.b, bz.x0.a(), qu2Var.v0);
                az.a(this.b, bz.y0.a(), qu2Var.w0);
                az.a(this.b, bz.z0.a(), qu2Var.x0);
                sh1 sh1Var7 = this.b;
                String a5 = bz.A0.a();
                u7 u7Var = this.d;
                f8 a6 = qu2Var.a();
                u7Var.getClass();
                ((uh1) sh1Var7).a(a5, u7.a(a6));
                sh1 sh1Var8 = this.b;
                String a7 = bz.L0.a();
                ww0 ww0Var = qu2Var.J0;
                if (ww0Var != null) {
                    j8y.a aVar = j8y.d;
                    aVar.getClass();
                    str2 = aVar.b(ww0.Companion.serializer(), ww0Var);
                } else {
                    str2 = null;
                }
                ((uh1) sh1Var8).a(a7, str2);
                ((uh1) this.b).b(bz.B0.a(), qu2Var.z0);
                wh1.a(this.b, bz.C0.a(), qu2Var.A0);
                ((uh1) this.b).b(bz.D0.a(), qu2Var.B0);
                ((uh1) this.b).b(bz.E0.a(), qu2Var.C0);
                ((uh1) this.b).b(bz.F0.a(), qu2Var.D0);
                ((uh1) this.b).b(bz.G0.a(), qu2Var.E0);
                ((uh1) this.b).b(bz.H0.a(), qu2Var.F0);
                az.a(this.b, bz.I0.a(), qu2Var.G0);
                ((uh1) this.b).b(bz.J0.a(), qu2Var.H0);
                ((uh1) this.b).b(bz.K0.a(), qu2Var.I0);
                ((uh1) this.b).b(bz.M0.a(), qu2Var.b());
                ((uh1) this.b).b(bz.P0.a(), qu2Var.d());
                fz2 c = qu2Var.c();
                if (c != null) {
                    ((uh1) this.b).a(bz.N0.a(), c.a());
                }
                ((uh1) this.b).b(bz.O0.a(), qu2Var.L0);
                sh1 sh1Var9 = this.b;
                String a8 = bz.Q0.a();
                ne2 ne2Var = qu2Var.O0;
                if (ne2Var != null) {
                    j8y.a aVar2 = j8y.d;
                    aVar2.getClass();
                    str3 = aVar2.b(ne2.Companion.serializer(), ne2Var);
                }
                ((uh1) sh1Var9).a(a8, str3);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
