package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class aqd implements b70 {
    public static final aqd a = new aqd();
    public static final List b = scc.g(ClidProvider.TIMESTAMP, "totalPrice");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        lkd lkdVar = (lkd) obj;
        bfxVar.A1(ClidProvider.TIMESTAMP);
        cVar.d(mlz.a).a(bfxVar, cVar, Long.valueOf(lkdVar.a));
        bfxVar.A1("totalPrice");
        eqd eqdVar = eqd.a;
        foe foeVar = l80.a;
        pkd pkdVar = lkdVar.b;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            eqdVar.a(bfxVar, cVar, pkdVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        eqdVar.a(ek00Var2, cVar, pkdVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Long l = null;
        pkd pkdVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                l = (Long) cVar.d(mlz.a).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new lkd(l.longValue(), pkdVar);
                }
                eqd eqdVar = eqd.a;
                foe foeVar = l80.a;
                pkdVar = (pkd) new ep60(eqdVar, true).b(xdxVar, cVar);
            }
        }
    }
}
