package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g9u {
    public final String a;
    public final String b;

    public g9u(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9u)) {
            return false;
        }
        g9u g9uVar = (g9u) obj;
        return this.a.equals(g9uVar.a) && jl40.l(this.b, g9uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("HeaderButton(title=", this.a, ", deeplink=", this.b, Extension.C_BRAKE);
    }
}
