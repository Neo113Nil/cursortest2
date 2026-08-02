package xsna;

import com.facebook.soloader.MinElf;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;

/* compiled from: ChannelMsgSendPostponedNowCmd.kt */
/* loaded from: classes2.dex */
public final class b6b extends xl6<s3q0> {
    public final Peer b;
    public final int c;
    public final int d;

    public b6b(int i, int i2, Peer peer) {
        this.b = peer;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.m2w
    public final String a() {
        return defpackage.k0.a(this.b.b, "im-channel-");
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Peer peer = this.b;
        try {
            bz2.l(nib.e(new oib(), com.vk.dto.common.a.b(peer), null, null, null, null, null, null, null, Integer.valueOf(this.c), null, null, null, null, null, null, null, null, null, null, null, null, -8194, MinElf.PN_XNUM), false);
            w2wVar.I0().e().e(this.d);
            w2wVar.S0().H(peer.b);
            w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
            return s3q0.a;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6b)) {
            return false;
        }
        b6b b6bVar = (b6b) obj;
        return epx.f(this.b, b6bVar.b) && this.c == b6bVar.c && this.d == b6bVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgSendPostponedNowCmd(peer=");
        sb.append(this.b);
        sb.append(", postId=");
        sb.append(this.c);
        sb.append(", localId=");
        return vu5.b(sb, this.d, ')');
    }
}
