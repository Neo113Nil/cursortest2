package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class k4b {
    public final String a;
    public final String b;

    public k4b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4b)) {
            return false;
        }
        k4b k4bVar = (k4b) obj;
        return jl40.l(this.a, k4bVar.a) && this.b.equals(k4bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ChatLink(name=", this.a, ", link=", this.b, Extension.C_BRAKE);
    }
}
