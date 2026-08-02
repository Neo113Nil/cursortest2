package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class dlw0 {
    public final HashMap a;
    public final HashMap b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public dlw0(Set set, Set set2) {
        HashMap hashMap = new HashMap((int) Math.ceil((set.size() + set2.size()) / 0.75d));
        HashMap hashMap2 = new HashMap((int) Math.ceil(set.size() / 0.75d));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            clw0 clw0Var = (clw0) it.next();
            hashMap.put(clw0Var.a, clw0Var);
            hashMap2.put(clw0Var.b, clw0Var);
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            clw0 clw0Var2 = (clw0) it2.next();
            hashMap.put(clw0Var2.a, clw0Var2);
        }
        this.a = hashMap;
        this.b = hashMap2;
    }
}
