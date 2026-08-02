package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompositeDecorationAction.kt */
/* loaded from: classes4.dex */
public final class tsi extends gux {
    public final ArrayList a;

    public tsi(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.gux
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gux) it.next()).a();
        }
    }
}
