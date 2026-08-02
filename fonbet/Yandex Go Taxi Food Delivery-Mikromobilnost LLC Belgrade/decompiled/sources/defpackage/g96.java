package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class g96 extends b2f0 {
    public boolean[] a;
    public int b;

    public g96(boolean[] zArr) {
        this.a = zArr;
        this.b = zArr.length;
        b(10);
    }

    @Override // defpackage.b2f0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.b2f0
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.b2f0
    public final int d() {
        return this.b;
    }

    public final void e(boolean z) {
        b(d() + 1);
        boolean[] zArr = this.a;
        int i = this.b;
        this.b = i + 1;
        zArr[i] = z;
    }
}
