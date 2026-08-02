package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.SearchContentVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.SearchState;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogSearchRequestFactory;
import com.vk.common.links.LaunchContext;
import com.vk.dto.music.SearchSuggestion;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.bcw0;
import xsna.hg1;

/* compiled from: SearchWithSuggesterRootDelegate.kt */
/* loaded from: classes16.dex */
public abstract class o0i0<T> {
    public final CatalogRootViewHolder b;
    public final u4a c;
    public final VideoCatalogSearchRequestFactory d;
    public final VideoCatalogSearchRequestFactory e;
    public final Activity f;
    public final zmc j;
    public io.reactivex.rxjava3.disposables.c k;
    public boolean l;
    public boolean m;
    public final f6n0 o;
    public final hq5 g = new hq5(this, 17);
    public final bpn0 h = new bpn0(new ag20(this, 29));
    public final Object i = msy.a(LazyThreadSafetyMode.NONE, new yu60(this, 18));
    public final q0i0 n = new q0i0(this);

    /* compiled from: SearchWithSuggesterRootDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SearchState.values().length];
            try {
                iArr[SearchState.Search.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchState.Suggestion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SearchSuggestion.Type.values().length];
            try {
                iArr2[SearchSuggestion.Type.SectionLink.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SearchSuggestion.Type.MetaChannelLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0i0(n0i0 n0i0Var, u4a u4aVar, VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory, VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory2, gzs gzsVar, Activity activity) {
        this.b = (CatalogRootViewHolder) n0i0Var;
        this.c = u4aVar;
        this.d = videoCatalogSearchRequestFactory;
        this.e = videoCatalogSearchRequestFactory2;
        this.f = activity;
        this.j = new zmc(new x0a(new ofc0(this, 4), gzsVar), new x750(this, 20));
        int i = 0;
        this.o = new f6n0(new yr50(2, this, o0i0.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;Lcom/vk/search/ui/api/SearchInputMethod;)V", i, 1), new p0i0(2, this, o0i0.class, "onQueryChangedWithoutDelay", "onQueryChangedWithoutDelay(Ljava/lang/String;Lcom/vk/search/ui/api/SearchInputMethod;)V", 0), new mga0(this, 12), new hv7(1, this, o0i0.class, "onActionSearchClicked", "onActionSearchClicked(Ljava/lang/String;)V", i, 7), new jw3(0, this, o0i0.class, "onActionClearClicked", "onActionClearClicked()V", i, 3), 0L, 32);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    public static void p(o0i0 o0i0Var, String str, String str2, boolean z, SearchInputMethod searchInputMethod, int i) {
        String str3 = (i & 2) != 0 ? null : str2;
        boolean z2 = (i & 4) != 0 ? false : z;
        SearchInputMethod searchInputMethod2 = (i & 8) != 0 ? null : searchInputMethod;
        ?? r12 = o0i0Var.b;
        boolean z3 = !str.equals(r12.j9());
        o0i0Var.l = z3;
        o0i0Var.m = z3;
        r12.jn(str, false);
        o0i0Var.e(drm0.N(str) ? SearchState.Suggestion : SearchState.Search);
        SearchResultsVh.cb(o0i0Var.c(), str, str3, null, z2, searchInputMethod2, false, 36);
    }

    public final void a(UIBlock uIBlock, Activity activity) {
        String str;
        SearchStatInfoProvider searchStatInfoProvider = this.c.b.m;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIP;
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null || (str = uIBlockVideo.B.r()) == null) {
            str = "";
        }
        this.j.a(activity, uIBlock, searchStatInfoProvider.b(type, str, false));
    }

    public abstract SearchResultsImplVh b(VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory, boolean z, hq5 hq5Var);

    public final SearchContentVh c() {
        return (SearchContentVh) this.h.getValue();
    }

    public boolean d(SearchState searchState) {
        return c().j == searchState;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    public void e(SearchState searchState) {
        io.reactivex.rxjava3.disposables.c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
        }
        ?? r0 = this.b;
        boolean z = false;
        r0.z0(false, false);
        SearchContentVh c = c();
        if (c.j != searchState) {
            c.j = searchState;
            SearchContentVh.c cVar2 = c.i;
            if (cVar2 != null && cVar2.b()) {
                SearchResultsVh searchResultsVh = c.b;
                SearchResultsVh searchResultsVh2 = c.c;
                int i = SearchContentVh.d.$EnumSwitchMapping$0[c.j.ordinal()];
                if (i == 1) {
                    searchResultsVh.onResume();
                    searchResultsVh2.onPause();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    searchResultsVh2.onResume();
                    searchResultsVh.onPause();
                }
            }
            c.b();
            if (searchState == SearchState.Search) {
                c().c.clear();
                r0.ul();
            }
        }
        String j9 = r0.j9();
        boolean z2 = j9 == null || drm0.N(j9);
        if (searchState == SearchState.Search && !z2) {
            z = true;
        }
        r0.ca(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    public void f(String str) {
        ?? r0 = this.b;
        r0.ul();
        if (d(SearchState.Suggestion) && myc0.f(r0.j9())) {
            e(SearchState.Search);
            SearchResultsVh.cb(c(), str, null, null, false, SearchInputMethod.Keyboard, false, 46);
        }
    }

    public boolean g() {
        int i = a.$EnumSwitchMapping$0[c().j.ordinal()];
        if (i == 1) {
            c().s();
            return false;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        c().s();
        VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory = this.d;
        String str = videoCatalogSearchRequestFactory.e;
        boolean z = str == null || drm0.N(str);
        String str2 = videoCatalogSearchRequestFactory.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        boolean z2 = videoCatalogSearchRequestFactory.j;
        if (z) {
            return false;
        }
        p(this, str3, null, z2, null, 10);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    public final void i(boolean z) {
        ?? r0 = this.b;
        String j9 = r0.j9();
        boolean z2 = false;
        boolean z3 = j9 == null || drm0.N(j9);
        if (d(SearchState.Search) && !z3) {
            z2 = true;
        }
        boolean z4 = !z;
        r0.f1(z2, z4);
        Intent intent = new Intent("show_hide_navigation_shadow_event");
        intent.putExtra("show", z4);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        cuz.a(context).c(intent);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    public final void j() {
        com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
        String V = c().b.V();
        if (V == null) {
            V = "";
        }
        com.vk.catalog2.common.ui.holders.search.b.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FILTERS, V);
        this.b.Tg();
    }

    public void l(String str, SearchInputMethod searchInputMethod) {
        SearchState searchState = SearchState.Suggestion;
        if (d(searchState)) {
            return;
        }
        e(searchState);
        SearchResultsVh.cb(c(), str, null, null, false, searchInputMethod, false, 46);
    }

    public void m(bcw0.a aVar) {
        if (d(SearchState.Suggestion)) {
            String str = aVar.a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            SearchInputMethod.a aVar2 = SearchInputMethod.Companion;
            icw0 icw0Var = aVar.b;
            aVar2.getClass();
            p(this, str2, null, false, SearchInputMethod.a.a(icw0Var), 6);
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    public final void n(set0 set0Var) {
        VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory = this.d;
        videoCatalogSearchRequestFactory.i = null;
        VideoSearchFiltersImpl videoSearchFiltersImpl = videoCatalogSearchRequestFactory.r;
        if (videoSearchFiltersImpl != null) {
            videoSearchFiltersImpl.R(set0Var);
        }
        if (c().j == SearchState.Search) {
            ?? r3 = this.b;
            if (r3.F0()) {
                String j9 = r3.j9();
                if (j9 == null) {
                    j9 = "";
                }
                l(j9, SearchInputMethod.Keyboard);
            }
        }
        c().f(false);
    }

    public final void o(UIBlockSearchSuggestion uIBlockSearchSuggestion) {
        this.c.b.e.b(new xxf0(uIBlockSearchSuggestion.Fb()), false);
        c().a(new ggb0(uIBlockSearchSuggestion, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    public void q(UIBlockSearchSuggestion uIBlockSearchSuggestion, Context context) {
        ?? r0 = this.b;
        r0.ul();
        SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
        SearchSuggestion.Type type = searchSuggestion.g;
        String str = searchSuggestion.h;
        int i = a.$EnumSwitchMapping$1[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                p(this, searchSuggestion.c, searchSuggestion.k, false, SearchInputMethod.Suggest, 4);
                return;
            } else {
                if (str != null) {
                    bpn0 bpn0Var = xwk.a;
                    maz.c(((qdz) (bpn0Var != null ? bpn0Var : null).getValue()).e(), context, str, LaunchContext.A, null, null, 24);
                    return;
                }
                return;
            }
        }
        if (str != null) {
            CatalogStatesViewHolder catalogStatesViewHolder = r0 instanceof CatalogStatesViewHolder ? (CatalogStatesViewHolder) r0 : null;
            if (catalogStatesViewHolder != null) {
                catalogStatesViewHolder.i8(alj.a);
            }
            ww50 ww50Var = (ww50) this.i.getValue();
            bg00 bg00Var = ww50Var instanceof bg00 ? (bg00) ww50Var : null;
            if (bg00Var != null) {
                bg00Var.a();
            }
        }
    }

    public final io.reactivex.rxjava3.disposables.c s() {
        io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.c.b.d.b;
        hg1.o3 o3Var = new hg1.o3();
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, o3Var).U(new hg1.n3()).subscribe(new m3y(new wq20(this, 27), 18));
    }

    public void r() {
    }

    public void h(boolean z) {
    }

    public void k(String str) {
    }
}
