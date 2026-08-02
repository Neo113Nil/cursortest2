package xsna;

/* compiled from: DialogInfoBarUpdateLpTask.kt */
/* loaded from: classes2.dex */
public final class ufm extends e500 {
    public final w2w c;
    public final tfm d;

    public ufm(w2w w2wVar, tfm tfmVar) {
        super("DialogInfoBarUpdateLpTask");
        this.c = w2wVar;
        this.d = tfmVar;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        p4g.a(Long.valueOf(this.d.a.b), f400Var.c, !c400Var.d.containsKey(Long.valueOf(r0.a.b)));
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.a.b);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        new wfm((com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(this.d.a.b), c400Var.d), null).o(this.c);
    }
}
