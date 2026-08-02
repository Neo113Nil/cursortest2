package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;

/* compiled from: ModalPostDonutAdapter.kt */
/* loaded from: classes4.dex */
public final class w030 extends zoj0<Object, RecyclerView.e0> implements c.i {
    public final ModalPostDonutFragment.b e;

    public w030(ModalPostDonutFragment.b bVar) {
        super(new ListDataSet());
        this.e = bVar;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.c.c(i) instanceof z030 ? 1000000 : 1000001;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        Object c = this.c.c(i);
        if (e0Var instanceof h130) {
            ((h130) e0Var).V5((z030) c);
        } else if (e0Var instanceof g130) {
            ((g130) e0Var).V5((v6n0) c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ModalPostDonutFragment.b bVar = this.e;
        return i == 1000000 ? new h130(viewGroup, bVar) : new g130(viewGroup, bVar);
    }
}
