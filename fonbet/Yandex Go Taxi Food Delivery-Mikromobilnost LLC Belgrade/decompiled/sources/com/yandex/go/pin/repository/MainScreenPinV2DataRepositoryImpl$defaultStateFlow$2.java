package com.yandex.go.pin.repository;

import defpackage.e800;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "it", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "<anonymous>", "(Lfnx0;)Lru/yandex/taxi/widget/map/SourceOnMapControl$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainScreenPinV2DataRepositoryImpl$defaultStateFlow$2", f = "MainScreenPinV2DataRepositoryImpl.kt", l = {257}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainScreenPinV2DataRepositoryImpl$defaultStateFlow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenPinV2DataRepositoryImpl$defaultStateFlow$2(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenPinV2DataRepositoryImpl$defaultStateFlow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenPinV2DataRepositoryImpl$defaultStateFlow$2) create((fnx0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e800 e800Var = this.this$0.f;
            this.label = 1;
            obj = ((b) e800Var).b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        SourceOnMapControl.a aVar = (SourceOnMapControl.a) obj;
        return aVar == null ? this.this$0.q : aVar;
    }
}
