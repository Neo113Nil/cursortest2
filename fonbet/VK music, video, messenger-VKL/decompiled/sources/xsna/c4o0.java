package xsna;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes12.dex */
public final class c4o0 implements c5z {
    public final Set<u3o0<?>> b = Collections.newSetFromMap(new WeakHashMap());

    @Override // xsna.c5z
    public final void onDestroy() {
        Iterator it = s2r0.e(this.b).iterator();
        while (it.hasNext()) {
            ((u3o0) it.next()).onDestroy();
        }
    }

    @Override // xsna.c5z
    public final void onStart() {
        Iterator it = s2r0.e(this.b).iterator();
        while (it.hasNext()) {
            ((u3o0) it.next()).onStart();
        }
    }

    @Override // xsna.c5z
    public final void onStop() {
        Iterator it = s2r0.e(this.b).iterator();
        while (it.hasNext()) {
            ((u3o0) it.next()).onStop();
        }
    }
}
