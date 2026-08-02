package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dl30 implements ml30 {
    public final ll30 a;

    public dl30(ll30 ll30Var) {
        this.a = ll30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl30) && this.a.equals(((dl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnBackButtonTapped(screenAnalyticsState=" + this.a + Extension.C_BRAKE;
    }
}
