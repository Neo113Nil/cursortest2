package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.log.api.LogPriority;
import defpackage.nw70;
import defpackage.pgz;
import defpackage.rzg;
import defpackage.tls;
import defpackage.vt80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$9 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        vt80 vt80Var = (vt80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleOpenSmart() outMessage=" + vt80Var);
        }
        aVar.f.getClass();
        Object y = nw70.y(vt80Var);
        if (!(y instanceof Result.Failure)) {
            b.b(aVar.g, (rzg) y, true, null, null, null, null, 60);
        }
        Throwable a = Result.a(y);
        if (a != null) {
            LogPriority logPriority2 = LogPriority.ERROR;
            if (pgzVar.e(logPriority2)) {
                pgzVar.b(logPriority2, "BaseCommonWebViewContract", "handleOpenSmart() error", a);
            }
            aVar.m.c(vt80Var.b);
        }
        return zy11.a;
    }
}
