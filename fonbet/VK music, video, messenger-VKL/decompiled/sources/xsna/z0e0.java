package xsna;

import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;

/* compiled from: ProfilesCarouselItemUiDto.kt */
/* loaded from: classes4.dex */
public interface z0e0 {

    /* compiled from: ProfilesCarouselItemUiDto.kt */
    public static final class a implements z0e0 {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImportContacts(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", buttonText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ProfilesCarouselItemUiDto.kt */
    public static final class b implements z0e0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a == bVar.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ImportContactsOld(card=null, isSyncEnabled="), this.a, ')');
        }
    }

    /* compiled from: ProfilesCarouselItemUiDto.kt */
    public static final class c implements z0e0 {
        public final ProfilesRecommendations.InfoCard a;

        public c(ProfilesRecommendations.InfoCard infoCard) {
            this.a = infoCard;
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
            return "Info(card=" + this.a + ')';
        }
    }

    /* compiled from: ProfilesCarouselItemUiDto.kt */
    public static final class d implements z0e0 {
        public final RecommendedProfile a;

        public d(RecommendedProfile recommendedProfile) {
            this.a = recommendedProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Profile(profile=" + this.a + ')';
        }
    }

    /* compiled from: ProfilesCarouselItemUiDto.kt */
    public static final class e implements z0e0 {
        public static final e a = new e();
    }

    /* compiled from: ProfilesCarouselItemUiDto.kt */
    public static final class f implements z0e0 {
        public static final f a = new f();
    }
}
