package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.log.api.LogPriority;
import defpackage.nw70;
import defpackage.pgz;
import defpackage.szg;
import defpackage.tls;
import defpackage.yt80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class HomeWebViewContract$addAdditionalMessageHandlers$8 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        yt80 yt80Var = (yt80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.B;
        String str = aVar.C;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handleOpenStoriesMessage() outMessage=" + yt80Var);
        }
        aVar.f.getClass();
        Object C = nw70.C(yt80Var);
        if (!(C instanceof Result.Failure)) {
            b.b(aVar.z, (szg) C, true, yt80Var.d, null, null, null, 56);
        }
        Throwable a = Result.a(C);
        if (a != null) {
            LogPriority logPriority2 = LogPriority.ERROR;
            if (pgzVar.e(logPriority2)) {
                pgzVar.b(logPriority2, str, "handleOpenStoriesMessage() outMessage=" + yt80Var, a);
            }
            aVar.A.c(yt80Var.b);
        }
        return zy11.a;
    }
}
