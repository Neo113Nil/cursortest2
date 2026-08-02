package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelUnarchiveCmd.kt */
/* loaded from: classes2.dex */
public final class odb extends xl6<s3q0> {
    public final List<Peer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public odb(List<? extends Peer> list) {
        this.b = list;
    }

    @Override // xsna.m2w
    public final String a() {
        return defpackage.k0.a(((Peer) j5g.Y(this.b)).b, "im-dialog-archive-unarchive-");
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        List<Peer> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).b));
        }
        List<Long> A = rli0.A(new ulp0(rli0.j(new i5g(w2wVar.I0().a().d(arrayList).values()), new k60(11)), new n82(8)));
        if (!A.isEmpty()) {
            new h6o0(w2wVar).d(A, false);
            w2wVar.S0().a(A);
            w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
            w2wVar.e1(this, new q280(A));
            List<Long> list2 = A;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                long longValue = ((Number) it2.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList2.add(Peer.a.b(longValue));
            }
            w2wVar.O0().a(new pdb(arrayList2));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odb) && epx.f(this.b, ((odb) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ms9.a(')', new StringBuilder("ChannelUnarchiveCmd(peers="), this.b);
    }
}
