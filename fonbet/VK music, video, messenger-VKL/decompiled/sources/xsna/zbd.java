package xsna;

import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.search.ui.api.SearchInputMethod;
import xsna.bcw0;

/* compiled from: ClipSearchRootVh.kt */
/* loaded from: classes16.dex */
public final class zbd extends bcw0 {
    public final /* synthetic */ ClipSearchRootVh a;

    public zbd(ClipSearchRootVh clipSearchRootVh) {
        this.a = clipSearchRootVh;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        String str;
        ClipSearchRootVh clipSearchRootVh = this.a;
        if (epx.f(clipSearchRootVh.D.r, vyh0.a) && (str = aVar.a) != null) {
            SearchInputMethod.a aVar2 = SearchInputMethod.Companion;
            icw0 icw0Var = aVar.b;
            aVar2.getClass();
            SearchInputMethod a = SearchInputMethod.a.a(icw0Var);
            clipSearchRootVh.v = str;
            clipSearchRootVh.w = null;
            clipSearchRootVh.q.T(str, a, null, null);
            clipSearchRootVh.E.d(true, true);
            CatalogConfiguration catalogConfiguration = clipSearchRootVh.m.b.s;
            if ((catalogConfiguration instanceof vbd ? (vbd) catalogConfiguration : null) != null) {
                drm0.N(str);
            }
        }
    }

    @Override // xsna.bcw0
    public final void b() {
        this.a.i8(vyh0.a);
    }
}
