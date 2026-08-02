package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.channels.ChannelsCounters;
import java.util.Collections;

/* compiled from: ChannelUnarchiveLpTask.kt */
/* loaded from: classes2.dex */
public final class qdb extends e500 {
    public final w2w c;
    public final long d;
    public final lkb e;
    public final h6o0 f;

    public qdb(w2w w2wVar, Peer peer) {
        super("ChannelUnarchiveLpTask");
        this.c = w2wVar;
        this.d = peer.b;
        this.e = new lkb(w2wVar, peer, false, false);
        this.f = new h6o0(w2wVar);
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        this.e.a(c400Var, f400Var);
        uib a = this.c.I0().a();
        ChannelsCounters.Type type = ChannelsCounters.Type.ARCHIVED;
        com.vk.im.engine.models.channels.a aVar = a.k(Collections.singletonList(type)).get(type);
        if (aVar == null || aVar.b != 1 || c400Var.a()) {
            return;
        }
        f400Var.k = true;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.b = Boolean.TRUE;
        z300Var.c(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.e.b(c400Var, new iz(this, 17));
    }
}
