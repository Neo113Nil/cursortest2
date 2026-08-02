package xsna;

import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: MsgDeleteLocallyWithDelayJob.kt */
/* loaded from: classes.dex */
public final class hi30 extends u4w {
    public final int c;
    public final long d;

    /* compiled from: MsgDeleteLocallyWithDelayJob.kt */
    public static final class a implements s7x<hi30> {
        @Override // xsna.s7x
        public final hi30 a(ny90 ny90Var) {
            return new hi30(ny90Var.c("msg_local_id"), ny90Var.e("start_delay_ms"));
        }

        @Override // xsna.s7x
        public final void b(hi30 hi30Var, ny90 ny90Var) {
            hi30 hi30Var2 = hi30Var;
            ny90Var.l("msg_local_id", hi30Var2.c);
            ny90Var.n("start_delay_ms", hi30Var2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MsgDeleteLocallyWithDelayJob";
        }
    }

    public hi30(int i, long j) {
        this.c = i;
        this.d = j;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        w2wVar.L0(this, new com.vk.im.engine.commands.messages.b(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi30)) {
            return false;
        }
        hi30 hi30Var = (hi30) obj;
        return this.c == hi30Var.c && this.d == hi30Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
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
    public final long r() {
        return this.d;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgDeleteLocallyWithDelayJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgDeleteLocallyWithDelayJob(msgLocalId=");
        sb.append(this.c);
        sb.append(", startDelayMs=");
        return vu5.a(')', this.d, sb);
    }
}
