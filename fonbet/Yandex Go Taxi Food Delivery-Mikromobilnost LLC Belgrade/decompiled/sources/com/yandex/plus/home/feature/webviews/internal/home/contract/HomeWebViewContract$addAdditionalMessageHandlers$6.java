package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.plus.home.feature.webviews.internal.home.d;
import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.pu80;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class HomeWebViewContract$addAdditionalMessageHandlers$6 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        d dVar;
        pu80 pu80Var = (pu80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.B;
        String str = aVar.C;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handlePurchaseButtonShown() outMessage=" + pu80Var);
        }
        dVar = aVar.y.a.presenter;
        dVar.k().h(pu80Var);
        return zy11.a;
    }
}
