package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import xsna.kb70;

/* compiled from: NotificationSettingCell.kt */
/* loaded from: classes5.dex */
public interface me70 {

    /* compiled from: NotificationSettingCell.kt */
    public static final class a implements me70 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
        }

        @Override // xsna.me70
        public final Object getKey() {
            return this.a;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Footer(key=");
            sb.append((Object) this.a);
            sb.append(", description=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class b implements me70 {
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class c implements me70 {
        public final UserId a;
        public final String b;
        public final String c;
        public final Image d;
        public final boolean e;

        public c(UserId userId, String str, String str2, Image image, boolean z) {
            this.a = userId;
            this.b = str;
            this.c = str2;
            this.d = image;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e;
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "ManagedCommunityItem_" + this.a;
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
            Image image = this.d;
            return Boolean.hashCode(this.e) + ((a + (image == null ? 0 : image.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ManagedCommunityItem(uid=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", images=");
            sb.append(this.d);
            sb.append(", hasPushesEnabled=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class d implements me70 {
        public final UserId a;
        public final String b;
        public final Image c;
        public final boolean d;

        public d(UserId userId, String str, Image image, boolean z) {
            this.a = userId;
            this.b = str;
            this.c = image;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d;
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "NewPostsItem_" + this.a;
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
            Image image = this.c;
            return Boolean.hashCode(this.d) + ((a + (image == null ? 0 : image.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewPostsItem(uid=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", images=");
            sb.append(this.c);
            sb.append(", isNft=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class e implements me70 {
        public final UserId a;
        public final String b;
        public final Image c;
        public final boolean d;

        public e(UserId userId, String str, Image image, boolean z) {
            this.a = userId;
            this.b = str;
            this.c = image;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d;
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "NewStoryItem_" + this.a;
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
            Image image = this.c;
            return Boolean.hashCode(this.d) + ((a + (image == null ? 0 : image.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewStoryItem(uid=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", images=");
            sb.append(this.c);
            sb.append(", isNft=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class f implements me70 {
        public final kb70.d a;

        public f(kb70.d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "NotificationHint";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NotificationHint(hint=" + this.a + ')';
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class g implements me70 {
        public final boolean a;
        public final boolean b;

        public g(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b;
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "PushSettingStatusToggle";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PushSettingStatusToggle(enabled=");
            sb.append(this.a);
            sb.append(", active=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class h implements me70 {
        public final boolean a;
        public final boolean b;

        public h(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b;
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "PushSettingWithSoundToggle";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PushSettingWithSoundToggle(enabled=");
            sb.append(this.a);
            sb.append(", active=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class i implements me70 {
        public final int a;

        public i(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "SectionTitle_" + this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SectionTitle(title="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class j implements me70 {
        public static final j a = new j();

        @Override // xsna.me70
        public final Object getKey() {
            return "SourcesLoadingItem";
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class k implements me70 {
        public final NotificationsNotificationSettingOptionsDto a;

        public k(NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto) {
            this.a = notificationsNotificationSettingOptionsDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "WhatToSendRadioGroup";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WhatToSendRadioGroup(current=" + this.a + ')';
        }
    }

    /* compiled from: NotificationSettingCell.kt */
    public static final class l implements me70 {
        public final NotificationsNotificationSettingOptionsDto a;

        public l(NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto) {
            this.a = notificationsNotificationSettingOptionsDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        @Override // xsna.me70
        public final Object getKey() {
            return "WhatToShowRadioGroup";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WhatToShowRadioGroup(current=" + this.a + ')';
        }
    }

    Object getKey();
}
