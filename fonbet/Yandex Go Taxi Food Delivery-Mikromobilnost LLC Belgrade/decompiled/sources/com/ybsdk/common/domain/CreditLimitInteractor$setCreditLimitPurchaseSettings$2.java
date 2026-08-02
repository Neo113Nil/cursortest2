package com.ybsdk.common.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.network.dto.creditlimit.CreditLimitSetSettingsRequest;
import com.ybsdk.network.dto.creditlimit.CreditLimitSettings;
import com.ybsdk.network.dto.creditlimit.CreditLimitSplitMatchingData;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.of51;
import defpackage.qf51;
import defpackage.tf51;
import defpackage.vqg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.domain.CreditLimitInteractor$setCreditLimitPurchaseSettings$2", f = "CreditLimitInteractor.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreditLimitInteractor$setCreditLimitPurchaseSettings$2 extends SuspendLambda implements wls {
    final /* synthetic */ of51 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLimitInteractor$setCreditLimitPurchaseSettings$2(a aVar, of51 of51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = of51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditLimitInteractor$setCreditLimitPurchaseSettings$2 creditLimitInteractor$setCreditLimitPurchaseSettings$2 = new CreditLimitInteractor$setCreditLimitPurchaseSettings$2(this.this$0, this.$request, continuation);
        creditLimitInteractor$setCreditLimitPurchaseSettings$2.L$0 = obj;
        return creditLimitInteractor$setCreditLimitPurchaseSettings$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditLimitInteractor$setCreditLimitPurchaseSettings$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.common.repositiories.creditlimit.a aVar = this.this$0.a;
            CreditLimitSettings creditLimitSettings = new CreditLimitSettings(this.$request.a.a);
            String a2 = vqg.a(this.$request.b.a, YbDateFormat.ISO_8601);
            tf51 tf51Var = this.$request.b.b;
            Money money = new Money(tf51Var.a, tf51Var.b);
            qf51 qf51Var = this.$request.b;
            CreditLimitSetSettingsRequest creditLimitSetSettingsRequest = new CreditLimitSetSettingsRequest(creditLimitSettings, new CreditLimitSplitMatchingData(a2, money, qf51Var.c, qf51Var.d, qf51Var.e, qf51Var.f, qf51Var.g));
            this.label = 1;
            a = aVar.a(creditLimitSetSettingsRequest, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
