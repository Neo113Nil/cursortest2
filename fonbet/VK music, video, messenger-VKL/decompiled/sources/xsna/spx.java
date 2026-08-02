package xsna;

import android.util.ArraySet;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.instantjobs.InstantJob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.u6x;

/* compiled from: InvalidateMsgsWithDonutAttachesJob.kt */
/* loaded from: classes.dex */
public final class spx extends u4w {
    public static final List<Integer> d = e43.l(1, 23, 21);
    public final UserId c;

    /* compiled from: InvalidateMsgsWithDonutAttachesJob.kt */
    public static final class a implements s7x<spx> {
        @Override // xsna.s7x
        public final spx a(ny90 ny90Var) {
            return new spx(new UserId(ny90Var.e("ownerId")));
        }

        @Override // xsna.s7x
        public final void b(spx spxVar, ny90 ny90Var) {
            ny90Var.n("ownerId", spxVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "InvalidateMsgsWithDonutAttachesJob";
        }
    }

    public spx(UserId userId) {
        this.c = userId;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        d040 o = w2wVar.I0().o();
        List<Integer> list = d;
        UserId userId = this.c;
        ArraySet Z = o.Z(userId, list);
        if (!Z.isEmpty()) {
            w2wVar.L0(this, new dj30(MsgIdType.LOCAL_ID, Z, null, Source.NETWORK, true, "InvalidateMsgsWithDonutAttachesJob", 4));
        }
        Collection H = w2wVar.I0().b().e().H(userId, list);
        if (H.isEmpty()) {
            return;
        }
        Collection collection = H;
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        w2wVar.J0(this, new tqm(new sqm(arrayList, Source.NETWORK, true, "InvalidateMsgsWithDonutAttachesJob", 0, 16))).await();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spx) && epx.f(this.c, ((spx) obj).c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b);
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
        return "InvalidateMsgsWithDonutAttachesJob";
    }

    public final String toString() {
        return gp.b(new StringBuilder("InvalidateMsgsWithDonutAttachesJob(attachOwnerId="), this.c, ')');
    }
}
