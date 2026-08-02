package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b5m extends b2f0 {
    public double[] a;
    public int b;

    public b5m(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
        b(10);
    }

    @Override // defpackage.b2f0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.b2f0
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.b2f0
    public final int d() {
        return this.b;
    }

    public final void e(double d) {
        b(d() + 1);
        double[] dArr = this.a;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }
}
