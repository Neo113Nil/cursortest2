package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.discover.carousel.artist.ArtistsCarouselItem;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ArtistsCarouselItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class ot3 extends RecyclerView.Adapter<nt3> {
    public final String c = "discover_full";
    public List<ArtistsCarouselItem> d = EmptyList.b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(nt3 nt3Var, int i) {
        nt3Var.V5(this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final nt3 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new nt3(viewGroup, this.c);
    }
}
