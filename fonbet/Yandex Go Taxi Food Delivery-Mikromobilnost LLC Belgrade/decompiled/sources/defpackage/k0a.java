package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class k0a implements o0a {
    public final ir9 a;

    public k0a(ir9 ir9Var) {
        this.a = ir9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0a) && this.a == ((k0a) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDiscount(discount=" + this.a + Extension.C_BRAKE;
    }
}
