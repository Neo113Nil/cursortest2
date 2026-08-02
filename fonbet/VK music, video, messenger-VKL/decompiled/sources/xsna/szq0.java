package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.pzq0;

/* compiled from: VkUserStack.kt */
/* loaded from: classes17.dex */
public final class szq0 implements rzq0 {
    public final ArrayList a = new ArrayList();
    public final SnapshotStateList<pzq0> b = new SnapshotStateList<>();

    @Override // xsna.rzq0
    public final void a(ixj ixjVar) {
        this.a.add(new pzq0.b(new jai(1112128010, new coj(ixjVar, 5), true)));
    }

    @Override // xsna.rzq0
    public final <T> void b(List<? extends T> list, wq5<T> wq5Var) {
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new pzq0.a(new jai(381166023, new zt7(4, wq5Var, it.next()), true)));
        }
        g5g.y(arrayList, this.a);
    }
}
