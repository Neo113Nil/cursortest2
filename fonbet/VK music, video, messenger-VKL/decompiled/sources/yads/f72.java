package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class f72 implements o72 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // yads.o72
    public final void a(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((o72) it.next()).a(j, j2);
        }
    }

    @Override // yads.o72
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((o72) it.next()).b();
        }
    }

    @Override // yads.o72
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((o72) it.next()).a();
        }
    }
}
