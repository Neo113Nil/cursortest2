package com.ybsdk.feature.credit.deposit.internal.data;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.TooltipPosition;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditAdditionalButtonDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PageInfoBottomSheetDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PaymentMethodSheetItemDto;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositPageResponse;
import defpackage.bob1;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.nbf;
import defpackage.ny61;
import defpackage.paf;
import defpackage.saf;
import defpackage.tcc;
import defpackage.ttb1;
import defpackage.wls;
import defpackage.x9f;
import defpackage.z690;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageResponse;", "response", "Lpaf;", "<anonymous>", "(Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageResponse;)Lpaf;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.data.CreditDepositRepository$getCreditLimitDepositPage$3$1", f = "CreditDepositRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositRepository$getCreditLimitDepositPage$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositRepository$getCreditLimitDepositPage$3$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditDepositRepository$getCreditLimitDepositPage$3$1 creditDepositRepository$getCreditLimitDepositPage$3$1 = new CreditDepositRepository$getCreditLimitDepositPage$3$1(this.this$0, continuation);
        creditDepositRepository$getCreditLimitDepositPage$3$1.L$0 = obj;
        return creditDepositRepository$getCreditLimitDepositPage$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditDepositRepository$getCreditLimitDepositPage$3$1) create((CreditLimitDepositPageResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        CreditLimitDepositPageResponse creditLimitDepositPageResponse = (CreditLimitDepositPageResponse) this.L$0;
        com.ybsdk.feature.credit.deposit.internal.domain.entities.b bVar = this.this$0.e;
        bVar.getClass();
        Text.Constant i = g8e.i(Text.Companion, creditLimitDepositPageResponse.getTitle());
        Text.Constant constant = new Text.Constant(creditLimitDepositPageResponse.getPaymentMethodsSheetTitle());
        String paymentMethodsDeeplink = creditLimitDepositPageResponse.getPaymentMethodsDeeplink();
        saf e = ttb1.e(creditLimitDepositPageResponse.getDefaultPaymentMethod(), false);
        List<PaymentMethodSheetItemDto> paymentMethods = creditLimitDepositPageResponse.getPaymentMethodList().getPaymentMethods();
        ArrayList arrayList = new ArrayList(tcc.n(paymentMethods, 10));
        Iterator<T> it = paymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(ttb1.e((PaymentMethodSheetItemDto) it.next(), false));
        }
        List<CreditAdditionalButtonDto> additionalButtons = creditLimitDepositPageResponse.getPaymentMethodList().getAdditionalButtons();
        ArrayList arrayList2 = new ArrayList(tcc.n(additionalButtons, 10));
        Iterator<T> it2 = additionalButtons.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.ybsdk.feature.credit.deposit.internal.domain.entities.b.b((CreditAdditionalButtonDto) it2.next()));
        }
        nbf nbfVar = new nbf(arrayList, arrayList2);
        MoneyEntity g = bob1.g(creditLimitDepositPageResponse.getDefaultAmountValue(), bVar.a);
        PageInfoBottomSheetDto pageInfoBottomSheet = creditLimitDepositPageResponse.getPageInfoBottomSheet();
        z690 c = pageInfoBottomSheet != null ? com.ybsdk.feature.credit.deposit.internal.domain.entities.b.c(pageInfoBottomSheet) : null;
        x9f x9fVar = new x9f(d.g(creditLimitDepositPageResponse.getAmountComment()), d.g(creditLimitDepositPageResponse.getTooltip()), null, TooltipPosition.AMOUNT, null, null, null, EmptyList.a, null, creditLimitDepositPageResponse.isPaymentAllowed());
        Boolean isNumPadVisible = creditLimitDepositPageResponse.isNumPadVisible();
        boolean booleanValue = isNumPadVisible != null ? isNumPadVisible.booleanValue() : true;
        String buttonText = creditLimitDepositPageResponse.getButtonText();
        return new paf(i, constant, paymentMethodsDeeplink, e, nbfVar, g, c, x9fVar, booleanValue, buttonText != null ? d.e(buttonText) : null);
    }
}
