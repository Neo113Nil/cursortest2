package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;

/* compiled from: ClipsGridDraftPreviewHolder.kt */
/* loaded from: classes17.dex */
public final class vce extends RecyclerView.e0 implements View.OnClickListener, View.OnLongClickListener {
    public final izs<tce, s3q0> l;
    public final izs<tce, s3q0> m;
    public tce n;

    public vce(ViewGroup viewGroup, ClipsGridDraftsListFragment.b bVar, ClipsGridDraftsListFragment.c cVar) {
        super(new dee(viewGroup.getContext()));
        this.l = bVar;
        this.m = cVar;
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tce tceVar;
        if (view == null || jjc.b() || (tceVar = this.n) == null) {
            return;
        }
        this.l.invoke(tceVar);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        tce tceVar;
        if (view == null || jjc.b() || (tceVar = this.n) == null) {
            return false;
        }
        this.m.invoke(tceVar);
        return true;
    }
}
