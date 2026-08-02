package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CompositeListener.kt */
/* loaded from: classes3.dex */
public final class mti implements j6q0 {
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // xsna.j6q0
    public final void a(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((j6q0) it.next()).a(z);
        }
    }

    @Override // xsna.j6q0
    public final void b(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((j6q0) it.next()).b(z);
        }
    }

    @Override // xsna.j6q0
    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((j6q0) it.next()).c();
        }
    }

    @Override // xsna.j6q0
    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((j6q0) it.next()).e();
        }
    }
}
