package xsna;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: TaggedItemsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class d1o0 extends GridLayoutManager.c {
    public final /* synthetic */ g010 d;
    public final /* synthetic */ int e;

    public d1o0(g010 g010Var, int i) {
        this.d = g010Var;
        this.e = i;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        if (this.d.getItemViewType(i) == 0) {
            return 1;
        }
        return this.e;
    }
}
