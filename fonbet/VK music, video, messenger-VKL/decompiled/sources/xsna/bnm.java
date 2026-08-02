package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogsChangeUserRoleCmd.kt */
/* loaded from: classes2.dex */
public final class bnm extends le6<Boolean> {
    public final Peer b;
    public final Peer c;
    public final String d;
    public final boolean e;

    public bnm(Peer peer, Peer peer2, String str, boolean z) {
        this.b = peer;
        this.c = peer2;
        this.d = str;
        this.e = z;
        if (peer.zb()) {
            return;
        }
        throw new IllegalStateException(("Specified chat=" + peer + " is not a chat").toString());
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        bz2.c(new xg20(this.b, this.c, this.d, w2wVar.Q0(), this.e), null);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnm)) {
            return false;
        }
        bnm bnmVar = (bnm) obj;
        return epx.f(this.b, bnmVar.b) && epx.f(this.c, bnmVar.c) && epx.f(this.d, bnmVar.d) && this.e == bnmVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c.b), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsChangeUserRoleCmd(chat=");
        sb.append(this.b);
        sb.append(", member=");
        sb.append(this.c);
        sb.append(", newRole=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
