package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes9.dex */
public final class fn00 {
    public final HashMap a = new HashMap();

    public static final class a {
        public final HashMap a = new HashMap();
    }

    public final void a() {
        HashSet hashSet = new HashSet();
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ycc.r(((a) ((Map.Entry) it.next()).getValue()).a.keySet(), hashSet);
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((a) ((Map.Entry) it2.next()).getValue()).a.values().iterator();
            while (it3.hasNext()) {
                ((Set) it3.next()).retainAll(hashSet);
            }
        }
    }

    public final synchronized void b(ro00 ro00Var, ro00 ro00Var2, boolean z) {
        a aVar = (a) this.a.get(ro00Var.c());
        if (aVar == null) {
            return;
        }
        a aVar2 = (a) this.a.get(ro00Var2.c());
        if (aVar2 == null) {
            return;
        }
        HashMap hashMap = aVar.a;
        if (z) {
            Set set = (Set) hashMap.get(ro00Var);
            if (set != null) {
                set.add(ro00Var2);
            }
            Set set2 = (Set) aVar2.a.get(ro00Var2);
            if (set2 != null) {
                set2.add(ro00Var);
            }
        } else {
            Set set3 = (Set) hashMap.get(ro00Var);
            if (set3 != null) {
                set3.remove(ro00Var2);
            }
            Set set4 = (Set) aVar2.a.get(ro00Var2);
            if (set4 != null) {
                set4.remove(ro00Var);
            }
        }
    }

    public final void c(Participant participant, List list) {
        a aVar = (a) this.a.get(participant);
        if (aVar == null) {
            return;
        }
        HashMap hashMap = aVar.a;
        if (list.isEmpty()) {
            hashMap.clear();
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ro00 ro00Var = (ro00) it.next();
            Collection collection = (Set) hashMap.get(ro00Var);
            if (collection == null) {
                collection = new HashSet();
            }
            hashMap2.put(ro00Var, collection);
        }
        hashMap.clear();
        hashMap.putAll(hashMap2);
    }

    public final synchronized void d(Participant participant, List list, Participant participant2, List list2) {
        c(participant, list);
        c(participant2, list2);
        a();
    }
}
