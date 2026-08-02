package com.yandex.go.scooters.offers.v2.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x5n0;
import defpackage.y5n0;
import defpackage.z5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz5n0;", "it", "Lzy11;", "<anonymous>", "(Lz5n0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToBookStateChanges$2", f = "ScootersCardStateInteractor.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardStateInteractor$listenToBookStateChanges$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardStateInteractor$listenToBookStateChanges$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCardStateInteractor$listenToBookStateChanges$2 scootersCardStateInteractor$listenToBookStateChanges$2 = new ScootersCardStateInteractor$listenToBookStateChanges$2(this.this$0, continuation);
        scootersCardStateInteractor$listenToBookStateChanges$2.L$0 = obj;
        return scootersCardStateInteractor$listenToBookStateChanges$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardStateInteractor$listenToBookStateChanges$2) create((z5n0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z5n0 z5n0Var = (z5n0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (z5n0Var instanceof x5n0) {
                this.this$0.f.b();
            } else if (z5n0Var instanceof y5n0) {
                e eVar = this.this$0;
                this.L$0 = null;
                this.label = 1;
                if (e.a(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
