package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.photo.Photo;
import com.vk.feedlikes.viewholders.PhotosLikeHeaderBlockViewHolder;
import java.util.List;

/* compiled from: PhotosLikeHeaderAdapter.kt */
/* loaded from: classes18.dex */
public final class nfa0 extends zoj0<List<? extends Photo>, PhotosLikeHeaderBlockViewHolder> implements mf7 {
    @Override // xsna.mf7
    public final int e0(int i) {
        return 6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1108;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((PhotosLikeHeaderBlockViewHolder) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new PhotosLikeHeaderBlockViewHolder(viewGroup);
    }
}
