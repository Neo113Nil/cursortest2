package yads;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class sk2 implements ug3 {
    public final Context a;
    public final List b;

    public sk2(Context context, nf3 nf3Var) {
        this.a = context.getApplicationContext();
        this.b = a(nf3Var);
    }

    public static List a(nf3 nf3Var) {
        b20 b20Var = nf3Var.a;
        long j = b20Var.i;
        List list = b20Var.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (NotificationCompat.CATEGORY_PROGRESS.equals(((b93) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b93 b93Var = (b93) it.next();
            be3 be3Var = b93Var.c;
            rk2 rk2Var = null;
            if (be3Var != null) {
                ae3 ae3Var = ae3.b;
                ae3 ae3Var2 = be3Var.b;
                Long valueOf = ae3Var == ae3Var2 ? Long.valueOf((long) be3Var.c) : ae3.c == ae3Var2 ? Long.valueOf((long) ((be3Var.c / 100) * j)) : null;
                if (valueOf != null) {
                    rk2Var = new rk2(b93Var.b, valueOf.longValue());
                }
            }
            if (rk2Var != null) {
                arrayList2.add(rk2Var);
            }
        }
        return new ArrayList(arrayList2);
    }

    @Override // yads.ug3
    public final void a(long j, long j2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rk2 rk2Var = (rk2) it.next();
            if (rk2Var.b <= j2) {
                hj3 a = hj3.c.a(this.a);
                a.b.a(new ce2(a.a, rk2Var.a, new sn3()));
                it.remove();
            }
        }
    }
}
