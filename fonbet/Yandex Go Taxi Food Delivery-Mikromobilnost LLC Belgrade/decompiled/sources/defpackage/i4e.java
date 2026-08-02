package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class i4e implements fie0 {
    public final ArrayList a;

    public i4e(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.fie0
    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((fie0) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
