package xsna;

import xsna.k800;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class z700 implements k800.a {
    public final /* synthetic */ k800 a;
    public final /* synthetic */ float b;

    public /* synthetic */ z700(k800 k800Var, float f) {
        this.a = k800Var;
        this.b = f;
    }

    @Override // xsna.k800.a
    public final void run() {
        k800 k800Var = this.a;
        i700 i700Var = k800Var.b;
        float f = this.b;
        if (i700Var == null) {
            k800Var.h.add(new z700(k800Var, f));
            return;
        }
        z800 z800Var = k800Var.c;
        z800Var.o(z800Var.k, ls20.f(i700Var.l, i700Var.m, f));
    }
}
