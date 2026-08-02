package yads;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class r53 {
    public static volatile r53 b;
    public static final Object c = new Object();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(le1 le1Var, Object obj) {
        synchronized (c) {
            Set set = (Set) this.a.get(le1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(le1 le1Var, Object obj) {
        synchronized (c) {
            try {
                Set set = (Set) this.a.get(le1Var);
                if (set == null) {
                    set = new LinkedHashSet();
                    this.a.put(le1Var, set);
                }
                set.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
