package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: HintMembersUpdateCmd.kt */
/* loaded from: classes2.dex */
public final class y6v extends le6<s3q0> {
    public final List<Peer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public y6v(List<? extends Peer> list) {
        this.b = list;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Iterable iterable = (Iterable) w2wVar.L0(this, new f7v(5, Source.CACHE));
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((qtd0) it.next()).B7());
        }
        if (p4g.b(arrayList, this.b)) {
            w2wVar.L0(this, new f7v(5, Source.NETWORK));
            w2wVar.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6v) && epx.f(this.b, ((y6v) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ms9.a(')', new StringBuilder("HintMembersUpdateCmd(members="), this.b);
    }
}
