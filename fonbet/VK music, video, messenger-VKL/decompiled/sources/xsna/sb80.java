package xsna;

/* compiled from: OnRemeasuredModifier.kt */
/* loaded from: classes11.dex */
final class sb80 extends d730<tb80> {
    public final izs<q9x, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public sb80(izs<? super q9x, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sb80) {
            return this.a == ((sb80) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final tb80 r() {
        return new tb80(this.a);
    }

    @Override // xsna.d730
    public final void s(tb80 tb80Var) {
        tb80 tb80Var2 = tb80Var;
        tb80Var2.p = this.a;
        long j = Integer.MIN_VALUE;
        tb80Var2.r = (j & 4294967295L) | (j << 32);
    }
}
