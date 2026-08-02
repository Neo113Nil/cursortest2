package xsna;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import xsna.b5w;
import xsna.u6x;

/* compiled from: ChannelPinJob.kt */
/* loaded from: classes.dex */
public final class k8b extends u4w {
    public final Peer c;
    public final int d;

    /* compiled from: ChannelPinJob.kt */
    public static final class a implements s7x<k8b> {
        @Override // xsna.s7x
        public final k8b a(ny90 ny90Var) {
            int c = ny90Var.g(X3.i.L) ? ny90Var.c(X3.i.L) : -1;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new k8b(c, Peer.a.b(ny90Var.e("channel_id")));
        }

        @Override // xsna.s7x
        public final void b(k8b k8bVar, ny90 ny90Var) {
            k8b k8bVar2 = k8bVar;
            ny90Var.n("channel_id", k8bVar2.c.b);
            ny90Var.l(X3.i.L, k8bVar2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelPinJob";
        }
    }

    public k8b(int i, Peer peer) {
        this.c = peer;
        this.d = i;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        boolean n = w2wVar.getExperiments().n();
        Peer peer = this.c;
        if (!n) {
            bz2.l(nib.a(sd9.d(), com.vk.dto.common.a.b(peer)), true);
            return;
        }
        bz2.l(nib.a(sd9.d(), com.vk.dto.common.a.b(peer)), true);
        w2wVar.I0().u(new bp7(2, w2wVar, this));
        w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new r680(this, Collections.singleton(b5w.a.a(peer.b))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8b)) {
            return false;
        }
        k8b k8bVar = (k8b) obj;
        return epx.f(this.c, k8bVar.c) && this.d == k8bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Long.hashCode(this.c.b) * 31);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.p(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ChannelPinJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelPinJob(peer=");
        sb.append(this.c);
        sb.append(", position=");
        return vu5.b(sb, this.d, ')');
    }
}
