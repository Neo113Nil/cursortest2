package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: MsgRequestStatusChangeForAllCmd.kt */
/* loaded from: classes2.dex */
public final class zv30 extends xl6<s3q0> {
    public final MsgRequestStatus b;

    public zv30(MsgRequestStatus msgRequestStatus) {
        this.b = msgRequestStatus;
    }

    @Override // xsna.m2w
    public final String a() {
        return "msg-request-change-status-cmd";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        DialogsHistory dialogsHistory = (DialogsHistory) w2wVar.J0(this, new lrm(new drm(gkx0.e, DialogsFilter.REQUESTS, 10, Source.CACHE, false, (Object) null, "MsgRequestStatusChangeForAllCmd "))).await();
        boolean z = (dialogsHistory.m() || (dialogsHistory.u() || dialogsHistory.t())) ? false : true;
        Iterable r = z ? dialogsHistory.r() : EmptyList.b;
        hpm c = sn.c(w2wVar);
        MsgRequestStatus msgRequestStatus = MsgRequestStatus.PENDING;
        c.getClass();
        fl3.J(c.b.b().d("SELECT COUNT(1) FROM dialogs WHERE msg_request_status_desired = " + msgRequestStatus.j(), null)).intValue();
        if (z) {
            Iterable iterable = r;
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList.add(Peer.a.b(longValue));
            }
            w2wVar.b1(this, new yv30((List) arrayList, this.b, false));
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            while (fl3.J(sn.c(w2wVar).b.b().d("SELECT COUNT(1) FROM dialogs WHERE msg_request_status_pending IS NOT NULL", null)).intValue() > 0) {
                Thread.sleep(500L);
            }
            bz2.c(new jg20(), null);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv30) && this.b == ((zv30) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b(qoy.b(this.b.hashCode() * 31, 31, false), 31, false);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MsgRequestStatusChangeForAllCmd(status=" + this.b + ", isSpam=false, awaitNetwork=false, changerTag=null)";
    }
}
