package com.yandex.go.agreement.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.am.AuthStateRepository;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "isAuthorized", ClidProvider.STATE, "Lru/yandex/taxi/am/AuthStateRepository$AuthState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.agreement.repository.AgreementToShowRepositoryImpl$authDoneFlow$1", f = "AgreementToShowRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class AgreementToShowRepositoryImpl$authDoneFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AgreementToShowRepositoryImpl$authDoneFlow$1 agreementToShowRepositoryImpl$authDoneFlow$1 = new AgreementToShowRepositoryImpl$authDoneFlow$1(3, (Continuation) obj3);
        agreementToShowRepositoryImpl$authDoneFlow$1.Z$0 = booleanValue;
        agreementToShowRepositoryImpl$authDoneFlow$1.L$0 = (AuthStateRepository.AuthState) obj2;
        return agreementToShowRepositoryImpl$authDoneFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        AuthStateRepository.AuthState authState = (AuthStateRepository.AuthState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z && authState != AuthStateRepository.AuthState.IN_PROGRESS);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
