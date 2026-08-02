package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ozq0;

/* compiled from: DonutUserStack.kt */
/* loaded from: classes17.dex */
public final class t4o implements s4o {
    public final ArrayList a = new ArrayList();
    public final SnapshotStateList<ozq0> b = new SnapshotStateList<>();

    @Override // xsna.s4o
    public final <T> void a(List<? extends T> list, kwn<T> kwnVar) {
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ozq0.a(new jai(1683707044, new i3c(1, kwnVar, it.next()), true)));
        }
        g5g.y(arrayList, this.a);
    }

    @Override // xsna.s4o
    public final void b(izn iznVar) {
        this.a.add(new ozq0.b(new jai(-97050816, new sc8(iznVar, 1), true)));
    }
}
