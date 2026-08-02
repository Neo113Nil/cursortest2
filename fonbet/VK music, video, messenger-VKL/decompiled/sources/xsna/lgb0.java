package xsna;

import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import xsna.bcw0;

/* compiled from: PodcastCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class lgb0 extends bcw0 {
    public final /* synthetic */ PodcastCatalogRootVh a;

    public lgb0(PodcastCatalogRootVh podcastCatalogRootVh) {
        this.a = podcastCatalogRootVh;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        String str = aVar.a;
        PodcastCatalogRootVh podcastCatalogRootVh = this.a;
        if (epx.f(podcastCatalogRootVh.w.r, vyh0.a)) {
            if (str == null) {
                podcastCatalogRootVh.i8(alj.a);
                return;
            }
            podcastCatalogRootVh.p = str;
            podcastCatalogRootVh.q = null;
            podcastCatalogRootVh.v.zf(str, false);
            SearchResultsVh.cb(podcastCatalogRootVh.u, str, null, null, false, null, false, 60);
        }
    }

    @Override // xsna.bcw0
    public final void b() {
        this.a.i8(vyh0.a);
    }
}
