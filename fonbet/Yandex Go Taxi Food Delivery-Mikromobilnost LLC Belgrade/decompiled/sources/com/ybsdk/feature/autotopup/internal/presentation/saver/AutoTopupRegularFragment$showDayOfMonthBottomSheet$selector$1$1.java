package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsWhenButtonClickBottomsheetType;
import defpackage.f42;
import defpackage.l0p;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupRegularFragment$showDayOfMonthBottomSheet$selector$1$1 extends FunctionReferenceImpl implements tls {
    public AutoTopupRegularFragment$showDayOfMonthBottomSheet$selector$1$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onDayClick", "onDayClick(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        a aVar = (a) this.receiver;
        f42 f42Var = aVar.L;
        AutoTopupRegularParams autoTopupRegularParams = aVar.B;
        l0p l0pVar = f42Var.b.c0;
        String agreementId = autoTopupRegularParams.getAgreementId();
        if (str == null) {
            str = "";
        }
        l0p.j(l0pVar, agreementId, str, RegularAutotopupEvents$RegularAutotopupSettingsWhenButtonClickBottomsheetType.MONTH);
        return zy11.a;
    }
}
