package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes7.dex */
public final class mn71 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;

    public mn71() {
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
            ik71 ik71Var = (ik71) list.get(i);
            if (!hashMap.containsKey(ik71Var.b) && !hashMap2.containsKey(Integer.valueOf(ik71Var.c))) {
                arrayList.add(ik71Var);
            }
        }
        return arrayList;
    }

    public final ik71 c(List list) {
        ik71 ik71Var;
        ArrayList a = a(list);
        if (a.size() < 2) {
            Iterator it = a.iterator();
            return (ik71) (it.hasNext() ? it.next() : null);
        }
        Collections.sort(a, new uw21(14));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((ik71) a.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= a.size()) {
                break;
            }
            ik71 ik71Var2 = (ik71) a.get(i3);
            if (i2 == ik71Var2.c) {
                arrayList.add(new Pair(ik71Var2.b, Integer.valueOf(ik71Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (ik71) a.get(0);
            }
        }
        HashMap hashMap = this.c;
        ik71 ik71Var3 = (ik71) hashMap.get(arrayList);
        if (ik71Var3 != null) {
            return ik71Var3;
        }
        List subList = a.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((ik71) subList.get(i5)).d;
        }
        int nextInt = this.d.nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                ik71Var = (ik71) jla1.g(subList);
                break;
            }
            ik71Var = (ik71) subList.get(i);
            i6 += ik71Var.d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        hashMap.put(arrayList, ik71Var);
        return ik71Var;
    }
}
