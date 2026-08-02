package com.ybsdk.feature.savings.internal.screens.account;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountIncomeWidgetTaxInfoButtonClickType;
import defpackage.rt1;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$14 extends FunctionReferenceImpl implements tls {
    public SavingsAccountFragment$adapter$2$14(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onFundIncomeInfoClick", "onFundIncomeInfoClick(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a aVar = (a) this.receiver;
        rt1 rt1Var = aVar.E.f0;
        SavingsEvents$SavingsAccountIncomeWidgetTaxInfoButtonClickType savingsEvents$SavingsAccountIncomeWidgetTaxInfoButtonClickType = SavingsEvents$SavingsAccountIncomeWidgetTaxInfoButtonClickType.FUND;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", savingsEvents$SavingsAccountIncomeWidgetTaxInfoButtonClickType.getOriginalValue());
        rt1Var.a.a("savings.account.income_widget.tax_info.button.click", linkedHashMap);
        aVar.x0((String) obj);
        return zy11.a;
    }
}
