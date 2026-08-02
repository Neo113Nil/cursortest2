package com.yandex.go.sdk_registry.runtime;

import defpackage.mvg;
import defpackage.npp0;
import defpackage.ny61;
import defpackage.qnp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk_registry.runtime.RealSdkComponentRegistry$forceObtainInstanceNow$1", f = "RealSdkComponentRegistry.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RealSdkComponentRegistry$forceObtainInstanceNow$1 extends SuspendLambda implements wls {
    final /* synthetic */ qnp0 $key;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSdkComponentRegistry$forceObtainInstanceNow$1(b bVar, qnp0 qnp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$key = qnp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealSdkComponentRegistry$forceObtainInstanceNow$1(this.this$0, this.$key, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RealSdkComponentRegistry$forceObtainInstanceNow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            qnp0 qnp0Var = this.$key;
            this.label = 1;
            c = bVar.c(qnp0Var, npp0.a, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        kotlin.b.b(c);
        return c;
    }
}
