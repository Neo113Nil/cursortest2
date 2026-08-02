package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class nwi0 implements mwi0 {
    public final ArrayList a = new ArrayList(8);

    @Override // defpackage.mwi0
    public final void remove() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((mwi0) it.next()).remove();
        }
        arrayList.clear();
    }
}
