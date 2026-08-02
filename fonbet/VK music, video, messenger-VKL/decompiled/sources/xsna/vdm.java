package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogFullUpdateLpTask.kt */
/* loaded from: classes2.dex */
public final class vdm extends e500 {
    public final w2w c;
    public final Peer d;

    public vdm(w2w w2wVar, Peer peer) {
        super("DialogFullUpdateLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        p4g.a(Long.valueOf(this.d.b), f400Var.c, !c400Var.d.containsKey(Long.valueOf(r0.b)));
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        new wfm((com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(this.d.b), c400Var.d), null).o(this.c);
    }
}
