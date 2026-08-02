package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: InvalidateMsgsWithDonutAttachesCmd.kt */
/* loaded from: classes2.dex */
public final class rpx extends le6<s3q0> {
    public final UserId b;

    public rpx(UserId userId) {
        this.b = userId;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.O0().a(new spx(this.b));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpx) && epx.f(this.b, ((rpx) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return gp.b(new StringBuilder("InvalidateMsgsWithDonutAttachesCmd(ownerId="), this.b, ')');
    }
}
