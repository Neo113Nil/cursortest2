package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.market.good.a;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;

/* compiled from: ProductCardEvent.kt */
/* loaded from: classes18.dex */
public interface tkd0 extends pk50 {

    /* compiled from: ProductCardEvent.kt */
    public interface a extends tkd0 {

        /* compiled from: ProductCardEvent.kt */
        /* renamed from: xsna.tkd0$a$a, reason: collision with other inner class name */
        public static final class C3752a implements a {
            public final UserId a;
            public final ExtendedCommunityProfile b;
            public final String c;

            public C3752a(UserId userId, ExtendedCommunityProfile extendedCommunityProfile, String str) {
                this.a = userId;
                this.b = extendedCommunityProfile;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3752a)) {
                    return false;
                }
                C3752a c3752a = (C3752a) obj;
                return epx.f(this.a, c3752a.a) && epx.f(this.b, c3752a.b) && epx.f(this.c, c3752a.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
                String str = this.c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenCreatePost(ownerId=");
                sb.append(this.a);
                sb.append(", profile=");
                sb.append(this.b);
                sb.append(", tooltip=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class b implements a {
            public final String a;
            public final String b;
            public final String c;

            public b(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowBusinessOnboardingDialog(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                sb.append(this.b);
                sb.append(", buttonTitle=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class c implements a {
            public final UserId a;

            public c(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("SubscribeOnPostCreateEvent(ownerId="), this.a, ')');
            }
        }
    }

    /* compiled from: ProductCardEvent.kt */
    public interface b extends tkd0 {

        /* compiled from: ProductCardEvent.kt */
        public static final class a implements b {
            public final UserId a;

            public a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenCommunity(communityId="), this.a, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        /* renamed from: xsna.tkd0$b$b, reason: collision with other inner class name */
        public static final class C3753b implements b {
            public final UserId a;

            public C3753b(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3753b) && epx.f(this.a, ((C3753b) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenCommunityMarket(communityId="), this.a, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class c implements b {
            public final UserId a;
            public final boolean b;

            public c(UserId userId, boolean z) {
                this.a = userId;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && this.b == cVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenCommunityMembers(communityId=");
                sb.append(this.a);
                sb.append(", startWithFriends=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class d implements b {
            public final UserId a;

            public d(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenServices(communityId="), this.a, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class e implements b {
            public final UserId a;
            public final long b;

            public e(long j, UserId userId) {
                this.a = userId;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && this.b == eVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenShopConditions(communityId=");
                sb.append(this.a);
                sb.append(", goodId=");
                return vu5.a(')', this.b, sb);
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class f implements b {
            public final UserId a;

            public f(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ShowUnsubscribeAlertsIfNeed(communityOwnerId="), this.a, ')');
            }
        }
    }

    /* compiled from: ProductCardEvent.kt */
    public interface c extends tkd0 {

        /* compiled from: ProductCardEvent.kt */
        public static final class a implements c {
            public final List<Photo> a;
            public final int b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends Photo> list, int i) {
                this.a = list;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenProductPhotos(photos=");
                sb.append(this.a);
                sb.append(", position=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class b implements c {
            public final VideoFile a;

            public b(VideoFile videoFile) {
                this.a = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("OpenProductVideo(video="), this.a, ')');
            }
        }
    }

    /* compiled from: ProductCardEvent.kt */
    public interface d extends tkd0 {

        /* compiled from: ProductCardEvent.kt */
        public static final class a implements d {
            public final lpd0 a;

            public a(lpd0 lpd0Var) {
                this.a = lpd0Var;
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
                return "HandleLabel(labelDto=" + this.a + ')';
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class b implements d {
            public final long a;
            public final UserId b;

            public b(long j, UserId userId) {
                this.a = j;
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenCreateReview(productId=");
                sb.append(this.a);
                sb.append(", communityId=");
                return gp.b(sb, this.b, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class c implements d {
            public final List<Image> a;

            public c(List<Image> list) {
                this.a = list;
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
                return ms9.a(')', new StringBuilder("OpenReviewPhotos(images="), this.a);
            }
        }

        /* compiled from: ProductCardEvent.kt */
        /* renamed from: xsna.tkd0$d$d, reason: collision with other inner class name */
        public static final class C3754d implements d {
            public final long a;
            public final UserId b;
            public final MarketCtaButtonAnalyticsParams c;
            public final String d;

            public C3754d(long j, UserId userId, MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams, String str) {
                this.a = j;
                this.b = userId;
                this.c = marketCtaButtonAnalyticsParams;
                this.d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3754d)) {
                    return false;
                }
                C3754d c3754d = (C3754d) obj;
                return this.a == c3754d.a && epx.f(this.b, c3754d.b) && epx.f(this.c, c3754d.c) && epx.f(this.d, c3754d.d);
            }

            public final int hashCode() {
                int a = bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
                MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams = this.c;
                int hashCode = (a + (marketCtaButtonAnalyticsParams == null ? 0 : marketCtaButtonAnalyticsParams.hashCode())) * 31;
                String str = this.d;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenReviews(productId=");
                sb.append(this.a);
                sb.append(", communityId=");
                sb.append(this.b);
                sb.append(", analyticParams=");
                sb.append(this.c);
                sb.append(", adsLabel=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class e implements d {
            public final mpd0 a;

            public e(mpd0 mpd0Var) {
                this.a = mpd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowOzonTermsDialog(approveInfo=" + this.a + ')';
            }
        }

        /* compiled from: ProductCardEvent.kt */
        public static final class f implements d {
            public final a.b a;

            public f(a.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ToggleFavorite(params=" + this.a + ')';
            }
        }
    }

    /* compiled from: ProductCardEvent.kt */
    public static final class e implements tkd0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(25);
        }

        public final String toString() {
            return "ScrollToBlock(block=25)";
        }
    }

    /* compiled from: ProductCardEvent.kt */
    public static final class f implements tkd0 {
        public final Exception a;

        public f(Exception exc) {
            this.a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowError(throwable=" + this.a + ')';
        }
    }

    /* compiled from: ProductCardEvent.kt */
    public static final class g implements tkd0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -682576269;
        }

        public final String toString() {
            return "UpdateData";
        }
    }
}
