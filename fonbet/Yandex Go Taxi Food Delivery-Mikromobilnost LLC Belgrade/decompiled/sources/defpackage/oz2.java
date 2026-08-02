package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class oz2 {
    public final ArrayList a = new ArrayList();

    public final void a(s7s s7sVar) {
        boolean z = s7sVar instanceof je60;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(s7sVar);
        } else {
            if (!(s7sVar instanceof uwd)) {
                w511.b();
                return;
            }
            Iterator it = ((uwd) s7sVar).a.iterator();
            while (it.hasNext()) {
                arrayList.add((je60) it.next());
            }
        }
    }
}
