package com.yandex.plus.home.feature.webviews.internal.smart.contract;

import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.tls;
import defpackage.yu80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class SmartWebViewContract$addAdditionalMessageHandlers$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        yu80 yu80Var = (yu80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.z;
        String str = aVar.B;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handleReadyForMessaging() outMessage=" + yu80Var);
        }
        return zy11.a;
    }
}
