package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b1e implements b70 {
    public static final b1e a = new b1e();
    public static final List b = Collections.singletonList("sections");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("sections");
        a1e a1eVar = a1e.a;
        foe foeVar = l80.a;
        ArrayList arrayList = ((x0e) obj).a;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                a1eVar.a(bfxVar, cVar, obj2);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                a1eVar.a(ek00Var, cVar, obj2);
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
            a1e a1eVar = a1e.a;
            foe foeVar = l80.a;
            ep60 ep60Var = new ep60(a1eVar, true);
            xdxVar.l();
            arrayList = new ArrayList();
            while (xdxVar.hasNext()) {
                arrayList.add(ep60Var.b(xdxVar, cVar));
            }
            xdxVar.j();
        }
        return new x0e(arrayList);
    }
}
