package com.yandex.go.scooters.offers.v2.surge.widget;

import defpackage.cjm0;
import defpackage.co40;
import defpackage.jl40;
import defpackage.u3p0;
import defpackage.w3p0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x3p0;
import defpackage.y3p0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersSurgeWidgetPresenter$attachView$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Double d;
        y3p0 y3p0Var = (y3p0) obj;
        u3p0 u3p0Var = (u3p0) this.receiver;
        if (y3p0Var instanceof x3p0) {
            d = Double.valueOf(((x3p0) y3p0Var).a);
        } else {
            u3p0Var.getClass();
            if (!jl40.l(y3p0Var, w3p0.a)) {
                w511.b();
                return null;
            }
            d = null;
        }
        cjm0 cjm0Var = u3p0Var.x;
        if (!jl40.i(d, (Double) cjm0Var.c)) {
            cjm0Var.c = d;
            co40 co40Var = (co40) cjm0Var.b;
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            if (d != null) {
                hashMap.put("surge_level", d);
            }
            co40Var.a.a("ScootersSurgeWidget.Shown", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
