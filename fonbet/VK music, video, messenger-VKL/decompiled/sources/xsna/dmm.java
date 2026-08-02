package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DialogUnpinCmd.kt */
/* loaded from: classes2.dex */
public final class dmm extends xl6<s3q0> {
    public final Peer b;

    public dmm(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-pin-unpin";
    }

    @Override // xsna.le6
    public final Object e(final w2w w2wVar) {
        boolean i;
        x7w x7wVar;
        hpm c = sn.c(w2wVar);
        Peer peer = this.b;
        long j = peer.b;
        com.vk.im.engine.models.dialogs.b c2 = c.c(j);
        if (c2 == null) {
            throw new IllegalArgumentException("Dialog(peer=" + peer + ") not found");
        }
        boolean n = w2wVar.getExperiments().n();
        if (n) {
            b5w b5wVar = new b5w(j, ImItemType.DIALOG);
            sew sewVar = w2wVar.I0().j().c(Collections.singletonList(b5wVar)).get(b5wVar);
            if (sewVar == null || (x7wVar = sewVar.b) == null) {
                x7wVar = x7w.f;
            }
            i = com.vk.im.engine.models.im_item.b.f(x7wVar);
        } else {
            vjm vjmVar = c2.e;
            if (vjmVar == null) {
                vjmVar = c2.d;
            }
            i = vjmVar.i();
        }
        if (!i) {
            throw new IllegalArgumentException("Dialog(peer=" + peer + ") must be pinned");
        }
        if (!n) {
            long j2 = c2.b;
            w2wVar.I0().b().e().f(0, j2);
            xgl0 I0 = w2wVar.I0();
            final int b = c2.b();
            final ArrayList g = zik0.g(w2wVar.I0().b().e().T());
            L.c("DialogMissedIssue", new r5i(g, 5));
            final ArrayList arrayList = new ArrayList(g.size());
            w2wVar.I0().u(new izs() { // from class: xsna.cmm
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    xgl0 xgl0Var = (xgl0) obj;
                    Iterator it = g.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        ArrayList arrayList2 = arrayList;
                        if (!hasNext) {
                            return (Map) xgl0Var.u(new mmm(xgl0Var, arrayList2, false, 0));
                        }
                        com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) it.next();
                        int b2 = bVar.b();
                        long j3 = bVar.b;
                        if (b2 >= b) {
                            sn.c(w2wVar).f(b2 - 1, j3);
                            arrayList2.add(Long.valueOf(j3));
                        }
                    }
                }
            });
        }
        w2wVar.O0().a(new emm(peer));
        w2wVar.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new q480(this, peer));
        w2wVar.e1(this, new r680(this, Collections.singleton(new b5w(j, ImItemType.DIALOG))));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmm) && epx.f(this.b, ((dmm) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("DialogUnpinCmd(peer="), this.b, ')');
    }
}
