package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;

/* compiled from: ReportSpamUserDialog.kt */
/* loaded from: classes2.dex */
public final class a6g0 extends le6<s3q0> {
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public a6g0(Peer peer, boolean z, boolean z2, String str) {
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Unknown unknown = Peer.Unknown.e;
        Peer peer = this.b;
        bz2.c(new x4g0("dialogue", unknown, peer.b, this.d, this.e, null), null);
        if (this.c) {
            bz2.c(new kn(peer, this.d, null), null);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6g0)) {
            return false;
        }
        a6g0 a6g0Var = (a6g0) obj;
        return epx.f(this.b, a6g0Var.b) && this.c == a6g0Var.c && this.d == a6g0Var.d && epx.f(this.e, a6g0Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportSpamUserDialog(dialog=");
        sb.append(this.b);
        sb.append(", addToBlackList=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", extraData=");
        return ho8.a(sb, this.e, ')');
    }
}
