package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import java.lang.ref.WeakReference;

/* compiled from: NewsEntryActionsAdapter.kt */
/* loaded from: classes4.dex */
public final class aa60 extends zoj0<y960, RecyclerView.e0> {
    public z960 e;
    public WeakReference<VkContextMenu> f;

    public final void K0(int i, int i2) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        x0(new y960(i, context.getText(i2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (((y960) this.c.c(i)) != null) {
            return r3.a;
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        y960 y960Var = (y960) this.c.c(i);
        if (y960Var != null && (e0Var instanceof p10)) {
            p10 p10Var = (p10) e0Var;
            p10Var.p = this.f;
            p10Var.o = this.e;
            p10Var.V5(y960Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new p10(viewGroup);
    }
}
