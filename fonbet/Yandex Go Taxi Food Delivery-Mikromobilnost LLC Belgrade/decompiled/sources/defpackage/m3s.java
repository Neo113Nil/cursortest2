package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class m3s extends m5j0 {
    public static final wg10 d;
    public final List b;
    public final List c;

    static {
        Regex regex = wg10.e;
        d = qje.o("application/x-www-form-urlencoded");
    }

    public m3s(ArrayList arrayList, ArrayList arrayList2) {
        this.b = bg61.k(arrayList);
        this.c = bg61.k(arrayList2);
    }

    @Override // defpackage.m5j0
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        return d;
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        e(oq6Var, false);
    }

    public final long e(oq6 oq6Var, boolean z) {
        yp6 yp6Var = z ? new yp6() : oq6Var.h();
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                yp6Var.e0(38);
            }
            yp6Var.x0((String) list.get(i));
            yp6Var.e0(61);
            yp6Var.x0((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = yp6Var.b;
        yp6Var.clear();
        return j;
    }
}
