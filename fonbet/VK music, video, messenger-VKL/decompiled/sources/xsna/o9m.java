package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: DialogAdminRemoveLpTask.kt */
/* loaded from: classes2.dex */
public final class o9m extends e500 {
    public final w2w c;
    public final Peer d;
    public final long e;
    public final Peer f;

    public o9m(w2w w2wVar, n9m n9mVar) {
        super("DialogAdminRemoveLpTask");
        this.c = w2wVar;
        Peer peer = n9mVar.a;
        this.d = peer;
        this.e = peer.b;
        this.f = n9mVar.b;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashSet linkedHashSet = f400Var.c;
        long j = this.e;
        Long valueOf = Long.valueOf(j);
        boolean containsKey = c400Var.d.containsKey(Long.valueOf(j));
        Peer peer = this.f;
        w2w w2wVar = this.c;
        p4g.a(valueOf, linkedHashSet, !containsKey && epx.f(peer, w2wVar.H0()));
        new qs20(w2wVar).a(peer, c400Var, f400Var);
        if (peer.d != w2wVar.H0().d) {
            ohm ohmVar = (ohm) c400Var.g.get(Long.valueOf(j));
            if ((ohmVar != null ? ohmVar.a(peer) : null) == null) {
                long j2 = peer.b;
                LinkedHashMap linkedHashMap = f400Var.b;
                Long valueOf2 = Long.valueOf(j);
                Object obj = linkedHashMap.get(valueOf2);
                if (obj == null) {
                    obj = new HashSet();
                    linkedHashMap.put(valueOf2, obj);
                }
                ((Set) obj).add(Long.valueOf(j2));
            }
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.e);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        hpm c = sn.c(w2wVar);
        dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = c.c;
        long j = this.e;
        Long valueOf = Long.valueOf(j);
        Peer peer = this.f;
        dhl0Var.a(valueOf, new k7f(peer, 9), new mre(c, 14));
        c.r(j, peer, false);
        if (peer.d == w2wVar.H0().d) {
            hpm e = w2wVar.I0().b().e();
            e.e0(j);
            e.g0(j);
        }
        ohm ohmVar = (ohm) c400Var.g.get(Long.valueOf(j));
        DialogMember a = ohmVar != null ? ohmVar.a(peer) : null;
        if (a != null) {
            new bhm(this.d, peer, a).o(w2wVar);
        }
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) c400Var.d.get(Long.valueOf(j));
        if (aVar != null) {
            new wfm(aVar, null).o(w2wVar);
        }
    }
}
