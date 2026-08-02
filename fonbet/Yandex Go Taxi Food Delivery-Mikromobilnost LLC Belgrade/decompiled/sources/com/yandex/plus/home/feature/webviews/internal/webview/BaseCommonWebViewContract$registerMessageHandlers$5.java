package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.ps80;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$5 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = ((ps80) obj).b;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleCriticalError() Close with critical error: " + str);
        }
        aVar.m.a(str);
        aVar.p.l(str);
        return zy11.a;
    }
}
