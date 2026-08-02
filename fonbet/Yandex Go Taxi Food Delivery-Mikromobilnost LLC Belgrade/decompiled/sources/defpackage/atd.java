package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.Offer;
import com.yandex.plus.pay.repository.api.model.upsale.CompositeUpsale;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class atd {
    public final pqd a;

    public atd(pqd pqdVar, aku0 aku0Var) {
        this.a = pqdVar;
    }

    public final CompositeUpsale a(gtd gtdVar, String str, String str2) {
        Offer c = this.a.c(gtdVar.a.b);
        if (c == null) {
            return null;
        }
        btd btdVar = gtdVar.b;
        String str3 = btdVar.a;
        String str4 = btdVar.b;
        String str5 = btdVar.e;
        String str6 = btdVar.f;
        ArrayList<ctd> arrayList = btdVar.c;
        ArrayList arrayList2 = new ArrayList();
        for (ctd ctdVar : arrayList) {
            String str7 = ctdVar != null ? ctdVar.a : null;
            if (str7 != null) {
                arrayList2.add(str7);
            }
        }
        CompositeUpsale.Template template = new CompositeUpsale.Template(str3, str4, str5, str6, arrayList2, btdVar.d, btdVar.g, btdVar.h, btdVar.i);
        ftd ftdVar = gtdVar.c;
        return new CompositeUpsale(c, template, ftdVar != null ? aku0.a(ftdVar.b) : null, new CompositeUpsale.Meta(str, str2));
    }
}
