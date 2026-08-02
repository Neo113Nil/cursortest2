package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.owz0;
import defpackage.pwz0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lowz0;", "unsupportedAddressReason", "Lpwz0;", "clarifyAddressReasonForSupportedAddress", "<anonymous>", "(Lowz0;Lpwz0;)Lpwz0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.ClarifyAddressInteractor$clarifyAddressReasonFlow$1", f = "ClarifyAddressInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ClarifyAddressInteractor$clarifyAddressReasonFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ClarifyAddressInteractor$clarifyAddressReasonFlow$1 clarifyAddressInteractor$clarifyAddressReasonFlow$1 = new ClarifyAddressInteractor$clarifyAddressReasonFlow$1(3, (Continuation) obj3);
        clarifyAddressInteractor$clarifyAddressReasonFlow$1.L$0 = (owz0) obj;
        clarifyAddressInteractor$clarifyAddressReasonFlow$1.L$1 = (pwz0) obj2;
        return clarifyAddressInteractor$clarifyAddressReasonFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        owz0 owz0Var = (owz0) this.L$0;
        pwz0 pwz0Var = (pwz0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return owz0Var != null ? owz0Var : pwz0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
