package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes9.dex */
public final class i1u implements j1u {
    public final /* synthetic */ GridLayoutManager a;

    public i1u(GridLayoutManager gridLayoutManager) {
        this.a = gridLayoutManager;
    }

    @Override // defpackage.j1u
    public final int getItemCount() {
        return this.a.getItemCount();
    }

    @Override // defpackage.j1u
    public final int l(int i) {
        GridLayoutManager gridLayoutManager = this.a;
        return gridLayoutManager.h0.b(i, gridLayoutManager.c0);
    }

    @Override // defpackage.ylt0
    public final int o(int i) {
        return this.a.h0.c(i);
    }

    @Override // defpackage.j1u
    public final int u(int i) {
        GridLayoutManager gridLayoutManager = this.a;
        return gridLayoutManager.h0.a(i, gridLayoutManager.c0);
    }

    @Override // defpackage.ylt0
    /* renamed from: z */
    public final int getB0() {
        return this.a.c0;
    }
}
