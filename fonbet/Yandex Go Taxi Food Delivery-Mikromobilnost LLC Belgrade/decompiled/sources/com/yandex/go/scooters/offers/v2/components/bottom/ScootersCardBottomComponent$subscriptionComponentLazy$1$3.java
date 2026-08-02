package com.yandex.go.scooters.offers.v2.components.bottom;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardButton;
import defpackage.f6n0;
import defpackage.h6n0;
import defpackage.hxo0;
import defpackage.s4n0;
import defpackage.s6n0;
import defpackage.tls;
import defpackage.wwo0;
import defpackage.y5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersCardBottomComponent$subscriptionComponentLazy$1$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        s4n0 s4n0Var = (s4n0) this.receiver;
        s6n0 s6n0Var = s4n0Var.z;
        f6n0 f6n0Var = s6n0Var.a;
        y5n0 y5n0Var = s6n0Var.d;
        h6n0 h6n0Var = s6n0Var.b;
        if (h6n0Var == null) {
            h6n0Var = null;
        }
        boolean booleanValue2 = ((Boolean) h6n0Var.invoke()).booleanValue();
        f6n0Var.getClass();
        f6n0Var.b(y5n0Var, null, null, ScootersOfferCardAnalytics$CardButton.SubscriptionPromoblockToggle, booleanValue2, bool);
        r0 r0Var = s4n0Var.E.c;
        hxo0.a aVar = (hxo0.a) r0Var.getValue();
        wwo0 wwo0Var = aVar.a;
        if (wwo0Var != null && aVar.b != booleanValue) {
            r0Var.m(null, new hxo0.a(wwo0Var, booleanValue));
        }
        return zy11.a;
    }
}
