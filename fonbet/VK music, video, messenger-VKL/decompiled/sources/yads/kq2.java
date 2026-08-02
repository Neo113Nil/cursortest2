package yads;

import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class kq2 implements zf0 {
    public final f2 a;
    public final int b;

    public kq2(f2 f2Var, int i) {
        this.a = f2Var;
        this.b = i;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        if (this.b == 1) {
            ((q2) this.a).a(7);
        } else {
            ((q2) this.a).a(6);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
