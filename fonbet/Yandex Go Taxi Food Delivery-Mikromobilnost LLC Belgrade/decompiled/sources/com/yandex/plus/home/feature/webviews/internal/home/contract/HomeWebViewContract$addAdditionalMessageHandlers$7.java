package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.st80;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class HomeWebViewContract$addAdditionalMessageHandlers$7 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        st80 st80Var = (st80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.B;
        String str = aVar.C;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handleOpenNativeSharing() outMessage=" + st80Var);
        }
        ((com.yandex.plus.home.feature.webviews.internal.container.a) aVar.z).t(st80Var.b, st80Var.c, st80Var.d);
        return zy11.a;
    }
}
