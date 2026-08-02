package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: EventfulPlayerStateController.kt */
/* loaded from: classes3.dex */
public final class w0q {
    public final nt10 a;
    public final LinkedHashSet<x0q> b = izi0.e(new wyy(), new yno());
    public ry40 c;

    public w0q(nt10 nt10Var) {
        this.a = nt10Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ry40 ry40Var) {
        if (!(ry40Var instanceof v0q) || ((v0q) ry40Var).a().a.e) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (!((x0q) obj).a(this.c, ry40Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x0q) it.next()).getTag());
        }
        bn40.f("Failed eventful state filters = " + arrayList2 + " (state=" + ry40Var + ", last state=" + this.c + ')');
        if (arrayList2.isEmpty()) {
            this.c = ry40Var;
            this.a.invoke(ry40Var);
        }
    }
}
