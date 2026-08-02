package xsna;

import com.vk.instantjobs.InstantJob;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.u6x;

/* compiled from: MsgFailVideoTranscriptWithDelayJob.kt */
/* loaded from: classes2.dex */
public final class ui30 extends u4w {
    public final int c;
    public final int d;
    public final long e;

    public ui30(int i, int i2, long j) {
        this.c = i;
        this.d = i2;
        this.e = j;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.I0().u(new ti30(0, ref$BooleanRef, w2wVar, this, ref$LongRef));
        if (ref$BooleanRef.element) {
            w2wVar.e1(this, new p980((Object) null, ref$LongRef.element, this.c));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui30)) {
            return false;
        }
        ui30 ui30Var = (ui30) obj;
        return this.c == ui30Var.c && this.d == ui30Var.d && this.e == ui30Var.e;
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
        return "MsgFailVideoTranscriptWithDelayJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgFailVideoTranscriptWithDelayJob(msgLocalId=");
        sb.append(this.c);
        sb.append(", attachLocalId=");
        sb.append(this.d);
        sb.append(", startDelayMs=");
        return vu5.a(')', this.e, sb);
    }
}
