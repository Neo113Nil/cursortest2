package xsna;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: BaseUrlExclusionList.java */
/* loaded from: classes12.dex */
public final class wp6 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;

    public wp6() {
        Random random = new Random();
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static int b(List<tp6> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).c));
        }
        return hashSet.size();
    }

    public static void d(long j, HashMap hashMap) {
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
        d(elapsedRealtime, hashMap);
        HashMap hashMap2 = this.b;
        d(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            tp6 tp6Var = (tp6) list.get(i);
            if (!hashMap.containsKey(tp6Var.b) && !hashMap2.containsKey(Integer.valueOf(tp6Var.c))) {
                arrayList.add(tp6Var);
            }
        }
        return arrayList;
    }

    public final int c(List<tp6> list) {
        HashSet hashSet = new HashSet();
        ArrayList a = a(list);
        for (int i = 0; i < a.size(); i++) {
            hashSet.add(Integer.valueOf(((tp6) a.get(i)).c));
        }
        return hashSet.size();
    }

    @Nullable
    public final tp6 e(List<tp6> list) {
        tp6 tp6Var;
        ArrayList a = a(list);
        if (a.size() < 2) {
            return (tp6) lwx.b(a.iterator(), null);
        }
        Collections.sort(a, new vp6());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((tp6) a.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= a.size()) {
                break;
            }
            tp6 tp6Var2 = (tp6) a.get(i3);
            if (i2 == tp6Var2.c) {
                arrayList.add(new Pair(tp6Var2.b, Integer.valueOf(tp6Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (tp6) a.get(0);
            }
        }
        HashMap hashMap = this.c;
        tp6 tp6Var3 = (tp6) hashMap.get(arrayList);
        if (tp6Var3 != null) {
            return tp6Var3;
        }
        List subList = a.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((tp6) subList.get(i5)).d;
        }
        int nextInt = this.d.nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                tp6Var = (tp6) sd9.k(subList);
                break;
            }
            tp6Var = (tp6) subList.get(i);
            i6 += tp6Var.d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        hashMap.put(arrayList, tp6Var);
        return tp6Var;
    }
}
