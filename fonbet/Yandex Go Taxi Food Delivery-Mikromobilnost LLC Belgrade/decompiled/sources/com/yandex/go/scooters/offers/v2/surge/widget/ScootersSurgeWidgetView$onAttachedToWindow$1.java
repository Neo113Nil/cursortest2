package com.yandex.go.scooters.offers.v2.surge.widget;

import defpackage.cjm0;
import defpackage.co40;
import defpackage.sls;
import defpackage.u3p0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersSurgeWidgetView$onAttachedToWindow$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        u3p0 u3p0Var = (u3p0) this.receiver;
        cjm0 cjm0Var = u3p0Var.x;
        co40 co40Var = (co40) cjm0Var.b;
        Double d = (Double) cjm0Var.c;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (d != null) {
            hashMap.put("surge_level", d);
        }
        co40Var.a.a("ScootersSurgeWidget.Tapped", hashMap, 1, new HashMap());
        ((ScootersSurgeWidgetRouter$provideView$1$1) u3p0Var.z).invoke();
        return zy11.a;
    }
}
