package xsna;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import java.util.List;
import xsna.pfh0;

/* compiled from: ScrollItemsAdapter.kt */
/* loaded from: classes6.dex */
public abstract class qfh0<E, T extends pfh0<E>> extends RecyclerView.Adapter<T> {
    public List<? extends E> c;
    public UniversalWidget d;
    public j3q0<? extends UniversalWidget> e;
    public u7n0 f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<? extends E> list = this.c;
        if (list == null) {
            list = null;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        pfh0 pfh0Var = (pfh0) e0Var;
        List<? extends E> list = this.c;
        if (list == null) {
            list = null;
        }
        E e = list.get(i);
        UniversalWidget universalWidget = this.d;
        if (universalWidget == null) {
            universalWidget = null;
        }
        j3q0<? extends UniversalWidget> j3q0Var = this.e;
        if (j3q0Var == null) {
            j3q0Var = null;
        }
        u7n0 u7n0Var = this.f;
        pfh0Var.V5(e, universalWidget, j3q0Var, u7n0Var != null ? u7n0Var : null);
    }

    public abstract pfh0 x0(LinearLayout linearLayout, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public pfh0 onCreateViewHolder(int i, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        return x0(linearLayout, i);
    }
}
