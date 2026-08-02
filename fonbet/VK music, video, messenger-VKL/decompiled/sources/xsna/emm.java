package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import xsna.b5w;
import xsna.ij20;
import xsna.u6x;

/* compiled from: DialogUnpinJob.kt */
/* loaded from: classes.dex */
public final class emm extends u4w {
    public final Peer c;

    /* compiled from: DialogUnpinJob.kt */
    public static final class a implements s7x<emm> {
        @Override // xsna.s7x
        public final emm a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new emm(Peer.a.b(ny90Var.e("dialog_id")));
        }

        @Override // xsna.s7x
        public final void b(emm emmVar, ny90 ny90Var) {
            ny90Var.n("dialog_id", emmVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DialogUnpinJob";
        }
    }

    public emm(Peer peer) {
        this.c = peer;
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        w2wVar.e1(this, new p480(this, this.c, th));
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = "messages.unpinConversation";
        Peer peer = this.c;
        aVar2.f.put("peer_id", Long.valueOf(peer.b).toString());
        aVar2.i = true;
        bz2.h(new ij20(aVar2));
        if (w2wVar.getExperiments().n()) {
            w2wVar.I0().u(new k8(13, w2wVar, this));
            w2wVar.e1(this, new r680(this, Collections.singleton(b5w.a.b(peer.b))));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emm) && epx.f(this.c, ((emm) obj).c);
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
        return "im-dialog-pin-unpin";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogUnpinJob";
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogUnpinJob(peer="), this.c, ')');
    }
}
