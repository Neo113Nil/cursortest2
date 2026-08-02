package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class lgu {
    public abstract int a();

    public abstract List b();

    public abstract long c(int i);

    public void d(HashSet hashSet) {
        a();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c(((Number) it.next()).intValue());
        }
    }
}
