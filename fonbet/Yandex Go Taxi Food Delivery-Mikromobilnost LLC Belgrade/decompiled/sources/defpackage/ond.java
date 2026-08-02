package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ond implements b70 {
    public static final ond a = new ond();
    public static final List b = Collections.singletonList("legalText");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("legalText");
        dnd dndVar = dnd.a;
        foe foeVar = l80.a;
        imd imdVar = ((tmd) obj).a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            dndVar.a(bfxVar, cVar, imdVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        dndVar.a(ek00Var2, cVar, imdVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        imd imdVar = null;
        while (xdxVar.h2(b) == 0) {
            dnd dndVar = dnd.a;
            foe foeVar = l80.a;
            imdVar = (imd) new ep60(dndVar, true).b(xdxVar, cVar);
        }
        return new tmd(imdVar);
    }
}
