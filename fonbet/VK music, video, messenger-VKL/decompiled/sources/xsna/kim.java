package xsna;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import xsna.b5w;
import xsna.ij20;
import xsna.u6x;

/* compiled from: DialogPinJob.kt */
/* loaded from: classes.dex */
public final class kim extends u4w {
    public final Peer c;
    public final int d;

    /* compiled from: DialogPinJob.kt */
    public static final class a implements s7x<kim> {
        @Override // xsna.s7x
        public final kim a(ny90 ny90Var) {
            int c = ny90Var.g(X3.i.L) ? ny90Var.c(X3.i.L) : -1;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new kim(c, Peer.a.b(ny90Var.e("dialog_id")));
        }

        @Override // xsna.s7x
        public final void b(kim kimVar, ny90 ny90Var) {
            kim kimVar2 = kimVar;
            ny90Var.n("dialog_id", kimVar2.c.b);
            ny90Var.l(X3.i.L, kimVar2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DialogPinJob";
        }
    }

    public kim(int i, Peer peer) {
        this.c = peer;
        this.d = i;
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        w2wVar.e1(this, new j480(this, this.c, th));
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = "messages.pinConversation";
        Peer peer = this.c;
        aVar2.f.put("peer_id", Long.valueOf(peer.b).toString());
        aVar2.i = true;
        bz2.h(new ij20(aVar2));
        if (w2wVar.getExperiments().n()) {
            w2wVar.I0().u(new fo6(9, w2wVar, this));
            w2wVar.e1(this, new r680(this, Collections.singleton(b5w.a.b(peer.b))));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kim)) {
            return false;
        }
        kim kimVar = (kim) obj;
        return epx.f(this.c, kimVar.c) && this.d == kimVar.d;
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
        return "im-dialog-pin-unpin";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogPinJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogPinJob(peer=");
        sb.append(this.c);
        sb.append(", position=");
        return vu5.b(sb, this.d, ')');
    }
}
