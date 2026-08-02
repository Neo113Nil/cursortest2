package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class b5 {
    public final e5 a;
    public final c5 b;

    public /* synthetic */ b5() {
        this(d5.a(), new c5());
    }

    public final String a(Context context) {
        List O0;
        e5 e5Var = this.a;
        e5Var.getClass();
        synchronized (e5.c) {
            O0 = j5g.O0(e5Var.b);
        }
        return a(context, O0);
    }

    public final String b(Context context) {
        List O0;
        e5 e5Var = this.a;
        e5Var.getClass();
        synchronized (e5.c) {
            O0 = j5g.O0(e5Var.a);
        }
        return a(context, O0);
    }

    public b5(e5 e5Var, c5 c5Var) {
        this.a = e5Var;
        this.b = c5Var;
    }

    public final String a(Context context, List list) {
        int i;
        this.b.getClass();
        qu2 a = gx2.a().a(context);
        if (a == null || (i = a.a) == 0) {
            i = 5;
        }
        int size = list.size();
        if (i > size) {
            i = size;
        }
        return j5g.g0(list.subList(list.size() - i, list.size()), StringUtils.COMMA, null, null, 0, null, 62);
    }
}
