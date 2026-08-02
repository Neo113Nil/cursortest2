package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class qxp0 extends dbd0<pxp0> {
    public long[] a;
    public int b;

    @Override // xsna.dbd0
    public final pxp0 a() {
        return new pxp0(Arrays.copyOf(this.a, this.b));
    }

    @Override // xsna.dbd0
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // xsna.dbd0
    public final int d() {
        return this.b;
    }
}
