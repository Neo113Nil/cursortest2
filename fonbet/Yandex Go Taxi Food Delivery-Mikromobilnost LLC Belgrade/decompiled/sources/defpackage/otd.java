package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public final class otd implements b70 {
    public static final otd a = new otd();
    public static final List b = scc.g("offer", "asset", "storePurchaseInfo");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        gtd gtdVar = (gtd) obj;
        bfxVar.A1("offer");
        mtd mtdVar = mtd.a;
        foe foeVar = l80.a;
        etd etdVar = gtdVar.a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            mtdVar.a(bfxVar, cVar, etdVar);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            mtdVar.a(ek00Var2, cVar, etdVar);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("asset");
        l80.a(jtd.a).a(bfxVar, cVar, gtdVar.b);
        bfxVar.A1("storePurchaseInfo");
        ep60 ep60Var = new ep60(ntd.a, true);
        ftd ftdVar = gtdVar.c;
        if (ftdVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, ftdVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        etd etdVar = null;
        btd btdVar = null;
        ftd ftdVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                mtd mtdVar = mtd.a;
                foe foeVar = l80.a;
                etdVar = (etd) new ep60(mtdVar, true).b(xdxVar, cVar);
            } else if (h2 == 1) {
                btdVar = (btd) l80.a(jtd.a).b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new gtd(etdVar, btdVar, ftdVar);
                }
                ntd ntdVar = ntd.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(ntdVar, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = ep60Var.b(xdxVar, cVar);
                }
                ftdVar = (ftd) b2;
            }
        }
    }
}
