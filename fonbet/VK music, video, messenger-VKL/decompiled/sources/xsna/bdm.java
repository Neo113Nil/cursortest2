package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogDisableWritingCmd.kt */
/* loaded from: classes2.dex */
public final class bdm extends le6<s3q0> {
    public final Peer b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public /* synthetic */ bdm(Peer peer, boolean z, int i, int i2) {
        this(peer, z, (i2 & 4) != 0 ? -1 : i, (i2 & 8) == 0);
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        nx2 be20Var;
        int i = this.d;
        boolean z = this.c;
        if (!z || i >= 0) {
            boolean z2 = this.e;
            Peer peer = this.b;
            be20Var = z ? new be20(i, peer, z2) : new fe20(peer, z2);
        } else {
            be20Var = new ce20(this.b, null, null, null, Boolean.valueOf(z), this.e, w2wVar.Q0(), null, null, null, 910);
        }
        bz2.c(be20Var, null);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdm)) {
            return false;
        }
        bdm bdmVar = (bdm) obj;
        return epx.f(this.b, bdmVar.b) && this.c == bdmVar.c && this.d == bdmVar.d && this.e == bdmVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogDisableWritingCmd(peer=");
        sb.append(this.b);
        sb.append(", isDisableWriting=");
        sb.append(this.c);
        sb.append(", durationSec=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public bdm(Peer peer, boolean z, int i, boolean z2) {
        this.b = peer;
        this.c = z;
        this.d = i;
        this.e = z2;
        if (!peer.zb()) {
            throw new IllegalStateException(yq.b(peer, "DialogDisableWritingCmd available only for chat! Called for ").toString());
        }
    }
}
