package xsna;

import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.Date;

/* compiled from: PrivacySettingsPatch.kt */
/* loaded from: classes4.dex */
public interface ffd0 extends xl50 {

    /* compiled from: PrivacySettingsPatch.kt */
    public static final class a implements ffd0 {
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
            return "ChangeOpenForAllDate(newDate=" + this.b + ')';
        }
    }

    /* compiled from: PrivacySettingsPatch.kt */
    public static final class b implements ffd0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Loaded(showDonutTeaserHint="), this.b, ')');
        }
    }

    /* compiled from: PrivacySettingsPatch.kt */
    public static final class c implements ffd0 {
        public final lcd0 b;

        public c(lcd0 lcd0Var) {
            this.b = lcd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateBestFriends(bestFriendsInfo=" + this.b + ')';
        }
    }

    /* compiled from: PrivacySettingsPatch.kt */
    public static final class d implements ffd0 {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
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

    /* compiled from: PrivacySettingsPatch.kt */
    public static final class e implements ffd0 {
        public final PrivacyPostType b;
        public final boolean c;

        public e(PrivacyPostType privacyPostType, boolean z) {
            this.b = privacyPostType;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisibilityChanged(privacyPostType=");
            sb.append(this.b);
            sb.append(", willOpenBestFriends=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
