package defpackage;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class m5w extends b2f0 {
    public int[] a;
    public int b;

    @Override // defpackage.b2f0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.b2f0
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

    @Override // defpackage.b2f0
    public final int d() {
        return this.b;
    }
}
