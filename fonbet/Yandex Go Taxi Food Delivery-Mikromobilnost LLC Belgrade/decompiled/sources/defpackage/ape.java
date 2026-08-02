package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ape implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List w = Collections.EMPTY_LIST;

    public final int a(mmm mmmVar) {
        int intValue;
        synchronized (this.a) {
            try {
                intValue = this.b.containsKey(mmmVar) ? ((Integer) this.b.get(mmmVar)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.w.iterator();
        }
        return it;
    }
}
