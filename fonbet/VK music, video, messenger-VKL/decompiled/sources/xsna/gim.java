package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.contacts.Contact;
import java.util.Collections;
import java.util.List;
import xsna.it80;

/* compiled from: DialogPeerGetByContactCachedOrNetworkCmd.kt */
/* loaded from: classes2.dex */
public final class gim extends le6<it80<Peer>> {
    public final long b;
    public final dvf0 c;

    public gim(long j, dvf0 dvf0Var) {
        this.b = j;
        this.c = dvf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final it80<Peer> e(w2w w2wVar) {
        Peer peer;
        Long l;
        Long l2;
        long j = this.b;
        List singletonList = Collections.singletonList(Long.valueOf(j));
        Source source = Source.CACHE;
        dvf0 dvf0Var = this.c;
        Contact contact = (Contact) ((wpp) w2wVar.L0(this, new abj(singletonList, source, false, dvf0Var))).e(Long.valueOf(j)).b;
        Peer peer2 = null;
        if (contact == null || (l2 = contact.j) == null) {
            peer = null;
        } else {
            long longValue = l2.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.a.b(longValue);
        }
        if (peer != null) {
            it80.b.getClass();
            return new it80<>(peer);
        }
        Contact contact2 = (Contact) ((wpp) w2wVar.L0(this, new abj(Collections.singletonList(Long.valueOf(j)), Source.NETWORK, false, dvf0Var))).e(Long.valueOf(j)).b;
        it80.a aVar = it80.b;
        if (contact2 != null && (l = contact2.j) != null) {
            long longValue2 = l.longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            peer2 = Peer.a.b(longValue2);
        }
        aVar.getClass();
        return new it80<>(peer2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gim)) {
            return false;
        }
        gim gimVar = (gim) obj;
        return this.b == gimVar.b && epx.f(this.c, gimVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b) * 31, 31, false);
        dvf0 dvf0Var = this.c;
        return b + (dvf0Var != null ? dvf0Var.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogPeerGetByContactCachedOrNetworkCmd(contactId=" + this.b + ", awaitNetwork=false, changerTag=" + this.c + ')';
    }
}
