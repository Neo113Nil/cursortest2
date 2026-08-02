package com.ybsdk.feature.credit.deposit.internal.domain.entities;

import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditAdditionalButtonDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositPageResponse;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PageInfoBottomSheetDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PageInfoButtonDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PaymentMethodSheetItemDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.SuggestDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.a5f;
import defpackage.a790;
import defpackage.b790;
import defpackage.bob1;
import defpackage.el0;
import defpackage.fob1;
import defpackage.g8e;
import defpackage.job1;
import defpackage.nbf;
import defpackage.ny61;
import defpackage.paf;
import defpackage.qxy0;
import defpackage.rr51;
import defpackage.saf;
import defpackage.tcc;
import defpackage.ttb1;
import defpackage.w530;
import defpackage.x9f;
import defpackage.z4v0;
import defpackage.z690;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final w530 a;

    public b(w530 w530Var) {
        this.a = w530Var;
    }

    public static el0 b(CreditAdditionalButtonDto creditAdditionalButtonDto) {
        String text = creditAdditionalButtonDto.getTitle().getText();
        ColoredTextDto description = creditAdditionalButtonDto.getDescription();
        return new el0(text, description != null ? description.getText() : null, fob1.b(creditAdditionalButtonDto.getImage()), creditAdditionalButtonDto.getAction());
    }

    public static z690 c(PageInfoBottomSheetDto pageInfoBottomSheetDto) {
        return new z690(fob1.b(pageInfoBottomSheetDto.getToolbarImage()), fob1.b(pageInfoBottomSheetDto.getBottomSheetImage()), g8e.i(Text.Companion, pageInfoBottomSheetDto.getTitle()), new Text.Constant(pageInfoBottomSheetDto.getDescription()), new Text.Constant(pageInfoBottomSheetDto.getButtonText()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CreditDepositPageResponse creditDepositPageResponse, boolean z, ContinuationImpl continuationImpl) {
        CreditDepositPageMapper$map$1 creditDepositPageMapper$map$1;
        int i;
        Text i2;
        Text constant;
        String paymentMethodsDeeplink;
        saf e;
        ArrayList arrayList;
        b790 a790Var;
        Text g;
        Text e2;
        boolean z2;
        MoneyEntity moneyEntity;
        nbf nbfVar;
        String str;
        CreditDepositPageResponse creditDepositPageResponse2;
        ArrayList arrayList2;
        TooltipPosition tooltipPosition;
        rr51 rr51Var;
        Object a;
        nbf nbfVar2;
        MoneyEntity moneyEntity2;
        b790 b790Var;
        String str2;
        TooltipPosition tooltipPosition2;
        ArrayList arrayList3;
        if (continuationImpl instanceof CreditDepositPageMapper$map$1) {
            creditDepositPageMapper$map$1 = (CreditDepositPageMapper$map$1) continuationImpl;
            int i3 = creditDepositPageMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                creditDepositPageMapper$map$1.label = i3 - Integer.MIN_VALUE;
                Object obj = creditDepositPageMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositPageMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = g8e.i(Text.Companion, creditDepositPageResponse.getTitle());
                    constant = new Text.Constant(creditDepositPageResponse.getPaymentMethodsSheetTitle());
                    paymentMethodsDeeplink = creditDepositPageResponse.getPaymentMethodsDeeplink();
                    e = ttb1.e(creditDepositPageResponse.getDefaultPaymentMethod(), z);
                    List<PaymentMethodSheetItemDto> paymentMethods = creditDepositPageResponse.getPaymentMethodList().getPaymentMethods();
                    ArrayList arrayList4 = new ArrayList(tcc.n(paymentMethods, 10));
                    Iterator it = paymentMethods.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(ttb1.e((PaymentMethodSheetItemDto) it.next(), z));
                    }
                    List<CreditAdditionalButtonDto> additionalButtons = creditDepositPageResponse.getPaymentMethodList().getAdditionalButtons();
                    if (additionalButtons != null) {
                        List<CreditAdditionalButtonDto> list = additionalButtons;
                        arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(b((CreditAdditionalButtonDto) it2.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    nbf nbfVar3 = new nbf(arrayList4, arrayList);
                    MoneyEntity g2 = bob1.g(creditDepositPageResponse.getDefaultAmountValue(), this.a);
                    PageInfoBottomSheetDto pageInfoBottomSheet = creditDepositPageResponse.getPageInfoBottomSheet();
                    PageInfoButtonDto pageInfoButton = creditDepositPageResponse.getPageInfoButton();
                    a790Var = pageInfoButton != null ? new a790(fob1.b(pageInfoButton.getToolbarImage()), pageInfoButton.getDeeplink()) : pageInfoBottomSheet != null ? c(pageInfoBottomSheet) : null;
                    g = d.g(creditDepositPageResponse.getAmountComment());
                    String tooltip = creditDepositPageResponse.getTooltip();
                    e2 = tooltip != null ? d.e(tooltip) : null;
                    String tooltipAmount = creditDepositPageResponse.getTooltipAmount();
                    TooltipPosition b = a.b(creditDepositPageResponse.getTooltipPosition());
                    List<SuggestDto> suggests = creditDepositPageResponse.getSuggests();
                    if (suggests == null) {
                        suggests = EmptyList.a;
                    }
                    List A0 = kotlin.collections.a.A0(suggests, 2);
                    ArrayList arrayList5 = new ArrayList(tcc.n(A0, 10));
                    Iterator it3 = A0.iterator();
                    while (it3.hasNext()) {
                        SuggestDto suggestDto = (SuggestDto) it3.next();
                        arrayList5.add(new z4v0(g8e.i(Text.Companion, suggestDto.getText()), suggestDto.getAmount()));
                        it3 = it3;
                        coroutineSingletons = coroutineSingletons;
                    }
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    DivDataDto divkitData = creditDepositPageResponse.getDivkitData();
                    if (divkitData == null) {
                        z2 = true;
                        moneyEntity = g2;
                        nbfVar = nbfVar3;
                        str = tooltipAmount;
                        creditDepositPageResponse2 = creditDepositPageResponse;
                        arrayList2 = arrayList5;
                        tooltipPosition = b;
                        rr51Var = null;
                        saf safVar = e;
                        String str3 = paymentMethodsDeeplink;
                        Text text = e2;
                        Text text2 = g;
                        Text text3 = constant;
                        Text text4 = i2;
                        boolean isPaymentAllowed = creditDepositPageResponse2.isPaymentAllowed();
                        String tooltipActionText = creditDepositPageResponse2.getTooltipActionText();
                        x9f x9fVar = new x9f(text2, text, str, tooltipPosition, tooltipActionText != null ? d.e(tooltipActionText) : null, creditDepositPageResponse2.getTooltipAction(), job1.f(qxy0.c(creditDepositPageResponse2.getTooltipActionImage(), null), new a5f(3)), arrayList2, rr51Var, isPaymentAllowed);
                        Boolean isNumPadVisible = creditDepositPageResponse2.isNumPadVisible();
                        boolean booleanValue = isNumPadVisible != null ? isNumPadVisible.booleanValue() : z2;
                        String buttonText = creditDepositPageResponse2.getButtonText();
                        return new paf(text4, text3, str3, safVar, nbfVar, moneyEntity, a790Var, x9fVar, booleanValue, buttonText != null ? d.e(buttonText) : null);
                    }
                    creditDepositPageMapper$map$1.L$0 = creditDepositPageResponse;
                    creditDepositPageMapper$map$1.L$1 = g;
                    creditDepositPageMapper$map$1.L$2 = e2;
                    creditDepositPageMapper$map$1.L$3 = tooltipAmount;
                    creditDepositPageMapper$map$1.L$4 = b;
                    creditDepositPageMapper$map$1.L$5 = arrayList5;
                    creditDepositPageMapper$map$1.L$6 = i2;
                    creditDepositPageMapper$map$1.L$7 = constant;
                    creditDepositPageMapper$map$1.L$8 = paymentMethodsDeeplink;
                    creditDepositPageMapper$map$1.L$9 = e;
                    creditDepositPageMapper$map$1.L$10 = nbfVar3;
                    creditDepositPageMapper$map$1.L$11 = g2;
                    creditDepositPageMapper$map$1.L$12 = a790Var;
                    z2 = true;
                    creditDepositPageMapper$map$1.label = 1;
                    a = com.ybsdk.feature.divkit.internal.a.a(divkitData, new com.ybsdk.feature.divkit.api.domain.a(null), creditDepositPageMapper$map$1);
                    if (a == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    nbfVar2 = nbfVar3;
                    moneyEntity2 = g2;
                    b790Var = a790Var;
                    str2 = tooltipAmount;
                    obj = a;
                    creditDepositPageResponse2 = creditDepositPageResponse;
                    tooltipPosition2 = b;
                    arrayList3 = arrayList5;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b790Var = (b790) creditDepositPageMapper$map$1.L$12;
                    moneyEntity2 = (MoneyEntity) creditDepositPageMapper$map$1.L$11;
                    nbfVar2 = (nbf) creditDepositPageMapper$map$1.L$10;
                    e = (saf) creditDepositPageMapper$map$1.L$9;
                    paymentMethodsDeeplink = (String) creditDepositPageMapper$map$1.L$8;
                    constant = (Text) creditDepositPageMapper$map$1.L$7;
                    i2 = (Text) creditDepositPageMapper$map$1.L$6;
                    ?? r11 = (List) creditDepositPageMapper$map$1.L$5;
                    TooltipPosition tooltipPosition3 = (TooltipPosition) creditDepositPageMapper$map$1.L$4;
                    str2 = (String) creditDepositPageMapper$map$1.L$3;
                    e2 = (Text) creditDepositPageMapper$map$1.L$2;
                    g = (Text) creditDepositPageMapper$map$1.L$1;
                    creditDepositPageResponse2 = (CreditDepositPageResponse) creditDepositPageMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    z2 = true;
                    tooltipPosition2 = tooltipPosition3;
                    arrayList3 = r11;
                }
                moneyEntity = moneyEntity2;
                rr51Var = (rr51) obj;
                nbfVar = nbfVar2;
                tooltipPosition = tooltipPosition2;
                arrayList2 = arrayList3;
                str = str2;
                a790Var = b790Var;
                saf safVar2 = e;
                String str32 = paymentMethodsDeeplink;
                Text text5 = e2;
                Text text22 = g;
                Text text32 = constant;
                Text text42 = i2;
                boolean isPaymentAllowed2 = creditDepositPageResponse2.isPaymentAllowed();
                String tooltipActionText2 = creditDepositPageResponse2.getTooltipActionText();
                x9f x9fVar2 = new x9f(text22, text5, str, tooltipPosition, tooltipActionText2 != null ? d.e(tooltipActionText2) : null, creditDepositPageResponse2.getTooltipAction(), job1.f(qxy0.c(creditDepositPageResponse2.getTooltipActionImage(), null), new a5f(3)), arrayList2, rr51Var, isPaymentAllowed2);
                Boolean isNumPadVisible2 = creditDepositPageResponse2.isNumPadVisible();
                if (isNumPadVisible2 != null) {
                }
                String buttonText2 = creditDepositPageResponse2.getButtonText();
                return new paf(text42, text32, str32, safVar2, nbfVar, moneyEntity, a790Var, x9fVar2, booleanValue, buttonText2 != null ? d.e(buttonText2) : null);
            }
        }
        creditDepositPageMapper$map$1 = new CreditDepositPageMapper$map$1(this, continuationImpl);
        Object obj2 = creditDepositPageMapper$map$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositPageMapper$map$1.label;
        if (i != 0) {
        }
        moneyEntity = moneyEntity2;
        rr51Var = (rr51) obj2;
        nbfVar = nbfVar2;
        tooltipPosition = tooltipPosition2;
        arrayList2 = arrayList3;
        str = str2;
        a790Var = b790Var;
        saf safVar22 = e;
        String str322 = paymentMethodsDeeplink;
        Text text52 = e2;
        Text text222 = g;
        Text text322 = constant;
        Text text422 = i2;
        boolean isPaymentAllowed22 = creditDepositPageResponse2.isPaymentAllowed();
        String tooltipActionText22 = creditDepositPageResponse2.getTooltipActionText();
        x9f x9fVar22 = new x9f(text222, text52, str, tooltipPosition, tooltipActionText22 != null ? d.e(tooltipActionText22) : null, creditDepositPageResponse2.getTooltipAction(), job1.f(qxy0.c(creditDepositPageResponse2.getTooltipActionImage(), null), new a5f(3)), arrayList2, rr51Var, isPaymentAllowed22);
        Boolean isNumPadVisible22 = creditDepositPageResponse2.isNumPadVisible();
        if (isNumPadVisible22 != null) {
        }
        String buttonText22 = creditDepositPageResponse2.getButtonText();
        return new paf(text422, text322, str322, safVar22, nbfVar, moneyEntity, a790Var, x9fVar22, booleanValue, buttonText22 != null ? d.e(buttonText22) : null);
    }
}
