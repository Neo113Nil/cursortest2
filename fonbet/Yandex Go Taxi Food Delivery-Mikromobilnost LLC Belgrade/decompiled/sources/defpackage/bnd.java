package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class bnd implements b70 {
    public static final bnd a = new bnd();
    public static final List b = Collections.singletonList("compositeOfferCheckoutInfo");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("compositeOfferCheckoutInfo");
        and andVar = and.a;
        foe foeVar = l80.a;
        fmd fmdVar = ((gmd) obj).a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            andVar.a(bfxVar, cVar, fmdVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        andVar.a(ek00Var2, cVar, fmdVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        fmd fmdVar = null;
        while (xdxVar.h2(b) == 0) {
            and andVar = and.a;
            foe foeVar = l80.a;
            fmdVar = (fmd) new ep60(andVar, true).b(xdxVar, cVar);
        }
        return new gmd(fmdVar);
    }
}
