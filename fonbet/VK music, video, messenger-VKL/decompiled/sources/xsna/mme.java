package xsna;

import androidx.fragment.app.Fragment;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import java.util.ArrayList;

/* compiled from: ClipsNavigationItem.kt */
/* loaded from: classes17.dex */
public interface mme {

    /* compiled from: ClipsNavigationItem.kt */
    public static final class a {
        public final gzs<Fragment> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gzs<? extends Fragment> gzsVar) {
            this.a = gzsVar;
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
            return uf3.d(new StringBuilder("FragmentProvider(createFragment="), this.a, ')');
        }
    }

    /* compiled from: ClipsNavigationItem.kt */
    public static final class b implements mme {
        public final long a;
        public final String b;
        public final a c;
        public final a d = new a(new ac(this, 20));

        /* compiled from: ClipsNavigationItem.kt */
        public static final class a {
            public final boolean a;
            public final int b;
            public final UserId c;

            public a(int i, UserId userId, boolean z) {
                this.a = z;
                this.b = i;
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return Long.hashCode(this.c.b) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Params(isCurrentUser=");
                sb.append(this.a);
                sb.append(", themeResId=");
                sb.append(this.b);
                sb.append(", ownerId=");
                return gp.b(sb, this.c, ')');
            }
        }

        public b(long j, String str, a aVar) {
            this.a = j;
            this.b = str;
            this.c = aVar;
        }

        @Override // xsna.mme
        public final a a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        @Override // xsna.mme
        public final long getId() {
            return this.a;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Owner(id=" + this.a + ", wrapperId=" + this.b + ", params=" + this.c + ')';
        }
    }

    /* compiled from: ClipsNavigationItem.kt */
    public static final class c implements mme {
        public final UserId a;
        public final ProfileFragmentProviderComponent b;
        public final a c;
        public final long d;
        public final a e = new a(new f5(this, 25));

        /* compiled from: ClipsNavigationItem.kt */
        public static final class a {
            public final boolean a;
            public final int b;
            public final UserId c;

            public a(int i, UserId userId, boolean z) {
                this.a = z;
                this.b = i;
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return Long.hashCode(this.c.b) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Params(isCurrentUser=");
                sb.append(this.a);
                sb.append(", themeResId=");
                sb.append(this.b);
                sb.append(", ownerId=");
                return gp.b(sb, this.c, ')');
            }
        }

        public c(UserId userId, ProfileFragmentProviderComponent profileFragmentProviderComponent, a aVar) {
            this.a = userId;
            this.b = profileFragmentProviderComponent;
            this.c = aVar;
            this.d = userId.b;
        }

        @Override // xsna.mme
        public final a a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        @Override // xsna.mme
        public final long getId() {
            return this.d;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
        }

        public final String toString() {
            return "Profile(userId=" + this.a + ", profileFragmentProvider=" + this.b + ", params=" + this.c + ')';
        }
    }

    /* compiled from: ClipsNavigationItem.kt */
    public static final class d implements mme {
        public final UserId a;
        public final a b;
        public final long c;

        public d(UserId userId, a aVar) {
            this.a = userId;
            this.b = aVar;
            this.c = userId.b;
        }

        @Override // xsna.mme
        public final a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        @Override // xsna.mme
        public final long getId() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "VideoOwner(userId=" + this.a + ", fragmentProvider=" + this.b + ')';
        }
    }

    /* compiled from: ClipsNavigationItem.kt */
    public static final class e implements mme {
        public final String a;
        public final a b;
        public final a c = new a(new g5(this, 21));

        /* compiled from: ClipsNavigationItem.kt */
        public static final class a {
            public final Integer a;
            public final ArrayList<ClipFeedTab> b;
            public final boolean c;
            public final boolean d;
            public final ClipFeedTransientArgumentsContainer e;
            public final a7j<ClipFeedOpenAction> f;
            public final ClipsScreenPerformanceReporter g;
            public final SearchStatsLoggingInfo h;
            public final boolean i;
            public final boolean j;
            public final boolean k;

            public a(Integer num, ArrayList<ClipFeedTab> arrayList, boolean z, boolean z2, ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer, a7j<ClipFeedOpenAction> a7jVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z3, boolean z4, boolean z5) {
                this.a = num;
                this.b = arrayList;
                this.c = z;
                this.d = z2;
                this.e = clipFeedTransientArgumentsContainer;
                this.f = a7jVar;
                this.g = clipsScreenPerformanceReporter;
                this.h = searchStatsLoggingInfo;
                this.i = z3;
                this.j = z4;
                this.k = z5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k;
            }

            public final int hashCode() {
                Integer num = this.a;
                int b = qoy.b(qoy.b((this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31, 31, this.c), 31, this.d);
                ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = this.e;
                int hashCode = (b + (clipFeedTransientArgumentsContainer == null ? 0 : clipFeedTransientArgumentsContainer.hashCode())) * 31;
                a7j<ClipFeedOpenAction> a7jVar = this.f;
                int hashCode2 = (this.g.hashCode() + ((hashCode + (a7jVar == null ? 0 : a7jVar.hashCode())) * 31)) * 31;
                SearchStatsLoggingInfo searchStatsLoggingInfo = this.h;
                return Boolean.hashCode(this.k) + qoy.b(qoy.b((hashCode2 + (searchStatsLoggingInfo != null ? searchStatsLoggingInfo.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Params(initialTabIndex=");
                sb.append(this.a);
                sb.append(", tabs=");
                sb.append(this.b);
                sb.append(", isMainFeed=");
                sb.append(this.c);
                sb.append(", openWithDefaultTabs=");
                sb.append(this.d);
                sb.append(", transientArguments=");
                sb.append(this.e);
                sb.append(", openAction=");
                sb.append(this.f);
                sb.append(", performanceReporter=");
                sb.append(this.g);
                sb.append(", searchStatsLoggingInfo=");
                sb.append(this.h);
                sb.append(", inWrapperActivity=");
                sb.append(this.i);
                sb.append(", noBottomNavigation=");
                sb.append(this.j);
                sb.append(", disableOwnerSwipe=");
                return defpackage.q0.a(sb, this.k, ')');
            }
        }

        public e(String str, a aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // xsna.mme
        public final a a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            eVar.getClass();
            return epx.f(this.a, eVar.a) && this.b.equals(eVar.b);
        }

        @Override // xsna.mme
        public final long getId() {
            return 0L;
        }

        public final int hashCode() {
            return this.b.hashCode() + urd0.a(Long.hashCode(0L) * 31, 31, this.a);
        }

        public final String toString() {
            return "Wrapper(id=0, wrapperId=" + this.a + ", params=" + this.b + ')';
        }
    }

    a a();

    long getId();
}
