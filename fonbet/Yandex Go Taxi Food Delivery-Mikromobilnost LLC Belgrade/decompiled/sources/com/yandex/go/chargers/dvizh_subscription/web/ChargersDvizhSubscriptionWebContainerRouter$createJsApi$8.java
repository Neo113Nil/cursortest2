package com.yandex.go.chargers.dvizh_subscription.web;

import defpackage.e48;
import defpackage.lma;
import defpackage.mma;
import defpackage.nm7;
import defpackage.qxx0;
import defpackage.s3d0;
import defpackage.sls;
import defpackage.v2d0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ChargersDvizhSubscriptionWebContainerRouter$createJsApi$8 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) this.receiver;
        lma lmaVar = bVar.G;
        nm7 nm7Var = new nm7(26, (sls) obj2, bVar);
        s3d0 s3d0Var = (s3d0) ((mma) lmaVar).a.get();
        String value = CashbackCardContext.CHARGERS.getValue();
        v2d0 v2d0Var = new v2d0();
        v2d0Var.c = (String) obj;
        v2d0Var.e = "chargers";
        s3d0Var.a(new qxx0(value, v2d0Var.a(), new e48(18, nm7Var)));
        return zy11.a;
    }
}
