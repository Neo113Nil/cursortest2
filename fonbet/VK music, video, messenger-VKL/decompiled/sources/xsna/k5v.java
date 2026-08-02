package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.us2;
import xsna.uv70;

/* compiled from: VkTemporalPicker.kt */
/* loaded from: classes17.dex */
public final class k5v implements b6u0 {
    public final ArrayList a;
    public final long b;

    public k5v(ArrayList arrayList, long j) {
        this.a = arrayList;
        this.b = j;
    }

    @Override // xsna.b6u0
    public final klp0 a(us2 us2Var) {
        us2.b bVar = new us2.b();
        bVar.h(us2Var);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            k9x k9xVar = (k9x) it.next();
            bVar.d(new hik0(this.b, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), k9xVar.b, k9xVar.c + 1);
        }
        return new klp0(bVar.n(), uv70.a.a);
    }
}
