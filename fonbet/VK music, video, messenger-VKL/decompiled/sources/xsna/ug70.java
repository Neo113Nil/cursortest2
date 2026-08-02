package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public interface ug70 extends xl50 {

    /* compiled from: NotificationSettingsPatch.kt */
    public static final class a implements ug70 {
        public final String b;
        public final String c;
        public final NotificationsNotificationSettingsSectionRedesignDto d;

        public a(String str, String str2, NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto) {
            this.b = str;
            this.c = str2;
            this.d = notificationsNotificationSettingsSectionRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = this.d;
            return hashCode2 + (notificationsNotificationSettingsSectionRedesignDto != null ? notificationsNotificationSettingsSectionRedesignDto.hashCode() : 0);
        }

        public final String toString() {
            return "InitialSectionData(sectionId=" + this.b + ", sectionTitle=" + this.c + ", section=" + this.d + ')';
        }
    }
}
