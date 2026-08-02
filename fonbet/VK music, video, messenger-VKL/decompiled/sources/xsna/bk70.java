package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationsSectionData.kt */
/* loaded from: classes5.dex */
public final class bk70 {
    public final String a;
    public final String b;
    public final NotificationsNotificationSettingsSectionRedesignDto c;

    public bk70(String str, String str2, NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto) {
        this.a = str;
        this.b = str2;
        this.c = notificationsNotificationSettingsSectionRedesignDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk70)) {
            return false;
        }
        bk70 bk70Var = (bk70) obj;
        return epx.f(this.a, bk70Var.a) && epx.f(this.b, bk70Var.b) && epx.f(this.c, bk70Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = this.c;
        return hashCode2 + (notificationsNotificationSettingsSectionRedesignDto != null ? notificationsNotificationSettingsSectionRedesignDto.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsSectionData(sectionId=" + this.a + ", sectionTitle=" + this.b + ", section=" + this.c + ')';
    }
}
