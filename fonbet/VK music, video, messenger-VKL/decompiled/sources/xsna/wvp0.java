package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class wvp0 extends dbd0<vvp0> {
    public byte[] a;
    public int b;

    @Override // xsna.dbd0
    public final vvp0 a() {
        return new vvp0(Arrays.copyOf(this.a, this.b));
    }

    @Override // xsna.dbd0
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // xsna.dbd0
    public final int d() {
        return this.b;
    }
}
