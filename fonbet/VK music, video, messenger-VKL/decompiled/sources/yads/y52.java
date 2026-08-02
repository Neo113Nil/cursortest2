package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class y52 implements uk2 {
    public final /* synthetic */ z52 a;

    public y52(z52 z52Var) {
        this.a = z52Var;
    }

    @Override // yads.uk2
    public final void a(long j, long j2) {
        z52 z52Var = this.a;
        View view = z52Var.c;
        if (view != null) {
            z52Var.a.a(view, j, j2);
        }
    }

    @Override // yads.uk2
    public final void a() {
        View view = this.a.c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
