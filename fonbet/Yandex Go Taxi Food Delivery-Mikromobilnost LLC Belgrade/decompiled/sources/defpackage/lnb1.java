package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class lnb1 {
    public static final f530 a(f530 f530Var, Orientation orientation) {
        Orientation orientation2 = Orientation.Vertical;
        c530 c530Var = c530.a;
        return f530Var.k(orientation == orientation2 ? ymb1.l(c530Var, yub.d) : ymb1.l(c530Var, yub.c));
    }

    public static final ArrayList b() {
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(l1z.a);
        }
        return arrayList;
    }

    public static final float c(dry0 dry0Var, int i) {
        if (i < 0) {
            return 0.0f;
        }
        cry0 cry0Var = dry0Var.a;
        hm40 hm40Var = dry0Var.b;
        if (cry0Var.a.b.length() == 0) {
            return 0.0f;
        }
        int min = Math.min(hm40Var.d(i), Math.min(hm40Var.b - 1, hm40Var.f - 1));
        if (i > hm40Var.c(min, false)) {
            return 0.0f;
        }
        hm40Var.m(min);
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.b(min, arrayList));
        gb2 gb2Var = cc90Var.a;
        int i2 = min - cc90Var.d;
        zqy0 zqy0Var = gb2Var.d;
        return zqy0Var.e(i2) - zqy0Var.g(i2);
    }
}
