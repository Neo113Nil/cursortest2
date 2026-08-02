package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.Date;
import java.util.UUID;

/* compiled from: PrivacySettingsAction.kt */
/* loaded from: classes4.dex */
public interface wed0 extends kj50 {

    /* compiled from: PrivacySettingsAction.kt */
    public static final class a implements wed0 {
        public final Date b;

        public a(Date date) {
            this.b = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            Date date = this.b;
            if (date == null) {
                return 0;
            }
            return date.hashCode();
        }

        public final String toString() {
            return "ChangeOpenForAllDate(date=" + this.b + ')';
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class c implements wed0 {
        public final PrivacyPostType.SingleDonutLevel b;
        public final UUID c;

        public c(PrivacyPostType.SingleDonutLevel singleDonutLevel, UUID uuid) {
            this.b = singleDonutLevel;
            this.c = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            UUID uuid = this.c;
            return hashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public final String toString() {
            return "DonutLevelSelected(privacyPostType=" + this.b + ", uuid=" + this.c + ')';
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class d implements wed0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 628932192;
        }

        public final String toString() {
            return "EditTeaserText";
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class e implements wed0 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Finish(withResult="), this.b, ')');
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class f implements wed0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1904207209;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class g implements wed0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1327297346;
        }

        public final String toString() {
            return "OpenTimePicker";
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class h implements wed0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1617158693;
        }

        public final String toString() {
            return "ShowBestFriends";
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class i implements wed0 {
        public final DonutLevel b;

        public i(DonutLevel donutLevel) {
            this.b = donutLevel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            DonutLevel donutLevel = this.b;
            if (donutLevel == null) {
                return 0;
            }
            return donutLevel.hashCode();
        }

        public final String toString() {
            return "ShowDonutLevelsSelection(currentLevel=" + this.b + ')';
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class j implements wed0 {
        public final String b;

        public j(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("UpdateDonutTeaserText(text="), this.b, ')');
        }
    }

    /* compiled from: PrivacySettingsAction.kt */
    public static final class b implements wed0 {
        public final PrivacyPostType b;
        public final boolean c;
        public final UUID d;

        public b(PrivacyPostType privacyPostType, boolean z, UUID uuid) {
            this.b = privacyPostType;
            this.c = z;
            this.d = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
            UUID uuid = this.d;
            return b + (uuid == null ? 0 : uuid.hashCode());
        }

        public final String toString() {
            return "ChangeVisibility(privacyPostType=" + this.b + ", withDismiss=" + this.c + ", uuid=" + this.d + ')';
        }

        public /* synthetic */ b(PrivacyPostType privacyPostType) {
            this(privacyPostType, !x19.G(privacyPostType), null);
        }
    }
}
