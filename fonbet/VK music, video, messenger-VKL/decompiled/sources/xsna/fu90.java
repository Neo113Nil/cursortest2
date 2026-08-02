package xsna;

import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PeersIdsByFolderIdGetCmd.kt */
/* loaded from: classes18.dex */
public final class fu90 extends le6<Set<? extends Long>> {
    public final int b;

    public fu90(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final Set<? extends Long> e(w2w w2wVar) {
        ArrayList h = w2wVar.I0().b().c().h(this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = h.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Long.valueOf(((Peer) it.next()).b));
        }
        return linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu90) && this.b == ((fu90) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("PeersIdsByFolderIdGetCmd(folderId="), this.b, ')');
    }
}
