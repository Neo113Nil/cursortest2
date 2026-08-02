package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.Collections;
import java.util.List;

/* compiled from: ChannelPinCmd.kt */
/* loaded from: classes2.dex */
public final class j8b extends xl6<s3q0> {
    public final Peer b;

    public j8b(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-pin-unpin";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        boolean z;
        x7w x7wVar;
        uib a = w2wVar.I0().a();
        Peer peer = this.b;
        long j = peer.b;
        bdb c = a.c(j);
        boolean n = w2wVar.getExperiments().n();
        w2wVar.getConfig().getClass();
        int g = n ? w2wVar.I0().j().g() : a.e();
        if (n) {
            if (w2wVar.getExperiments().n()) {
                b5w b5wVar = new b5w(j, ImItemType.CHANNEL);
                sew sewVar = w2wVar.I0().j().c(Collections.singletonList(b5wVar)).get(b5wVar);
                if (sewVar == null || (x7wVar = sewVar.b) == null) {
                    x7wVar = x7w.f;
                }
                z = com.vk.im.engine.models.im_item.b.f(x7wVar);
            }
            z = false;
        } else {
            if (c != null && pli.j(c.k)) {
                z = true;
            }
            z = false;
        }
        if (z) {
            throw new IllegalArgumentException("Channel(peer " + peer + ") already pinned.");
        }
        if (g >= 5) {
            throw new IllegalStateException(tgw.b(g, "Max amount if pinned items reached. Count -> ", ". Limit -> 5"));
        }
        int i = g + 1;
        if (!n) {
            uib a2 = w2wVar.I0().a();
            a2.f(a2.e() + 1, j);
            xgl0 I0 = w2wVar.I0();
            List singletonList = Collections.singletonList(Long.valueOf(j));
        }
        w2wVar.O0().a(new k8b(i, peer));
        w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new r680(this, Collections.singleton(new b5w(j, ImItemType.CHANNEL))));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8b) && epx.f(this.b, ((j8b) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("ChannelPinCmd(peer="), this.b, ')');
    }
}
