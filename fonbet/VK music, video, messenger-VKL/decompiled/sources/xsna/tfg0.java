package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: RevealSpoilerLocallyCmd.kt */
/* loaded from: classes2.dex */
public final class tfg0 extends le6<s3q0> {
    public final long b;
    public final UserId c;
    public final int d;

    public tfg0(UserId userId, long j, int i) {
        this.b = j;
        this.c = userId;
        this.d = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        lnf lnfVar = w2wVar.getConfig().i0;
        fmk0 fmk0Var = fmk0.a;
        long j = this.b;
        UserId userId = this.c;
        fmk0Var.a(j, userId);
        w2wVar.e1(this, new wb80(userId, j, this.d));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfg0)) {
            return false;
        }
        tfg0 tfg0Var = (tfg0) obj;
        return this.b == tfg0Var.b && epx.f(this.c, tfg0Var.c) && this.d == tfg0Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("RevealSpoilerLocallyCmd(photoId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", cnvMsgId=");
        return vu5.b(sb, this.d, ')');
    }
}
