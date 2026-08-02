package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/* compiled from: PrivacySettingsSideEffects.kt */
/* loaded from: classes4.dex */
public interface jfd0 {

    /* compiled from: PrivacySettingsSideEffects.kt */
    public static final class a implements jfd0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2135272317;
        }

        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: PrivacySettingsSideEffects.kt */
    public static final class b implements jfd0 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenDonutTeaserModal(donutTeaserText=");
            sb.append(this.a);
            sb.append(", defaultDonutTeaserText=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: PrivacySettingsSideEffects.kt */
    public static final class c implements jfd0 {
        public final Date a;

        public c(Date date) {
            this.a = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            Date date = this.a;
            if (date == null) {
                return 0;
            }
            return date.hashCode();
        }

        public final String toString() {
            return "OpenTimePicker(currentDate=" + this.a + ')';
        }
    }

    /* compiled from: PrivacySettingsSideEffects.kt */
    public static final class d implements jfd0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1717333774;
        }

        public final String toString() {
            return "ShowBestFriends";
        }
    }

    /* compiled from: PrivacySettingsSideEffects.kt */
    public static final class e implements jfd0 {
        public final DonutLevel a;
        public final List<DonutLevel> b;
        public final UUID c;

        public e(DonutLevel donutLevel, List<DonutLevel> list, UUID uuid) {
            this.a = donutLevel;
            this.b = list;
            this.c = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            DonutLevel donutLevel = this.a;
            return this.c.hashCode() + fw3.a((donutLevel == null ? 0 : donutLevel.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return "ShowDonutLevelsSelector(selectedLevel=" + this.a + ", availableLevels=" + this.b + ", uuid=" + this.c + ')';
        }
    }

    /* compiled from: PrivacySettingsSideEffects.kt */
    public static final class f implements jfd0 {
        public final PostPrivacyData a;
        public final boolean b;
        public final int c;

        public f(PostPrivacyData postPrivacyData, boolean z, int i) {
            this.a = postPrivacyData;
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdatePrivacy(privacyData=");
            sb.append(this.a);
            sb.append(", willOpenBestFriends=");
            sb.append(this.b);
            sb.append(", currentBestFriendsCount=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
