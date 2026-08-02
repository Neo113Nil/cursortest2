package com.ybsdk.feature.qr.payments.internal.domain.v2;

import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tzj0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldqg;", "Ltzj0;", "", "<anonymous>", "(Ldqg;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.v2.QrPaymentsV2Interactor$callGetResult$2", f = "QrPaymentsV2Interactor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Interactor$callGetResult$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsV2Interactor$callGetResult$2 qrPaymentsV2Interactor$callGetResult$2 = new QrPaymentsV2Interactor$callGetResult$2(2, continuation);
        qrPaymentsV2Interactor$callGetResult$2.L$0 = obj;
        return qrPaymentsV2Interactor$callGetResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsV2Interactor$callGetResult$2) create((dqg) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        dqg dqgVar = (dqg) this.L$0;
        boolean z = true;
        if (dqgVar instanceof cqg) {
            if (((tzj0) ((cqg) dqgVar).a).a == ResultStatus.PROCESSING) {
                z = false;
            }
        } else if (!(dqgVar instanceof bqg)) {
            w511.b();
            return null;
        }
        return Boolean.valueOf(z);
    }
}
