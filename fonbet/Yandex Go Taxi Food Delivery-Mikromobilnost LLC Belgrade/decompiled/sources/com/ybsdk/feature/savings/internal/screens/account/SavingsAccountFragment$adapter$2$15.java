package com.ybsdk.feature.savings.internal.screens.account;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountIncomeWidgetPeriodClickType;
import defpackage.k9m0;
import defpackage.m9m0;
import defpackage.rt1;
import defpackage.tm60;
import defpackage.uc5;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$15 extends FunctionReferenceImpl implements zls {
    public SavingsAccountFragment$adapter$2$15(uc5 uc5Var) {
        super(3, uc5Var, a.class, "onFundIncomePeriodChange", "onFundIncomePeriodChange(Ljava/lang/String;II)V", 0);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k9m0 k9m0Var;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        a aVar = (a) this.receiver;
        m9m0 c0 = aVar.c0((String) obj);
        if (c0 != null) {
            ArrayList arrayList = c0.d;
            k9m0 k9m0Var2 = (k9m0) kotlin.collections.a.S(intValue, arrayList);
            if (k9m0Var2 != null && (k9m0Var = (k9m0) kotlin.collections.a.S(intValue2, arrayList)) != null) {
                rt1 rt1Var = aVar.E.f0;
                SavingsEvents$SavingsAccountIncomeWidgetPeriodClickType savingsEvents$SavingsAccountIncomeWidgetPeriodClickType = SavingsEvents$SavingsAccountIncomeWidgetPeriodClickType.FUND;
                String str = k9m0Var.a;
                String str2 = k9m0Var2.a;
                double floatValue = tm60.h(k9m0Var.d) != null ? r5.floatValue() : -1.0d;
                LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                linkedHashMap.put("type", savingsEvents$SavingsAccountIncomeWidgetPeriodClickType.getOriginalValue());
                linkedHashMap.put("period_selected", str);
                linkedHashMap.put("period_prev", str2);
                linkedHashMap.put("income_value", Double.valueOf(floatValue));
                rt1Var.a.a("savings.account.income_widget.period.click", linkedHashMap);
            }
        }
        return zy11.a;
    }
}
