package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: CounterAdapter.kt */
/* loaded from: classes4.dex */
public final class bxj extends androidx.recyclerview.widget.x<rxj, ayj> implements vic {
    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        submitList(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((ayj) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ayj(tf3.b(viewGroup, R.layout.photos_root_count_view, viewGroup, false));
    }
}
