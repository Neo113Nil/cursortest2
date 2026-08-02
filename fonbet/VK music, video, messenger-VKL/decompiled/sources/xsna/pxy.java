package xsna;

/* compiled from: LazyStaggeredGridScrollPosition.kt */
/* loaded from: classes11.dex */
public final class pxy {
    public final vxy a;
    public int[] b;
    public final rg50 c;
    public int[] d;
    public final rg50 e;
    public boolean f;
    public Object g;
    public final tty h;

    public pxy(int[] iArr, int[] iArr2, vxy vxyVar) {
        this.a = vxyVar;
        this.b = iArr;
        this.c = androidx.compose.runtime.i.a(a(iArr));
        this.d = iArr2;
        this.e = androidx.compose.runtime.i.a(b(iArr, iArr2));
        Integer i0 = rl3.i0(iArr);
        this.h = new tty(i0 != null ? i0.intValue() : 0, 90, 200);
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                return i;
            }
            int i3 = iArr[i2];
            if (i3 <= 0) {
                break;
            }
            if (i > i3) {
                i = i3;
            }
            i2++;
        }
        return 0;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int a = a(iArr);
        int length = iArr2.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == a) {
                i = Math.min(i, iArr2[i2]);
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }
}
