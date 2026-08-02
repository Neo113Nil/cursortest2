package xsna;

import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.PinnedMsg;

/* compiled from: DialogPinnedMsgAttachLpTask.kt */
/* loaded from: classes2.dex */
public final class oim extends e500 {
    public final w2w c;
    public final long d;
    public final int e;

    public oim(w2w w2wVar, nim nimVar) {
        super("DialogPinnedMsgAttachLpTask");
        this.c = w2wVar;
        this.d = nimVar.a.b;
        this.e = nimVar.b;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        d040 o = this.c.I0().o();
        int i = this.e;
        long j = this.d;
        if (o.y0(i, j)) {
            return;
        }
        p4g.a(Long.valueOf(j), f400Var.c, !c400Var.d.containsKey(Long.valueOf(j)));
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        d040 o = w2wVar.I0().o();
        int i = this.e;
        long j = this.d;
        Msg t0 = o.t0(i, j);
        if (!(t0 instanceof MsgFromUser)) {
            new wfm((com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(j), c400Var.d), null).o(w2wVar);
            return;
        }
        boolean X = w2wVar.I0().b().e().X(t0.d, j);
        boolean z = !X;
        PinnedMsg Bb = new PinnedMsg((MsgFromUser) t0).Bb(new vfm(1, w2wVar));
        hpm c = sn.c(w2wVar);
        if (X) {
            c.x(Bb, j);
        } else {
            c.w(j, Bb, z);
        }
    }
}
