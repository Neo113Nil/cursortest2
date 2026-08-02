package com.ybsdk.feature.futurepayments.internal.data;

import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "divScreen", "Lkotlin/Result;", "Lkqs;", "<anonymous>", "(Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.futurepayments.internal.data.FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1", f = "FuturePaymentsRepository.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1 futurePaymentsRepository$getFuturePaymentsScreen$2$1$1 = new FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1(this.this$0, continuation);
        futurePaymentsRepository$getFuturePaymentsScreen$2$1$1.L$0 = obj;
        return futurePaymentsRepository$getFuturePaymentsScreen$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1) create((DivScreenDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            DivScreenDto divScreenDto = (DivScreenDto) this.L$0;
            a aVar = this.this$0;
            this.label = 1;
            a = a.a(aVar, divScreenDto, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
