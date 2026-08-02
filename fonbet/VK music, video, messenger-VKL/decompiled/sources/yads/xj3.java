package yads;

import xsna.swe0;

/* loaded from: classes10.dex */
public abstract class xj3 {
    public static int a() {
        Integer num;
        hx2 a = gx2.a();
        synchronized (hx2.j) {
            num = a.h;
        }
        if (num != null) {
            return swe0.g(num.intValue(), 1, 4);
        }
        return 4;
    }
}
