package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MarketMultiPickerPageController.kt */
/* loaded from: classes18.dex */
public final class ka10 extends GridLayoutManager.c {
    public final /* synthetic */ la10 d;
    public final /* synthetic */ GridLayoutManager e;

    public ka10(la10 la10Var, GridLayoutManager gridLayoutManager) {
        this.d = la10Var;
        this.e = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        RecyclerView.Adapter adapter = this.d.B.getAdapter();
        Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(i)) : null;
        if (valueOf == null || epx.g(valueOf.intValue(), 0) != 1) {
            return 1;
        }
        return this.e.s;
    }
}
