package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.plus.home.feature.webviews.internal.home.d;
import com.yandex.plus.log.api.LogPriority;
import defpackage.nv80;
import defpackage.pgz;
import defpackage.tls;
import defpackage.y4d0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class HomeWebViewContract$addAdditionalMessageHandlers$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        d dVar;
        nv80 nv80Var = (nv80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.B;
        String str = aVar.C;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handleShowPurchaseButton() outMessage=" + nv80Var);
        }
        y4d0 y4d0Var = aVar.y;
        String str2 = nv80Var.a;
        dVar = y4d0Var.a.presenter;
        dVar.g.k(str2);
        r0 r0Var = dVar.k().h;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
