package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class hje {
    public final ArrayList a = new ArrayList();

    public hje(Object obj) {
        a(obj);
    }

    public final void a(Object obj) {
        boolean z = obj instanceof List;
        ArrayList arrayList = this.a;
        if (!z) {
            arrayList.add(obj);
            return;
        }
        for (Object obj2 : (List) obj) {
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
    }
}
