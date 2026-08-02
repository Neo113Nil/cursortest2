package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.tba0;

/* compiled from: PhotoTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class dca0 extends androidx.recyclerview.widget.x<tba0, vif0<? extends tba0>> implements vic {
    public final x2y c;
    public final es00 d;
    public final fda0 e;
    public final gda0 f;
    public final kn20 g;

    public dca0(x2y x2yVar, es00 es00Var, fda0 fda0Var, gda0 gda0Var, kn20 kn20Var) {
        super(eca0.a);
        this.c = x2yVar;
        this.d = es00Var;
        this.e = fda0Var;
        this.f = gda0Var;
        this.g = kn20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        tba0 item = getItem(i);
        if (item instanceof tba0.a) {
            return R.layout.item_photo_with_tag_counter;
        }
        if (item instanceof tba0.b) {
            return R.layout.item_photo_with_tag;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vif0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, i, viewGroup, false);
        if (i == R.layout.item_photo_with_tag) {
            return new bca0(b, this.c, this.d, this.e, this.f, this.g);
        }
        if (i == R.layout.item_photo_with_tag_counter) {
            return new sba0(b);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported view type "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        vif0 vif0Var = (vif0) e0Var;
        if (list.isEmpty()) {
            super.onBindViewHolder(vif0Var, i, list);
        } else {
            vif0Var.W5(getItem(i), j5g.Y(list));
        }
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
