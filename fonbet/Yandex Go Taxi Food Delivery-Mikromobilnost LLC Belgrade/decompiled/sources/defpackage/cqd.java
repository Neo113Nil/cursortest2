package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class cqd implements b70 {
    public static final cqd a = new cqd();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        nkd nkdVar = (nkd) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(nkdVar.a);
        List list = ye70.a;
        pe70 pe70Var = nkdVar.b;
        bfxVar.A1("name");
        cVar.d(rs60.a).a(bfxVar, cVar, pe70Var.a);
        bfxVar.A1("title");
        foe foeVar2 = l80.a;
        bfxVar.r0(pe70Var.b);
        bfxVar.A1(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX);
        l80.a(xe70.a).a(bfxVar, cVar, pe70Var.c);
        bfxVar.A1(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, pe70Var.d);
        bfxVar.A1("text");
        om60Var.a(bfxVar, cVar, pe70Var.e);
        bfxVar.A1("additionText");
        om60Var.a(bfxVar, cVar, pe70Var.f);
        bfxVar.A1("commonPrice");
        we70 we70Var = we70.a;
        me70 me70Var = pe70Var.g;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            we70Var.a(bfxVar, cVar, me70Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            we70Var.a(ek00Var2, cVar, me70Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("commonPeriod");
        foe foeVar3 = l80.a;
        uga1.f(bfxVar, pe70Var.h);
        bfxVar.A1("plans");
        ze70 ze70Var = ze70.a;
        ArrayList arrayList = pe70Var.i;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (z) {
                ek00 ek00Var3 = (ek00) bfxVar;
                ek00Var3.u();
                ze70Var.a(bfxVar, cVar, obj2);
                ek00Var3.y();
            } else {
                ek00 ek00Var4 = new ek00();
                ek00Var4.u();
                ze70Var.a(ek00Var4, cVar, obj2);
                ek00Var4.y();
                uga1.f(bfxVar, ek00Var4.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("offerVendorType");
        bfxVar.r0(pe70Var.j.getRawValue());
        bfxVar.A1("payload");
        b70 d = cVar.d(ju00.a);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        Map map = pe70Var.k;
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
        return new nkd(str, ye70.c(xdxVar, cVar));
    }
}
