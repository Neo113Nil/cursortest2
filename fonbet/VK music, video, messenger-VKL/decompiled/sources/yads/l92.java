package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class l92 {
    public static final int a(Context context) {
        Integer num;
        qu2 a = gx2.a().a(context);
        if (a == null || (num = a.u0) == null) {
            return 1;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
