package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class cf11 {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ cf11(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public i1m a(Set set) {
        boolean z;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((b5q0) it.next()).a);
        }
        hzk hzkVar = (hzk) this.c;
        hzkVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set2) {
            if (!((q1q0) hzkVar.a).a.contains(((b5q0) obj).a)) {
                linkedHashSet.add(obj);
            }
        }
        boolean z2 = true;
        if (!linkedHashSet.isEmpty()) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                if (((b5q0) it2.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        mb7 mb7Var = (mb7) hzkVar.b;
        long j = mb7Var.c + mb7Var.b;
        mb7Var.a.getClass();
        boolean z3 = j < SystemClock.elapsedRealtime();
        if (!z && (!z3 || linkedHashSet.isEmpty())) {
            z2 = false;
        }
        boolean z4 = ((gye0) this.a).a;
        LinkedHashSet U = a.U(((q1q0) this.b).a, arrayList);
        hst hstVar = jst.e;
        Objects.toString(set);
        hstVar.getClass();
        return (!z4 || z2 || U.isEmpty()) ? new g1m(arrayList, z2) : new h1m(arrayList);
    }
}
