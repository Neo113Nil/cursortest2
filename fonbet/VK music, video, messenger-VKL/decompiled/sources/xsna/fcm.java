package xsna;

import com.vk.dto.common.Peer;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: DialogCnvReadTillForIncomingLpTask.kt */
/* loaded from: classes2.dex */
public final class fcm extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public final Integer f;
    public boolean g;

    public fcm(w2w w2wVar, Peer peer, int i, Integer num) {
        super("DialogCnvReadTillForIncomingLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
        this.f = num;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        if (this.f == null) {
            LinkedHashMap linkedHashMap = c400Var.d;
            Peer peer = this.d;
            long j = peer.b;
            long j2 = peer.b;
            if (linkedHashMap.containsKey(Long.valueOf(j))) {
                return;
            }
            p4g.a(Long.valueOf(j2), f400Var.c, !this.c.I0().o().y0(this.e, j2));
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.g) {
            z300Var.g(this.d.b);
        }
        long j = this.d.b;
        int i = this.e;
        if (z300Var.y == null) {
            z300Var.y = new HashMap();
        }
        z300Var.y.put(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.d;
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) linkedHashMap.get(Long.valueOf(peer.b));
        this.g = ((Boolean) new gjm(peer.b, Integer.valueOf(this.e), null, aVar != null ? Integer.valueOf(aVar.g) : this.f, 4).o(this.c)).booleanValue();
    }
}
