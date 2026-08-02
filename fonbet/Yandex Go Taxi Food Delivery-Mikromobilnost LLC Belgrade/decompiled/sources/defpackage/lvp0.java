package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class lvp0 {
    public static b580 a(String str, List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((b580) next).a, str)) {
                obj = next;
                break;
            }
        }
        return (b580) obj;
    }
}
