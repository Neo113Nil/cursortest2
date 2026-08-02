package com.yandex.go.scooters.subscription.pci_dss.web;

import defpackage.epo0;
import defpackage.fko0;
import defpackage.qxx0;
import defpackage.s3d0;
import defpackage.sls;
import defpackage.v2d0;
import defpackage.wls;
import defpackage.ykn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersSubscriptionWebContainerModalViewRouter$createJsApi$8 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) this.receiver;
        fko0 fko0Var = bVar.G;
        epo0 epo0Var = new epo0(2, (sls) obj2, bVar);
        s3d0 s3d0Var = (s3d0) fko0Var.a.get();
        String value = CashbackCardContext.SCOOTERS.getValue();
        v2d0 v2d0Var = new v2d0();
        v2d0Var.c = (String) obj;
        v2d0Var.e = "scooters";
        s3d0Var.a(new qxx0(value, v2d0Var.a(), new ykn0(3, epo0Var)));
        return zy11.a;
    }
}
