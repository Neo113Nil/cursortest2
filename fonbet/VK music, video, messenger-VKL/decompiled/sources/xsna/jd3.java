package xsna;

/* compiled from: ApplyChannelSpaceLpTask.kt */
/* loaded from: classes2.dex */
public final class jd3 extends e500 {
    public final w2w c;
    public final String d;

    public jd3(w2w w2wVar, String str) {
        super("ApplyChannelSpaceLpTask");
        this.c = w2wVar;
        this.d = str;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Boolean bool = Boolean.TRUE;
        z300Var.b = bool;
        z300Var.d = bool;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().u(new e1(this, 6));
    }
}
