package xsna;

/* compiled from: DialogMessagesInvalidateLpTask.kt */
/* loaded from: classes2.dex */
public final class vhm extends e500 {
    public final w2w c;
    public final long d;

    public vhm(w2w w2wVar, long j) {
        super("DialogMessagesInvalidateLpTask");
        this.c = w2wVar;
        this.d = j;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().o().n0(this.d);
    }
}
