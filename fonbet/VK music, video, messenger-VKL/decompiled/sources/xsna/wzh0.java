package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.search.SearchContentVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.SearchState;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.common.ui.mvp.holder.search.suggester.core.SearchServiceWithSuggestCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.offline.di.component.api.VideoCatalogComponent;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogSearchRequestFactory;
import com.vk.core.apps.BuildInfo;
import com.vk.lists.c;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import xsna.bcw0;
import xsna.jri0;
import xsna.u4a;

/* compiled from: SearchVideoServiceRootDelegate.kt */
/* loaded from: classes16.dex */
public final class wzh0 extends jri0<set0> implements w8i {
    public final VideoSearchFiltersImpl p;
    public final hui q;
    public final qqh0 r;

    /* compiled from: SearchVideoServiceRootDelegate.kt */
    public final class a implements sok0 {
        @Override // xsna.sok0
        public final boolean S(UIBlockList uIBlockList) {
            return false;
        }

        @Override // xsna.sok0
        public final int getSpanCount() {
            return 2;
        }

        @Override // xsna.sok0
        public final int q(UIBlock uIBlock) {
            return uIBlock.d == CatalogViewType.SHORT_DOUBLE_STACKED_LIST ? 1 : 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wzh0(SearchServiceWithSuggestCatalogRootVh searchServiceWithSuggestCatalogRootVh, u4a u4aVar, VideoSearchFiltersImpl videoSearchFiltersImpl, gzs gzsVar, Activity activity) {
        super(searchServiceWithSuggestCatalogRootVh, u4aVar, r3, r4, gzsVar, activity);
        u4a.a aVar = u4aVar.b;
        wba N = aVar.s.N();
        VideoCatalogSearchRequestFactory.VideoEntrypoint videoEntrypoint = VideoCatalogSearchRequestFactory.VideoEntrypoint.SearchInService;
        int i = 8;
        VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory = new VideoCatalogSearchRequestFactory(N, videoSearchFiltersImpl, videoEntrypoint, i);
        VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory2 = new VideoCatalogSearchRequestFactory(aVar.s.N(), videoSearchFiltersImpl, videoEntrypoint, i);
        videoCatalogSearchRequestFactory2.d = videoEntrypoint;
        s3q0 s3q0Var = s3q0.a;
        this.p = videoSearchFiltersImpl;
        this.q = new hui();
        this.r = new qqh0(null, 1);
        new bpn0(new kg(24, this, u4aVar));
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0q0] */
    @Override // xsna.o0i0
    public final SearchResultsImplVh b(VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory, final boolean z, hq5 hq5Var) {
        VerticalListVh verticalListVh;
        SearchResultsVh.a aVar = new SearchResultsVh.a(!z, 94);
        u4a a2 = this.r.a(this.c);
        u4a.a aVar2 = a2.b;
        CatalogConfiguration catalogConfiguration = aVar2.s;
        kea keaVar = new kea(videoCatalogSearchRequestFactory, catalogConfiguration.K(a2), a2, new vd7(aVar2.e), false, null, null, false, null, null, aVar2.H, null, null, z, new wzs() { // from class: xsna.vzh0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                SearchContentVh.c cVar;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (!z && (cVar = this.c().i) != null) {
                    cVar.c(uIBlockList);
                }
                return s3q0.a;
            }
        }, 28352);
        hui huiVar = this.q;
        keaVar.F = new vgb0(0, huiVar, uzh0.class, "onSearchRequestStart", "onSearchRequestStart()V", 0, 1);
        int i = 0;
        int i2 = 2;
        int i3 = 0;
        keaVar.G = new orf(i3, huiVar, uzh0.class, "onSearchRequestLoaded", "onSearchRequestLoaded()V", i, i2);
        keaVar.H = new prf(i3, huiVar, uzh0.class, "onSearchRequestFailed", "onSearchRequestFailed()V", i, i2);
        e4t e4tVar = new e4t(this, 12);
        c.h hVar = new c.h((c.m) keaVar);
        hVar.o = e4tVar;
        ((VideoCatalogComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(VideoCatalogComponent.class))).getClass();
        VerticalListVh.a aVar3 = new VerticalListVh.a(null, new ee8(1, huiVar, uzh0.class, "onSearchResultsBinded", "onSearchResultsBinded(Landroid/view/View;)V", i, 14), CatalogConfiguration.AutoPlayEntryPoint.Search, 15);
        if (BuildInfo.s()) {
            verticalListVh = new VerticalStackedListVh(catalogConfiguration, hVar, keaVar, this.c, null, R.layout.catalog_list_vertical_with_appbar_behaviour, aVar3, new a(), 368);
        } else {
            verticalListVh = new VerticalListVh(catalogConfiguration, hVar, keaVar, a2, null, false, R.layout.catalog_list_vertical_with_appbar_behaviour, aVar3, 368);
        }
        return new SearchResultsImplVh(videoCatalogSearchRequestFactory, keaVar, verticalListVh, this.p, this.b, aVar2.s, hq5Var, aVar, null, 256);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // xsna.jri0, xsna.o0i0
    public final void e(SearchState searchState) {
        String j9;
        super.e(searchState);
        SearchState searchState2 = SearchState.Search;
        hui huiVar = this.q;
        if (searchState == searchState2) {
            huiVar.r(c().b.H8());
        } else if (searchState == SearchState.Suggestion && ((j9 = this.b.j9()) == null || j9.length() == 0)) {
            huiVar.j(c().c.H8());
        } else {
            huiVar.e(c().c.H8());
        }
    }

