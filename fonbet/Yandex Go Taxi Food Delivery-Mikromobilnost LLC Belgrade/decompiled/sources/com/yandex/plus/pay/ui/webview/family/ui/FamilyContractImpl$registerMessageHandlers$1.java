package com.yandex.plus.pay.ui.webview.family.ui;

import com.yandex.plus.log.api.LogPriority;
import defpackage.ccp;
import defpackage.pgz;
import defpackage.pz40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class FamilyContractImpl$registerMessageHandlers$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ccp ccpVar = (ccp) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.f;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "FamilyContractImpl", "Handle ready message: " + ccpVar);
        }
        pz40 b = aVar.e.b();
        Boolean bool = Boolean.TRUE;
        r0 r0Var = (r0) b;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
