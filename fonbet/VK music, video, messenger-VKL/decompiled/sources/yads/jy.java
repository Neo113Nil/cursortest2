package yads;

import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class jy implements zf0 {
    public final zf0[] a;

    public jy(zf0... zf0VarArr) {
        this.a = zf0VarArr;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        for (zf0 zf0Var : this.a) {
            zf0Var.a(viewGroup);
        }
    }

    @Override // yads.zf0
    public final void c() {
        for (zf0 zf0Var : this.a) {
            zf0Var.c();
        }
    }
}
