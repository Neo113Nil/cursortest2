package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.evu0;
import defpackage.lw80;
import defpackage.pgz;
import defpackage.sls;
import defpackage.tls;
import defpackage.ynv;
import defpackage.znv;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$6 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        lw80 lw80Var = (lw80) obj;
        a aVar = (a) this.receiver;
        sls slsVar = aVar.q;
        if (slsVar != null) {
            String str = (String) slsVar.invoke();
            pgz pgzVar = aVar.u;
            String x = aVar.x();
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, x, "get card info from host - handleUserCardRequest() outMessage=" + lw80Var + " cardId=" + str);
            }
            String str2 = lw80Var.a;
            ynv ynvVar = null;
            if (str != null) {
                if (evu0.J(str)) {
                    str = null;
                }
                if (str != null) {
                    ynvVar = new ynv(str);
                }
            }
            aVar.z(new znv(str2, ynvVar));
        }
        return zy11.a;
    }
}
