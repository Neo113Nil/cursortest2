package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gl30 implements ml30 {
    public final ll30 a;

    public gl30(ll30 ll30Var) {
        this.a = ll30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl30) && this.a.equals(((gl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnScanQrButtonTapped(screenAnalyticsState=" + this.a + Extension.C_BRAKE;
    }
}
