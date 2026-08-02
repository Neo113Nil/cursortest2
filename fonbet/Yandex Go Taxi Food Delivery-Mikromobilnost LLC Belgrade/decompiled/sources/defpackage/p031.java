package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p031 implements u031 {
    public final u031 a;

    public p031() {
        this(r501.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p031) && jl40.l(this.a, ((p031) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IsValidating(previous=" + this.a + Extension.C_BRAKE;
    }

    public p031(u031 u031Var) {
        this.a = u031Var;
    }
}
