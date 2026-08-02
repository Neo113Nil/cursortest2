package com.yandex.go.scooters.offers.v2.components.tariffs;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardButton;
import defpackage.f6n0;
import defpackage.h6n0;
import defpackage.h7n0;
import defpackage.n5p0;
import defpackage.s6n0;
import defpackage.seo0;
import defpackage.tls;
import defpackage.y5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersTariffListViewFactory$create$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        n5p0 n5p0Var = (n5p0) this.receiver;
        s6n0 s6n0Var = n5p0Var.z;
        f6n0 f6n0Var = s6n0Var.a;
        y5n0 y5n0Var = s6n0Var.d;
        h6n0 h6n0Var = s6n0Var.b;
        if (h6n0Var == null) {
            h6n0Var = null;
        }
        boolean booleanValue = ((Boolean) h6n0Var.invoke()).booleanValue();
        f6n0Var.getClass();
        f6n0Var.b(y5n0Var, null, str, ScootersOfferCardAnalytics$CardButton.Package, booleanValue, null);
        h7n0 h7n0Var = (h7n0) n5p0Var.x;
        h7n0Var.getClass();
        h7n0Var.h(new seo0(str));
        return zy11.a;
    }
}
