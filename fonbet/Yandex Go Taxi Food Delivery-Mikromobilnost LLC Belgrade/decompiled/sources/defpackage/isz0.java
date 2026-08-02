package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class isz0 {
    public final rr51 a;
    public final rr51 b;

    public isz0(rr51 rr51Var, rr51 rr51Var2) {
        this.a = rr51Var;
        this.b = rr51Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isz0)) {
            return false;
        }
        isz0 isz0Var = (isz0) obj;
        return jl40.l(this.a, isz0Var.a) && this.b.equals(isz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Toolbar(blockCenter=" + this.a + ", blockRight=" + this.b + Extension.C_BRAKE;
    }
}
