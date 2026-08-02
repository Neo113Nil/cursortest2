package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes11.dex */
public class c5g extends e43 {
    public static <T> int u(Iterable<? extends T> iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList v(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g5g.y((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
