package xsna;

import xsna.i0c0;

/* compiled from: PostSticker.kt */
/* loaded from: classes6.dex */
public final class n7c0 implements i0c0.a {
    public final int a;
    public final /* synthetic */ o7c0 b;

    public n7c0(o7c0 o7c0Var) {
        this.b = o7c0Var;
        this.a = o7c0Var.getAvailableWidth();
    }

    @Override // xsna.i0c0.a
    public final boolean N1() {
        return false;
    }

    @Override // xsna.i0c0.a
    public final void a() {
        this.b.v();
    }

    @Override // xsna.i0c0.a
    public final int b() {
        return this.a;
    }
}
