package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.video.VideoOwner;
import java.util.ArrayList;

/* compiled from: RecommendedRecyclerAdapter.java */
/* loaded from: classes3.dex */
public final class qef0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public ArrayList c;
    public nef0 d;

    /* compiled from: RecommendedRecyclerAdapter.java */
    public class a extends RecyclerView.e0 {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        VideoOwner videoOwner = (VideoOwner) this.c.get(i);
        xcf0 xcf0Var = (xcf0) e0Var.itemView;
        xcf0Var.setPresenter(this.d);
        xcf0Var.setModel(videoOwner);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        xcf0 xcf0Var = new xcf0(viewGroup.getContext());
        xcf0Var.setPresenter(this.d);
        return new a(xcf0Var);
    }
}
