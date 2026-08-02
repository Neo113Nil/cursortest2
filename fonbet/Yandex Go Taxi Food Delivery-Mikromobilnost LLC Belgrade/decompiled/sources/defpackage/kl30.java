package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kl30 implements ml30 {
    public final ll30 a;

    public kl30(ll30 ll30Var) {
        this.a = ll30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl30) && this.a.equals(((kl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenLocationSettings(screenAnalyticsState=" + this.a + Extension.C_BRAKE;
    }
}
