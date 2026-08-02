package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p90 implements q90 {
    public final uc8 a;

    public p90(uc8 uc8Var) {
        this.a = uc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p90) && jl40.l(this.a, ((p90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(cardData=" + this.a + Extension.C_BRAKE;
    }
}
