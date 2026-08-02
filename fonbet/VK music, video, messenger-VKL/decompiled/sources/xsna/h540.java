package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiLogRecordProcessor.java */
/* loaded from: classes8.dex */
public final class h540 implements o000 {
    public final ArrayList b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public h540(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.o000
    public final v7i forceFlush() {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o000) it.next()).forceFlush());
        }
        return v7i.d(arrayList2);
    }

    @Override // xsna.o000
    public final void onEmit(wmj wmjVar, o7f0 o7f0Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((o000) it.next()).onEmit(wmjVar, o7f0Var);
        }
    }

    @Override // xsna.o000
    public final v7i shutdown() {
        if (this.c.getAndSet(true)) {
            return v7i.e;
        }
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o000) it.next()).shutdown());
        }
        return v7i.d(arrayList2);
    }
}
