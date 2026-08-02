package xsna;

import java.util.Arrays;

/* compiled from: LongList.kt */
/* loaded from: classes11.dex */
public final class wg50 extends q300 {
    public wg50(int i) {
        this.a = i == 0 ? w500.a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public /* synthetic */ wg50() {
        this(16);
    }
}
