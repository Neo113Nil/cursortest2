package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.Collections;
import java.util.List;

/* compiled from: ChannelUnpinCmd.kt */
/* loaded from: classes2.dex */
public final class sdb extends xl6<s3q0> {
    public final Peer b;

    public sdb(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-pin-unpin";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        boolean j;
        x7w x7wVar;
        uib a = w2wVar.I0().a();
        Peer peer = this.b;
        long j2 = peer.b;
        bdb c = a.c(j2);
        if (c == null) {
            throw new IllegalArgumentException("Channel(peer=" + peer + ") not found");
        }
        aeb aebVar = c.k;
        long j3 = c.b;
        boolean n = w2wVar.getExperiments().n();
        boolean z = false;
        if (!n) {
            j = pli.j(aebVar);
        } else if (w2wVar.getExperiments().n()) {
            b5w b5wVar = new b5w(j2, ImItemType.CHANNEL);
            sew sewVar = w2wVar.I0().j().c(Collections.singletonList(b5wVar)).get(b5wVar);
            if (sewVar == null || (x7wVar = sewVar.b) == null) {
                x7wVar = x7w.f;
            }
            j = com.vk.im.engine.models.im_item.b.f(x7wVar);
        } else {
            j = false;
        }
        if (!j) {
            throw new IllegalArgumentException("Channel(peer=" + peer + ") must be pinned");
        }
        if (!n) {
            w2wVar.I0().a().f(0, j3);
            xgl0 I0 = w2wVar.I0();
            List singletonList = Collections.singletonList(Long.valueOf(j3));
            w2wVar.I0().u(new bm1(pli.k(aebVar).b.h(), 1));
        }
        w2wVar.O0().a(new tdb(peer));
        w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new r680(this, Collections.singleton(new b5w(j2, ImItemType.CHANNEL))));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdb) && epx.f(this.b, ((sdb) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("ChannelUnpinCmd(peer="), this.b, ')');
    }
}
