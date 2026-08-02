package com.yandex.go.pin.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3", f = "MainScreenPinV2DataRepositoryImpl.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3 mainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3 = new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3(this.this$0, continuation);
        mainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3.L$0 = obj;
        return mainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SourceOnMapControl.a aVar = this.this$0.q;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(aVar, this) == coroutineSingletons) {
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
