package xsna;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class x2k0 {
    public static final int a(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int f = f(arrayList, i, i2);
        return f >= 0 ? f : -(f + 1);
    }

    public static final int c(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void d(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final v2k0 e(be beVar) {
        v2k0 v2k0Var = beVar instanceof v2k0 ? (v2k0) beVar : null;
        if (v2k0Var != null) {
            return v2k0Var;
        }
        throw at.b("Inconsistent composition");
    }

    public static final int f(ArrayList<rgt> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = arrayList.get(i4).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int g = epx.g(i5, i);
            if (g < 0) {
                i3 = i4 + 1;
            } else {
                if (g <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }
}
