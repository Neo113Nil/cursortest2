package com.yandex.plus.pay.ui.webview.family.ui;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.b;
import defpackage.fcp;
import defpackage.pgz;
import defpackage.tls;
import defpackage.wap;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class FamilyContractImpl$registerMessageHandlers$5 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        b viewModel;
        fcp fcpVar = (fcp) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.f;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "FamilyContractImpl", "Handle unknown message: " + fcpVar);
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.a aVar2 = aVar.g;
        String str = fcpVar.a;
        viewModel = aVar2.a.getViewModel();
        wap wapVar = viewModel.z;
        if (wapVar != null) {
            viewModel.y.b(wapVar.a, str);
        }
        return zy11.a;
    }
}
