package xsna;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: SearchIndexes.kt */
/* loaded from: classes4.dex */
public final class uvh0 {
    public final HashMap<dcy<?>, svh0<?, ?>> a = new HashMap<>(32);

    public final void a(Object obj) {
        Iterator<T> it = this.a.values().iterator();
        while (it.hasNext()) {
            ((svh0) it.next()).add(obj);
        }
    }

    public final void b(Object obj) {
        Iterator<T> it = this.a.values().iterator();
        while (it.hasNext()) {
            ((svh0) it.next()).remove(obj);
        }
    }
}
