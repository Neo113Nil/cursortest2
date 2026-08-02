package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import yads.kc1;

/* loaded from: classes7.dex */
public final class m481 {
    public static volatile m481 b;
    public static final Object c = new Object();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(kc1 kc1Var, Object obj) {
        synchronized (c) {
            Set set = (Set) this.a.get(kc1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(kc1 kc1Var, Object obj) {
        synchronized (c) {
            try {
                Set set = (Set) this.a.get(kc1Var);
                if (set == null) {
                    set = new LinkedHashSet();
                    this.a.put(kc1Var, set);
                }
                set.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
