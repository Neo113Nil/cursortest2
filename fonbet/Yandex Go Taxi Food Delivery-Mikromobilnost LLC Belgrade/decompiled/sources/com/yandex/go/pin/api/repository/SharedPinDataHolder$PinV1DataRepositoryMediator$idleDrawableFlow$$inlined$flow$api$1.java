package com.yandex.go.pin.api.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.y0c0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1", f = "SharedPinDataHolder.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    public SharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1 sharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1 = new SharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1(3, (Continuation) obj3);
        sharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1.L$0 = (vpr) obj;
        sharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1.L$1 = obj2;
        return sharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (obj2 == null || (tprVar = ((y0c0) obj2).b()) == null) {
                tprVar = pvn.a;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(tprVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
