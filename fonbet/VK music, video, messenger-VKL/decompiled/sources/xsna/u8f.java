package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: ClipsTemplatesEditorFragmentItemsAdapter.kt */
/* loaded from: classes16.dex */
public final class u8f extends zoj0<o7f, t8f> {
    public final j5 e;

    public u8f(com.vk.lists.a aVar, j5 j5Var) {
        super(aVar);
        this.e = j5Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((o7f) this.c.c(i)).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return R.layout.clips_template_editor_fragment_item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((t8f) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.layout.clips_template_editor_fragment_item) {
            return new t8f(viewGroup, this.e);
        }
        throw new IllegalStateException("Unsupported viewType");
    }
}
