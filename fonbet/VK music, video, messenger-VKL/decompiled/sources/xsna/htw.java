package xsna;

/* compiled from: IncrementChannelMsgPaidReactionCmd.kt */
/* loaded from: classes2.dex */
public final class htw extends le6<s3q0> {
    public final long b;
    public final int c;
    public final int d;
    public final int e;

    public htw(int i, int i2, int i3, long j) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Integer num;
        if (this.d > 0 && (num = (Integer) w2wVar.I0().u(new hxl(this, 13))) != null) {
            int intValue = num.intValue();
            long j = this.b;
            w2wVar.e1(this, new l280(j, intValue));
            w2wVar.e1(this, new o280("IncrementChannelMsgPaidReactionCmd", j, intValue));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htw)) {
            return false;
        }
        htw htwVar = (htw) obj;
        return this.b == htwVar.b && this.c == htwVar.c && this.d == htwVar.d && this.e == htwVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("IncrementChannelMsgPaidReactionCmd(channelId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", userCountBeforePayment=");
        return vu5.b(sb, this.e, ')');
    }
}
