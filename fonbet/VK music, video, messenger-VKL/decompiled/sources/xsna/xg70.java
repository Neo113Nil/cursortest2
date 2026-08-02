package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class xg70 implements ug70 {
    public final NotificationsNotificationSettingRedesignDto b;

    public xg70(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
        this.b = notificationsNotificationSettingRedesignDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg70) && epx.f(this.b, ((xg70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SettingStatusUpdate(setting=" + this.b + ')';
    }
}
