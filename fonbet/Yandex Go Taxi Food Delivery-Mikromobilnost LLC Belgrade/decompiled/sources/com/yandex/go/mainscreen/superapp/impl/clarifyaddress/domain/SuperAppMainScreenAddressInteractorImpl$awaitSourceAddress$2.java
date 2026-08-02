package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld0l0;", "it", "", "<anonymous>", "(Ld0l0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2", f = "SuperAppMainScreenAddressInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    public SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2 superAppMainScreenAddressInteractorImpl$awaitSourceAddress$2 = new SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2(2, continuation);
        superAppMainScreenAddressInteractorImpl$awaitSourceAddress$2.L$0 = obj;
        return superAppMainScreenAddressInteractorImpl$awaitSourceAddress$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2) create((d0l0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(d0l0Var.h() != null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
