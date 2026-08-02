package xsna;

import com.vk.instantjobs.InstantJob;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.u6x;

/* compiled from: MsgFailAudioTranscriptWithDelayJob.kt */
/* loaded from: classes.dex */
public final class si30 extends u4w {
    public final int c;
    public final int d;
    public final long e;

    /* compiled from: MsgFailAudioTranscriptWithDelayJob.kt */
    public static final class a implements s7x<si30> {
        @Override // xsna.s7x
        public final si30 a(ny90 ny90Var) {
            return new si30(ny90Var.c("msg_local_id"), ny90Var.c("attach_local_id"), ny90Var.e("start_delay_ms"));
        }

        @Override // xsna.s7x
        public final void b(si30 si30Var, ny90 ny90Var) {
            si30 si30Var2 = si30Var;
            ny90Var.l("msg_local_id", si30Var2.c);
            ny90Var.l("attach_local_id", si30Var2.d);
            ny90Var.n("start_delay_ms", si30Var2.e);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MsgFailAudioTranscriptWithDelayJob";
        }
    }

    public si30(int i, int i2, long j) {
        this.c = i;
        this.d = i2;
        this.e = j;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.I0().u(new aa9(w2wVar, this, ref$BooleanRef, ref$LongRef, 5));
        if (ref$BooleanRef.element) {
            w2wVar.e1(this, new p980((Object) null, ref$LongRef.element, this.c));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si30)) {
            return false;
        }
        si30 si30Var = (si30) obj;
        return this.c == si30Var.c && this.d == si30Var.d && this.e == si30Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + shy.a(this.d, Integer.hashCode(this.c) * 31, 31);
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
        return this.e;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgFailAudioTranscriptWithDelayJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgFailAudioTranscriptWithDelayJob(msgLocalId=");
        sb.append(this.c);
        sb.append(", attachLocalId=");
        sb.append(this.d);
        sb.append(", startDelayMs=");
        return vu5.a(')', this.e, sb);
    }
}
