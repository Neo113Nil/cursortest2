package defpackage;

import com.yandex.go.taxi.summary.shared.promo.models.NotificationTrail$Switch$ClickPolicy;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fk60 implements hk60 {
    public final boolean a;
    public final NotificationTrail$Switch$ClickPolicy b;
    public final th40 c;

    public fk60(boolean z, NotificationTrail$Switch$ClickPolicy notificationTrail$Switch$ClickPolicy, th40 th40Var) {
        this.a = z;
        this.b = notificationTrail$Switch$ClickPolicy;
        this.c = th40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fk60) {
            fk60 fk60Var = (fk60) obj;
            return this.a == fk60Var.a && this.b == fk60Var.b && this.c == fk60Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Switch(toggled=" + this.a + ", clickPolicy=" + this.b + ", changeCallback=" + this.c + Extension.C_BRAKE;
    }
}
