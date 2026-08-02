package xsna;

/* compiled from: DialogsFolderInvalidateLpTask.kt */
/* loaded from: classes2.dex */
public final class aqm extends e500 {
    public final int c;
    public final w2w d;

    public aqm(int i, w2w w2wVar) {
        super("DialogsFolderInvalidateLpTask");
        this.c = i;
        this.d = w2wVar;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.L.add(Integer.valueOf(this.c));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.d.I0().u(new wcj(this, 4));
    }
}
