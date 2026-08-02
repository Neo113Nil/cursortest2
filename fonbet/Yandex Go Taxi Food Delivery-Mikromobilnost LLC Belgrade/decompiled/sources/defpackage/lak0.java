package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lak0 implements ibk0 {
    public final String a;
    public final boolean b;

    public lak0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "toggle_rating_reasons";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lak0)) {
            return false;
        }
        lak0 lak0Var = (lak0) obj;
        return jl40.l(this.a, lak0Var.a) && this.b == lak0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Toggled(id=", this.a, ", isSelected=", this.b, Extension.C_BRAKE);
    }
}
