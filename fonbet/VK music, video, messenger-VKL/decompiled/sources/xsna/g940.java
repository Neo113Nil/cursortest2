package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.se50;

/* compiled from: MusicAdapter.kt */
/* loaded from: classes3.dex */
public abstract class g940<T, VH extends se50<? super T>> extends zoj0<T, VH> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh, int i) {
        vh.V5("", false, i, this.c.c(i));
    }

    @Override // xsna.zoj0, xsna.uuk
    public final void n0(List<? extends T> list) {
        if (list == null) {
            list = EmptyList.b;
        }
        super.n0(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        se50 se50Var = (se50) e0Var;
        se50Var.a6();
        super.onViewAttachedToWindow(se50Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        se50 se50Var = (se50) e0Var;
        se50Var.h6();
        super.onViewDetachedFromWindow(se50Var);
    }

    @Override // xsna.zoj0, xsna.uuk
    public final void setItems(List<? extends T> list) {
        if (list == null) {
            list = EmptyList.b;
        }
        super.setItems(list);
    }
}
