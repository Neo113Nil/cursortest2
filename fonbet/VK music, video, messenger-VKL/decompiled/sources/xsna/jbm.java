package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogChangeWritePermissionCmd.kt */
/* loaded from: classes2.dex */
public final class jbm extends me6<s3q0> {
    public final long b;
    public final Peer c;
    public final int d;

    public jbm(long j, Peer peer, int i) {
        this.b = j;
        this.c = peer;
        this.d = i;
    }

    @Override // xsna.me6
    public final Object e(w2w w2wVar, spj<? super s3q0> spjVar) {
        x6x x6xVar = (x6x) w2wVar.M0().b().a;
        long j = this.b;
        Peer peer = this.c;
        x6xVar.c(new hob(j, peer, 1));
        ((x6x) w2wVar.M0().b().a).a(new kbm(j, peer, this.d));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbm)) {
            return false;
        }
        jbm jbmVar = (jbm) obj;
        return this.b == jbmVar.b && epx.f(this.c, jbmVar.c) && this.d == jbmVar.d;
    }

    @Override // xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogChangeWritePermissionCmd(dialogId=");
        sb.append(this.b);
        sb.append(", member=");
        sb.append(this.c);
        sb.append(", durationSec=");
        return vu5.b(sb, this.d, ')');
    }
}
