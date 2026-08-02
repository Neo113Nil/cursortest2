package defpackage;

import com.yandex.mob.model.MobNotificationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class np20 {
    public static final mp20 Companion = new mp20();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new um20(3))};
    public final String a;
    public final MobNotificationType b;

    public /* synthetic */ np20(int i, String str, MobNotificationType mobNotificationType) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, lp20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mobNotificationType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np20)) {
            return false;
        }
        np20 np20Var = (np20) obj;
        return jl40.l(this.a, np20Var.a) && this.b == np20Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MobNotificationType mobNotificationType = this.b;
        return hashCode + (mobNotificationType == null ? 0 : mobNotificationType.hashCode());
    }

    public final String toString() {
        return "MobNotification(notificationId=" + this.a + ", notificationType=" + this.b + Extension.C_BRAKE;
    }
}
