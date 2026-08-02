package yads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class d7 implements u2 {
    public final long a;

    public d7(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((j7) it.next()).a();
        }
        this.a = j;
    }

    @Override // yads.u2
    public final long a() {
        return this.a;
    }

    @Override // yads.u2
    public final long a(long j) {
        return this.a;
    }
}
