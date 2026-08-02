package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;

/* compiled from: ChannelHistoryStorageEvents.kt */
/* loaded from: classes16.dex */
public final class f0b implements r8v {
    public final long a;
    public final boolean b;
    public final a1w c;

    public f0b(long j, a1w a1wVar, boolean z) {
        this.a = j;
        this.b = z;
        this.c = a1wVar;
    }

    @Override // xsna.r8v
    public final void a(gj30 gj30Var) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.c.D(this, new w7q0(Peer.a.b(this.a), gj30Var.k(), this.b));
    }
}
