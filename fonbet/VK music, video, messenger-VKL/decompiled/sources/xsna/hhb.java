package xsna;

import com.vk.dto.common.Peer;
import java.util.LinkedHashMap;

/* compiled from: ChannelsLpTaskInteractor.kt */
/* loaded from: classes2.dex */
public final class hhb {
    public final w2w a;
    public final Peer b;
    public final long c;

    public hhb(w2w w2wVar, Peer peer) {
        this.a = w2wVar;
        this.b = peer;
        this.c = peer.b;
    }

    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.i;
        long j = this.c;
        p4g.a(Long.valueOf(j), f400Var.i, (linkedHashMap.containsKey(Long.valueOf(j)) || ((Boolean) this.a.I0().c(new fhb(j, this))).booleanValue()) ? false : true);
    }
}
