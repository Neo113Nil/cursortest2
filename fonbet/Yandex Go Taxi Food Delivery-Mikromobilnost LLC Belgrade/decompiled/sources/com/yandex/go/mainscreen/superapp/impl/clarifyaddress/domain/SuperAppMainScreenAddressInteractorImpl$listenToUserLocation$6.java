package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.c34;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmo21;", "it", "Lzy11;", "<anonymous>", "(Lmo21;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6", f = "SuperAppMainScreenAddressInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6 superAppMainScreenAddressInteractorImpl$listenToUserLocation$6 = new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6(this.this$0, continuation);
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$6.L$0 = obj;
        return superAppMainScreenAddressInteractorImpl$listenToUserLocation$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6 superAppMainScreenAddressInteractorImpl$listenToUserLocation$6 = (SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6) create((mo21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$6.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mo21 mo21Var = (mo21) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c34 c34Var = (c34) this.this$0.m.get();
        Objects.toString(mo21Var);
        c34Var.getClass();
        return zy11.a;
    }
}
