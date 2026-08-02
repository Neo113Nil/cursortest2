package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityDetailsEvent.kt */
/* loaded from: classes5.dex */
public interface l1h {

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class a implements l1h {
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
            return gp.b(new StringBuilder("OpenArticles(ownerId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class b implements l1h {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenAudios(ownerId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class c implements l1h {
        public final UserId a;
        public final String b;

        public c(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenChannel(ownerId=");
            sb.append(this.a);
            sb.append(", channelUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class d implements l1h {
        public final UserId a;
        public final int b;

        public d(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenChats(ownerId=");
            sb.append(this.a);
            sb.append(", adminLevel=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class e implements l1h {
        public final UserId a;

        public e(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenDiscussions(groupId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class f implements l1h {
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
            return gp.b(new StringBuilder("OpenEvents(groupId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class g implements l1h {
        public final UserId a;

        public g(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenFiles(ownerId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class h implements l1h {
        public final UserId a;

        public h(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenMarket(groupId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class i implements l1h {
        public final UserId a;

        public i(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenNarratives(ownerId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class j implements l1h {
        public final ExtendedCommunityProfile a;

        public j(ExtendedCommunityProfile extendedCommunityProfile) {
            this.a = extendedCommunityProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return at.a(new StringBuilder("OpenPhotos(profile="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class k implements l1h {
        public final UserId a;

        public k(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenPodcasts(ownerId="), this.a, ')');
        }
    }

    /* compiled from: CommunityDetailsEvent.kt */
    public static final class l implements l1h {
        public final UserId a;

        public l(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenServices(groupId="), this.a, ')');
        }
    }
}
