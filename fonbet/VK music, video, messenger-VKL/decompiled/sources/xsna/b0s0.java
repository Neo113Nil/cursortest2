package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoAddCmd.kt */
/* loaded from: classes2.dex */
public final class b0s0 extends le6<Boolean> {
    public final long b;
    public final UserId c;

    public b0s0(long j, UserId userId) {
        this.b = j;
        this.c = userId;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return (Boolean) bz2.c(new a0s0(this.b, this.c), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b0s0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        b0s0 b0s0Var = (b0s0) obj;
        return this.b == b0s0Var.b && epx.f(this.c, b0s0Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.c.b) + (((int) this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAddCmd(videoId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        return gp.b(sb, this.c, ')');
    }
}
