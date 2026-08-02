package com.yandex.plus.pay.ui.webview.family.ui;

import com.yandex.plus.log.api.LogPriority;
import defpackage.dcp;
import defpackage.pgz;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class FamilyContractImpl$registerMessageHandlers$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dcp dcpVar = (dcp) obj;
        pgz pgzVar = ((a) this.receiver).f;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "FamilyContractImpl", "Handle ready for messaging message: " + dcpVar);
        }
        return zy11.a;
    }
}
