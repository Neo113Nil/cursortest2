package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class gh70 implements ug70 {
    public final NotificationsNotificationSettingsSectionRedesignDto b;

    public gh70(NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto) {
        this.b = notificationsNotificationSettingsSectionRedesignDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh70) && epx.f(this.b, ((gh70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ToggleSectionEnabled(section=" + this.b + ')';
    }
}
