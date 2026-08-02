package xsna;

import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import xsna.bcw0;

/* compiled from: MusicMyAudiosCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class zo40 extends bcw0 {
    public final /* synthetic */ MusicMyAudiosCatalogRootVh a;

    public zo40(MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh) {
        this.a = musicMyAudiosCatalogRootVh;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = this.a;
        if (epx.f(musicMyAudiosCatalogRootVh.Q.r, vyh0.a)) {
            String str = aVar.a;
            if (str != null) {
                wda.e0(musicMyAudiosCatalogRootVh, str, null, null, 12);
            } else {
                musicMyAudiosCatalogRootVh.i8(alj.a);
            }
        }
    }

    @Override // xsna.bcw0
    public final void b() {
        MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = this.a;
        SearchResultsImplVh searchResultsImplVh = musicMyAudiosCatalogRootVh.C;
        if (searchResultsImplVh != null) {
            searchResultsImplVh.clear();
        }
        musicMyAudiosCatalogRootVh.i8(vyh0.a);
    }
}
