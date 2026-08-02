package xsna;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.kt */
/* loaded from: classes.dex */
public final class eq9 {
    public static final void a(String str, dwx0 dwx0Var) {
        uyx0 b;
        WorkDatabase workDatabase = dwx0Var.c;
        gxx0 D = workDatabase.D();
        izl y = workDatabase.y();
        ArrayList o = e43.o(str);
        while (!o.isEmpty()) {
            String str2 = (String) g5g.I(o);
            WorkInfo.State d = D.d(str2);
            if (d != WorkInfo.State.SUCCEEDED && d != WorkInfo.State.FAILED) {
                D.e(str2);
            }
            o.addAll(y.a(str2));
        }
        ohd0 ohd0Var = dwx0Var.f;
        synchronized (ohd0Var.k) {
            m100.c().getClass();
            ohd0Var.i.add(str);
            b = ohd0Var.b(str);
        }
        ohd0.d(b, 1);
        Iterator<z7h0> it = dwx0Var.e.iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }
}
