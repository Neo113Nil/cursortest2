package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class bqr extends dbd0<float[]> {
    public float[] a;
    public int b;

    @Override // xsna.dbd0
    public final float[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // xsna.dbd0
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // xsna.dbd0
    public final int d() {
        return this.b;
    }
}
