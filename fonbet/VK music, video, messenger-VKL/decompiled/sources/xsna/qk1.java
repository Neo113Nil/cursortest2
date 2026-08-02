package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: AlbumSettingsCounterAdapter.kt */
/* loaded from: classes4.dex */
public final class qk1 extends zoj0<rxj, gm1> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((gm1) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new gm1(tf3.b(viewGroup, R.layout.photos_root_count_view, viewGroup, false));
    }
}
