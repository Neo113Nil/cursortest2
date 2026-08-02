package com.yandex.go.superapp.biometrics.data;

import defpackage.a26;
import defpackage.c26;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc26;", "it", "", "<anonymous>", "(Lc26;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1", f = "BiometricsBleReceiverConnectionRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BiometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BiometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1 biometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1 = new BiometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1(2, continuation);
        biometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1.L$0 = obj;
        return biometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricsBleReceiverConnectionRepository$establishNewConnection$2$connectionResult$1) create((c26) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c26 c26Var = (c26) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(!(c26Var instanceof a26));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
