package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.ec40;

/* compiled from: MusicBottomSheetActionAdapter.kt */
/* loaded from: classes3.dex */
public final class fc40<T> extends g940<ec40<T>, se50<ec40<T>>> {
    public final ec40.a<T> e;
    public final boolean f;

    public fc40(ec40.a<T> aVar, boolean z) {
        this.e = aVar;
        this.f = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ec40) this.c.c(i)).h != null ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context u = this.f ? bwt0.u(viewGroup.getContext()) : viewGroup.getContext();
        ec40.a<T> aVar = this.e;
        return i != 0 ? i != 1 ? new r840(LayoutInflater.from(u).inflate(R.layout.music_action_item, viewGroup, false), aVar) : new p840(LayoutInflater.from(u).inflate(R.layout.music_action_item_with_subtitle, viewGroup, false), aVar) : new r840(LayoutInflater.from(u).inflate(R.layout.music_action_item, viewGroup, false), aVar);
    }
}
