package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.dto.common.id.UserId;

/* compiled from: NotificationSettingAction.kt */
/* loaded from: classes5.dex */
public interface le70 extends kj50 {

    /* compiled from: NotificationSettingAction.kt */
    public static final class a implements le70 {
        public final NotificationsNotificationSettingOptionsItemDto b;

        public a(NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto) {
            this.b = notificationsNotificationSettingOptionsItemDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChooseWhatToSend(whatToSendItem=" + this.b + ')';
        }
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class b implements le70 {
        public final NotificationsNotificationSettingOptionsItemDto b;

        public b(NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto) {
            this.b = notificationsNotificationSettingOptionsItemDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChooseWhatToShow(whatToShowItem=" + this.b + ')';
        }
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class c implements le70 {
        public final String b;
        public final String c;
        public final NotificationsNotificationSettingRedesignDto d;

        public c(String str, String str2, NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.b = str;
            this.c = str2;
            this.d = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.d;
            return hashCode2 + (notificationsNotificationSettingRedesignDto != null ? notificationsNotificationSettingRedesignDto.hashCode() : 0);
        }

        public final String toString() {
            return "Init(settingId=" + this.b + ", settingTitle=" + this.c + ", setting=" + this.d + ')';
        }
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class d implements le70 {
        public static final d b = new d();
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class e implements le70 {
        public final UserId b;

        public e(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenProfile(userId="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class f implements le70 {
        public static final f b = new f();
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class g implements le70 {
        public final UserId b;

        public g(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("RemovePostSource(userId="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class h implements le70 {
        public final UserId b;

        public h(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("RemoveStoriesSource(userId="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class i implements le70 {
        public static final i b = new i();
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class j implements le70 {
        public final UserId b;

        public j(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ToggleManagedCommunityPush(userId="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class k implements le70 {
        public static final k b = new k();
    }

    /* compiled from: NotificationSettingAction.kt */
    public static final class l implements le70 {
        public static final l b = new l();
    }
}
