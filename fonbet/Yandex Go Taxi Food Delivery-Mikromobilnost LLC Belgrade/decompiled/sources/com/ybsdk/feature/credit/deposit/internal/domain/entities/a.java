package com.ybsdk.feature.credit.deposit.internal.domain.entities;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositAmountCheckResponse;
import com.ybsdk.feature.credit.deposit.internal.network.dto.SuggestDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.a5f;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.job1;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.tcc;
import defpackage.x9f;
import defpackage.z4v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.ybsdk.core.utils.text.Text] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(CreditDepositAmountCheckResponse creditDepositAmountCheckResponse, ContinuationImpl continuationImpl) {
        CreditDepositAmountCheckEntityKt$toEntity$1 creditDepositAmountCheckEntityKt$toEntity$1;
        int i;
        Text i2;
        Text e;
        String tooltipAmount;
        TooltipPosition b;
        String str;
        Text text;
        CreditDepositAmountCheckResponse creditDepositAmountCheckResponse2;
        rr51 rr51Var;
        Text.Constant constant;
        String str2;
        Text text2;
        rbv rbvVar;
        ArrayList arrayList;
        Object a;
        Text.Constant constant2;
        String str3;
        rbv rbvVar2;
        ArrayList arrayList2;
        if (continuationImpl instanceof CreditDepositAmountCheckEntityKt$toEntity$1) {
            creditDepositAmountCheckEntityKt$toEntity$1 = (CreditDepositAmountCheckEntityKt$toEntity$1) continuationImpl;
            int i3 = creditDepositAmountCheckEntityKt$toEntity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                creditDepositAmountCheckEntityKt$toEntity$1.label = i3 - Integer.MIN_VALUE;
                Object obj = creditDepositAmountCheckEntityKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositAmountCheckEntityKt$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = g8e.i(Text.Companion, creditDepositAmountCheckResponse.getAmountDescription());
                    String tooltip = creditDepositAmountCheckResponse.getTooltip();
                    e = tooltip != null ? d.e(tooltip) : null;
                    tooltipAmount = creditDepositAmountCheckResponse.getTooltipAmount();
                    b = b(creditDepositAmountCheckResponse.getTooltipPosition());
                    String tooltipActionText = creditDepositAmountCheckResponse.getTooltipActionText();
                    Text.Constant e2 = tooltipActionText != null ? d.e(tooltipActionText) : null;
                    String tooltipAction = creditDepositAmountCheckResponse.getTooltipAction();
                    rbv f = job1.f(qxy0.c(creditDepositAmountCheckResponse.getTooltipActionImage(), null), new a5f(2));
                    List<SuggestDto> suggests = creditDepositAmountCheckResponse.getSuggests();
                    if (suggests == null) {
                        suggests = EmptyList.a;
                    }
                    List<SuggestDto> list = suggests;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
                    for (SuggestDto suggestDto : list) {
                        arrayList3.add(new z4v0(g8e.i(Text.Companion, suggestDto.getText()), suggestDto.getAmount()));
                    }
                    DivDataDto divkitData = creditDepositAmountCheckResponse.getDivkitData();
                    if (divkitData == null) {
                        str = tooltipAmount;
                        text = e;
                        creditDepositAmountCheckResponse2 = creditDepositAmountCheckResponse;
                        rr51Var = null;
                        constant = e2;
                        str2 = tooltipAction;
                        text2 = i2;
                        rbvVar = f;
                        arrayList = arrayList3;
                        return new x9f(text2, text, str, b, constant, str2, rbvVar, arrayList, rr51Var, creditDepositAmountCheckResponse2.isPaymentAllowed());
                    }
                    creditDepositAmountCheckEntityKt$toEntity$1.L$0 = creditDepositAmountCheckResponse;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$1 = i2;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$2 = e;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$3 = tooltipAmount;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$4 = b;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$5 = e2;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$6 = tooltipAction;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$7 = f;
                    creditDepositAmountCheckEntityKt$toEntity$1.L$8 = arrayList3;
                    creditDepositAmountCheckEntityKt$toEntity$1.label = 1;
                    a = com.ybsdk.feature.divkit.internal.a.a(divkitData, new com.ybsdk.feature.divkit.api.domain.a(null), creditDepositAmountCheckEntityKt$toEntity$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    constant2 = e2;
                    obj = a;
                    str3 = tooltipAction;
                    rbvVar2 = f;
                    creditDepositAmountCheckResponse2 = creditDepositAmountCheckResponse;
                    arrayList2 = arrayList3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r2 = (List) creditDepositAmountCheckEntityKt$toEntity$1.L$8;
                    rbvVar2 = (rbv) creditDepositAmountCheckEntityKt$toEntity$1.L$7;
                    str3 = (String) creditDepositAmountCheckEntityKt$toEntity$1.L$6;
                    ?? r5 = (Text) creditDepositAmountCheckEntityKt$toEntity$1.L$5;
                    b = (TooltipPosition) creditDepositAmountCheckEntityKt$toEntity$1.L$4;
                    tooltipAmount = (String) creditDepositAmountCheckEntityKt$toEntity$1.L$3;
                    e = (Text) creditDepositAmountCheckEntityKt$toEntity$1.L$2;
                    i2 = (Text) creditDepositAmountCheckEntityKt$toEntity$1.L$1;
                    creditDepositAmountCheckResponse2 = (CreditDepositAmountCheckResponse) creditDepositAmountCheckEntityKt$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    arrayList2 = r2;
                    constant2 = r5;
                }
                Text text3 = i2;
                rbvVar = rbvVar2;
                text2 = text3;
                Text text4 = e;
                str2 = str3;
                text = text4;
                String str4 = tooltipAmount;
                constant = constant2;
                str = str4;
                rr51Var = (rr51) obj;
                arrayList = arrayList2;
                return new x9f(text2, text, str, b, constant, str2, rbvVar, arrayList, rr51Var, creditDepositAmountCheckResponse2.isPaymentAllowed());
            }
        }
        creditDepositAmountCheckEntityKt$toEntity$1 = new CreditDepositAmountCheckEntityKt$toEntity$1(continuationImpl);
        Object obj2 = creditDepositAmountCheckEntityKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositAmountCheckEntityKt$toEntity$1.label;
        if (i != 0) {
        }
        Text text32 = i2;
        rbvVar = rbvVar2;
        text2 = text32;
        Text text42 = e;
        str2 = str3;
        text = text42;
        String str42 = tooltipAmount;
        constant = constant2;
        str = str42;
        rr51Var = (rr51) obj2;
        arrayList = arrayList2;
        return new x9f(text2, text, str, b, constant, str2, rbvVar, arrayList, rr51Var, creditDepositAmountCheckResponse2.isPaymentAllowed());
    }

    public static final TooltipPosition b(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        return jl40.l(lowerCase, "payment_method") ? TooltipPosition.PAYMENT_METHOD : jl40.l(lowerCase, "amount") ? TooltipPosition.AMOUNT : TooltipPosition.AMOUNT;
    }
}
