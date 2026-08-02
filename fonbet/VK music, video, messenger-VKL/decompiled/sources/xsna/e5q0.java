package xsna;

import java.util.ArrayList;

/* compiled from: UnreadDialogsCountChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class e5q0 extends e500 {
    public final w2w c;
    public final int d;
    public final int e;
    public final Boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final ArrayList m;
    public boolean n;

    public e5q0(w2w w2wVar, int i, int i2, Boolean bool, int i3, int i4, int i5, int i6, int i7, int i8) {
        super("UnreadDialogsCountChangeLpTask");
        this.c = w2wVar;
        this.d = i;
        this.e = i2;
        this.f = bool;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = new ArrayList();
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.G.addAll(this.m);
        if (this.n) {
            z300Var.E = true;
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().u(new wgm0(this, 5));
    }
}
