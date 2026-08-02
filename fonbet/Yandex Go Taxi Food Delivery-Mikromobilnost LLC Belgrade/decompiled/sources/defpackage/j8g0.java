package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j8g0 implements k8g0 {
    public final a1v0 a;

    public j8g0(a1v0 a1v0Var) {
        this.a = a1v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8g0) && this.a.equals(((j8g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Subscription(subscriptionInfo=" + this.a + Extension.C_BRAKE;
    }
}
