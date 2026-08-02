package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cem0 implements fem0 {
    public final rr51 a;
    public final cx11 b;

    public cem0(rr51 rr51Var, cx11 cx11Var) {
        this.a = rr51Var;
        this.b = cx11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cem0)) {
            return false;
        }
        cem0 cem0Var = (cem0) obj;
        return jl40.l(this.a, cem0Var.a) && this.b.equals(cem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountInfoScreen(entity=" + this.a + ", accountUnbindSheet=" + this.b + Extension.C_BRAKE;
    }
}
