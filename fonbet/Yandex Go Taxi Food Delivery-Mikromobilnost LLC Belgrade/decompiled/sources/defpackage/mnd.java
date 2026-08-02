package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class mnd implements b70 {
    public static final mnd a = new mnd();
    public static final List b = scc.g("groups", "mainPaymentMethodId", "pos", "trustServiceToken", "paymentButtons", "promoBadges", "promoLegalInfo");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        rmd rmdVar = (rmd) obj;
        bfxVar.A1("groups");
        ep60 a2 = l80.a(cnd.a);
        ArrayList arrayList = rmdVar.a;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a2.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("mainPaymentMethodId");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, rmdVar.b);
        bfxVar.A1("pos");
        om60Var.a(bfxVar, cVar, rmdVar.c);
        bfxVar.A1("trustServiceToken");
        om60Var.a(bfxVar, cVar, rmdVar.d);
        bfxVar.A1("paymentButtons");
        lnd lndVar = lnd.a;
        ArrayList arrayList2 = rmdVar.e;
        bfxVar.l();
        for (Object obj2 : arrayList2) {
            if (bfxVar instanceof ek00) {
                ek00 ek00Var = (ek00) bfxVar;
                ek00Var.u();
                lndVar.a(bfxVar, cVar, obj2);
                ek00Var.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                lndVar.a(ek00Var2, cVar, obj2);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("promoBadges");
        lqy lqyVar = new lqy(new om60(new ep60(nnd.a, true)));
        List list = rmdVar.f;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
        bfxVar.A1("promoLegalInfo");
        ep60 a3 = l80.a(ond.a);
        tmd tmdVar = rmdVar.g;
        if (tmdVar == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, tmdVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        return new defpackage.rmd(r1, r2, r3, r4, r5, r6, r7);
     */
    @Override // defpackage.b70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        List list = null;
        tmd tmdVar = null;
        while (true) {
            switch (xdxVar.h2(b)) {
                case 0:
                    ep60 a2 = l80.a(cnd.a);
                    arrayList = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        arrayList.add(a2.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    break;
                case 1:
                    str = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 2:
                    str2 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 3:
                    str3 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 4:
                    lnd lndVar = lnd.a;
                    foe foeVar = l80.a;
                    ep60 ep60Var = new ep60(lndVar, true);
                    xdxVar.l();
                    ArrayList arrayList3 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList3.add(ep60Var.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList2 = arrayList3;
                    break;
                case 5:
                    nnd nndVar = nnd.a;
                    foe foeVar2 = l80.a;
                    lqy lqyVar = new lqy(new om60(new ep60(nndVar, true)));
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = lqyVar.b(xdxVar, cVar);
                    }
                    list = (List) obj2;
                    break;
                case 6:
                    ep60 a3 = l80.a(ond.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = a3.b(xdxVar, cVar);
                    }
                    tmdVar = (tmd) obj;
                    break;
            }
        }
    }
}
