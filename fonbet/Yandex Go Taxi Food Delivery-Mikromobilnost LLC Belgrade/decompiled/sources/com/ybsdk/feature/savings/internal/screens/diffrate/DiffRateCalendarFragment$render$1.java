package com.ybsdk.feature.savings.internal.screens.diffrate;

import com.ybsdk.core.analytics.generated.PlusStatusDiffRate;
import com.ybsdk.core.analytics.generated.delegates.DiffRateEvents$BottomsheetDiffRateCalendarLoadedResult;
import defpackage.bij;
import defpackage.eij;
import defpackage.r8j0;
import defpackage.tls;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class DiffRateCalendarFragment$render$1 extends FunctionReferenceImpl implements tls {
    public DiffRateCalendarFragment$render$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onInitialViewportReady", "onInitialViewportReady(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        a aVar = (a) this.receiver;
        if (aVar.I) {
            aVar.I = false;
            u8j0 u8j0Var = ((eij) aVar.X()).a;
            r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
            if (r8j0Var != null && ((bij) r8j0Var.a) != null) {
                aVar.F.u.b(DiffRateEvents$BottomsheetDiffRateCalendarLoadedResult.OK, str, aVar.H ? PlusStatusDiffRate.ACTIVE : PlusStatusDiffRate.INACTIVE);
                aVar.e0(str);
            }
        }
        return zy11.a;
    }
}
