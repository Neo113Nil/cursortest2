package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationSettingsAction.kt */
/* loaded from: classes5.dex */
public final class wf70 implements rf70 {
    public final NotificationsNotificationSettingsSectionRedesignDto b;

    public wf70(NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto) {
        this.b = notificationsNotificationSettingsSectionRedesignDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf70) && epx.f(this.b, ((wf70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SectionStatusChange(section=" + this.b + ')';
    }
}
