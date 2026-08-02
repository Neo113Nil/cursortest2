package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class lk81 {
    public final d881 a;
    public final fe81 b;
    public final cl81 c;
    public final v981 d;
    public final z181 e;

    public lk81(d881 d881Var, fe81 fe81Var, cl81 cl81Var, v981 v981Var, z181 z181Var, int i) {
        z181Var = (i & 64) != 0 ? null : z181Var;
        this.a = d881Var;
        this.b = fe81Var;
        this.c = cl81Var;
        this.d = v981Var;
        this.e = z181Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk81)) {
            return false;
        }
        lk81 lk81Var = (lk81) obj;
        return jl40.l(this.a, lk81Var.a) && jl40.l(this.b, lk81Var.b) && jl40.l(this.c, lk81Var.c) && jl40.l(this.d, lk81Var.d) && jl40.l(this.e, lk81Var.e);
    }

    public final int hashCode() {
        int b = fia1.b(0, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 961);
        z181 z181Var = this.e;
        return b + (z181Var != null ? z181Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.a + ", adConfiguration=" + this.b + ", adResultReceiver=" + this.c + ", sdkEnvironmentModule=" + this.d + ", nativeAd=null, requestedOrientation=0, delegatedActivityLaunchInfo=" + this.e + Extension.C_BRAKE;
    }
}
