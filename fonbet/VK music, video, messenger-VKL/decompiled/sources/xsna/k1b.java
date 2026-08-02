package xsna;

import com.vk.instantjobs.InstantJob;

/* compiled from: ChannelMarkAsReadCmd.kt */
/* loaded from: classes2.dex */
public final class k1b extends le6<s3q0> {
    public final long b;
    public final int c;

    public k1b(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        x6x O0 = w2wVar.O0();
        final long j = this.b;
        O0.b(q9k.d("mark as read (channelId=", j, ')'), new izs() { // from class: xsna.j1b
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof m1b) && ((m1b) instantJob).c == j);
            }
        });
        xgl0 I0 = w2wVar.I0();
        cbb cbbVar = new cbb(I0, 0);
        int i = this.c;
        if (((Boolean) I0.u(new abb(j, cbbVar, i))).booleanValue()) {
            w2wVar.S0().H(j);
        }
        w2wVar.O0().a(new m1b(j, i));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1b)) {
            return false;
        }
        k1b k1bVar = (k1b) obj;
        return this.b == k1bVar.b && this.c == k1bVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMarkAsReadCmd(channelId=");
        sb.append(this.b);
        sb.append(", messageCnvId=");
        return vu5.b(sb, this.c, ')');
    }
}
