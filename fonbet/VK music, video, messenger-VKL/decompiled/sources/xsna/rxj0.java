package xsna;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
final class rxj0 extends d730<uxj0> {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;
    public final izs<z5x, s3q0> f;

    public rxj0() {
        throw null;
    }

    public rxj0(float f, float f2, float f3, float f4, boolean z, izs izsVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
        this.f = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxj0)) {
            return false;
        }
        rxj0 rxj0Var = (rxj0) obj;
        return pco.b(this.a, rxj0Var.a) && pco.b(this.b, rxj0Var.b) && pco.b(this.c, rxj0Var.c) && pco.b(this.d, rxj0Var.d) && this.e == rxj0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // xsna.d730
    public final uxj0 r() {
        uxj0 uxj0Var = new uxj0();
        uxj0Var.p = this.a;
        uxj0Var.q = this.b;
        uxj0Var.r = this.c;
        uxj0Var.s = this.d;
        uxj0Var.t = this.e;
        return uxj0Var;
    }

    @Override // xsna.d730
    public final void s(uxj0 uxj0Var) {
        uxj0 uxj0Var2 = uxj0Var;
        uxj0Var2.p = this.a;
        uxj0Var2.q = this.b;
        uxj0Var2.r = this.c;
        uxj0Var2.s = this.d;
        uxj0Var2.t = this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ rxj0(float f, float f2, float f3, float f4, boolean z, izs izsVar, int i) {
        this(f, f2, f3, r7, r8, r9);
        izs izsVar2;
        boolean z2;
        float f5;
        f = (i & 1) != 0 ? Float.NaN : f;
        f2 = (i & 2) != 0 ? Float.NaN : f2;
        f3 = (i & 4) != 0 ? Float.NaN : f3;
        if ((i & 8) != 0) {
            izsVar2 = izsVar;
            z2 = z;
            f5 = Float.NaN;
        } else {
            izsVar2 = izsVar;
            z2 = z;
            f5 = f4;
        }
    }
}
