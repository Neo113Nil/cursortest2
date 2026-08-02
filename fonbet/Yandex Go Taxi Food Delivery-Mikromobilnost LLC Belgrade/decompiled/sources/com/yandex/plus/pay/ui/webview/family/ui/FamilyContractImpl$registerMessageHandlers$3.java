package com.yandex.plus.pay.ui.webview.family.ui;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.b;
import defpackage.ecp;
import defpackage.ped0;
import defpackage.pgz;
import defpackage.tbd0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class FamilyContractImpl$registerMessageHandlers$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        b viewModel;
        ecp ecpVar = (ecp) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.f;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "FamilyContractImpl", "Handle send metrics message: " + ecpVar);
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.a aVar2 = aVar.g;
        String str = ecpVar.a;
        String str2 = ecpVar.b;
        viewModel = aVar2.a.getViewModel();
        ((ped0) viewModel.x.a.a.c).b(new tbd0(PlusPayEvent$Type.CLIENT, str, str2, (Throwable) null));
        return zy11.a;
    }
}
