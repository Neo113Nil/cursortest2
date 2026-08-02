package defpackage;

import com.ybsdk.api.entities.YBBuildFlavor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class kg51 {
    public final wls A;
    public final sls B;
    public final String a;
    public final tls b;
    public final tls c;
    public final YBBuildFlavor d;
    public final String e;
    public final tls f;
    public final tls g;
    public final tls h;
    public final tls i;
    public final boolean j;
    public final sls k;
    public final sls l;
    public final sls m;
    public final sls n;
    public final sls o;
    public final wls p;
    public final ums q;
    public final tls r;
    public final vms s;
    public final wms t;
    public final tls u;
    public final o9r v;
    public final tls w;
    public final tls x;
    public final tls y;
    public final tls z;

    public kg51(int i) {
        u431 u431Var = new u431(20);
        js41 js41Var = new js41(22);
        YBBuildFlavor yBBuildFlavor = YBBuildFlavor.PROD;
        int i2 = 23;
        js41 js41Var2 = new js41(i2);
        u431 u431Var2 = new u431(i2);
        js41 js41Var3 = new js41(24);
        u431 u431Var3 = new u431(21);
        qqr qqrVar = qqr.D;
        qqr qqrVar2 = qqr.E;
        q251 q251Var = new q251(10);
        qqr qqrVar3 = qqr.B;
        qqr qqrVar4 = qqr.C;
        sw41 sw41Var = new sw41(3);
        ums umsVar = new ums(13);
        js41 js41Var4 = new js41(17);
        int i3 = 13;
        vms vmsVar = new vms(i3);
        wms wmsVar = new wms(i3);
        u431 u431Var4 = new u431(22);
        rms rmsVar = new rms(14);
        js41 js41Var5 = new js41(18);
        js41 js41Var6 = new js41(19);
        js41 js41Var7 = new js41(20);
        js41 js41Var8 = new js41(21);
        sw41 sw41Var2 = new sw41(4);
        agz0 agz0Var = agz0.w;
        this.a = "ecd10020-35f9-46d4-a231-68e50488b824";
        this.b = u431Var;
        this.c = js41Var;
        this.d = yBBuildFlavor;
        this.e = "";
        this.f = js41Var2;
        this.g = u431Var2;
        this.h = js41Var3;
        this.i = u431Var3;
        this.j = true;
        this.k = qqrVar;
        this.l = qqrVar2;
        this.m = q251Var;
        this.n = qqrVar3;
        this.o = qqrVar4;
        this.p = sw41Var;
        this.q = umsVar;
        this.r = js41Var4;
        this.s = vmsVar;
        this.t = wmsVar;
        this.u = u431Var4;
        this.v = rmsVar;
        this.w = js41Var5;
        this.x = js41Var6;
        this.y = js41Var7;
        this.z = js41Var8;
        this.A = sw41Var2;
        this.B = agz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg51)) {
            return false;
        }
        kg51 kg51Var = (kg51) obj;
        return jl40.l(this.a, kg51Var.a) && jl40.l(this.b, kg51Var.b) && jl40.l(this.c, kg51Var.c) && this.d == kg51Var.d && jl40.l(this.e, kg51Var.e) && jl40.l(this.f, kg51Var.f) && jl40.l(this.g, kg51Var.g) && jl40.l(this.h, kg51Var.h) && jl40.l(this.i, kg51Var.i) && this.j == kg51Var.j && jl40.l(this.k, kg51Var.k) && jl40.l(this.l, kg51Var.l) && jl40.l(this.m, kg51Var.m) && jl40.l(this.n, kg51Var.n) && jl40.l(this.o, kg51Var.o) && jl40.l(this.p, kg51Var.p) && jl40.l(this.q, kg51Var.q) && jl40.l(this.r, kg51Var.r) && jl40.l(this.s, kg51Var.s) && jl40.l(this.t, kg51Var.t) && jl40.l(this.u, kg51Var.u) && jl40.l(this.v, kg51Var.v) && jl40.l(this.w, kg51Var.w) && jl40.l(this.x, kg51Var.x) && jl40.l(this.y, kg51Var.y) && jl40.l(this.z, kg51Var.z) && jl40.l(this.A, kg51Var.A) && jl40.l(this.B, kg51Var.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + ((this.A.hashCode() + ly3.a(ly3.a(ly3.a(ly3.a((this.v.hashCode() + ly3.a((this.t.hashCode() + ((this.s.hashCode() + ly3.a((this.q.hashCode() + ((this.p.hashCode() + nnm.a(nnm.a(nnm.a(nnm.a(nnm.a(unr0.e(ly3.a(ly3.a(ly3.a(ly3.a(unr0.b((this.d.hashCode() + unr0.e(ly3.a(ly3.a(unr0.b(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, false)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 923521, this.o)) * 31)) * 31, 31, this.r)) * 31)) * 31, 31, this.u)) * 961, 31, this.w), 31, this.x), 31, this.y), 31, this.z)) * 31);
    }

    public final String toString() {
        return "YBSdkAdditionalParams(forceEnableLogging=false, appMetricaApiKey=" + this.a + ", okHttpBuilder=" + this.b + ", authLandingFeatureProvider=" + this.c + ", isBankApp=false, buildFlavor=" + this.d + ", pulseHistogramsAdditionalPrefix=" + this.e + ", plusHomeFeatureProvider=" + this.f + ", nfcSdkFeatureProvider=" + this.g + ", harmonyWatchFeatureProvider=" + this.h + ", yPayConfigFeatureProvider=" + this.i + ", isNfcPinningDisabled=" + this.j + ", nfcOverridePaymentErrorTypeProvider=" + this.k + ", nfcOverrideTokenizationErrorTypeProvider=" + this.l + ", logoutListener=" + this.m + ", deviceIdProvider=" + this.n + ", externalBiometricHelperProvider=" + this.o + ", ybSdkSettingsTheme=null, coilIdlingThreadPoolDispatcher=null, customAnalyticsReporter=null, reviewAppProvider=" + this.p + ", adjustEventsHelper=" + this.q + ", updateAppProvider=" + this.r + ", qrScannerFactory=" + this.s + ", videoPlayerFactory=" + this.t + ", environmentCheckFactory=" + this.u + ", fingerprintStarter=" + this.v + ", adjustProvider=null, appIconFeatureProvider=" + this.w + ", personalWalletFeatureProvider=" + this.x + ", quickPayFeatureProvider=" + this.y + ", cbdcDataFeatureProvider=" + this.z + ", cbdcFeatureProvider=" + this.A + ", buildVariant=" + this.B + Extension.C_BRAKE;
    }

    public kg51() {
        this(0);
    }
}
