package xsna;

import com.facebook.soloader.MinElf;

/* compiled from: Settings.kt */
/* loaded from: classes8.dex */
public final class e0j0 {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        return (this.a & 128) != 0 ? this.b[7] : MinElf.PN_XNUM;
    }

    public final int b() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
