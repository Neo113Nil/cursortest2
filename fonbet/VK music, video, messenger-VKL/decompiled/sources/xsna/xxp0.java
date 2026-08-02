package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class xxp0 extends dbd0<wxp0> {
    public short[] a;
    public int b;

    @Override // xsna.dbd0
    public final wxp0 a() {
        return new wxp0(Arrays.copyOf(this.a, this.b));
    }

    @Override // xsna.dbd0
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // xsna.dbd0
    public final int d() {
        return this.b;
    }
}
