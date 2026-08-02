package xsna;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: GoodPreviewView.kt */
/* loaded from: classes18.dex */
public final class h7u extends GridLayoutManager.c {
    public final /* synthetic */ i7u d;
    public final /* synthetic */ GridLayoutManager e;

    public h7u(i7u i7uVar, GridLayoutManager gridLayoutManager) {
        this.d = i7uVar;
        this.e = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        if (this.d.k.h.get(i) instanceof v6u) {
            return 1;
        }
        return this.e.s;
    }
}
