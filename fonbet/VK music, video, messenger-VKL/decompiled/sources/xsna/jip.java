package xsna;

import com.vk.catalog2.common.ui.holders.EmptyScreenWithTextVh;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureResultsWithTabsVh;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b9q0;
import xsna.nvs;
import xsna.u4a;
import xsna.vrh0;
import xsna.x2a;

/* compiled from: EnabledSearchFeatureDelegate.kt */
/* loaded from: classes16.dex */
public final class jip implements drh0 {
    public final h1j a;
    public final h7m b;
    public final wia c;
    public final btm d;
    public final gqh0 e;
    public final Object f;
    public esh0 g;
    public final Object h;

    /* compiled from: EnabledSearchFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<l3a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(l3a l3aVar) {
            ((jsh0) this.receiver).a(l3aVar);
            return s3q0.a;
        }
    }

    public jip(h1j h1jVar, h7m h7mVar, wia wiaVar, btm btmVar, gqh0 gqh0Var) {
        this.a = h1jVar;
        this.b = h7mVar;
        this.c = wiaVar;
        this.d = btmVar;
        this.e = gqh0Var;
        g4g g4gVar = new g4g(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, g4gVar);
        this.h = msy.a(lazyThreadSafetyMode, new z0h(this, 9));
    }

    @Override // xsna.drh0
    public final void O(String str, SearchInputMethod searchInputMethod) {
        vrh0.a aVar;
        urh0 d = d();
        if (d.c || (aVar = d.b) == null) {
            return;
        }
        aVar.b(new SearchQuery(str, searchInputMethod, null, null, 12, null));
    }

    @Override // xsna.drh0
    public final io.reactivex.rxjava3.disposables.c P(m3a m3aVar) {
        return ((io.reactivex.rxjava3.subjects.f) m3aVar.b).subscribe(new ov2(new a(1, new jsh0(c()), jsh0.class, "onCatalogClickEvent", "onCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0), 16));
    }

    @Override // xsna.drh0
    public final void Q() {
        esh0 esh0Var = this.g;
        h1j h1jVar = this.a;
        if (esh0Var != null) {
            c().k(esh0Var, (f5z) h1jVar.invoke());
        }
        zqh0 c = c();
        urh0 d = d();
        d.getClass();
        c.f(new trh0(d), (f5z) h1jVar.invoke());
        c().d(new xi7(this), (f5z) h1jVar.invoke());
    }

    @Override // xsna.drh0
    public final void R(String str) {
        urh0 d = d();
        vrh0.a aVar = d.b;
        if (aVar != null) {
            aVar.c(d.a(str));
        }
    }

    @Override // xsna.drh0
    public final boolean S() {
        return false;
    }

    @Override // xsna.drh0
    public final void T(String str, SearchInputMethod searchInputMethod, String str2, String str3) {
        SearchQuery searchQuery = new SearchQuery(str, searchInputMethod, str2, str3);
        d().b(searchQuery, false);
        c().e(searchQuery, b9q0.a.a);
    }

    @Override // xsna.drh0
    public final void U(String str) {
        urh0 d = d();
        vrh0.a aVar = d.b;
        if (aVar != null) {
            aVar.e(d.a(str));
        }
    }

    @Override // xsna.drh0
    public final long V() {
        return 0L;
    }

    @Override // xsna.drh0
    public final void a(boolean z, boolean z2) {
        c().a(z, z2);
    }

    @Override // xsna.drh0
    public final CommonSearchResultsVh b(u4a u4aVar, CatalogGetAudioSearchRequestFactory catalogGetAudioSearchRequestFactory, eg50 eg50Var) {
        zqh0 c = c();
        u4a.a aVar = u4aVar.b;
        u4a a2 = u4a.a(u4aVar, u4a.a.a(aVar, null, null, null, null, null, new tyh0(aVar.s), null, null, null, eg50Var, new onh0(), -524289, 1048551));
        u4a.a aVar2 = a2.b;
        nvs.s7.getClass();
        u4a a3 = u4a.a(a2, u4a.a.a(aVar2, null, null, null, null, null, null, null, nvs.a.b, null, null, null, Integer.MAX_VALUE, 1048575));
        u4a.a aVar3 = a3.b;
        CatalogConfiguration catalogConfiguration = aVar3.s;
        g3a g3aVar = new g3a(catalogConfiguration, a3, catalogConfiguration.K(a3), new x2a.e(), null, null, null, aVar3.H, catalogGetAudioSearchRequestFactory, new t66(0, c, zqh0.class, "notifyRequestFinished", "notifyRequestFinished()V", 0, 1), 24816);
        ViewPagerVh viewPagerVh = new ViewPagerVh(a3, false, null, false, null, null, null, null, null, null, 8190);
        TabsOrListVh tabsOrListVh = new TabsOrListVh(a3, null, 0, null, false, g3aVar, this.c, viewPagerVh, new VkTabsVh(viewPagerVh, new h550(), aVar3.r, Tab$Mode.Accent, 168), new EmptyScreenWithTextVh(), true, null, 131260);
        Pair pair = new Pair(new SearchFeatureResultsWithTabsVh(tabsOrListVh), new kzn0(g3aVar, catalogGetAudioSearchRequestFactory, tabsOrListVh));
        CommonSearchResultsVh commonSearchResultsVh = (CommonSearchResultsVh) pair.d();
        this.g = (esh0) pair.g();
        return commonSearchResultsVh;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zqh0 c() {
        return (zqh0) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final urh0 d() {
        return (urh0) this.h.getValue();
    }

    @Override // xsna.drh0
    public final void n() {
        vrh0.a aVar = d().b;
        if (aVar != null) {
            aVar.a();
        }
    }
}
