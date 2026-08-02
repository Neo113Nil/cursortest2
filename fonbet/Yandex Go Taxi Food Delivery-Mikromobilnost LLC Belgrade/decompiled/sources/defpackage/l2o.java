package defpackage;

import android.text.TextUtils;
import androidx.room.util.a;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class l2o {
    public static final String a = hgz.o("EnqueueRunnable");

    public static void a(a951 a951Var) {
        boolean z;
        b bVar = a951Var.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(a951Var.e);
        HashSet b = a951.b(a951Var);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(a951Var.e);
                z = false;
                break;
            } else if (b.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            vg10.p("WorkContinuation has cycles (", a951Var, Extension.C_BRAKE);
            return;
        }
        WorkDatabase workDatabase = bVar.c;
        u0e u0eVar = bVar.b;
        workDatabase.v0();
        try {
            udq0.i(workDatabase, u0eVar, a951Var);
            boolean b2 = b(a951Var);
            workDatabase.Q0();
            if (b2) {
                pom0.b(u0eVar, bVar.c, bVar.e);
            }
        } finally {
            workDatabase.B0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(a951 a951Var) {
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        boolean z4;
        boolean z5;
        Iterator it;
        boolean z6;
        boolean z7;
        HashSet b = a951.b(a951Var);
        b bVar = a951Var.a;
        List list2 = a951Var.d;
        String[] strArr = (String[]) b.toArray(new String[0]);
        String str = a951Var.b;
        ExistingWorkPolicy existingWorkPolicy = a951Var.c;
        bVar.b.d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = bVar.c;
        boolean z8 = strArr != null && strArr.length > 0;
        if (z8) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str2 : strArr) {
                fa51 d = workDatabase.X0().d(str2);
                if (d == null) {
                    hgz.g().e(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                WorkInfo$State workInfo$State = d.b;
                z &= workInfo$State == WorkInfo$State.SUCCEEDED;
                if (workInfo$State == WorkInfo$State.FAILED) {
                    z3 = true;
                } else if (workInfo$State == WorkInfo$State.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z8) {
            List<da51> e = workDatabase.X0().e(str);
            if (!e.isEmpty()) {
                if (existingWorkPolicy != ExistingWorkPolicy.APPEND && existingWorkPolicy != ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        Iterator it2 = e.iterator();
                        while (it2.hasNext()) {
                            WorkInfo$State workInfo$State2 = ((da51) it2.next()).b;
                            if (workInfo$State2 != WorkInfo$State.ENQUEUED && workInfo$State2 != WorkInfo$State.RUNNING) {
                            }
                            z7 = false;
                            z6 = true;
                        }
                    }
                    workDatabase.P0(new gtg(5, new v08(workDatabase, str, bVar, 0)));
                    ia51 X0 = workDatabase.X0();
                    Iterator it3 = e.iterator();
                    while (it3.hasNext()) {
                        a.b(X0.a, false, true, new brd(((da51) it3.next()).a, 24));
                        X0 = X0;
                    }
                    list = list2;
                    z4 = isEmpty;
                    z5 = true;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    z6 = true;
                    z7 = z5;
                    a951Var.g = z6;
                    return z7;
                }
                ywi S0 = workDatabase.S0();
                ArrayList arrayList = new ArrayList();
                for (da51 da51Var : e) {
                    List list3 = list2;
                    ywi ywiVar = S0;
                    boolean z9 = isEmpty;
                    if (!((Boolean) a.b(S0.a, true, false, new wwb(da51Var.a, 13))).booleanValue()) {
                        WorkInfo$State workInfo$State3 = da51Var.b;
                        boolean z10 = (workInfo$State3 == WorkInfo$State.SUCCEEDED) & z;
                        if (workInfo$State3 == WorkInfo$State.FAILED) {
                            z3 = true;
                        } else if (workInfo$State3 == WorkInfo$State.CANCELLED) {
                            z2 = true;
                        }
                        arrayList.add(da51Var.a);
                        z = z10;
                    }
                    list2 = list3;
                    S0 = ywiVar;
                    isEmpty = z9;
                }
                list = list2;
                z4 = isEmpty;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                    ia51 X02 = workDatabase.X0();
                    Iterator it4 = X02.e(str).iterator();
                    while (it4.hasNext()) {
                        a.b(X02.a, false, true, new brd(((da51) it4.next()).a, 24));
                    }
                    z2 = false;
                    z3 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z8 = strArr.length > 0;
                z5 = false;
                it = list.iterator();
                while (it.hasNext()) {
                    ba51 ba51Var = (ba51) it.next();
                    fa51 fa51Var = ba51Var.b;
                    UUID uuid = ba51Var.a;
                    if (!z8 || z) {
                        fa51Var.n = currentTimeMillis;
                    } else if (z3) {
                        fa51Var.b = WorkInfo$State.FAILED;
                    } else if (z2) {
                        fa51Var.b = WorkInfo$State.CANCELLED;
                    } else {
                        fa51Var.b = WorkInfo$State.BLOCKED;
                    }
                    if (fa51Var.b == WorkInfo$State.ENQUEUED) {
                        z5 = true;
                    }
                    ia51 X03 = workDatabase.X0();
                    boolean z11 = z5;
                    Iterator it5 = it;
                    a.b(X03.a, false, true, new fgw0(9, X03, udq0.W(fa51Var)));
                    if (z8) {
                        int i = 0;
                        for (int length = strArr.length; i < length; length = length) {
                            uwi uwiVar = new uwi(uuid.toString(), strArr[i]);
                            ywi S02 = workDatabase.S0();
                            a.b(S02.a, false, true, new dke(29, S02, uwiVar));
                            i++;
                            strArr = strArr;
                        }
                    }
                    String[] strArr2 = strArr;
                    workDatabase.Y0().a(uuid.toString(), ba51Var.c);
                    if (!z4) {
                        v951 V0 = workDatabase.V0();
                        a.b(V0.a, false, true, new fgw0(5, V0, new u951(str, uuid.toString())));
                    }
                    z5 = z11;
                    it = it5;
                    strArr = strArr2;
                }
                z6 = true;
                z7 = z5;
                a951Var.g = z6;
                return z7;
            }
        }
        list = list2;
        z4 = isEmpty;
        z5 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        z6 = true;
        z7 = z5;
        a951Var.g = z6;
        return z7;
    }
}
