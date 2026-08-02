package xsna;

import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.xen;

/* compiled from: DisplayLayoutProviderCollectionImpl.kt */
/* loaded from: classes11.dex */
public final class yen implements xen {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();

    @Override // xsna.xen
    public final void a(wen wenVar) {
        this.a.add(wenVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((xen.a) it.next()).a();
        }
    }

    @Override // xsna.xen
    public final void b(wen wenVar) {
        this.a.remove(wenVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((xen.a) it.next()).a();
        }
    }
}
