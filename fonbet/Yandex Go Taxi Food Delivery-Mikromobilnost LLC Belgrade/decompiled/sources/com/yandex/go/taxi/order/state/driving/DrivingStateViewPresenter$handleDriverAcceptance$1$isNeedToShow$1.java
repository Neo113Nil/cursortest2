package com.yandex.go.taxi.order.state.driving;

import com.yandex.go.taxi.order.domain.repositories.f;
import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.driving.DrivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1", f = "DrivingStateViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DrivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        f fVar = aVar.Z;
        boolean contains = fVar.b.n("Acceptance").contains(aVar.A.b().a);
        a aVar2 = this.this$0;
        if (contains) {
            f fVar2 = aVar2.Z;
            String str = aVar2.A.b().a;
            cne0 cne0Var = fVar2.b;
            cne0Var.t("Acceptance", v4r0.f(cne0Var.n("Acceptance"), str));
        } else {
            aVar2.getClass();
        }
        return Boolean.valueOf(contains);
    }
}
