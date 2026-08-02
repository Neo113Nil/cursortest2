package com.ybsdk.feature.savings.internal.screens.account;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountIncomeWidgetShowType;
import defpackage.k9m0;
import defpackage.m9m0;
import defpackage.rt1;
import defpackage.tls;
import defpackage.tm60;
import defpackage.uc5;
import defpackage.x8m0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$13 extends FunctionReferenceImpl implements tls {
    public SavingsAccountFragment$adapter$2$13(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onFundIncomeWidgetShown", "onFundIncomeWidgetShown(Lcom/ybsdk/feature/savings/internal/screens/account/widgets/SavingsAccountWidget$FundIncome;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        m9m0 c0;
        k9m0 k9m0Var;
        x8m0 x8m0Var = (x8m0) obj;
        a aVar = (a) this.receiver;
        if (!aVar.S && (c0 = aVar.c0(x8m0Var.c)) != null && (k9m0Var = (k9m0) kotlin.collections.a.b0(c0.d)) != null) {
            aVar.S = true;
            rt1 rt1Var = aVar.E.f0;
            SavingsEvents$SavingsAccountIncomeWidgetShowType savingsEvents$SavingsAccountIncomeWidgetShowType = SavingsEvents$SavingsAccountIncomeWidgetShowType.FUND;
            String str = k9m0Var.a;
            double floatValue = tm60.h(k9m0Var.d) != null ? r6.floatValue() : -1.0d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("type", savingsEvents$SavingsAccountIncomeWidgetShowType.getOriginalValue());
            linkedHashMap.put("period", str);
            linkedHashMap.put("income_value", Double.valueOf(floatValue));
            rt1Var.a.a("savings.account.income_widget.show", linkedHashMap);
        }
        return zy11.a;
    }
}
