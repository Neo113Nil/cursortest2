package com.yandex.go.scooters.offers.v2.components.bottom;

import defpackage.cpm0;
import defpackage.f6n0;
import defpackage.h6n0;
import defpackage.jl40;
import defpackage.nd3;
import defpackage.rbn0;
import defpackage.s6n0;
import defpackage.sbn0;
import defpackage.tls;
import defpackage.ubn0;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.wwo0;
import defpackage.y5n0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersCardBottomComponent$subscriptionComponentLazy$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        cpm0 cpm0Var;
        nd3.a aVar;
        wwo0 wwo0Var = (wwo0) obj;
        s6n0 s6n0Var = (s6n0) this.receiver;
        if (!jl40.l(s6n0Var.f, wwo0Var)) {
            s6n0Var.f = wwo0Var;
            f6n0 f6n0Var = s6n0Var.a;
            y5n0 y5n0Var = s6n0Var.d;
            h6n0 h6n0Var = s6n0Var.b;
            if (h6n0Var == null) {
                h6n0Var = null;
            }
            boolean booleanValue = ((Boolean) h6n0Var.invoke()).booleanValue();
            i d = ((j) f6n0Var.a).d("ScootersOfferSubscriptionPromoblock.Shown");
            LinkedHashMap linkedHashMap = d.a;
            d.d("open_reason", f6n0Var.d.a());
            d.d("from_screen", f6n0Var.e.a().c.a);
            if (y5n0Var != null) {
                vbn0 vbn0Var = y5n0Var.j;
                if (vbn0Var instanceof rbn0) {
                    cpm0Var = ((rbn0) vbn0Var).e;
                    aVar = new nd3.a();
                } else if (vbn0Var instanceof sbn0) {
                    for (cpm0 cpm0Var2 : ((sbn0) vbn0Var).e) {
                        nd3.a aVar2 = new nd3.a();
                        f6n0.a(d, cpm0Var2, booleanValue);
                        linkedHashMap.put("scooters", aVar2.a);
                    }
                } else {
                    if (!(vbn0Var instanceof ubn0)) {
                        w511.b();
                        return null;
                    }
                    cpm0Var = ((ubn0) vbn0Var).e;
                    aVar = new nd3.a();
                }
                f6n0.a(d, cpm0Var, booleanValue);
                linkedHashMap.put("scooters", aVar.a);
            }
            d.m();
        }
        return zy11.a;
    }
}
