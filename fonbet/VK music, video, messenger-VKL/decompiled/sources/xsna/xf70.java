package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;

/* compiled from: NotificationSettingsAction.kt */
/* loaded from: classes5.dex */
public final class xf70 implements rf70 {
    public final NotificationsNotificationSettingRedesignDto b;

    public xf70(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
        this.b = notificationsNotificationSettingRedesignDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf70) && epx.f(this.b, ((xf70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SettingStatusChange(setting=" + this.b + ')';
    }
}
