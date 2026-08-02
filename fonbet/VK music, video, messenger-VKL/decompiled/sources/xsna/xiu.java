package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.group.MessagesFromGroupType;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: GroupCanSendAnyToMeChangeJob.kt */
/* loaded from: classes.dex */
public final class xiu extends u4w {
    public final Peer c;
    public final MessagesFromGroupType d;

    /* compiled from: GroupCanSendAnyToMeChangeJob.kt */
    public static final class a implements s7x<xiu> {
        @Override // xsna.s7x
        public final xiu a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new xiu(Peer.a.a(ny90Var.e("group_id"), Peer.Type.GROUP), MessagesFromGroupType.valueOf(ny90Var.f("group_message_type")));
        }

        @Override // xsna.s7x
        public final void b(xiu xiuVar, ny90 ny90Var) {
            xiu xiuVar2 = xiuVar;
            ny90Var.n("group_id", xiuVar2.c.d);
            ny90Var.o("group_message_type", xiuVar2.d.toString());
        }

        @Override // xsna.s7x
        public final String getType() {
            return "GroupCanSendAnyToMeChangeJob";
        }
    }

    public xiu(Peer peer, MessagesFromGroupType messagesFromGroupType) {
        this.c = peer;
        this.d = messagesFromGroupType;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        bru n = w2wVar.I0().n();
        Peer peer = this.c;
        n.e(peer.d);
        w2wVar.S0().D(peer.d, "xiu");
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        bru n = w2wVar.I0().n();
        Peer peer = this.c;
        n.e(peer.d);
        w2wVar.S0().D(peer.d, "xiu");
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        bru n = w2wVar.I0().n();
        Peer peer = this.c;
        long j = peer.d;
        long j2 = peer.d;
        yiu d = n.d(j);
        if (d == null) {
            return;
        }
        bz2.c(new ipu(peer, d.a() || d.b(), this.d), null);
        n.f(j2, d.a(), d.b());
        n.e(j2);
        w2wVar.S0().D(j2, "xiu");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiu)) {
            return false;
        }
        xiu xiuVar = (xiu) obj;
        return epx.f(this.c, xiuVar.c) && this.d == xiuVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c.b) * 31);
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
        return sa30.v(this.c.d);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "GroupCanSendAnyToMeChangeJob";
    }

    public final String toString() {
        return "GroupCanSendAnyToMeChangeJob(peer=" + this.c + ", type=" + this.d + ')';
    }
}
