package com.yandex.go.scooters.offers.v2.components.header;

import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import defpackage.b4p0;
import defpackage.b5n0;
import defpackage.h7n0;
import defpackage.n6n0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersCardHeaderComponentDelegate$newCardHeaderComponent$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b5n0 b5n0Var = (b5n0) this.receiver;
        b5n0Var.A.a(ScootersCardV2Analytics$CardButton.INSURANCE_BADGE);
        n6n0 n6n0Var = b5n0Var.y;
        InsuranceOpenReason insuranceOpenReason = InsuranceOpenReason.ICON;
        b4p0 a = b5n0Var.z.a();
        ((h7n0) n6n0Var).g(insuranceOpenReason, a != null ? a.l : null);
        return zy11.a;
    }
}
