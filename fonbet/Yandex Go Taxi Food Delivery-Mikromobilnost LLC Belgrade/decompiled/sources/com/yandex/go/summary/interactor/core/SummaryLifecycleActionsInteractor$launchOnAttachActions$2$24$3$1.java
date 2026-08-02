package com.yandex.go.summary.interactor.core;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lzy11;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1", f = "SummaryLifecycleActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $shouldShowRoute;
    final /* synthetic */ Address $sourceAddress;
    final /* synthetic */ pex0 $tariffDescription;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1(t tVar, Address address, boolean z, pex0 pex0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$sourceAddress = address;
        this.$shouldShowRoute = z;
        this.$tariffDescription = pex0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1(this.this$0, this.$sourceAddress, this.$shouldShowRoute, this.$tariffDescription, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.Q.c(this.$sourceAddress, this.$shouldShowRoute, this.$tariffDescription);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
