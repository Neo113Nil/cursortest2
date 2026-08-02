package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VkContextMenu.kt */
/* loaded from: classes17.dex */
public final class doj implements aoj {
    public nnj a;
    public nnj b;
    public final ArrayList c = new ArrayList();
    public final wh50 d = androidx.compose.runtime.k.b(null);
    public final wh50 e = androidx.compose.runtime.k.b(null);
    public final SnapshotStateList<nnj> f = new SnapshotStateList<>();

    @Override // xsna.aoj
    public final void a(znj znjVar) {
        this.c.add(new nnj(new jai(1425016881, new coj(znjVar, 0), true)));
    }

    @Override // xsna.aoj
    public final void b() {
        this.c.add(new nnj(qni.a));
    }

    @Override // xsna.aoj
    public final void c(List list, umd0 umd0Var) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new nnj(new jai(-408452541, new zt7(1, umd0Var, it.next()), true)));
        }
        g5g.y(arrayList, this.c);
    }
}
