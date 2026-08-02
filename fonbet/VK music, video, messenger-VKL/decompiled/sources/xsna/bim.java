package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: DialogNotificationChangeJob.kt */
/* loaded from: classes.dex */
public final class bim extends u4w {
    public final Peer c;
    public final long d;
    public final boolean e;

    /* compiled from: DialogNotificationChangeJob.kt */
    public static final class a implements s7x<bim> {
        @Override // xsna.s7x
        public final bim a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new bim(ny90Var.e("disabled_until"), Peer.a.b(ny90Var.e("dialog_id")), ny90Var.a("use_sound"));
        }

        @Override // xsna.s7x
        public final void b(bim bimVar, ny90 ny90Var) {
            bim bimVar2 = bimVar;
            ny90Var.n("dialog_id", bimVar2.c.b);
            ny90Var.n("disabled_until", bimVar2.d);
            ny90Var.j("use_sound", bimVar2.e);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImDialogNotificationChange";
        }
    }

    public bim(long j, Peer peer, boolean z) {
        this.c = peer;
        this.d = j;
        this.e = z;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        hpm c = sn.c(w2wVar);
        Peer peer = this.c;
        c.y(peer.b, null);
        w2wVar.S0().v(peer.b, "bim");
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        hpm c = sn.c(w2wVar);
        Peer peer = this.c;
        c.y(peer.b, null);
        w2wVar.S0().v(peer.b, "bim");
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        xgl0 I0 = w2wVar.I0();
        xuo0.a.getClass();
        long a2 = xuo0.a();
        long j = this.d;
        long j2 = 0;
        if (j < 0) {
            j2 = -1;
        } else if (j != 0) {
            j2 = Math.max(0L, j - a2) / 1000;
        }
        bz2.c(new js(w2wVar.getDeviceId(), this.c, w2wVar.Q0(), j2, this.e), null);
        PushSettings pushSettings = new PushSettings(this.e, j);
        hpm e = I0.b().e();
        Peer peer = this.c;
        long j3 = peer.b;
        long j4 = peer.b;
        e.z(j3, pushSettings);
        I0.b().e().y(j4, null);
        w2wVar.S0().v(j4, "bim");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bim)) {
            return false;
        }
        bim bimVar = (bim) obj;
        return epx.f(this.c, bimVar.c) && this.d == bimVar.d && this.e == bimVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + bh10.a(Long.hashCode(this.c.b) * 31, 31, this.d);
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
        return sa30.t(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogNotificationChangeJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogNotificationChangeJob(peer=");
        sb.append(this.c);
        sb.append(", disabledUntil=");
        sb.append(this.d);
        sb.append(", isUseSound=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
