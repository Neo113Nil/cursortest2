package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kn20 extends mn20 {
    public final String a;
    public final String b;

    public kn20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn20)) {
            return false;
        }
        kn20 kn20Var = (kn20) obj;
        return this.a.equals(kn20Var.a) && this.b.equals(kn20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Failure(errorDomain=", this.a, ", errorDescription=", this.b, Extension.C_BRAKE);
    }
}
