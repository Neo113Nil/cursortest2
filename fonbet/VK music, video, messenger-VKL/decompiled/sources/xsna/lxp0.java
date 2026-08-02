package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class lxp0 extends dbd0<kxp0> {
    public int[] a;
    public int b;

    @Override // xsna.dbd0
    public final kxp0 a() {
        return new kxp0(Arrays.copyOf(this.a, this.b));
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
