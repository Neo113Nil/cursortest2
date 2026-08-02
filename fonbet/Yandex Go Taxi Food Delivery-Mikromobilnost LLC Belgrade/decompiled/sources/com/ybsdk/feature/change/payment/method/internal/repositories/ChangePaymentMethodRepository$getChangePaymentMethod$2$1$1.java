package com.ybsdk.feature.change.payment.method.internal.repositories;

import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sc9;
import defpackage.v7l;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "divScreen", "Lsc9;", "<anonymous>", "(Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;)Lsc9;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$getChangePaymentMethod$2$1$1", f = "ChangePaymentMethodRepository.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangePaymentMethodRepository$getChangePaymentMethod$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePaymentMethodRepository$getChangePaymentMethod$2$1$1 changePaymentMethodRepository$getChangePaymentMethod$2$1$1 = new ChangePaymentMethodRepository$getChangePaymentMethod$2$1$1(2, continuation);
        changePaymentMethodRepository$getChangePaymentMethod$2$1$1.L$0 = obj;
        return changePaymentMethodRepository$getChangePaymentMethod$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePaymentMethodRepository$getChangePaymentMethod$2$1$1) create((DivScreenDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            DivScreenDto divScreenDto = (DivScreenDto) this.L$0;
            this.label = 1;
            obj = com.ybsdk.feature.divkit.api.dto.a.a(divScreenDto, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return new sc9(((v7l) obj).c);
    }
}
