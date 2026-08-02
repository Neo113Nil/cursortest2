package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.NotificationVariants;

/* compiled from: BookingEditScreenPatch.kt */
/* loaded from: classes18.dex */
public final class zp7 implements com.vk.ecomm.onlinebooking.impl.edit.f {
    public final NotificationVariants b;

    public zp7(NotificationVariants notificationVariants) {
        this.b = notificationVariants;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp7) && this.b == ((zp7) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Changed(value=" + this.b + ')';
    }
}
