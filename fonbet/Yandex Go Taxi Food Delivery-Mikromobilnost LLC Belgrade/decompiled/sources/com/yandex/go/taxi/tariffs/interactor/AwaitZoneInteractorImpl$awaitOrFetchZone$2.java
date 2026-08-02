package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.bc4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.AwaitZoneInteractorImpl$awaitOrFetchZone$2", f = "AwaitZoneInteractorImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AwaitZoneInteractorImpl$awaitOrFetchZone$2 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<Zone> $routeZone;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitZoneInteractorImpl$awaitOrFetchZone$2(g gVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$routeZone = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AwaitZoneInteractorImpl$awaitOrFetchZone$2(this.this$0, this.$routeZone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AwaitZoneInteractorImpl$awaitOrFetchZone$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.t T = kotlinx.coroutines.flow.e.T(new d(this.this$0.d.k()), 1);
            bc4 bc4Var = new bc4(0, this.$routeZone);
            this.label = 1;
            if (T.collect(bc4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
