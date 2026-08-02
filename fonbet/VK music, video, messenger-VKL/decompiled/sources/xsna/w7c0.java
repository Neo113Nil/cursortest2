package xsna;

import xsna.i0c0;

/* compiled from: PostStickerRedesign.kt */
/* loaded from: classes6.dex */
public final class w7c0 implements i0c0.a {
    public final int a;
    public final boolean b;
    public final /* synthetic */ jw30 c;

    public w7c0(z7c0 z7c0Var, jw30 jw30Var) {
        this.c = jw30Var;
        int i = a8c0.a;
        this.a = (int) (1080 * z7c0Var.getMaxScaleLimit());
        this.b = z7c0Var.s;
    }

    @Override // xsna.i0c0.a
    public final boolean N1() {
        return this.b;
    }

    @Override // xsna.i0c0.a
    public final void a() {
        this.c.invoke();
    }

    @Override // xsna.i0c0.a
    public final int b() {
        return this.a;
    }
}
