package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.instantjobs.InstantJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.hfr;
import xsna.u6x;

/* compiled from: InvalidateMsgsWithAttachesJob.kt */
/* loaded from: classes.dex */
public final class qpx extends u4w {
    public final long c;
    public final UserId d;
    public final int e;

    /* compiled from: InvalidateMsgsWithAttachesJob.kt */
    public static final class a implements s7x<qpx> {
        @Override // xsna.s7x
        public final qpx a(ny90 ny90Var) {
            return new qpx(new UserId(ny90Var.e("ownerId")), ny90Var.e("id"), ny90Var.c("type"));
        }

        @Override // xsna.s7x
        public final void b(qpx qpxVar, ny90 ny90Var) {
            qpx qpxVar2 = qpxVar;
            ny90Var.n("id", qpxVar2.c);
            ny90Var.n("ownerId", qpxVar2.d.b);
            ny90Var.l("type", qpxVar2.e);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "InvalidateMsgsWithAttachesJob";
        }
    }

    public qpx(UserId userId, long j, int i) {
        this.c = j;
        this.d = userId;
        this.e = i;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Q(w2wVar, false);
        Q(w2wVar, true);
        d040 o = w2wVar.I0().o();
        long j = this.c;
        Long valueOf = Long.valueOf(j);
        int i = this.e;
        UserId userId = this.d;
        List<Msg> k0 = o.k0(i, userId, valueOf);
        if (!k0.isEmpty()) {
            MsgIdType msgIdType = MsgIdType.LOCAL_ID;
            List<Msg> list = k0;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Msg) it.next()).xb()));
            }
            w2wVar.L0(this, new dj30(msgIdType, arrayList, null, Source.NETWORK, true, "InvalidateMsgsWithAttachesJob", 4));
        }
        List G = w2wVar.I0().b().e().G(userId, j, i);
        if (G.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(G, 10));
        Iterator it2 = G.iterator();
        while (it2.hasNext()) {
            long longValue = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(longValue));
        }
        w2wVar.J0(this, new tqm(new sqm(arrayList2, Source.NETWORK, true, "InvalidateMsgsWithAttachesJob", 0, 16))).await();
    }

    public final void Q(w2w w2wVar, boolean z) {
        xgl0 I0 = w2wVar.I0();
        List<Msg> g = (z ? I0.e() : I0.y()).g(this.e, this.d, Long.valueOf(this.c));
        if (((ArrayList) g).isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : g) {
            Long valueOf = Long.valueOf(((Msg) obj).y());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Msg) it.next()).xb()));
            }
            linkedHashMap2.put(key, arrayList);
        }
        hfr.a aVar = new hfr.a(rli0.j(rn00.w(linkedHashMap2), new f6w(2)));
        while (aVar.hasNext()) {
            Map.Entry entry2 = (Map.Entry) aVar.next();
            w2wVar.L0(this, new n2b(((Number) entry2.getKey()).longValue(), (List) entry2.getValue(), MsgIdType.LOCAL_ID, Source.NETWORK, true, z));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpx)) {
            return false;
        }
        qpx qpxVar = (qpx) obj;
        return this.c == qpxVar.c && epx.f(this.d, qpxVar.d) && this.e == qpxVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + bh10.a(Long.hashCode(this.c) * 31, 31, this.d.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "msg-attaches-updates";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "InvalidateMsgsWithAttachesJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvalidateMsgsWithAttachesJob(attachId=");
        sb.append(this.c);
        sb.append(", attachOwnerId=");
        sb.append(this.d);
        sb.append(", attachType=");
        return vu5.b(sb, this.e, ')');
    }
}
