package com.ybsdk.feature.savings.internal.screens.account;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountIncomeWidgetChartScrubStartType;
import defpackage.k9m0;
import defpackage.m9m0;
import defpackage.rt1;
import defpackage.tcc;
import defpackage.uc5;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$16 extends FunctionReferenceImpl implements wls {
    public SavingsAccountFragment$adapter$2$16(uc5 uc5Var) {
        super(2, uc5Var, a.class, "onFundIncomeChartScrubStart", "onFundIncomeChartScrubStart(Ljava/lang/String;I)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        a aVar = (a) this.receiver;
        m9m0 c0 = aVar.c0((String) obj);
        if (c0 != null) {
            ArrayList arrayList = c0.d;
            k9m0 k9m0Var = (k9m0) kotlin.collections.a.S(intValue, arrayList);
            if (k9m0Var != null) {
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((k9m0) it.next()).a);
                }
                rt1 rt1Var = aVar.E.f0;
                SavingsEvents$SavingsAccountIncomeWidgetChartScrubStartType savingsEvents$SavingsAccountIncomeWidgetChartScrubStartType = SavingsEvents$SavingsAccountIncomeWidgetChartScrubStartType.FUND;
                String str = k9m0Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                linkedHashMap.put("type", savingsEvents$SavingsAccountIncomeWidgetChartScrubStartType.getOriginalValue());
                linkedHashMap.put("period", str);
                linkedHashMap.put("available_periods", arrayList2);
                rt1Var.a.a("savings.account.income_widget.chart.scrub_start", linkedHashMap);
            }
        }
        return zy11.a;
    }
}
