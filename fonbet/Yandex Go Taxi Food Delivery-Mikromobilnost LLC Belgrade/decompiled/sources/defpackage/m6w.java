package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m6w {
    public int[] a = new int[10];
    public int b;

    public final int a(int i) {
        int i2 = this.b - 1;
        return i2 >= 0 ? this.a[i2] : i;
    }

    public final int b() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void c(int i) {
        int[] iArr = this.a;
        if (this.b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.a = iArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }
}
