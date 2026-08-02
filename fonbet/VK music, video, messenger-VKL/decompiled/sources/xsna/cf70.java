package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import xsna.kb70;

/* compiled from: NotificationSettingPatch.kt */
/* loaded from: classes5.dex */
public interface cf70 extends xl50 {

    /* compiled from: NotificationSettingPatch.kt */
    public static final class a implements cf70 {
        public final NotificationsNotificationSettingRedesignDto b;
        public final kb70.d c;

        public a(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto, kb70.d dVar) {
            this.b = notificationsNotificationSettingRedesignDto;
            this.c = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 961;
            kb70.d dVar = this.c;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            return "DataLoaded(setting=" + this.b + ", localSetting=null, notification=" + this.c + ')';
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class b implements cf70 {
        public static final b b = new b();
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class c implements cf70 {
        public final ArrayList b;

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b.equals(((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("GroupSourceLoaded(sources="), this.b);
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class d implements cf70 {
        public final String b;
        public final String c;
        public final NotificationsNotificationSettingRedesignDto d;

        public d(String str, String str2, NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.b = str;
            this.c = str2;
            this.d = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.d;
            return hashCode2 + (notificationsNotificationSettingRedesignDto != null ? notificationsNotificationSettingRedesignDto.hashCode() : 0);
        }

        public final String toString() {
            return "InitialData(settingId=" + this.b + ", settingTitle=" + this.c + ", setting=" + this.d + ')';
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class e implements cf70 {
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
            return gp.b(new StringBuilder("RemoveSource(userId="), this.b, ')');
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class f implements cf70 {
        public final NotificationsNotificationSettingRedesignDto b;

        public f(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.b = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SendPushChange(setting=" + this.b + ')';
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class g implements cf70 {
        public final NotificationsNotificationSettingRedesignDto b;

        public g(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.b = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SoundPushChange(setting=" + this.b + ')';
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class h implements cf70 {
        public final List<UserProfile> b;

        public h(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("SourceLoaded(sources="), this.b);
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class i implements cf70 {
        public static final i b = new i();
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class j implements cf70 {
        public static final j b = new j();
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class k implements cf70 {
        public static final k b = new k();
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class l implements cf70 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ToggleLocalSetting(localSetting=null)";
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class m implements cf70 {
        public final UserId b;
        public final boolean c;

        public m(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && this.c == mVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleManagedCommunitySource(userId=");
            sb.append(this.b);
            sb.append(", enabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class n implements cf70 {
        public final NotificationsNotificationSettingRedesignDto b;

        public n(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.b = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.b;
            if (notificationsNotificationSettingRedesignDto == null) {
                return 0;
            }
            return notificationsNotificationSettingRedesignDto.hashCode();
        }

        public final String toString() {
            return "WhatToSendChange(setting=" + this.b + ')';
        }
    }

    /* compiled from: NotificationSettingPatch.kt */
    public static final class o implements cf70 {
        public final NotificationsNotificationSettingRedesignDto b;

        public o(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
            this.b = notificationsNotificationSettingRedesignDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.b;
            if (notificationsNotificationSettingRedesignDto == null) {
                return 0;
            }
            return notificationsNotificationSettingRedesignDto.hashCode();
        }

        public final String toString() {
            return "WhatToShowChange(setting=" + this.b + ')';
        }
    }
}
