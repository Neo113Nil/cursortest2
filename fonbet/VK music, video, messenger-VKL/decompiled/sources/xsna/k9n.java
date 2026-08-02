package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.lists.c;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* compiled from: DiscoverStoriesAdapter.kt */
/* loaded from: classes6.dex */
public final class k9n extends sxm implements c.i, vic {
    public final bw6 i;
    public final p99 j;
    public final lw3 k;
    public final ArrayList l;

    public k9n(bw6 bw6Var, p99 p99Var, lw3 lw3Var) {
        this.i = bw6Var;
        this.j = p99Var;
        this.k = lw3Var;
        k9x k9xVar = new k9x(1, 18, 1);
        ArrayList arrayList = new ArrayList(c5g.u(k9xVar, 10));
        j9x it = k9xVar.iterator();
        while (it.d) {
            it.nextInt();
            arrayList.add(new gvl0());
        }
        this.l = arrayList;
        x0(rrl0.class, new m4g(this, 13));
        x0(gvl0.class, new oc0(19));
        x0(trl0.class, new la2(25));
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: B0 */
    public final void onBindViewHolder(vfz<hfz> vfzVar, int i) {
        StoriesContainer storiesContainer;
        D0(vfzVar, i, null);
        hfz hfzVar = this.h.get(i);
        rrl0 rrl0Var = hfzVar instanceof rrl0 ? (rrl0) hfzVar : null;
        if (rrl0Var == null || (storiesContainer = rrl0Var.b) == null) {
            return;
        }
        this.k.invoke(storiesContainer);
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return this.h.isEmpty();
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }
}
