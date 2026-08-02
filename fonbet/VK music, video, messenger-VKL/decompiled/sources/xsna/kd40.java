package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;

/* compiled from: MusicCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class kd40 extends RecyclerView.t {
    public final /* synthetic */ MusicCatalogRootVh b;

    public kd40(MusicCatalogRootVh musicCatalogRootVh) {
        this.b = musicCatalogRootVh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        this.b.j0();
    }
}
