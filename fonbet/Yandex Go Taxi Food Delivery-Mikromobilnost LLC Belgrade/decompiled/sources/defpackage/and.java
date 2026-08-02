package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class and implements b70 {
    public static final and a = new and();
    public static final List b = scc.g("__typename", "checkoutAdditionalOffers", "paymentMethods");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        fmd fmdVar = (fmd) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(fmdVar.a);
        bfxVar.A1("checkoutAdditionalOffers");
        l80.a(zmd.a).a(bfxVar, cVar, fmdVar.b);
        bfxVar.A1("paymentMethods");
        ep60 a2 = l80.a(mnd.a);
        rmd rmdVar = fmdVar.c;
        if (rmdVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, rmdVar);
        }
        List list = sld.a;
        pld pldVar = fmdVar.d;
        bfxVar.A1("tariffOffer");
        zld zldVar = zld.a;
        foe foeVar2 = l80.a;
        ep60 ep60Var = new ep60(zldVar, true);
        mld mldVar = pldVar.a;
        if (mldVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, mldVar);
        }
        bfxVar.A1("optionOffers");
        lqy lqyVar = new lqy(new om60(new ep60(wld.a, true)));
        List list2 = pldVar.b;
        if (list2 == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list2);
        }
        bfxVar.A1("legalInfo");
        ep60 ep60Var2 = new ep60(uld.a, true);
        zkd zkdVar = pldVar.c;
        if (zkdVar == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, zkdVar);
        }
        bfxVar.A1("paymentText");
        l80.a(xld.a).a(bfxVar, cVar, pldVar.d);
        bfxVar.A1("successScreen");
        l80.a(yld.a).a(bfxVar, cVar, pldVar.e);
        bfxVar.A1("invoices");
        ep60 a3 = l80.a(tld.a);
        ArrayList arrayList = pldVar.f;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                a3.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
        bfxVar.A1("silentInvoiceAvailable");
        l80.l.a(bfxVar, cVar, pldVar.g);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        emd emdVar = null;
        rmd rmdVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                emdVar = (emd) l80.a(zmd.a).b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    xdxVar.rewind();
                    return new fmd(str, emdVar, rmdVar, sld.c(xdxVar, cVar));
                }
                ep60 a2 = l80.a(mnd.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a2.b(xdxVar, cVar);
                }
                rmdVar = (rmd) b2;
            }
        }
    }
}
