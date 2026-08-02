package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class i9m0 implements s9m0 {
    public final String a;
    public final rr51 b;

    public i9m0(rr51 rr51Var, String str) {
        this.a = str;
        this.b = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9m0)) {
            return false;
        }
        i9m0 i9m0Var = (i9m0) obj;
        return jl40.l(this.a, i9m0Var.a) && this.b.equals(i9m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Div(id=" + this.a + ", divData=" + this.b + Extension.C_BRAKE;
    }
}
