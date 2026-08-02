package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;

/* compiled from: NotificationSettingSideEffect.kt */
/* loaded from: classes5.dex */
public interface if70 {

    /* compiled from: NotificationSettingSideEffect.kt */
    public static final class a implements if70 {
        public static final a a = new a();
    }

    /* compiled from: NotificationSettingSideEffect.kt */
    public static final class b implements if70 {
        public final String a;
        public final int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateSource(settingId=");
            sb.append(this.a);
            sb.append(", sourcesCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationSettingSideEffect.kt */
    public static final class c implements if70 {
        public final NotificationsNotificationSettingRedesignDto a;

        public c(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.a = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateStatus(setting=" + this.a + ')';
        }
    }
}
