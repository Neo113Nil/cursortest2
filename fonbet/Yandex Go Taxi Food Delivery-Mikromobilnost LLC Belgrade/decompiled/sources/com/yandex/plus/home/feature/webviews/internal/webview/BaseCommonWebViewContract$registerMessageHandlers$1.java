package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.mu80;
import defpackage.pgz;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$1 extends FunctionReferenceImpl implements tls {
    public final void i(mu80 mu80Var) {
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleOptionStatusRequest() outMessage=" + mu80Var);
        }
        tje.N(aVar.d, aVar.w, null, new BaseCommonWebViewContract$handleOptionStatusRequest$2(aVar, mu80Var, null), 2);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((mu80) obj);
        return zy11.a;
    }
}
