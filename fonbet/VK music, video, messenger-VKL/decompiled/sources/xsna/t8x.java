package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class t8x extends dbd0<int[]> {
    public int[] a;
    public int b;

    @Override // xsna.dbd0
    public final int[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // xsna.dbd0
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // xsna.dbd0
    public final int d() {
        return this.b;
    }
}
