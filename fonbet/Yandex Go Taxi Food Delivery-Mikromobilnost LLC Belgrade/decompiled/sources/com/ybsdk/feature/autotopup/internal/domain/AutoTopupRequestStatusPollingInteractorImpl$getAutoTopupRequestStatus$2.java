package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.bqg;
import defpackage.c24;
import defpackage.cqg;
import defpackage.d24;
import defpackage.dqg;
import defpackage.e24;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldqg;", "Le24;", "", "<anonymous>", "(Ldqg;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2", f = "AutoTopupRequestStatusPollingInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2 autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2 = new AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2(2, continuation);
        autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2.L$0 = obj;
        return autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2) create((dqg) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            e24 e24Var = (e24) ((cqg) dqgVar).a;
            if (e24Var instanceof c24) {
                if (((c24) e24Var).a == null) {
                    z = false;
                }
            } else if (!(e24Var instanceof d24)) {
                w511.b();
                return null;
            }
        } else if (!(dqgVar instanceof bqg)) {
            w511.b();
            return null;
        }
        return Boolean.valueOf(z);
    }
}
