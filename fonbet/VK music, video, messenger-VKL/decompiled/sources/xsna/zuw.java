package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerStockItem;
import com.vkontakte.android.R;

/* compiled from: InfiniteRotationAdapter.kt */
/* loaded from: classes6.dex */
public final class zuw extends RecyclerView.Adapter<b790> {
    public final nng0 c;

    public zuw(nng0 nng0Var) {
        this.c = nng0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        nng0 nng0Var = this.c;
        if (nng0Var != null) {
            return nng0Var.u4();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b790 b790Var, int i) {
        b790 b790Var2 = b790Var;
        nng0 nng0Var = this.c;
        StickerStockItem f2 = nng0Var != null ? nng0Var.f2(i) : null;
        if (f2 != null) {
            dgr0.a(b790Var2.m, f2);
            b790Var2.n.setText(f2.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b790 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b790(tf3.b(viewGroup, R.layout.roulette_pack_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(b790 b790Var) {
        b790 b790Var2 = b790Var;
        b790Var2.m.c.clear();
        super.onViewRecycled(b790Var2);
    }
}
