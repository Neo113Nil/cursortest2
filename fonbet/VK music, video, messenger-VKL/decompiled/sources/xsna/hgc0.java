package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.R;

/* compiled from: PostingItemDraftAdapter.kt */
/* loaded from: classes4.dex */
public final class hgc0 extends lk6<igc0> implements dc6 {
    public PostingCreationEntryPoint c;

    @Override // xsna.mf7
    public final int e0(int i) {
        return 6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1106;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        igc0 igc0Var = (igc0) e0Var;
        igc0Var.V5(s3q0.a);
        igc0Var.o = this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = igc0.q;
        PostingCreationEntryPoint postingCreationEntryPoint = this.c;
        igc0 igc0Var = new igc0(postingCreationEntryPoint != PostingCreationEntryPoint.GroupWallButton ? R.layout.holder_posting_draft_v3 : R.layout.holder_posting_draft_v2, viewGroup, null, postingCreationEntryPoint);
        bwt0.p0(igc0Var.itemView, true);
        return igc0Var;
    }
}
