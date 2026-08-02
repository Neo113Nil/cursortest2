package com.yandex.messaging.internal;

import android.os.Looper;
import defpackage.a80;
import defpackage.ag5;
import defpackage.mvg;
import defpackage.n5e;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xi3;
import defpackage.y6f0;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1", f = "GetConnectionStatusUseCase.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ n5e $this_connectionStatusFlow$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1(Continuation continuation, n5e n5eVar) {
        super(2, continuation);
        this.$this_connectionStatusFlow$inlined = n5eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1 getConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1 = new GetConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1(continuation, this.$this_connectionStatusFlow$inlined);
        getConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return getConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetConnectionStatusUseCase$connectionStatusFlow$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            n5e n5eVar = this.$this_connectionStatusFlow$inlined;
            ag5 ag5Var = new ag5(y6f0Var, 3);
            z83.g(null, n5eVar.a, Looper.myLooper());
            ag5Var.invoke(n5eVar.E);
            n5eVar.x.b(ag5Var);
            a80 a80Var = new a80(12, new xi3(5, n5eVar, ag5Var));
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, a80Var, this) == coroutineSingletons) {
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
