package xsna;

/* compiled from: OnRevertReactionEvent.kt */
/* loaded from: classes2.dex */
public final class za80 extends sxp {
    public final long b;
    public final int c;
    public final int d;
    public final Integer e;
    public final aii0 f;

    public za80(long j, int i, int i2, Integer num, aii0 aii0Var) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = num;
        this.f = aii0Var;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za80)) {
            return false;
        }
        za80 za80Var = (za80) obj;
        return this.b == za80Var.b && this.c == za80Var.c && this.d == za80Var.d && epx.f(this.e, za80Var.e) && epx.f(this.f, za80Var.f);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        aii0 aii0Var = this.f;
        return hashCode + (aii0Var != null ? aii0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OnRevertReactionEvent(dialogId=" + this.b + ", cnvMsgId=" + this.c + ", msgLocalId=" + this.d + ", oldReactionId=" + this.e + ", changerTag=" + this.f + ')';
    }
}
