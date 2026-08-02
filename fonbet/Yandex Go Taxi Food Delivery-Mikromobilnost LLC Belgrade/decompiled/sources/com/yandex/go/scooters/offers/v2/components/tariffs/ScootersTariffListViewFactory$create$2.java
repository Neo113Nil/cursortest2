package com.yandex.go.scooters.offers.v2.components.tariffs;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardButton;
import com.yandex.go.scooters.offers.v2.g;
import defpackage.b4p0;
import defpackage.b590;
import defpackage.eer;
import defpackage.f6n0;
import defpackage.f7n0;
import defpackage.h6n0;
import defpackage.h7n0;
import defpackage.m950;
import defpackage.n5p0;
import defpackage.s6n0;
import defpackage.tls;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.xzt0;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersTariffListViewFactory$create$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton;
        b4p0 b4p0Var = (b4p0) obj;
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
        if (b4p0Var instanceof xzt0) {
            scootersOfferCardAnalytics$CardButton = ScootersOfferCardAnalytics$CardButton.MinutesOffer;
        } else if (b4p0Var instanceof eer) {
            scootersOfferCardAnalytics$CardButton = ScootersOfferCardAnalytics$CardButton.FixOffer;
        } else if (b4p0Var instanceof b590) {
            scootersOfferCardAnalytics$CardButton = ScootersOfferCardAnalytics$CardButton.Package;
        } else {
            if (b4p0Var != null) {
                w511.b();
                return null;
            }
            scootersOfferCardAnalytics$CardButton = ScootersOfferCardAnalytics$CardButton.MinutesOffer;
        }
        f6n0Var.b(y5n0Var, b4p0Var, null, scootersOfferCardAnalytics$CardButton, booleanValue, null);
        y5n0 a = n5p0Var.A.a();
        vbn0 vbn0Var = a != null ? a.j : null;
        if (!(b4p0Var instanceof eer) || vbn0Var == null) {
            y5p0 y5p0Var = n5p0Var.y;
            y5p0Var.c.l(b4p0Var);
            if (b4p0Var != null) {
                y5p0Var.a.a = b4p0Var;
            }
        } else {
            h7n0 h7n0Var = (h7n0) n5p0Var.x;
            g gVar = h7n0Var.b;
            gVar.z((m950) gVar.P.get(), new f7n0(h7n0Var, (eer) b4p0Var, vbn0Var));
        }
        return zy11.a;
    }
}
