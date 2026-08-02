package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ez9 implements gz9 {
    public final ir9 a;

    public ez9(ir9 ir9Var) {
        this.a = ir9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez9) && this.a == ((ez9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDiscountDetails(discount=" + this.a + Extension.C_BRAKE;
    }
}
