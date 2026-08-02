package yads;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class ws2 implements zf0 {
    public final b2 a;
    public final b83 b;
    public final z52 c;
    public final c2 d;

    public ws2(b2 b2Var, b83 b83Var, z52 z52Var, c2 c2Var) {
        this.a = b2Var;
        this.b = b83Var;
        this.c = z52Var;
        this.d = c2Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        b2 b2Var = this.a;
        b2Var.b.add(this.d);
        this.b.getClass();
        View findViewWithTag = viewGroup.findViewWithTag("timer_container");
        if (findViewWithTag == null) {
            findViewWithTag = null;
        }
        z52 z52Var = this.c;
        z52Var.c = findViewWithTag;
        by0 by0Var = z52Var.b;
        if (by0Var != null) {
            by0Var.start();
        }
    }

    @Override // yads.zf0
    public final void c() {
        b2 b2Var = this.a;
        b2Var.b.remove(this.d);
        z52 z52Var = this.c;
        z52Var.c = null;
        by0 by0Var = z52Var.b;
        if (by0Var != null) {
            by0Var.invalidate();
        }
    }
}
