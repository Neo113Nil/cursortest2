package defpackage;

/* loaded from: classes9.dex */
public final class g8 {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ny61.i(b64.s(i, i2, "startIndex: ", ", endIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            ny61.g(oyr.h(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            ny61.m(oyr.h(i, i2, "index: ", ", size: "));
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i > i2) {
            ny61.m(oyr.h(i, i2, "index: ", ", size: "));
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ny61.i(b64.s(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            ny61.g(oyr.h(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int e(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }
}
