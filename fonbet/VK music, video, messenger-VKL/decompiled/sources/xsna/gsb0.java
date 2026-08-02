package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import java.lang.ref.WeakReference;

/* compiled from: PollV3ActionsAdapter.kt */
/* loaded from: classes4.dex */
public final class gsb0 extends zoj0<esb0, RecyclerView.e0> {
    public psb0 e;
    public WeakReference<VkContextMenu> f;
    public boolean g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((esb0) this.c.c(i)).c ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        esb0 esb0Var = (esb0) this.c.c(i);
        if (esb0Var == null) {
            return;
        }
        if (!(e0Var instanceof fsb0)) {
            if (e0Var instanceof vsb0) {
                ((vsb0) e0Var).V5(esb0Var);
            }
        } else {
            fsb0 fsb0Var = (fsb0) e0Var;
            fsb0Var.p = this.f;
            fsb0Var.o = this.e;
            fsb0Var.V5(esb0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 1 ? new vsb0(viewGroup) : new fsb0(viewGroup);
    }
}
