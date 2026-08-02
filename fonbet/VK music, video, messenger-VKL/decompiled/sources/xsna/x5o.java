package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class x5o extends dbd0<double[]> {
    public double[] a;
    public int b;

    @Override // xsna.dbd0
    public final double[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // xsna.dbd0
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

    @Override // xsna.dbd0
    public final int d() {
        return this.b;
    }
}
