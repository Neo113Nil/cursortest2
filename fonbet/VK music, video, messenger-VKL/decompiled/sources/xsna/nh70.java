package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationSettingsSideEffect.kt */
/* loaded from: classes5.dex */
public interface nh70 {

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class a implements nh70 {
        public final NotificationsNotificationSettingsSectionRedesignDto a;

        public a(NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto) {
            this.a = notificationsNotificationSettingsSectionRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeSectionEnableState(section=" + this.a + ')';
        }
    }

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class b implements nh70 {
        public static final b a = new b();
    }

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class c implements nh70 {
        public static final c a = new c();
    }

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class d implements nh70 {
        public static final d a = new d();
    }

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class e implements nh70 {
        public static final e a = new e();
    }

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class f implements nh70 {
        public final String a;
        public final String b;
        public final NotificationsNotificationSettingsSectionRedesignDto c;

        public f(String str, String str2, NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto) {
            this.a = str;
            this.b = str2;
            this.c = notificationsNotificationSettingsSectionRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = this.c;
            return hashCode2 + (notificationsNotificationSettingsSectionRedesignDto != null ? notificationsNotificationSettingsSectionRedesignDto.hashCode() : 0);
        }

        public final String toString() {
            return "NavigateToSection(sectionId=" + this.a + ", sectionTitle=" + this.b + ", section=" + this.c + ')';
        }
    }

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class g implements nh70 {
        public final String a;
        public final String b;
        public final NotificationsNotificationSettingRedesignDto c;

        public g(String str, String str2, NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.a = str;
            this.b = str2;
            this.c = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.c;
            return hashCode2 + (notificationsNotificationSettingRedesignDto != null ? notificationsNotificationSettingRedesignDto.hashCode() : 0);
        }

        public final String toString() {
            return "NavigateToSetting(settingId=" + this.a + ", settingTitle=" + this.b + ", setting=" + this.c + ')';
        }
    }

    /* compiled from: NotificationSettingsSideEffect.kt */
    public static final class h implements nh70 {
        public final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SystemNotificationSettingChange(enabled="), this.a, ')');
        }
    }
}
