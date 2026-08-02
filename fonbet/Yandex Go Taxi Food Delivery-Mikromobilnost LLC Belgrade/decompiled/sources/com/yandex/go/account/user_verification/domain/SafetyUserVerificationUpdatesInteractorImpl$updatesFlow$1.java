package com.yandex.go.account.user_verification.domain;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzy11;", "<unused var>", "", BackendConfig.Restrictions.ENABLED, "<anonymous>", "(VVZ)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.account.user_verification.domain.SafetyUserVerificationUpdatesInteractorImpl$updatesFlow$1", f = "SafetyUserVerificationUpdatesInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SafetyUserVerificationUpdatesInteractorImpl$updatesFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        SafetyUserVerificationUpdatesInteractorImpl$updatesFlow$1 safetyUserVerificationUpdatesInteractorImpl$updatesFlow$1 = new SafetyUserVerificationUpdatesInteractorImpl$updatesFlow$1(4, (Continuation) obj4);
        safetyUserVerificationUpdatesInteractorImpl$updatesFlow$1.Z$0 = booleanValue;
        return safetyUserVerificationUpdatesInteractorImpl$updatesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
