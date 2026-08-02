package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fd40 implements td40 {
    public final ka40 a;

    public fd40(ka40 ka40Var) {
        this.a = ka40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd40) && jl40.l(this.a, ((fd40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CheckoutInfoAction(action=" + this.a + Extension.C_BRAKE;
    }
}
