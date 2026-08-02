package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes12.dex */
public final class n8c0 implements gir {
    public final Set a;
    public final Set b;
    public final Set c;
    public final kwl d;
    public final i3y e = a.b(LazyThreadSafetyMode.NONE, new t9b0(16, this));

    public n8c0(Set set, Set set2, Set set3, kwl kwlVar) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = kwlVar;
    }

    @Override // defpackage.gir
    public final g0p a() {
        this.d.getClass();
        List singletonList = Collections.singletonList(new iwl());
        LinkedHashSet h = v4r0.h(this.a, this.b);
        ArrayList arrayList = new ArrayList(tcc.n(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(((nu) it.next()).create());
        }
        return new g0p(null, null, arrayList, null, (List) this.e.getValue(), null, singletonList, null, 727);
    }
}
