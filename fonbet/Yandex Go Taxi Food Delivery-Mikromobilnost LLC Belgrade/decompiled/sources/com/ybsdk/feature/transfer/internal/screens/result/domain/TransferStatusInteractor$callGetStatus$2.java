package com.ybsdk.feature.transfer.internal.screens.result.domain;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import defpackage.et01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Let01;", "", "<anonymous>", "(Let01;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$callGetStatus$2", f = "TransferStatusInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferStatusInteractor$callGetStatus$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferStatusInteractor$callGetStatus$2 transferStatusInteractor$callGetStatus$2 = new TransferStatusInteractor$callGetStatus$2(2, continuation);
        transferStatusInteractor$callGetStatus$2.L$0 = obj;
        return transferStatusInteractor$callGetStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferStatusInteractor$callGetStatus$2) create((et01) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(((et01) this.L$0).a != TransferStatus.PROCESSING);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
