package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nv1 implements wv1 {
    public final sd6 a;

    public nv1(sd6 sd6Var) {
        this.a = sd6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nv1) && this.a.equals(((nv1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BottomNotificationContent(bottomNotification=" + this.a + Extension.C_BRAKE;
    }
}
