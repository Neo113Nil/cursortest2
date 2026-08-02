package xsna;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes.dex */
public final class ypk {

    /* compiled from: CycleDetector.java */
    public static class a {
        public final i8i<?> a;
        public final HashSet b = new HashSet();
        public final HashSet c = new HashSet();

        public a(i8i<?> i8iVar) {
            this.a = i8iVar;
        }
    }

    /* compiled from: CycleDetector.java */
    public static class b {
        public final toe0<?> a;
        public final boolean b;

        public b() {
            throw null;
        }

        public b(toe0 toe0Var, boolean z) {
            this.a = toe0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a.equals(this.a) && bVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        for (gzl gzlVar : aVar.a.c) {
                            if (gzlVar.c == 0) {
                                Set<a> set = (Set) hashMap.get(new b(gzlVar.a, gzlVar.b == 2));
                                if (set != null) {
                                    for (a aVar2 : set) {
                                        aVar.b.add(aVar2);
                                        aVar2.c.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a aVar3 = (a) it4.next();
                    if (aVar3.c.isEmpty()) {
                        hashSet2.add(aVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i++;
                    Iterator it5 = aVar4.b.iterator();
                    while (it5.hasNext()) {
                        a aVar5 = (a) it5.next();
                        aVar5.c.remove(aVar4);
                        if (aVar5.c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    a aVar6 = (a) it6.next();
                    if (!aVar6.c.isEmpty() && !aVar6.b.isEmpty()) {
                        arrayList2.add(aVar6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            i8i i8iVar = (i8i) it.next();
            a aVar7 = new a(i8iVar);
            Iterator it7 = i8iVar.b.iterator();
            while (it7.hasNext()) {
                toe0 toe0Var = (toe0) it7.next();
                boolean z = i8iVar.e == 0;
                b bVar = new b(toe0Var, !z);
                if (!hashMap.containsKey(bVar)) {
                    hashMap.put(bVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(bVar);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + toe0Var + ".");
                }
                set2.add(aVar7);
            }
        }
    }
}
