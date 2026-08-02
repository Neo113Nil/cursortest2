package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class fyw implements b70 {
    public static final fyw a = new fyw();
    public static final List b = Collections.singletonList("externalInvoice");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("externalInvoice");
        gyw gywVar = gyw.a;
        foe foeVar = l80.a;
        dyw dywVar = ((cyw) obj).a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            gywVar.a(bfxVar, cVar, dywVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        gywVar.a(ek00Var2, cVar, dywVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        dyw dywVar = null;
        while (xdxVar.h2(b) == 0) {
            gyw gywVar = gyw.a;
            foe foeVar = l80.a;
            dywVar = (dyw) new ep60(gywVar, true).b(xdxVar, cVar);
        }
        return new cyw(dywVar);
    }
}
