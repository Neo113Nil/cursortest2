package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fe60 implements he60 {
    public final edb0 a;
    public final edb0 b;

    public fe60(edb0 edb0Var, edb0 edb0Var2) {
        this.a = edb0Var;
        this.b = edb0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe60)) {
            return false;
        }
        fe60 fe60Var = (fe60) obj;
        return this.a.equals(fe60Var.a) && this.b.equals(fe60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Multiple(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
