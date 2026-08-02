package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMarkAsUnreadCmd.kt */
/* loaded from: classes2.dex */
public final class vgm extends iuz {
    public final Peer b;
    public final long c;

    public vgm(Peer peer) {
        this.b = peer;
        this.c = peer.b;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-read-changes-local";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgm) && epx.f(this.b, ((vgm) obj).b);
    }

    @Override // xsna.iuz
    public final long h() {
        return this.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.iuz
    public final void i(w2w w2wVar) {
        w2wVar.O0().a(new wgm(this.b));
    }

    @Override // xsna.iuz
    public final boolean j(w2w w2wVar) {
        x6x O0 = w2wVar.O0();
        StringBuilder sb = new StringBuilder("mark as unread (peer=");
        Peer peer = this.b;
        O0.b(eq.a(sb, peer, ')'), new ugm(this, 0));
        return ((Boolean) w2wVar.I0().u(new cjm(peer.b, 0))).booleanValue();
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("DialogMarkAsUnreadCmd(peer="), this.b, ')');
    }
}
