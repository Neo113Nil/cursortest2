package com.yandex.go.pin.repository;

import com.yandex.go.pin.api.v1.Pin$State;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xa00;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1", f = "MainScreenPinV1DataRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class MainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ xa00 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, xa00 xa00Var) {
        super(3, continuation);
        this.this$0 = xa00Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1 mainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1 = new MainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        mainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr n;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((Boolean) obj2).booleanValue()) {
                n = new g92(2, Pin$State.MOVE);
            } else {
                xa00 xa00Var = this.this$0;
                tpr t = kotlinx.coroutines.flow.e.t(new s(((com.yandex.go.taxi.tariffs.internal.repository.k) xa00Var.d).j.a()));
                r0 r0Var = xa00Var.b.a;
                ru.yandex.taxi.main.map.i iVar = xa00Var.a.a;
                n = kotlinx.coroutines.flow.e.n(t, r0Var, kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.main.map.h(((com.yandex.go.taxi.tariffs.internal.repository.k) iVar.b).f(), iVar)), new MainScreenPinV1DataRepositoryImpl$fixedStateFlow$2(4, xa00Var, xa00.class, "mapState", "mapState(ZLru/yandex/taxi/address/repository/AddressResolveRepository$State;Lru/yandex/taxi/tariffs/model/EstimatedWaiting;)Lcom/yandex/go/pin/api/v1/Pin$State;", 4));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(n, vprVar, this) == coroutineSingletons) {
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
