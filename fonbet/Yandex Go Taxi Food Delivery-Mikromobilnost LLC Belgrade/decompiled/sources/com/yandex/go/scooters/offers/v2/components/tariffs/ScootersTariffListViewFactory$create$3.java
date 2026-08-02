package com.yandex.go.scooters.offers.v2.components.tariffs;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardButton;
import defpackage.c3o;
import defpackage.d3o;
import defpackage.f6n0;
import defpackage.h6n0;
import defpackage.h7n0;
import defpackage.n5p0;
import defpackage.n6n0;
import defpackage.rco0;
import defpackage.s6n0;
import defpackage.tls;
import defpackage.w1p0;
import defpackage.x1p0;
import defpackage.y5n0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersTariffListViewFactory$create$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        w1p0 w1p0Var;
        rco0 rco0Var = (rco0) obj;
        n5p0 n5p0Var = (n5p0) this.receiver;
        n5p0Var.getClass();
        x1p0 x1p0Var = rco0Var.h;
        String str = (x1p0Var == null || (w1p0Var = (w1p0) kotlin.collections.a.R((ArrayList) x1p0Var.d.c)) == null) ? null : w1p0Var.a;
        s6n0 s6n0Var = n5p0Var.z;
        f6n0 f6n0Var = s6n0Var.a;
        y5n0 y5n0Var = s6n0Var.d;
        h6n0 h6n0Var = s6n0Var.b;
        if (h6n0Var == null) {
            h6n0Var = null;
        }
        boolean booleanValue = ((Boolean) h6n0Var.invoke()).booleanValue();
        f6n0Var.getClass();
        f6n0Var.b(y5n0Var, null, str, ScootersOfferCardAnalytics$CardButton.Superpass, booleanValue, null);
        d3o d3oVar = rco0Var.b;
        c3o c3oVar = d3oVar != null ? d3oVar.d : null;
        n6n0 n6n0Var = n5p0Var.x;
        if (c3oVar != null) {
            ((h7n0) n6n0Var).i(c3oVar);
        } else {
            n6n0.b(n6n0Var);
        }
        return zy11.a;
    }
}
