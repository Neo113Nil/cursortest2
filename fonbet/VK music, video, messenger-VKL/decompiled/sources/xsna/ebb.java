package xsna;

import com.vk.dto.common.Peer;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: ChannelReadTillAndUnreadCountLpTask.kt */
/* loaded from: classes2.dex */
public final class ebb extends e500 {
    public final Peer c;
    public final int d;
    public final Integer e;
    public final long f;
    public final hhb g;

    public ebb(w2w w2wVar, Peer peer, int i, Integer num) {
        super("ChannelReadTillAndUnreadCountLpTask");
        this.c = peer;
        this.d = i;
        this.e = num;
        this.f = peer.b;
        this.g = new hhb(w2wVar, peer);
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.i;
        hhb hhbVar = this.g;
        final long j = hhbVar.c;
        p4g.a(Long.valueOf(j), f400Var.i, (linkedHashMap.containsKey(Long.valueOf(j)) || ((Boolean) hhbVar.a.I0().c(new izs() { // from class: xsna.ghb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((xgl0) obj).a().p(j) != null);
            }
        })).booleanValue()) ? false : true);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.f);
        long j = this.f;
        int i = this.d;
        if (z300Var.U == null) {
            z300Var.U = new HashMap();
        }
        z300Var.U.put(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        com.vk.movika.sdk.base.observable.m mVar = new com.vk.movika.sdk.base.observable.m(this, 19);
        hhb hhbVar = this.g;
        hhbVar.a.I0().u(new w95(hhbVar, mVar, c400Var, 2));
    }
}
