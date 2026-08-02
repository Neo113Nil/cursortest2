package defpackage;

import com.yandex.quark.configuration.Language;

/* loaded from: classes8.dex */
public final class ahg0 {
    public final as90 a;
    public final raj b;
    public final String c;
    public final String d;
    public final cs1 e;
    public final oez f;
    public final Language g;
    public final dsu h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final pe60 l;
    public final q2c0 m;

    public ahg0(as90 as90Var, raj rajVar, String str, String str2, cs1 cs1Var, Language language, dsu dsuVar) {
        pe60 pe60Var = new pe60();
        q2c0 q2c0Var = new q2c0(149);
        this.a = as90Var;
        this.b = rajVar;
        this.c = str;
        this.d = str2;
        this.e = cs1Var;
        this.f = oez.b;
        this.g = language;
        this.h = dsuVar;
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = pe60Var;
        this.m = q2c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahg0)) {
            return false;
        }
        ahg0 ahg0Var = (ahg0) obj;
        return jl40.l(this.a, ahg0Var.a) && jl40.l(this.b, ahg0Var.b) && jl40.l(this.c, ahg0Var.c) && jl40.l(this.d, ahg0Var.d) && jl40.l(this.e, ahg0Var.e) && jl40.l(this.f, ahg0Var.f) && this.g == ahg0Var.g && jl40.l(this.h, ahg0Var.h) && this.i == ahg0Var.i && this.j == ahg0Var.j && this.k == ahg0Var.k && jl40.l(this.l, ahg0Var.l) && jl40.l(this.m, ahg0Var.m);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.m.hashCode() + ((this.l.hashCode() + unr0.e(unr0.e(unr0.e((this.h.hashCode() + unr0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31, 31, false)) * 31, 31, this.i), 31, this.j), 31, this.k)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuarkConfig(paths=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", platformName=");
        g8e.D(sb, this.c, ", appVersion=", this.d, ", aliceConfig=");
        sb.append(this.e);
        sb.append(", logLevel=");
        sb.append(this.f);
        sb.append(", language=");
        sb.append(this.g);
        sb.append(", waitForAuthToRegister=false, hostConfig=");
        sb.append(this.h);
        sb.append(", readAssetsDirectly=");
        nnm.v(", enableManualStreamingCompletion=", ", prepareSpotterModels=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", cookieProvider=");
        sb.append(this.l);
        sb.append(", pingNetworkMonitorConfig=");
        sb.append(this.m);
        sb.append(", usePersistentConfigsCache=false)");
        return sb.toString();
    }
}
