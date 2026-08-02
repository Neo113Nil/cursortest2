package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ta2 {
    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap();

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.b.keySet());
            this.b.clear();
            s3q0 s3q0Var = s3q0.a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pe3 pe3Var = (pe3) it.next();
            if (pe3Var != null) {
                pe3Var.a();
            }
        }
    }

    public final void a(pe3 pe3Var) {
        synchronized (this.a) {
            this.b.put(pe3Var, null);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b(pe3 pe3Var) {
        synchronized (this.a) {
            this.b.remove(pe3Var);
        }
    }
}
