package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class ed60 {
    public abstract int a();

    public abstract boolean b(int i);

    public abstract List c();

    public abstract long d(int i);

    public void e(HashSet hashSet) {
        a();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            d(((Number) it.next()).intValue());
        }
    }
}
