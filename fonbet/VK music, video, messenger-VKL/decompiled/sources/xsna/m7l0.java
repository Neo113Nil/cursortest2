package xsna;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: StickerStyleSelectorView.kt */
/* loaded from: classes6.dex */
public final class m7l0 extends GridLayoutManager.c {
    public final /* synthetic */ o7l0 d;
    public final /* synthetic */ GridLayoutManager e;

    public m7l0(o7l0 o7l0Var, GridLayoutManager gridLayoutManager) {
        this.d = o7l0Var;
        this.e = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        e7l0 e7l0Var = this.d.d;
        if ((j5g.b0(i, e7l0Var.h) instanceof y1l0) || (j5g.b0(i, e7l0Var.h) instanceof zl2)) {
            return 1;
        }
        return this.e.s;
    }
}
