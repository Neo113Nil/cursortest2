package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class alg {
    public final String a;
    public final zkg b;

    public alg(String str, zkg zkgVar) {
        this.a = str;
        this.b = zkgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alg)) {
            return false;
        }
        alg algVar = (alg) obj;
        return jl40.l(this.a, algVar.a) && this.b.equals(algVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TitleText(text=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }
}
