package xsna;

import java.util.Arrays;

/* compiled from: IntList.kt */
/* loaded from: classes11.dex */
public final class ng50 extends a9x {
    public ng50(int i) {
        this.a = i == 0 ? p9x.a : new int[i];
    }

    public final void c(int i) {
        d(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void e(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (i == iArr[i3]) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            f(i3);
        }
    }

    public final void f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            alk.D("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            jw5.e(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= this.b) {
            alk.D("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public /* synthetic */ ng50() {
        this(16);
    }
}
