package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositeMeasuringSessionHolder.kt */
/* loaded from: classes6.dex */
public final class oti implements bhn0 {
    public final List<bhn0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public oti(List<? extends bhn0> list) {
        this.a = list;
    }

    @Override // xsna.bhn0
    public final ahn0 a() {
        List<bhn0> list = this.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((bhn0) it.next()).a());
        }
        return new pti(arrayList);
    }
}
