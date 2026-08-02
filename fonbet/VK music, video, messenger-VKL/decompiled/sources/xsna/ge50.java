package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.discover.carousel.tracks.MusicTracksCarouselItem;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MusicTracksCarouselItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class ge50 extends RecyclerView.Adapter<la50> {
    public String c;
    public List<MusicTracksCarouselItem> d = EmptyList.b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(la50 la50Var, int i) {
        la50 la50Var2 = la50Var;
        String str = this.c;
        if (str != null) {
            la50Var2.n = MusicPlaybackLaunchContext.Fb(str);
        }
        la50Var2.V5(this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final la50 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new la50(viewGroup, this.d.size() <= 3);
    }
}
