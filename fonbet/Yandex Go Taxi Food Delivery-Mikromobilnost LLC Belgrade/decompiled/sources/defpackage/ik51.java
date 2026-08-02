package defpackage;

import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class ik51 {
    public static final Integer[] b = {-1, 0, 22};
    public final x22 a;

    public ik51(x22 x22Var) {
        this.a = x22Var;
    }

    public final boolean a(String str, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        boolean z6 = (z4 || z2 || z3 || !z5 || !j73.y(b, Integer.valueOf(i))) ? false : true;
        if (z6 && z) {
            this.a.reportEvent("tech_prevented_yadisk_loading_into_stub", b.i(new Pair("chatId", str), new Pair("namespace", Integer.valueOf(i))));
        }
        return z6 && !z;
    }
}
