package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import xsna.fxx0;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public final class mmp {
    public static final String a = m100.d("EnqueueRunnable");

    public static void a(@NonNull xux0 xux0Var) {
        boolean z;
        dwx0 dwx0Var = xux0Var.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(xux0Var.e);
        HashSet d = xux0.d(xux0Var);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(xux0Var.e);
                z = false;
                break;
            } else if (d.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            throw new IllegalStateException("WorkContinuation has cycles (" + xux0Var + ")");
        }
        WorkDatabase workDatabase = dwx0Var.c;
        workDatabase.c();
        try {
            omp.a(workDatabase, dwx0Var.b, xux0Var);
            boolean b = b(xux0Var);
            workDatabase.w();
            if (b) {
                i8h0.b(dwx0Var.b, dwx0Var.c, dwx0Var.e);
            }
        } finally {
            workDatabase.q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(@NonNull xux0 xux0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator<? extends androidx.work.e> it;
        boolean z5;
        boolean z6;
        izl izlVar;
        HashSet d = xux0.d(xux0Var);
        dwx0 dwx0Var = xux0Var.a;
        List<? extends androidx.work.e> list = xux0Var.d;
        String[] strArr = (String[]) d.toArray(new String[0]);
        String str = xux0Var.b;
        ExistingWorkPolicy existingWorkPolicy = xux0Var.c;
        dwx0Var.b.d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = dwx0Var.c;
        boolean z7 = strArr != null && strArr.length > 0;
        if (z7) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str2 : strArr) {
                fxx0 j = workDatabase.D().j(str2);
                if (j == null) {
                    m100.c().a(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                WorkInfo.State state = j.b;
                z &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z3 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z7) {
            ArrayList A = workDatabase.D().A(str);
            if (!A.isEmpty()) {
                if (existingWorkPolicy != ExistingWorkPolicy.APPEND && existingWorkPolicy != ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        Iterator it2 = A.iterator();
                        while (it2.hasNext()) {
                            WorkInfo.State state2 = ((fxx0.b) it2.next()).b;
                            if (state2 != WorkInfo.State.ENQUEUED && state2 != WorkInfo.State.RUNNING) {
                            }
                            z6 = true;
                            z5 = false;
                        }
                    }
                    WorkDatabase workDatabase2 = dwx0Var.c;
                    workDatabase2.v(new zp9(workDatabase2, str, dwx0Var));
                    gxx0 D = workDatabase.D();
                    Iterator it3 = A.iterator();
                    while (it3.hasNext()) {
                        D.delete(((fxx0.b) it3.next()).a);
                    }
                    z4 = true;
                    it = list.iterator();
                    while (it.hasNext()) {
                        androidx.work.e next = it.next();
                        fxx0 fxx0Var = next.b;
                        UUID uuid = next.a;
                        if (!z7 || z) {
                            fxx0Var.n = currentTimeMillis;
                        } else if (z3) {
                            fxx0Var.b = WorkInfo.State.FAILED;
                        } else if (z2) {
                            fxx0Var.b = WorkInfo.State.CANCELLED;
                        } else {
                            fxx0Var.b = WorkInfo.State.BLOCKED;
                        }
                        boolean z8 = fxx0Var.b == WorkInfo.State.ENQUEUED ? true : z4;
                        workDatabase.D().g(omp.b(fxx0Var));
                        if (z7) {
                            int length = strArr.length;
                            int i = 0;
                            while (i < length) {
                                String[] strArr2 = strArr;
                                workDatabase.y().c(new fzl(uuid.toString(), strArr2[i]));
                                i++;
                                z8 = z8;
                                strArr = strArr2;
                                it = it;
                            }
                        }
                        String[] strArr3 = strArr;
                        boolean z9 = z8;
                        Iterator<? extends androidx.work.e> it4 = it;
                        workDatabase.E().b(uuid.toString(), next.c);
                        if (!isEmpty) {
                            workDatabase.B().b(new jwx0(str, uuid.toString()));
                        }
                        z4 = z9;
                        strArr = strArr3;
                        it = it4;
                    }
                    z5 = z4;
                    z6 = true;
                    xux0Var.g = z6;
                    return z5;
                }
                izl y = workDatabase.y();
                ArrayList arrayList = new ArrayList();
                Iterator it5 = A.iterator();
                while (it5.hasNext()) {
                    fxx0.b bVar = (fxx0.b) it5.next();
                    if (y.d(bVar.a)) {
                        izlVar = y;
                    } else {
                        WorkInfo.State state3 = bVar.b;
                        izlVar = y;
                        boolean z10 = (state3 == WorkInfo.State.SUCCEEDED) & z;
                        if (state3 == WorkInfo.State.FAILED) {
                            z3 = true;
                        } else if (state3 == WorkInfo.State.CANCELLED) {
                            z2 = true;
                        }
                        arrayList.add(bVar.a);
                        z = z10;
                    }
                    y = izlVar;
                }
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                    gxx0 D2 = workDatabase.D();
                    Iterator it6 = D2.A(str).iterator();
                    while (it6.hasNext()) {
                        D2.delete(((fxx0.b) it6.next()).a);
                    }
                    z2 = false;
                    z3 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z7 = strArr.length > 0;
            }
        }
        z4 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        z5 = z4;
        z6 = true;
        xux0Var.g = z6;
        return z5;
    }
}
