package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: FoldersByDialogGetCmd.kt */
/* loaded from: classes18.dex */
public final class j0s extends le6<Map<Peer, ? extends Collection<? extends Integer>>> {
    public final Collection<Peer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public j0s(Collection<? extends Peer> collection) {
        this.b = collection;
    }

    @Override // xsna.le6
    public final Map<Peer, ? extends Collection<? extends Integer>> e(w2w w2wVar) {
        pdm c = w2wVar.I0().b().c();
        Collection<Peer> collection = this.b;
        int e = on00.e(c5g.u(collection, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : collection) {
            long j = ((Peer) obj).b;
            c.getClass();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b = Peer.a.b(j);
            linkedHashMap.put(obj, j5g.u0(c.l().a(c.g().a(b)), c.d().b(b)));
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0s) && epx.f(this.b, ((j0s) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return l4.h(new StringBuilder("FoldersByDialogGetCmd(peers="), this.b, ')');
    }
}
