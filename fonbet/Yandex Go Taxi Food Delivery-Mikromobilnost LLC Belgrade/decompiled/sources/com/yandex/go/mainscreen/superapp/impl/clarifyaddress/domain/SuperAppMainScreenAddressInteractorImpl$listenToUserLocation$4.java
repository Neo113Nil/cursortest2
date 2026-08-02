package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$LocationUpdateType;
import defpackage.c34;
import defpackage.fdz;
import defpackage.ibw0;
import defpackage.j1w0;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj1w0;", "it", "Lzy11;", "<anonymous>", "(Lj1w0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4", f = "SuperAppMainScreenAddressInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4 superAppMainScreenAddressInteractorImpl$listenToUserLocation$4 = new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4(this.this$0, continuation);
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$4.L$0 = obj;
        return superAppMainScreenAddressInteractorImpl$listenToUserLocation$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4 superAppMainScreenAddressInteractorImpl$listenToUserLocation$4 = (SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4) create((j1w0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j1w0 j1w0Var = (j1w0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c34 c34Var = (c34) this.this$0.m.get();
        Objects.toString(j1w0Var);
        c34Var.getClass();
        fdz fdzVar = this.this$0.k;
        mo21 mo21Var = j1w0Var.a;
        boolean z = j1w0Var.b;
        ibw0 ibw0Var = fdzVar.a;
        if (z && !fdzVar.c.getAndSet(true)) {
            ibw0Var.a(SuperappMainAnalytics$LocationUpdateType.Immediate, fdzVar.a(mo21Var));
        }
        if (!z && !fdzVar.d.getAndSet(true)) {
            ibw0Var.a(SuperappMainAnalytics$LocationUpdateType.FirstUpdate, fdzVar.a(mo21Var));
        }
        if ((mo21Var.f > 0 ? System.currentTimeMillis() - mo21Var.f : 0L) <= 10000 && !fdzVar.e.getAndSet(true)) {
            ibw0Var.a(SuperappMainAnalytics$LocationUpdateType.FirstFresh, fdzVar.a(mo21Var));
        }
        return zy11.a;
    }
}
