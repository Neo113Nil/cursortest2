package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: SimpleProgressiveJpegConfig.java */
/* loaded from: classes.dex */
public final class hsj0 implements z3e0 {

    /* compiled from: SimpleProgressiveJpegConfig.java */
    public static class a {
    }

    @Override // xsna.z3e0
    public final int a(int i) {
        List list = Collections.EMPTY_LIST;
        if (list == null || list.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((Integer) list.get(i2)).intValue() > i) {
                return ((Integer) list.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // xsna.z3e0
    public final gpw b(int i) {
        return gpw.a(i, i >= 0, false);
    }
}
