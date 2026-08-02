package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lgl0 {
    public final a4l0 a;
    public final a4l0 b;

    public lgl0(a4l0 a4l0Var, a4l0 a4l0Var2) {
        this.a = a4l0Var;
        this.b = a4l0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgl0)) {
            return false;
        }
        lgl0 lgl0Var = (lgl0) obj;
        return this.a.equals(lgl0Var.a) && jl40.l(this.b, lgl0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a4l0 a4l0Var = this.b;
        return hashCode + (a4l0Var == null ? 0 : a4l0Var.hashCode());
    }

    public final String toString() {
        return "RoutesInfoModel(mainRoute=" + this.a + ", alternativeRoute=" + this.b + Extension.C_BRAKE;
    }
}
