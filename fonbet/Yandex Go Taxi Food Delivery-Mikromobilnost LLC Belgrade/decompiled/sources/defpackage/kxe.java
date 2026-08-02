package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes5.dex */
public final class kxe extends RecyclerView.Adapter {
    public List a = EmptyList.a;
    public pxe b;
    public mxe c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        jxe jxeVar = (jxe) x0Var;
        mxe mxeVar = (mxe) this.a.get(i);
        boolean l = jl40.l(mxeVar, this.c);
        boolean z = i == this.a.size() - 1;
        ListItemCheckComponent listItemCheckComponent = jxeVar.N;
        listItemCheckComponent.setChecked(l);
        listItemCheckComponent.setTitle(mxeVar.a);
        listItemCheckComponent.setDividers(DividerPosition.BOTTOM, z ? DividerType.NONE : DividerType.MARGIN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new jxe(c.q(viewGroup, qph0.cost_center_item_view, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        jxe jxeVar = (jxe) x0Var;
        super.onViewAttachedToWindow(jxeVar);
        jxeVar.N.setCheckedChangeListener(new ixe(0, this, jxeVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        jxe jxeVar = (jxe) x0Var;
        super.onViewDetachedFromWindow(jxeVar);
        jxeVar.N.setCheckedChangeListener(null);
    }
}
