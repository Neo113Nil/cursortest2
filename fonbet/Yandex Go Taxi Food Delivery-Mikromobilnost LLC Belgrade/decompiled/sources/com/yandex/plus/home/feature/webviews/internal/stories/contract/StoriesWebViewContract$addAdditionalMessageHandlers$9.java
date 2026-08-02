package com.yandex.plus.home.feature.webviews.internal.stories.contract;

import com.yandex.plus.home.feature.webviews.internal.stories.e;
import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.su80;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class StoriesWebViewContract$addAdditionalMessageHandlers$9 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        e eVar;
        su80 su80Var = (su80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.A;
        String str = aVar.B;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handlePurchaseProductRequest() outMessage=" + su80Var);
        }
        eVar = aVar.z.a.presenter;
        eVar.k().b("PurchaseProductRequest");
        return zy11.a;
    }
}
