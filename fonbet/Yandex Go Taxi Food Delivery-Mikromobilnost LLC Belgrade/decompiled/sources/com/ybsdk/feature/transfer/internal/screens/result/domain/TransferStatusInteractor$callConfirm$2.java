package com.ybsdk.feature.transfer.internal.screens.result.domain;

import defpackage.ayp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Layp0;", "Let01;", "Lcom/ybsdk/feature/transfer/internal/screens/result/domain/TransferStatusEntity2fa;", "", "<anonymous>", "(Layp0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$callConfirm$2", f = "TransferStatusInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferStatusInteractor$callConfirm$2 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferStatusInteractor$callConfirm$2(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((TransferStatusInteractor$callConfirm$2) create((ayp0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        return Boolean.TRUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.TRUE;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
