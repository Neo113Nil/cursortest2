package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fal0 implements hal0 {
    public final String a;
    public final String b;
    public final String c;
    public final u0c0 d;
    public final boolean e;
    public final ub90 f;

    public fal0(String str, String str2, String str3, u0c0 u0c0Var, boolean z, tb90 tb90Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u0c0Var;
        this.e = z;
        this.f = tb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fal0)) {
            return false;
        }
        fal0 fal0Var = (fal0) obj;
        return jl40.l(this.a, fal0Var.a) && this.b.equals(fal0Var.b) && jl40.l(this.c, fal0Var.c) && jl40.l(this.d, fal0Var.d) && this.e == fal0Var.e && jl40.l(this.f, fal0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e = unr0.e((this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e);
        ub90 ub90Var = this.f;
        return e + (ub90Var != null ? ub90Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CirclePin(title=", this.a, ", subtitle=", this.b, ", initialEntranceNumber=");
        v.append(this.c);
        v.append(", pinStyles=");
        v.append(this.d);
        v.append(", isShowEntrance=");
        v.append(this.e);
        v.append(", panoramaData=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
