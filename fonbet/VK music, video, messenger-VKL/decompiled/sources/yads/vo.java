package yads;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import xsna.tgz0;

/* loaded from: classes10.dex */
public final class vo {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;

    public vo() {
        this(new Random());
    }

    public static int a(uo uoVar, uo uoVar2) {
        int compare = Integer.compare(uoVar.c, uoVar2.c);
        return compare != 0 ? compare : uoVar.b.compareTo(uoVar2.b);
    }

    public final uo b(s51 s51Var) {
        uo uoVar;
        ArrayList a = a(s51Var);
        if (a.size() < 2) {
            Iterator it = a.iterator();
            return (uo) (it.hasNext() ? it.next() : null);
        }
        Collections.sort(a, new tgz0());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((uo) a.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= a.size()) {
                break;
            }
            uo uoVar2 = (uo) a.get(i3);
            if (i2 == uoVar2.c) {
                arrayList.add(new Pair(uoVar2.b, Integer.valueOf(uoVar2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (uo) a.get(0);
            }
        }
        uo uoVar3 = (uo) this.c.get(arrayList);
        if (uoVar3 != null) {
            return uoVar3;
        }
        List subList = a.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((uo) subList.get(i5)).d;
        }
        int nextInt = this.d.nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                uoVar = (uo) yd1.a(subList);
                break;
            }
            uoVar = (uo) subList.get(i);
            i6 += uoVar.d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        this.c.put(arrayList, uoVar);
        return uoVar;
    }

    public vo(Random random) {
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static void a(long j, HashMap hashMap) {
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

    public final ArrayList a(s51 s51Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a(elapsedRealtime, this.a);
        a(elapsedRealtime, this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < s51Var.size(); i++) {
            uo uoVar = (uo) s51Var.get(i);
            if (!this.a.containsKey(uoVar.b) && !this.b.containsKey(Integer.valueOf(uoVar.c))) {
                arrayList.add(uoVar);
            }
        }
        return arrayList;
    }
}
