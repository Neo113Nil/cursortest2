package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelNotificationsSettingsChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class g7b extends e500 {
    public final long c;
    public final long d;
    public final hhb e;

    public g7b(w2w w2wVar, Peer peer, long j) {
        super("ChannelNotificationsSettingsChangeLpTask");
        this.c = j;
        this.d = peer.b;
        this.e = new hhb(w2wVar, peer);
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        this.e.a(c400Var, f400Var);
        if (c400Var.a()) {
            return;
        }
        f400Var.k = true;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.d);
        z300Var.X = true;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        iz izVar = new iz(this, 15);
        hhb hhbVar = this.e;
        hhbVar.a.I0().u(new w95(hhbVar, izVar, c400Var, 2));
    }
}
