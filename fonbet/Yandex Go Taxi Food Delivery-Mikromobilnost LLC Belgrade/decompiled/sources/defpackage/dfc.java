package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class dfc implements b70 {
    public static final dfc a = new dfc();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        xec xecVar = (xec) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(xecVar.a);
        List list = qyt.a;
        oyt oytVar = xecVar.b;
        bfxVar.A1("__typename");
        foe foeVar2 = l80.a;
        bfxVar.r0(oytVar.a);
        bfxVar.A1("colors");
        ep60 a2 = l80.a(pyt.a);
        ArrayList arrayList = oytVar.b;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a2.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        kyt kytVar = oytVar.c;
        if (kytVar != null) {
            List list2 = syt.a;
            bfxVar.A1("angle");
            l80.c.a(bfxVar, cVar, Double.valueOf(kytVar.a));
        }
        lyt lytVar = oytVar.d;
        if (lytVar != null) {
            tyt.d(bfxVar, cVar, lytVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new xec(str, qyt.c(xdxVar, cVar));
    }
}
