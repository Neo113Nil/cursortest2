package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.dialogs.DialogsCounters;

/* compiled from: DialogMsgRequestValueChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class zhm extends e500 {
    public final w2w c;
    public final Peer d;
    public final MsgRequestStatus e;

    public zhm(w2w w2wVar, Peer peer, MsgRequestStatus msgRequestStatus) {
        super("DialogMsgRequestValueChangeLpTask(d=" + f9t.K(peer.b) + ",s=" + msgRequestStatus.j());
        this.c = w2wVar;
        this.d = peer;
        this.e = msgRequestStatus;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        p4g.a(Long.valueOf(this.d.b), f400Var.c, !c400Var.d.containsKey(Long.valueOf(r0.b)));
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (o25.b(o25.a())) {
            return;
        }
        z300Var.f(DialogsCounters.Type.REQUESTS, 0);
        z300Var.g(this.d.b);
        if (this.e == MsgRequestStatus.PENDING) {
            long j = this.d.b;
            if (z300Var.A == null) {
                z300Var.A = new ArraySet();
            }
            z300Var.A.add(Long.valueOf(j));
            return;
        }
        long j2 = this.d.b;
        if (z300Var.B == null) {
            z300Var.B = new ArraySet();
        }
        z300Var.B.add(Long.valueOf(j2));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        if (o25.b(o25.a())) {
            return;
        }
        this.c.I0().u(new eaa(9, (com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(this.d.b), c400Var.d), this));
    }
}
