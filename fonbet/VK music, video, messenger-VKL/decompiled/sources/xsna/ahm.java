package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: DialogMemberAddLpTask.kt */
/* loaded from: classes2.dex */
public final class ahm extends e500 {
    public final w2w c;
    public final Peer d;
    public final Peer e;
    public final long f;

    public ahm(w2w w2wVar, Peer peer, Peer peer2) {
        super("DialogMemberAddLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = peer2;
        this.f = peer.b;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        qs20 qs20Var = new qs20(this.c);
        Peer peer = this.e;
        qs20Var.a(peer, c400Var, f400Var);
        LinkedHashMap linkedHashMap = c400Var.g;
        long j = this.f;
        ohm ohmVar = (ohm) linkedHashMap.get(Long.valueOf(j));
        if ((ohmVar != null ? ohmVar.a(peer) : null) == null) {
            long j2 = peer.b;
            LinkedHashMap linkedHashMap2 = f400Var.b;
            Long valueOf = Long.valueOf(j);
            Object obj = linkedHashMap2.get(valueOf);
            if (obj == null) {
                obj = new HashSet();
                linkedHashMap2.put(valueOf, obj);
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
        ohm ohmVar = (ohm) c400Var.g.get(Long.valueOf(this.f));
        Peer peer = this.e;
        DialogMember a = ohmVar != null ? ohmVar.a(peer) : null;
        if (a != null) {
            new bhm(this.d, peer, a).o(this.c);
            return;
        }
        throw new IllegalArgumentException(("Dialog member " + peer + " was not loaded").toString());
    }
}
