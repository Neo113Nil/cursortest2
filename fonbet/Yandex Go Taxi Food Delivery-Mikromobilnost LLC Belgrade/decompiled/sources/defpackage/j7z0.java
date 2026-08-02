package defpackage;

import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class j7z0 {
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final cjw0 e;

    public j7z0(List list, List list2, int i, int i2, cjw0 cjw0Var) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = cjw0Var;
    }

    public final f7z0 a(Calendar calendar) {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (wf7.e(calendar, ((f7z0) obj).a)) {
                break;
            }
        }
        return (f7z0) obj;
    }

    public final boolean b(Calendar calendar) {
        List<h7z0> list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (h7z0 h7z0Var : list) {
            if (calendar.getTimeInMillis() <= h7z0Var.b.getTimeInMillis() && calendar.getTimeInMillis() >= h7z0Var.a.getTimeInMillis()) {
                return true;
            }
        }
        return false;
    }
}
