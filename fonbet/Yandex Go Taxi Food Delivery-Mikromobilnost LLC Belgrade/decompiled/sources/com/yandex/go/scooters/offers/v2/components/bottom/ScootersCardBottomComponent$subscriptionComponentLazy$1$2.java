package com.yandex.go.scooters.offers.v2.components.bottom;

import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import com.yandex.go.scooters.subscription.api.ScootersSubscriptionEntryPoint;
import defpackage.gxo0;
import defpackage.h7n0;
import defpackage.s4n0;
import defpackage.sls;
import defpackage.two0;
import defpackage.wwo0;
import defpackage.xwo0;
import defpackage.y5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersCardBottomComponent$subscriptionComponentLazy$1$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        two0 two0Var;
        gxo0 gxo0Var;
        s4n0 s4n0Var = (s4n0) this.receiver;
        s4n0Var.z.a(ScootersCardV2Analytics$CardButton.SUBSCRIPTION);
        y5n0 a = s4n0Var.B.a();
        wwo0 wwo0Var = null;
        if (a != null && (two0Var = a.j.d) != null) {
            xwo0 xwo0Var = two0Var instanceof xwo0 ? (xwo0) two0Var : null;
            if (xwo0Var != null && (gxo0Var = xwo0Var.a) != null) {
                wwo0Var = gxo0Var.a;
            }
        }
        ((h7n0) s4n0Var.x).j(ScootersSubscriptionEntryPoint.OFFER_PROMOBLOCK, wwo0Var, false);
        return zy11.a;
    }
}
