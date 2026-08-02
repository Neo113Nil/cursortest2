package xsna;

import com.vk.dto.common.EntitySyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g1e0;

/* compiled from: FriendsMutualGetCmd.kt */
/* loaded from: classes2.dex */
public final class frs extends le6<ers> {
    public final Peer b;
    public final List<Source> c;
    public final int d = 3;
    public final boolean e;

    public frs(Peer peer, List list, boolean z) {
        this.b = peer;
        this.c = list;
        this.e = z;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("No sources are specified");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r3 == com.vk.dto.common.EntitySyncState.EXPIRED) goto L18;
     */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ers e(w2w w2wVar) {
        ers ersVar;
        ProfilesInfo g;
        Peer peer = this.b;
        peer.getClass();
        if (!peer.Ab(Peer.Type.USER) && !peer.Ab(Peer.Type.GROUP)) {
            return new ers(EmptyList.b, EntitySyncState.ACTUAL, 0L, false, new ProfilesInfo(), 32, 0);
        }
        List<Source> list = this.c;
        Source source = Source.CACHE;
        if (p4g.c(list, source)) {
            ersVar = (ers) w2wVar.L0(this, new grs(peer));
        } else if (p4g.c(list, Source.ACTUAL)) {
            ersVar = (ers) w2wVar.L0(this, new grs(peer));
            EntitySyncState entitySyncState = ersVar.b;
            entitySyncState.getClass();
            if (entitySyncState != EntitySyncState.MISSED) {
                entitySyncState.getClass();
            }
            ersVar = f(w2wVar);
        } else if (p4g.c(list, Source.NETWORK)) {
            ersVar = f(w2wVar);
        } else {
            ersVar = (ers) w2wVar.L0(this, new grs(peer));
            EntitySyncState entitySyncState2 = ersVar.b;
            entitySyncState2.getClass();
            if (entitySyncState2 == EntitySyncState.MISSED) {
                ersVar = f(w2wVar);
            }
        }
        ers a = ers.a(ersVar, j5g.H0(ersVar.a, this.d), null, ersVar.a.size(), 30);
        List<Peer> list2 = a.a;
        if (p4g.c(list, source)) {
            g = g(source, list2, w2wVar);
        } else {
            Source source2 = Source.ACTUAL;
            if (p4g.c(list, source2)) {
                g = g(source2, list2, w2wVar);
            } else {
                Source source3 = Source.NETWORK;
                if (p4g.c(list, source3)) {
                    g = g(source3, list2, w2wVar);
                } else {
                    List<Peer> list3 = list2;
                    ProfilesInfo g2 = g(source, list3, w2wVar);
                    g = g2.Fb() ? g(source2, list3, w2wVar) : g2;
                }
            }
        }
        return ers.a(a, null, g, 0, 47);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frs)) {
            return false;
        }
        frs frsVar = (frs) obj;
        return epx.f(this.b, frsVar.b) && epx.f(this.c, frsVar.c) && this.d == frsVar.d && this.e == frsVar.e;
    }

    public final ers f(w2w w2wVar) {
        return (ers) w2wVar.J0(this, new hrs(this.b, this.e)).await();
    }

    public final ProfilesInfo g(Source source, List list, w2w w2wVar) {
        g1e0.a aVar = new g1e0.a();
        aVar.h(list);
        aVar.b = source;
        aVar.c = this.e;
        return (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, fw3.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsMutualGetCmd(targetPeer=");
        sb.append(this.b);
        sb.append(", sources=");
        sb.append(this.c);
        sb.append(", limit=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
