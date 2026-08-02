package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stories.model.StoriesContainer;
import xsna.w43;

/* compiled from: GroupedStoriesAdapter.kt */
/* loaded from: classes6.dex */
public final class lou extends zoj0<StoriesContainer, vif0<StoriesContainer>> {
    public final xsl0 e;
    public final w43.c f;
    public final w43.d g;
    public final w43.b h;

    public lou(xsl0 xsl0Var, w43.c cVar, w43.d dVar, w43.b bVar) {
        this.e = xsl0Var;
        this.f = cVar;
        this.g = dVar;
        this.h = bVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((StoriesContainer) this.c.c(i)).Ab().b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        StoriesContainer storiesContainer = (StoriesContainer) this.c.c(i);
        ((vif0) e0Var).V5(storiesContainer);
        this.h.invoke(storiesContainer, Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            throw new IllegalStateException(lhg.a(i, "Unsupported view type: "));
        }
        return new mou(viewGroup, this.e, this.f, this.g);
    }
}
