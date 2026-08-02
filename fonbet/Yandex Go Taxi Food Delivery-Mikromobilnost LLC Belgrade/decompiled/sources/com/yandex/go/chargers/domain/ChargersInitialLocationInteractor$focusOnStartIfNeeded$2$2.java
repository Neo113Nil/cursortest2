package com.yandex.go.chargers.domain;

import defpackage.gh00;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.domain.ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2", f = "ChargersInitialLocationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2 extends SuspendLambda implements wls {
    final /* synthetic */ mo21 $userLocation;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2(c cVar, mo21 mo21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$userLocation = mo21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2(this.this$0, this.$userLocation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2 chargersInitialLocationInteractor$focusOnStartIfNeeded$2$2 = (ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersInitialLocationInteractor$focusOnStartIfNeeded$2$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0.f;
        ((gh00) bVar.a).G(this.$userLocation.a());
        return zy11.a;
    }
}
