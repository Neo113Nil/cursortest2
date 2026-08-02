package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.utils.ItemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SimpleAdapter.kt */
/* loaded from: classes17.dex */
public final class apj0 extends RecyclerView.Adapter<on6> {
    public List<brj0> c;
    public final izs<brj0, s3q0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public apj0(List<brj0> list, izs<? super brj0, s3q0> izsVar) {
        this.c = list;
        this.d = izsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.c.get(i).i.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(on6 on6Var, int i) {
        on6Var.V5(this.c.get(i), this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final on6 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == ItemType.CUSTOM.h()) {
            int i2 = hmk.o;
            return new hmk((ViewGroup) tf3.b(viewGroup, R.layout.actions_custom, viewGroup, false));
        }
        int i3 = bpj0.r;
        return new bpj0((ViewGroup) tf3.b(viewGroup, i == ItemType.TITLE.h() ? R.layout.actions_simple_title : i == ItemType.DEFAULT_WITH_CHECK.h() ? R.layout.actions_simple_with_check : R.layout.actions_simple, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(on6 on6Var) {
        on6Var.W5();
    }
}
