package xsna;

import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: MsgExpireLocallyWithDelayJob.kt */
/* loaded from: classes.dex */
public final class ri30 extends u4w {
    public final int c;
    public final long d;

    /* compiled from: MsgExpireLocallyWithDelayJob.kt */
    public static final class a implements s7x<ri30> {
        @Override // xsna.s7x
        public final ri30 a(ny90 ny90Var) {
            return new ri30(ny90Var.c("msg_local_id"), ny90Var.e("start_delay_ms"));
        }

        @Override // xsna.s7x
        public final void b(ri30 ri30Var, ny90 ny90Var) {
            ri30 ri30Var2 = ri30Var;
            ny90Var.l("msg_local_id", ri30Var2.c);
            ny90Var.n("start_delay_ms", ri30Var2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MsgExpireLocallyWithDelayJob";
        }
    }

    public ri30(int i, long j) {
        this.c = i;
        this.d = j;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        w2wVar.L0(this, new com.vk.im.engine.commands.messages.e(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri30)) {
            return false;
        }
        ri30 ri30Var = (ri30) obj;
        return this.c == ri30Var.c && this.d == ri30Var.d;
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
        return "MsgExpireLocallyWithDelayJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgExpireLocallyWithDelayJob(msgLocalId=");
        sb.append(this.c);
        sb.append(", startDelayMs=");
        return vu5.a(')', this.d, sb);
    }
}
