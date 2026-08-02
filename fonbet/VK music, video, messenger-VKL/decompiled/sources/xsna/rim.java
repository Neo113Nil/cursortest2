package xsna;

/* compiled from: DialogPinnedMsgDetachLpTask.kt */
/* loaded from: classes2.dex */
public final class rim extends e500 {
    public final w2w c;
    public final long d;
    public boolean e;

    public rim(w2w w2wVar, qim qimVar) {
        super("DialogPinnedMsgDetachLpTask");
        this.c = w2wVar;
        this.d = qimVar.a.b;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.e) {
            z300Var.g(this.d);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = sn.c(w2wVar).d.c;
        long j = this.d;
        com.vk.im.engine.models.dialogs.b d = dhl0Var.d(Long.valueOf(j));
        if ((d != null ? d.t : null) != null) {
            w2wVar.I0().b().e().w(j, null, false);
            this.e = true;
        }
    }
}
