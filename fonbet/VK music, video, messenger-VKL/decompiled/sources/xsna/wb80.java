package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: OnSpoilerRevealEvent.kt */
/* loaded from: classes2.dex */
public final class wb80 extends sxp {
    public final long b;
    public final UserId c;
    public final int d;

    public wb80(UserId userId, long j, int i) {
        this.b = j;
        this.c = userId;
        this.d = i;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb80)) {
            return false;
        }
        wb80 wb80Var = (wb80) obj;
        return this.b == wb80Var.b && epx.f(this.c, wb80Var.c) && this.d == wb80Var.d;
    }

    public final int hashCode() {
        return shy.a(this.d, bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSpoilerRevealEvent(photoId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", cnvMsgId=");
        return h5s.c(this.d, ", changerTag=null)", sb);
    }
}
