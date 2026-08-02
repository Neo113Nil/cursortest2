package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationSettingsAction.kt */
/* loaded from: classes5.dex */
public interface rf70 extends kj50 {

    /* compiled from: NotificationSettingsAction.kt */
    public static final class a implements rf70 {
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
            return "Init(sectionId=" + this.b + ", sectionTitle=" + this.c + ", section=" + this.d + ')';
        }
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class b implements rf70 {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ManagedCommunitiesCountChange(count="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class c implements rf70 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MessagesIncludeChatsToCountChange(isAllChats="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class d implements rf70 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            return this.b == dVar.b;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MessagesIncludeCustomFolderToCountChange(folderType=null, isChecked="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class e implements rf70 {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NavigateToSetting(settingId="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class f implements rf70 {
        public static final f b = new f();
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class g implements rf70 {
        public final int b;
        public final String c;

        public g(int i, String str) {
            this.b = i;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SettingSourcesCountChange(sourcesCount=");
            sb.append(this.b);
            sb.append(", settingId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class h implements rf70 {
        public static final h b = new h();
    }

    /* compiled from: NotificationSettingsAction.kt */
    public static final class i implements rf70 {
        public static final i b = new i();
    }
}
