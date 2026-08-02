package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PhotoFlowAdapter.kt */
/* loaded from: classes4.dex */
public final class n7a0 extends androidx.recyclerview.widget.x<y7a0, f9a0> implements vic {
    public final s5a0 c;
    public final eha0 d;

    public n7a0(s5a0 s5a0Var, eha0 eha0Var) {
        super(o7a0.a);
        this.c = s5a0Var;
        this.d = eha0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((f9a0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new f9a0(tf3.b(viewGroup, R.layout.photo_flow_item, viewGroup, false), this.c, this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        f9a0 f9a0Var = (f9a0) e0Var;
        if (!list.isEmpty()) {
            f9a0Var.W5(getItem(i), j5g.Y(list));
        } else {
            f9a0Var.V5(getItem(i));
        }
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
