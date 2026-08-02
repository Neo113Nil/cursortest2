package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: RequestBatcher.kt */
/* loaded from: classes5.dex */
public final class h7g0<T> {
    public final int a;
    public final LinkedList b;
    public final LinkedList c = new LinkedList();

    public h7g0(List list, int i) {
        this.a = i;
        this.b = new LinkedList(list);
    }

    public final boolean a() {
        return (this.b.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public final ArrayList b() {
        int i = this.a;
        ArrayList arrayList = new ArrayList(i);
        Iterator it = this.c.iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add(it.next());
            it.remove();
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext() && arrayList.size() < i) {
            arrayList.add(it2.next());
            it2.remove();
        }
        return arrayList;
    }
}
