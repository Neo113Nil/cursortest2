package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public final class i8h0 {
    public static final /* synthetic */ int a = 0;

    static {
        m100.d("Schedulers");
    }

    public static void a(gxx0 gxx0Var, i7o0 i7o0Var, List list) {
        if (list.size() > 0) {
            i7o0Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gxx0Var.u(currentTimeMillis, ((fxx0) it.next()).a);
            }
        }
    }

    public static void b(@NonNull androidx.work.a aVar, @NonNull WorkDatabase workDatabase, @Nullable List<z7h0> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        gxx0 D = workDatabase.D();
        workDatabase.c();
        try {
            ArrayList q = D.q();
            a(D, aVar.d, q);
            ArrayList C = D.C(aVar.k);
            a(D, aVar.d, C);
            C.addAll(q);
            ArrayList y = D.y();
            workDatabase.w();
            workDatabase.q();
            if (C.size() > 0) {
                fxx0[] fxx0VarArr = (fxx0[]) C.toArray(new fxx0[C.size()]);
                for (z7h0 z7h0Var : list) {
                    if (z7h0Var.c()) {
                        z7h0Var.e(fxx0VarArr);
                    }
                }
            }
            if (y.size() > 0) {
                fxx0[] fxx0VarArr2 = (fxx0[]) y.toArray(new fxx0[y.size()]);
                for (z7h0 z7h0Var2 : list) {
                    if (!z7h0Var2.c()) {
                        z7h0Var2.e(fxx0VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.q();
            throw th;
        }
    }
}
