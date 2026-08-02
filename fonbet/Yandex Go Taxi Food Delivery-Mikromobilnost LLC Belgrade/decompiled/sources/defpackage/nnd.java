package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class nnd implements b70 {
    public static final nnd a = new nnd();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        smd smdVar = (smd) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(smdVar.a);
        List list = qha0.a;
        hha0 hha0Var = smdVar.b;
        bfxVar.A1("benefitTitle");
        kha0 kha0Var = kha0.a;
        foe foeVar2 = l80.a;
        bha0 bha0Var = hha0Var.a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            kha0Var.a(bfxVar, cVar, bha0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            kha0Var.a(ek00Var2, cVar, bha0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("additionalTitle");
        ep60 ep60Var = new ep60(iha0.a, true);
        zga0 zga0Var = hha0Var.b;
        if (zga0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, zga0Var);
        }
        bfxVar.A1("iconImage");
        ep60 a2 = l80.a(nha0.a);
        eha0 eha0Var = hha0Var.c;
        if (eha0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, eha0Var);
        }
        bfxVar.A1(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        l80.a(jha0.a).a(bfxVar, cVar, hha0Var.d);
        bfxVar.A1("paymentMethodId");
        l80.i.a(bfxVar, cVar, hha0Var.e);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new smd(str, qha0.c(xdxVar, cVar));
    }
}
