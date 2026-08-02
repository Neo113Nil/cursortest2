package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import android.net.Uri;
import defpackage.n4u;
import defpackage.rt1;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransfersDashboardFragment$onViewCreated$1$7 extends FunctionReferenceImpl implements tls {
    public TransfersDashboardFragment$onViewCreated$1$7(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onGuidelineWidgetClick", "onGuidelineWidgetClick(Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/view/GuidelineItemView$State;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        n4u n4uVar = (n4u) obj;
        a aVar = (a) this.receiver;
        rt1 rt1Var = aVar.E.a.r0;
        String str = n4uVar.d;
        String str2 = n4uVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (str != null) {
            linkedHashMap.put("guideline_type", str);
        }
        linkedHashMap.put("action", str2);
        rt1Var.a.a("transfers_dashboard.qr_scanner_guideline.click", linkedHashMap);
        aVar.c0(Uri.parse(str2), null);
        return zy11.a;
    }
}
