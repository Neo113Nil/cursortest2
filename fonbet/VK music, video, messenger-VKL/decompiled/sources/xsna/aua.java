package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelArchiveCmd.kt */
/* loaded from: classes2.dex */
public final class aua extends xl6<s3q0> {
    public final List<Peer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public aua(List<? extends Peer> list) {
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
        List A = rli0.A(new ulp0(rli0.l(new i5g(w2wVar.I0().a().d(arrayList).values()), new xr0(7)), new sd4(5)));
        if (!A.isEmpty()) {
            new h6o0(w2wVar).d(arrayList, true);
            w2wVar.S0().a(arrayList);
            w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
            w2wVar.e1(this, new h280(arrayList));
            List list2 = A;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                long longValue = ((Number) it2.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList2.add(Peer.a.b(longValue));
            }
            w2wVar.O0().a(new eua(arrayList2));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aua) && epx.f(this.b, ((aua) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ms9.a(')', new StringBuilder("ChannelArchiveCmd(peers="), this.b);
    }
}
