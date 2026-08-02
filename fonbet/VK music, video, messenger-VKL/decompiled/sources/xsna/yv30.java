package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MsgRequestStatusChangeCmd.kt */
/* loaded from: classes2.dex */
public final class yv30 extends xl6<Integer> {
    public final List<Peer> b;
    public final MsgRequestStatus c;
    public final boolean d;

    public yv30(Peer peer, MsgRequestStatus msgRequestStatus, boolean z) {
        this(Collections.singletonList(peer), msgRequestStatus, z);
    }

    @Override // xsna.m2w
    public final String a() {
        return "msg-request-change-status-cmd";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        List<Peer> list = this.b;
        if (list.isEmpty()) {
            return Integer.valueOf(f(w2wVar));
        }
        w2wVar.O0().b("change msg request status", new c230(this, 1));
        boolean b = o25.b(o25.a());
        MsgRequestStatus msgRequestStatus = this.c;
        if (!b) {
            hpm c = sn.c(w2wVar);
            List<Peer> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((Peer) it.next()).b));
            }
            c.u(arrayList, msgRequestStatus);
        }
        List<Peer> list3 = list;
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            w2wVar.O0().a(new sv30((Peer) it2.next(), msgRequestStatus, this.d, b));
        }
        bzp S0 = w2wVar.S0();
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((Peer) it3.next()).b));
        }
        S0.n(null, arrayList2);
        return Integer.valueOf(f(w2wVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv30)) {
            return false;
        }
        yv30 yv30Var = (yv30) obj;
        return epx.f(this.b, yv30Var.b) && this.c == yv30Var.c && this.d == yv30Var.d;
    }

    public final int f(w2w w2wVar) {
        DialogsCounters.a aVar = ((DialogsCounters) w2wVar.J0(this, new gnm(2, Source.CACHE)).await()).e;
        qcy<Object> qcyVar = DialogsCounters.i[4];
        Integer num = (Integer) aVar.a().a();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgRequestStatusChangeCmd(dialogs=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", isSpam=");
        return n23.b(sb, this.d, ", changerTag=null)");
    }

    public yv30(List list, MsgRequestStatus msgRequestStatus, boolean z) {
        this.b = list;
        this.c = msgRequestStatus;
        this.d = z;
    }
}
