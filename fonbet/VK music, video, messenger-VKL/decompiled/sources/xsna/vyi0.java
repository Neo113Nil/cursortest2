package xsna;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: SetMsgMyReactionJobLauncherCmd.kt */
/* loaded from: classes2.dex */
public final class vyi0 extends xl6<s3q0> {
    public final long b;
    public final int c;
    public final int d;
    public final Integer e;
    public final Integer f;
    public final String g;

    public vyi0(long j, int i, int i2, Integer num, Integer num2, String str) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = num;
        this.f = num2;
        this.g = str;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-reactions-send-launcher";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.O0().c(new gd5(this, ref$ObjectRef, ref$BooleanRef, 9));
        boolean z = ref$BooleanRef.element;
        Integer num = this.f;
        Integer num2 = z ? (Integer) ref$ObjectRef.element : num;
        boolean z2 = num == null || num.intValue() != Integer.MIN_VALUE;
        if (!epx.f(num2, this.e) || !z2) {
            w2wVar.O0().a(new aii0(this.b, this.c, this.d, this.e, num2, this.g));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyi0)) {
            return false;
        }
        vyi0 vyi0Var = (vyi0) obj;
        return this.b == vyi0Var.b && this.c == vyi0Var.c && this.d == vyi0Var.d && epx.f(this.e, vyi0Var.e) && epx.f(this.f, vyi0Var.f) && epx.f(this.g, vyi0Var.g);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return this.g.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetMsgMyReactionJobLauncherCmd(dialogId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", reactionId=");
        sb.append(this.e);
        sb.append(", oldReactionIdFromDB=");
        sb.append(this.f);
        sb.append(", source=");
        return ho8.a(sb, this.g, ')');
    }
}
