package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class dqd implements b70 {
    public static final dqd a = new dqd();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        okd okdVar = (okd) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(okdVar.a);
        List list = fhx0.a;
        tgx0 tgx0Var = okdVar.b;
        bfxVar.A1("name");
        cVar.d(rs60.a).a(bfxVar, cVar, tgx0Var.a);
        bfxVar.A1("title");
        foe foeVar2 = l80.a;
        bfxVar.r0(tgx0Var.b);
        bfxVar.A1(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX);
        l80.a(ehx0.a).a(bfxVar, cVar, tgx0Var.c);
        bfxVar.A1(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, tgx0Var.d);
        bfxVar.A1("text");
        om60Var.a(bfxVar, cVar, tgx0Var.e);
        bfxVar.A1("additionText");
        om60Var.a(bfxVar, cVar, tgx0Var.f);
        bfxVar.A1("commonPrice");
        chx0 chx0Var = chx0.a;
        pgx0 pgx0Var = tgx0Var.g;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            chx0Var.a(bfxVar, cVar, pgx0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            chx0Var.a(ek00Var2, cVar, pgx0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("commonPeriod");
        foe foeVar3 = l80.a;
        uga1.f(bfxVar, tgx0Var.h);
        bfxVar.A1("plans");
        dhx0 dhx0Var = dhx0.a;
        ArrayList arrayList = tgx0Var.i;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (z) {
                ek00 ek00Var3 = (ek00) bfxVar;
                ek00Var3.u();
                dhx0Var.a(bfxVar, cVar, obj2);
                ek00Var3.y();
            } else {
                ek00 ek00Var4 = new ek00();
                ek00Var4.u();
                dhx0Var.a(ek00Var4, cVar, obj2);
                ek00Var4.y();
                uga1.f(bfxVar, ek00Var4.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("offerVendorType");
        bfxVar.r0(tgx0Var.j.getRawValue());
        bfxVar.A1("payload");
        b70 d = cVar.d(ju00.a);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        Map map = tgx0Var.k;
        if (map == null) {
            bfxVar.k2();
        } else {
            d.a(bfxVar, cVar, map);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new okd(str, fhx0.c(xdxVar, cVar));
    }
}
