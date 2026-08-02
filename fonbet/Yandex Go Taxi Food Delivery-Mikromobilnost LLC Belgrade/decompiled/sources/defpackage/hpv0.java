package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hpv0 implements jpv0 {
    public final bov0 a;

    public hpv0(bov0 bov0Var) {
        this.a = bov0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpv0) && jl40.l(this.a, ((hpv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Opened(revealParams=" + this.a + Extension.C_BRAKE;
    }
}
