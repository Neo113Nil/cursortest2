package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;

/* compiled from: OwnerBoundEvent.kt */
/* loaded from: classes.dex */
public abstract class q490 extends sxp {
    public Peer b;

    public q490() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.b = Peer.Unknown.e;
    }
}
