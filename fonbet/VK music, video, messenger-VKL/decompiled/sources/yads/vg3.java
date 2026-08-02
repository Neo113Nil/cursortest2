package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class vg3 implements ug3, wg3 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();

    @Override // yads.ug3
    public final void a(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ug3) it.next()).a(j, j2);
        }
    }

    @Override // yads.wg3
    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wg3) it.next()).b();
        }
    }

    @Override // yads.wg3
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wg3) it.next()).a();
        }
    }
}
