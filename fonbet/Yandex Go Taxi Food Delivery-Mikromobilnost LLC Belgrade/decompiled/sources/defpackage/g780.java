package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g780 extends mr {
    public final m83 a;

    public g780(m83 m83Var) {
        this.a = m83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g780) && this.a.equals(((g780) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrderState(orderStatus=" + this.a + Extension.C_BRAKE;
    }
}
