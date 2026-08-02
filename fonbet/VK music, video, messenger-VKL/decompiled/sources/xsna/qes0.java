package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoDeleteCmd.kt */
/* loaded from: classes2.dex */
public final class qes0 extends le6<Boolean> {
    public final long b;
    public final UserId c;

    public qes0(long j, UserId userId) {
        this.b = j;
        this.c = userId;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return (Boolean) bz2.c(new pes0(this.b, this.c), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qes0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        qes0 qes0Var = (qes0) obj;
        return this.b == qes0Var.b && epx.f(this.c, qes0Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.c.b) + (((int) this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDeleteCmd(videoId=");
        sb.append(this.b);
        sb.append(", targetId=");
        return gp.b(sb, this.c, ')');
    }
}
