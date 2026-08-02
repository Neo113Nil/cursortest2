package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: DialogReturnLpTask.kt */
/* loaded from: classes2.dex */
public final class ojm extends e500 {
    public final w2w c;
    public final Peer d;

    public ojm(w2w w2wVar, Peer peer) {
        super("DialogReturnLpTask");
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
        Peer H0 = this.c.H0();
        ohm ohmVar = (ohm) c400Var.g.get(Long.valueOf(j));
        if ((ohmVar != null ? ohmVar.a(H0) : null) == null) {
            long j2 = H0.b;
            LinkedHashMap linkedHashMap2 = f400Var.b;
            Long valueOf2 = Long.valueOf(j);
            Object obj = linkedHashMap2.get(valueOf2);
            if (obj == null) {
                obj = new HashSet();
                linkedHashMap2.put(valueOf2, obj);
            }
            ((Set) obj).add(Long.valueOf(j2));
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        hpm c = sn.c(w2wVar);
        Peer peer = this.d;
        c.e0(peer.b);
        long j = peer.b;
        c.g0(j);
        ohm ohmVar = (ohm) c400Var.g.get(Long.valueOf(j));
        DialogMember a = ohmVar != null ? ohmVar.a(w2wVar.H0()) : null;
        if (a != null) {
            new bhm(peer, w2wVar.H0(), a).o(w2wVar);
            new wfm((com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(j), c400Var.d), null).o(w2wVar);
        } else {
            throw new IllegalArgumentException(("Dialog member " + w2wVar.H0() + " was not loaded").toString());
        }
    }
}
