package xsna;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class llb extends dbd0<char[]> {
    public char[] a;
    public int b;

    @Override // xsna.dbd0
    public final char[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // xsna.dbd0
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // xsna.dbd0
    public final int d() {
        return this.b;
    }
}
