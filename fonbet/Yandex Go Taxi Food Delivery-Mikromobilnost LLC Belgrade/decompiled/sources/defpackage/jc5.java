package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes10.dex */
public final class jc5 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;

    public jc5() {
        Random random = new Random();
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static void b(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public final ArrayList a(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.a;
        b(elapsedRealtime, hashMap);
        HashMap hashMap2 = this.b;
        b(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ic5 ic5Var = (ic5) list.get(i);
            if (!hashMap.containsKey(ic5Var.b) && !hashMap2.containsKey(Integer.valueOf(ic5Var.c))) {
                arrayList.add(ic5Var);
            }
        }
        return arrayList;
    }

    public final ic5 c(List list) {
        ic5 ic5Var;
        ArrayList a = a(list);
        if (a.size() < 2) {
            return (ic5) eab1.b(a, null);
        }
        Collections.sort(a, new y60(4));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((ic5) a.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= a.size()) {
                break;
            }
            ic5 ic5Var2 = (ic5) a.get(i3);
            if (i2 == ic5Var2.c) {
                arrayList.add(new Pair(ic5Var2.b, Integer.valueOf(ic5Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (ic5) a.get(0);
            }
        }
        HashMap hashMap = this.c;
        ic5 ic5Var3 = (ic5) hashMap.get(arrayList);
        if (ic5Var3 != null) {
            return ic5Var3;
        }
        List subList = a.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((ic5) subList.get(i5)).d;
        }
        int nextInt = this.d.nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                ic5Var = (ic5) eab1.c(subList);
                break;
            }
            ic5Var = (ic5) subList.get(i);
            i6 += ic5Var.d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        hashMap.put(arrayList, ic5Var);
        return ic5Var;
    }
}
