package xsna;

/* compiled from: TwoWayFromHolder.kt */
/* loaded from: classes3.dex */
public final class ktp0 extends s170 {
    public Integer d;
    public Integer e;
    public da90 f;

    @Override // xsna.s170
    public final void g() {
        throw null;
    }

    public final synchronized void h(int i) {
        try {
            if (i() - i < 0) {
                j(0);
            } else {
                j(i() - i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int i() {
        Integer num;
        num = this.d;
        return num != null ? num.intValue() : 0;
    }

    public final synchronized void j(int i) {
        this.e = this.d;
        this.d = Integer.valueOf(i);
        da90 da90Var = this.f;
        if (da90Var.a) {
            da90Var.b++;
        } else {
            int i2 = da90Var.b - 1;
            da90Var.b = i2;
            if (i2 < 0) {
                da90Var.b = 0;
            }
        }
    }
}
