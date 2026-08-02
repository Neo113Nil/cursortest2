package xsna;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: VmojiCharacterView.kt */
/* loaded from: classes7.dex */
public final class g8w0 extends GridLayoutManager.c {
    public final /* synthetic */ e8w0 d;
    public final /* synthetic */ GridLayoutManager e;

    public g8w0(e8w0 e8w0Var, GridLayoutManager gridLayoutManager) {
        this.d = e8w0Var;
        this.e = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        hfz hfzVar = this.d.u.h.get(i);
        if ((hfzVar instanceof o6w0) || (hfzVar instanceof p6w0)) {
            return 1;
        }
        return this.e.s;
    }
}
