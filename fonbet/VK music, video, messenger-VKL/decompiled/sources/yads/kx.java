package yads;

import xsna.cqi;
import xsna.na8;

/* loaded from: classes10.dex */
public abstract class kx {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(cqi.c(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(xsna.so.a(obj, "null value in entry: ", "=null"));
        }
    }

    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(na8.a(i, str, " cannot be negative but was: "));
    }
}
