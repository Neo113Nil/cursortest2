package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import xsna.b5w;
import xsna.u6x;

/* compiled from: ChannelUnpinJob.kt */
/* loaded from: classes.dex */
public final class tdb extends u4w {
    public final Peer c;

    /* compiled from: ChannelUnpinJob.kt */
    public static final class a implements s7x<tdb> {
        @Override // xsna.s7x
        public final tdb a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new tdb(Peer.a.b(ny90Var.e("channel_id")));
        }

        @Override // xsna.s7x
        public final void b(tdb tdbVar, ny90 ny90Var) {
            ny90Var.n("channel_id", tdbVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelPinJob";
        }
    }

    public tdb(Peer peer) {
        this.c = peer;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        oib d = sd9.d();
        Peer peer = this.c;
        bz2.l(d.j(com.vk.dto.common.a.b(peer)), true);
        if (w2wVar.getExperiments().n()) {
            xgl0 I0 = w2wVar.I0();
            I0.u(new c5(I0, this, w2wVar, 2));
            w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
            w2wVar.e1(this, new r680(this, Collections.singleton(b5w.a.a(peer.b))));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdb) && epx.f(this.c, ((tdb) obj).c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b);
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
        return eq.a(new StringBuilder("ChannelUnpinJob(peer="), this.c, ')');
    }
}
