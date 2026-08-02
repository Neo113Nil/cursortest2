package com.yandex.messaging.internal.net;

import defpackage.fse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.net.RetryManager$awaitConnectionEstablished$2", f = "RetryManager.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class RetryManager$awaitConnectionEstablished$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryManager$awaitConnectionEstablished$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RetryManager$awaitConnectionEstablished$2 retryManager$awaitConnectionEstablished$2 = new RetryManager$awaitConnectionEstablished$2(this.this$0, continuation);
        retryManager$awaitConnectionEstablished$2.L$0 = obj;
        return retryManager$awaitConnectionEstablished$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RetryManager$awaitConnectionEstablished$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fse coroutineContext = ((tse) this.L$0).getCoroutineContext();
            RetryManager$awaitConnectionEstablished$2$invokeSuspend$$inlined$disposableCoroutineWrapper$1 retryManager$awaitConnectionEstablished$2$invokeSuspend$$inlined$disposableCoroutineWrapper$1 = new RetryManager$awaitConnectionEstablished$2$invokeSuspend$$inlined$disposableCoroutineWrapper$1(this.this$0, null);
            this.label = 1;
            if (tje.k0(coroutineContext, retryManager$awaitConnectionEstablished$2$invokeSuspend$$inlined$disposableCoroutineWrapper$1, this) == coroutineSingletons) {
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
