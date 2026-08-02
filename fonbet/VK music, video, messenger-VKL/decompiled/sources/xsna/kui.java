package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompositeRequestEventListener.kt */
/* loaded from: classes.dex */
public final class kui implements cx2 {
    public final ArrayList a = new ArrayList();

    @Override // xsna.cx2
    public final void a(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cx2) it.next()).a(j);
        }
    }

    @Override // xsna.cx2
    public final void b(long j, Exception exc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cx2) it.next()).b(j, exc);
        }
    }

    @Override // xsna.cx2
    public final void c(long j, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cx2) it.next()).c(j, str);
        }
    }
}
