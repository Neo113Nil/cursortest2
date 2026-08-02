package xsna;

import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import xsna.u6x;

/* compiled from: ChannelMarkAsReadJob.kt */
/* loaded from: classes.dex */
public final class m1b extends u4w {
    public final long c;
    public final int d;

    /* compiled from: ChannelMarkAsReadJob.kt */
    public static final class a implements s7x<m1b> {
        @Override // xsna.s7x
        public final m1b a(ny90 ny90Var) {
            return new m1b(ny90Var.e("channel_id"), ny90Var.c("till_cnv_id"));
        }

        @Override // xsna.s7x
        public final void b(m1b m1bVar, ny90 ny90Var) {
            m1b m1bVar2 = m1bVar;
            ny90Var.n("channel_id", m1bVar2.c);
            ny90Var.l("till_cnv_id", m1bVar2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImChannelMarkAsRead";
        }
    }

    public m1b(long j, int i) {
        this.c = j;
        this.d = i;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        long j = this.c;
        int i = this.d;
        if (((Boolean) bz2.c(new i1b(j, i), "ChannelMarkAsReadApiCmd")).booleanValue()) {
            return;
        }
        L.l("ChannelMarkAsReadJob", "failed to mark as read channelId=" + j + ", tillCnvId=" + i);
        Q(w2wVar);
    }

    public final void Q(w2w w2wVar) {
        cbb cbbVar = new cbb(w2wVar.I0(), 0);
        int i = this.d;
        long j = this.c;
        if (cbbVar.f(i, j)) {
            w2wVar.S0().H(j);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1b)) {
            return false;
        }
        m1b m1bVar = (m1b) obj;
        return this.c == m1bVar.c && this.d == m1bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.p(this.c);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ChannelMarkAsReadJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMarkAsReadJob(channelId=");
        sb.append(this.c);
        sb.append(", tillCnvId=");
        return vu5.b(sb, this.d, ')');
    }
}
