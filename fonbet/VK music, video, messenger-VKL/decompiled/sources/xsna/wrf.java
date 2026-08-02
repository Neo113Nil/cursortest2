package xsna;

import android.os.Bundle;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.api.utils.ClipFeedScreenType;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;

/* compiled from: ClipsWrapperItem.kt */
/* loaded from: classes17.dex */
public interface wrf {

    /* compiled from: ClipsWrapperItem.kt */
    public static final class a implements wrf {
        public final ClipFeedTab.Discover a;
        public final tlo0 b;
        public final int c;
        public final String d;
        public final Integer e;

        public a(ClipFeedTab.Discover discover, tlo0 tlo0Var, int i, String str, Integer num) {
            this.a = discover;
            this.b = tlo0Var;
            this.c = i;
            this.d = str;
            this.e = num;
        }

        @Override // xsna.wrf
        public final FragmentImpl a() {
            return g620.f().x(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_DISCOVER));
        }

        @Override // xsna.wrf
        public final tlo0 b() {
            return this.b;
        }

        @Override // xsna.wrf
        public final ClipFeedTab c() {
            return this.a;
        }

        @Override // xsna.wrf
        public final Integer d() {
            return this.e;
        }

        @Override // xsna.wrf
        public final int e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(shy.a(this.c, com.vk.movika.sdk.base.model.history.b.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            Integer num = this.e;
            return a + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Discover(tab=");
            sb.append(this.a);
            sb.append(", tabName=");
            sb.append(this.b);
            sb.append(", tabIndex=");
            sb.append(this.c);
            sb.append(", wrapperId=");
            sb.append(this.d);
            sb.append(", tabIcon=");
            return uqi.b(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsWrapperItem.kt */
    public static final class b implements wrf {
        public final ClipFeedTab a;
        public final tlo0 b;
        public final int c;
        public final String d;
        public final a e;
        public final Integer f;

        /* compiled from: ClipsWrapperItem.kt */
        public static final class a {
            public final kwc a;
            public final a7j<ClipFeedOpenAction> b;
            public final ClipsScreenPerformanceReporter c;
            public final ClipFeedScreenType d;
            public final int e;
            public final SearchStatsLoggingInfo f;

            public /* synthetic */ a(kwc kwcVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, ClipFeedScreenType clipFeedScreenType, SearchStatsLoggingInfo searchStatsLoggingInfo, int i) {
                this(kwcVar, null, clipsScreenPerformanceReporter, clipFeedScreenType, 0, (i & 32) != 0 ? null : searchStatsLoggingInfo);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
            }

            public final int hashCode() {
                kwc kwcVar = this.a;
                int hashCode = (kwcVar == null ? 0 : kwcVar.hashCode()) * 31;
                a7j<ClipFeedOpenAction> a7jVar = this.b;
                int hashCode2 = (hashCode + (a7jVar == null ? 0 : a7jVar.hashCode())) * 31;
                ClipsScreenPerformanceReporter clipsScreenPerformanceReporter = this.c;
                int a = shy.a(this.e, (this.d.hashCode() + ((hashCode2 + (clipsScreenPerformanceReporter == null ? 0 : clipsScreenPerformanceReporter.hashCode())) * 31)) * 31, 31);
                SearchStatsLoggingInfo searchStatsLoggingInfo = this.f;
                return a + (searchStatsLoggingInfo != null ? searchStatsLoggingInfo.hashCode() : 0);
            }

            public final String toString() {
                return "Params(initialData=" + this.a + ", openAction=" + this.b + ", performanceReporter=" + this.c + ", screenType=" + this.d + ", bottomNavigationHeight=" + this.e + ", searchStatsLoggingInfo=" + this.f + ')';
            }

            public a(kwc kwcVar, a7j<ClipFeedOpenAction> a7jVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, ClipFeedScreenType clipFeedScreenType, int i, SearchStatsLoggingInfo searchStatsLoggingInfo) {
                this.a = kwcVar;
                this.b = a7jVar;
                this.c = clipsScreenPerformanceReporter;
                this.d = clipFeedScreenType;
                this.e = i;
                this.f = searchStatsLoggingInfo;
            }
        }

        public b(ClipFeedTab clipFeedTab, tlo0 tlo0Var, int i, String str, a aVar, Integer num) {
            this.a = clipFeedTab;
            this.b = tlo0Var;
            this.c = i;
            this.d = str;
            this.e = aVar;
            this.f = num;
        }

        @Override // xsna.wrf
        public final FragmentImpl a() {
            a aVar = this.e;
            ClipFeedScreenType clipFeedScreenType = aVar.d;
            ClipFeedListFragment.a aVar2 = new ClipFeedListFragment.a(ClipFeedListFragment.class, null, null);
            ClipsWrapperInputArguments.r.getClass();
            ArrayList a2 = e43.a(this.a);
            Bundle bundle = aVar2.j;
            ClipsWrapperInputArguments.a.e(bundle, a2);
            bundle.putInt("ClipFeedListFragment.bottom_nav_height", 0);
            bundle.putInt("ClipFeedListFragment.screen_type", clipFeedScreenType.ordinal());
            bundle.putString("ClipsWrapperFragment.clips_wrapper_id_param", this.d);
            SearchStatsLoggingInfo searchStatsLoggingInfo = aVar.f;
            if (searchStatsLoggingInfo != null) {
                bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            }
            bundle.putParcelable("ClipFeedListFragment.ui_performance_reporter_key", aVar.c);
            FragmentImpl f = aVar2.f();
            ((ClipFeedListFragment) f).T = aVar.a;
            return f;
        }

        @Override // xsna.wrf
        public final tlo0 b() {
            return this.b;
        }

        @Override // xsna.wrf
        public final ClipFeedTab c() {
            return this.a;
        }

        @Override // xsna.wrf
        public final Integer d() {
            return this.f;
        }

        @Override // xsna.wrf
        public final int e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + urd0.a(shy.a(this.c, com.vk.movika.sdk.base.model.history.b.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31;
            Integer num = this.f;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Feed(tab=");
            sb.append(this.a);
            sb.append(", tabName=");
            sb.append(this.b);
            sb.append(", tabIndex=");
            sb.append(this.c);
            sb.append(", wrapperId=");
            sb.append(this.d);
            sb.append(", params=");
            sb.append(this.e);
            sb.append(", tabIcon=");
            return uqi.b(sb, this.f, ')');
        }
    }

    /* compiled from: ClipsWrapperItem.kt */
    public static final class c implements wrf {
        public final ClipFeedTab.MyClips a;
        public final tlo0 b;
        public final int c;
        public final String d;
        public final Integer e;

        public c(ClipFeedTab.MyClips myClips, tlo0 tlo0Var, int i, String str, Integer num) {
            this.a = myClips;
            this.b = tlo0Var;
            this.c = i;
            this.d = str;
            this.e = num;
        }

        @Override // xsna.wrf
        public final FragmentImpl a() {
            UserId d = g620.f().e().d();
            if (d == null) {
                d = o25.a().c();
            }
            ClipsGridFragment.a aVar = new ClipsGridFragment.a(new ClipGridParams.OnlyId.Profile(d));
            Bundle bundle = aVar.j;
            bundle.putBoolean("ClipsGridFragment.is_parent_fits_system_windows", true);
            ClipsWrapperInputArguments.r.getClass();
            bundle.putString("ClipsWrapperFragment.clips_wrapper_id_param", this.d);
            bundle.putBoolean("ClipsGridFragment.is_owner_grid", true);
            bundle.putBoolean("ClipsGridFragment.force_dark_theme", true);
            bundle.putBoolean("ClipsGridFragment.is_opened_in_app_tab", true);
            dhr0.a.getClass();
            aVar.w(dhr0.u().c);
            return aVar.f();
        }

        @Override // xsna.wrf
        public final tlo0 b() {
            return this.b;
        }

        @Override // xsna.wrf
        public final ClipFeedTab c() {
            return this.a;
        }

        @Override // xsna.wrf
        public final Integer d() {
            return this.e;
        }

        @Override // xsna.wrf
        public final int e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(shy.a(this.c, com.vk.movika.sdk.base.model.history.b.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            Integer num = this.e;
            return a + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Grid(tab=");
            sb.append(this.a);
            sb.append(", tabName=");
            sb.append(this.b);
            sb.append(", tabIndex=");
            sb.append(this.c);
            sb.append(", wrapperId=");
            sb.append(this.d);
            sb.append(", tabIcon=");
            return uqi.b(sb, this.e, ')');
        }
    }

    FragmentImpl a();

    tlo0 b();

    ClipFeedTab c();

    Integer d();

    int e();
}
