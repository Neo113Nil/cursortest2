package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.dto.search.SearchStatsLoggingInfo;
import java.util.List;

/* compiled from: ClipsOwnerSwipeStatePatch.kt */
/* loaded from: classes17.dex */
public interface epe extends xl50 {

    /* compiled from: ClipsOwnerSwipeStatePatch.kt */
    public interface a extends epe {

        /* compiled from: ClipsOwnerSwipeStatePatch.kt */
        /* renamed from: xsna.epe$a$a, reason: collision with other inner class name */
        public static final class C2831a implements a {
            public final doe b;
            public final boolean c;

            public C2831a(doe doeVar, boolean z) {
                this.b = doeVar;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2831a)) {
                    return false;
                }
                C2831a c2831a = (C2831a) obj;
                return epx.f(this.b, c2831a.b) && this.c == c2831a.c;
            }

            public final int hashCode() {
                doe doeVar = this.b;
                return Boolean.hashCode(this.c) + ((doeVar == null ? 0 : doeVar.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OwnerState(ownerInfo=");
                sb.append(this.b);
                sb.append(", isShowingOwner=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: ClipsOwnerSwipeStatePatch.kt */
        public static final class b implements a {
            public final Integer b;
            public final List<ClipFeedTab> c;
            public final boolean d;
            public final boolean e;
            public final ClipFeedTransientArgumentsContainer f;
            public final a7j<ClipFeedOpenAction> g;
            public final ClipsScreenPerformanceReporter h;
            public final SearchStatsLoggingInfo i;
            public final boolean j;
            public final boolean k;
            public final boolean l;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Integer num, List<? extends ClipFeedTab> list, boolean z, boolean z2, ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer, a7j<ClipFeedOpenAction> a7jVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z3, boolean z4, boolean z5) {
                this.b = num;
                this.c = list;
                this.d = z;
                this.e = z2;
                this.f = clipFeedTransientArgumentsContainer;
                this.g = a7jVar;
                this.h = clipsScreenPerformanceReporter;
                this.i = searchStatsLoggingInfo;
                this.j = z3;
                this.k = z4;
                this.l = z5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l;
            }

            public final int hashCode() {
                Integer num = this.b;
                int b = qoy.b(qoy.b(fw3.a((num == null ? 0 : num.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e);
                ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = this.f;
                int hashCode = (b + (clipFeedTransientArgumentsContainer == null ? 0 : clipFeedTransientArgumentsContainer.hashCode())) * 31;
                a7j<ClipFeedOpenAction> a7jVar = this.g;
                int hashCode2 = (this.h.hashCode() + ((hashCode + (a7jVar == null ? 0 : a7jVar.hashCode())) * 31)) * 31;
                SearchStatsLoggingInfo searchStatsLoggingInfo = this.i;
                return Boolean.hashCode(this.l) + qoy.b(qoy.b((hashCode2 + (searchStatsLoggingInfo != null ? searchStatsLoggingInfo.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowWithInitialData(initialTabIndex=");
                sb.append(this.b);
                sb.append(", tabs=");
                sb.append(this.c);
                sb.append(", isMainFeed=");
                sb.append(this.d);
                sb.append(", openWithDefaultTabs=");
                sb.append(this.e);
                sb.append(", transientArguments=");
                sb.append(this.f);
                sb.append(", openAction=");
                sb.append(this.g);
                sb.append(", performanceReporter=");
                sb.append(this.h);
                sb.append(", searchStatsLoggingInfo=");
                sb.append(this.i);
                sb.append(", inWrapperActivity=");
                sb.append(this.j);
                sb.append(", disableOwnerSwipe=");
                sb.append(this.k);
                sb.append(", noBottomNavigation=");
                return defpackage.q0.a(sb, this.l, ')');
            }
        }
    }

    /* compiled from: ClipsOwnerSwipeStatePatch.kt */
    public static final class b implements epe {
        public static final b b = new b();
    }
}