    @Override // xsna.o0i0
    public final void f(String str) {
        this.q.o(this.p.I());
        super.f(str);
    }

    @Override // xsna.o0i0
    public final boolean g() {
        VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory = this.d;
        String str = videoCatalogSearchRequestFactory.e;
        boolean z = false;
        boolean z2 = str == null || drm0.N(str);
        SearchState searchState = SearchState.Suggestion;
        this.q.k(d(searchState) && !z2, this.p.I());
        int i = jri0.a.$EnumSwitchMapping$0[c().j.ordinal()];
        CatalogVh catalogVh = this.b;
        if (i == 1) {
            c().s();
            com.vk.core.utils.newtork.b.a.getClass();
            ((SearchServiceWithSuggestCatalogRootVh) catalogVh).i8(com.vk.core.utils.newtork.b.d() ? alj.a : new swp(new IOException()));
            return true;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        c().s();
        String str2 = videoCatalogSearchRequestFactory.e;
        boolean z3 = str2 == null || drm0.N(str2);
        if (d(searchState) && !z3) {
            z = true;
        }
        String str3 = videoCatalogSearchRequestFactory.e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        boolean z4 = videoCatalogSearchRequestFactory.j;
        if (z) {
            o0i0.p(this, str4, null, z4, null, 10);
            return true;
        }
        ((SearchServiceWithSuggestCatalogRootVh) catalogVh).i8(alj.a);
        return true;
    }

    @Override // xsna.o0i0
    public final void h(boolean z) {
        this.q.l(z);
    }

    @Override // xsna.o0i0
    public final void k(String str) {
        if (this.m) {
            this.m = false;
        } else {
            this.q.q(str);
        }
    }

    @Override // xsna.o0i0
    public final void l(String str, SearchInputMethod searchInputMethod) {
        this.q.c();
        super.l(str, searchInputMethod);
    }

    @Override // xsna.o0i0
    public final void m(bcw0.a aVar) {
        this.q.i();
        super.m(aVar);
    }

    @Override // xsna.o0i0
    public final void q(UIBlockSearchSuggestion uIBlockSearchSuggestion, Context context) {
        this.q.m(this.p.I());
        super.q(uIBlockSearchSuggestion, context);
    }

    @Override // xsna.o0i0
    public final void r() {
        this.q.n();
    }
}
