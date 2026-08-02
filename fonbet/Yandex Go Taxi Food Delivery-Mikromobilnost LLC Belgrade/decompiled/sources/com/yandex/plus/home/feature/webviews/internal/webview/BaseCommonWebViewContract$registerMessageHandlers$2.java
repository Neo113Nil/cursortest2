package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.fs80;
import defpackage.pgz;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$2 extends FunctionReferenceImpl implements tls {
    public final void i(fs80 fs80Var) {
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleChangeOptionStatusRequest() outMessage=" + fs80Var);
        }
        tje.N(aVar.d, aVar.v, null, new BaseCommonWebViewContract$handleChangeOptionStatusRequest$2(aVar, fs80Var, null), 2);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((fs80) obj);
        return zy11.a;
    }
}
