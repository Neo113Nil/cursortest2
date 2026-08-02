package com.yandex.go.taxi.tariffs.internal.interactor;

import defpackage.dk31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldk31;", "<anonymous>", "()Ldk31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.interactor.UpdateMulticlassTariffInteractor$onResume$1$1$1", f = "UpdateMulticlassTariffInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UpdateMulticlassTariffInteractor$onResume$1$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ dk31 $verticalsInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateMulticlassTariffInteractor$onResume$1$1$1(dk31 dk31Var, Continuation continuation) {
        super(1, continuation);
        this.$verticalsInfo = dk31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UpdateMulticlassTariffInteractor$onResume$1$1$1(this.$verticalsInfo, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((UpdateMulticlassTariffInteractor$onResume$1$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.$verticalsInfo;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
