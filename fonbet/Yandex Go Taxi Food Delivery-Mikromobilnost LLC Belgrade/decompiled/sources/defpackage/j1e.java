package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j1e implements b70 {
    public static final j1e a = new j1e();
    public static final List b = Collections.singletonList("items");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("items");
        m1e m1eVar = m1e.a;
        foe foeVar = l80.a;
        ArrayList arrayList = ((d1e) obj).a;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                m1eVar.a(bfxVar, cVar, obj2);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                m1eVar.a(ek00Var, cVar, obj2);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        ArrayList arrayList = null;
        while (xdxVar.h2(b) == 0) {
            m1e m1eVar = m1e.a;
            foe foeVar = l80.a;
            ep60 ep60Var = new ep60(m1eVar, true);
            xdxVar.l();
            arrayList = new ArrayList();
            while (xdxVar.hasNext()) {
                arrayList.add(ep60Var.b(xdxVar, cVar));
            }
            xdxVar.j();
        }
        return new d1e(arrayList);
    }
}
