package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: DialogMarkAsUnreadJob.kt */
/* loaded from: classes.dex */
public final class wgm extends u4w {
    public final Peer c;

    /* compiled from: DialogMarkAsUnreadJob.kt */
    public static final class a implements s7x<wgm> {
        @Override // xsna.s7x
        public final wgm a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new wgm(Peer.a.b(ny90Var.e("dialog_id")));
        }

        @Override // xsna.s7x
        public final void b(wgm wgmVar, ny90 ny90Var) {
            ny90Var.n("dialog_id", wgmVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImDialogMarkAsUnreadJob";
        }
    }

    public wgm(Peer peer) {
        this.c = peer;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        xgl0 I0 = w2wVar.I0();
        Peer peer = this.c;
        if (his0.p(peer.b, I0)) {
            w2wVar.S0().V(peer.b);
        }
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        xgl0 I0 = w2wVar.I0();
        Peer peer = this.c;
        if (his0.p(peer.b, I0)) {
            w2wVar.S0().V(peer.b);
        }
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        bz2.c(new tgm(this.c, w2wVar.Q0()), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgm) && epx.f(this.c, ((wgm) obj).c);
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
        return sa30.u(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogMarkAsUnreadJob";
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogMarkAsUnreadJob(peer="), this.c, ')');
    }
}
