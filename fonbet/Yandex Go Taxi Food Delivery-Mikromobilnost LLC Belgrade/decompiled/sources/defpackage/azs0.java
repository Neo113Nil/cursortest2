package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class azs0 {
    public final dyu0 a;
    public final lvi0 b;
    public final ldc c;
    public final ldc d;
    public final fz e;
    public final lxy0 f;

    public azs0(dyu0 dyu0Var, lvi0 lvi0Var, ldc ldcVar, ldc ldcVar2, fz fzVar, lxy0 lxy0Var) {
        this.a = dyu0Var;
        this.b = lvi0Var;
        this.c = ldcVar;
        this.d = ldcVar2;
        this.e = fzVar;
        this.f = lxy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azs0)) {
            return false;
        }
        azs0 azs0Var = (azs0) obj;
        return this.a.equals(azs0Var.a) && this.b.equals(azs0Var.b) && jl40.l(this.c, azs0Var.c) && jl40.l(this.d, azs0Var.d) && this.e.equals(azs0Var.e) && jl40.l(this.f, azs0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ldc ldcVar = this.c;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31)) * 31;
        lxy0 lxy0Var = this.f;
        return hashCode3 + (lxy0Var != null ? lxy0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCameraWidgetState(title=" + this.a + ", icon=" + this.b + ", backgroundColor=" + this.c + ", initialColor=" + this.d + ", actionWithAnalyticsData=" + this.e + ", initialBackgroundGradient=" + this.f + Extension.C_BRAKE;
    }
}
