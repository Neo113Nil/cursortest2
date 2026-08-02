package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SelectionState.kt */
/* loaded from: classes4.dex */
public final class rei0 {
    public ArrayList<mdi0> a;

    public final ArrayList a() {
        ArrayList<mdi0> arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<mdi0> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().a);
        }
        return arrayList2;
    }

    public final int b(q4t q4tVar) {
        Iterator<mdi0> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (epx.f(it.next().a, q4tVar)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean c(q4t q4tVar) {
        Object obj;
        Iterator<T> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mdi0) obj).a.c() == q4tVar.c()) {
                break;
            }
        }
        return obj != null;
    }
}
