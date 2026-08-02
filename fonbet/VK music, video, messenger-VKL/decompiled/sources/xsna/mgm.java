package xsna;

import com.vk.dto.common.Peer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: DialogLeaveLpTask.kt */
/* loaded from: classes2.dex */
public final class mgm extends e500 {
    public final w2w c;
    public final Peer d;

    public mgm(w2w w2wVar, Peer peer) {
        super("DialogLeaveLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashSet linkedHashSet = f400Var.c;
        Peer peer = this.d;
        Long valueOf = Long.valueOf(peer.b);
        LinkedHashMap linkedHashMap = c400Var.d;
        long j = peer.b;
        p4g.a(valueOf, linkedHashSet, !linkedHashMap.containsKey(Long.valueOf(j)));
        f400Var.n.remove(Long.valueOf(j));
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
        z300Var.a = Boolean.TRUE;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Peer peer = this.d;
        long j = peer.b;
        w2w w2wVar = this.c;
        new ghm(j, w2wVar.H0(), true).o(w2wVar);
        new wfm((com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(peer.b), c400Var.d), null).o(w2wVar);
    }
}
