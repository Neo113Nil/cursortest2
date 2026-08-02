package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: CommunityLiveCoverPagerAdapter.kt */
/* loaded from: classes5.dex */
public final class t8h extends RecyclerView.Adapter<jyg> {
    public List<? extends gwh<?, ?>> c;
    public r8h d;
    public c8h e;
    public final z8h f;
    public final k3b g;

    public t8h(List list, r8h r8hVar, c8h c8hVar, z8h z8hVar, k3b k3bVar) {
        this.c = list;
        this.d = r8hVar;
        this.e = c8hVar;
        this.f = z8hVar;
        this.g = k3bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(jyg jygVar, int i) {
        jyg jygVar2 = jygVar;
        jygVar2.m = this.d;
        jygVar2.n = this.e;
        List<? extends gwh<?, ?>> list = this.c;
        jygVar2.V5(list.get(i % list.size()).a(i == this.d.c), this.d, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final jyg onCreateViewHolder(ViewGroup viewGroup, int i) {
        b8h b8hVar = new b8h(viewGroup.getContext());
        b8hVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return new jyg(b8hVar, this.d, this.e, this.f, this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(jyg jygVar) {
        jyg jygVar2 = jygVar;
        super.onViewDetachedFromWindow(jygVar2);
        com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = jygVar2.q;
        if (aVar != null) {
            aVar.g(true);
        }
        com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar = jygVar2.r;
        if (bVar != null) {
            bVar.f(true);
        }
        jygVar2.q = null;
        jygVar2.r = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(jyg jygVar) {
        jyg jygVar2 = jygVar;
        super.onViewRecycled(jygVar2);
        com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = jygVar2.q;
        if (aVar != null) {
            aVar.g(true);
        }
        com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar = jygVar2.r;
        if (bVar != null) {
            bVar.f(true);
        }
        jygVar2.q = null;
        jygVar2.r = null;
    }
}
