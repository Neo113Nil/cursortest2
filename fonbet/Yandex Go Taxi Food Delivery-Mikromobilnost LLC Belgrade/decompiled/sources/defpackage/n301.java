package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n301 {
    public final String a;
    public final e501 b;

    public n301(String str, e501 e501Var) {
        this.a = str;
        this.b = e501Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n301)) {
            return false;
        }
        n301 n301Var = (n301) obj;
        return jl40.l(this.a, n301Var.a) && this.b.equals(n301Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(url=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
