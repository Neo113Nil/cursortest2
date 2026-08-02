package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class q82 implements kb2, wv1 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // yads.wv1
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r82) it.next()).a();
        }
    }

    @Override // yads.kb2
    public final void a(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r82) it.next()).a(z);
        }
    }

    @Override // yads.kb2
    public final void c() {
    }
}
