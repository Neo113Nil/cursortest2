package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class a00 implements Iterable {
    public final Object b = new Object();
    public final HashMap c = new HashMap();
    public Set d = Collections.EMPTY_SET;
    public List e = Collections.EMPTY_LIST;

    public final int a(Object obj) {
        int intValue;
        synchronized (this.b) {
            try {
                intValue = this.c.containsKey(obj) ? ((Integer) this.c.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public final void b(Object obj) {
        synchronized (this.b) {
            try {
                Integer num = (Integer) this.c.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.e);
                arrayList.remove(obj);
                this.e = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.c.remove(obj);
                    HashSet hashSet = new HashSet(this.d);
                    hashSet.remove(obj);
                    this.d = Collections.unmodifiableSet(hashSet);
                } else {
                    this.c.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.b) {
            it = this.e.iterator();
        }
        return it;
    }
}
