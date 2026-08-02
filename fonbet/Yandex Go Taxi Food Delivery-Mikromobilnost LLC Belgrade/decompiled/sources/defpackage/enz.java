package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class enz {
    public final String a = null;
    public final String b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enz)) {
            return false;
        }
        enz enzVar = (enz) obj;
        return jl40.l(this.a, enzVar.a) && jl40.l(this.b, enzVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("Hint(searchStart=", this.a, ", radiusChange=", this.b, Extension.C_BRAKE);
    }
}
