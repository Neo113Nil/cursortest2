package com.yandex.plus.home.api.prefetch;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrvj0;", "<anonymous>", "()Lrvj0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.api.prefetch.PrefetchManager$startLoadingWithRetry$job$1$1$response$1", f = "PrefetchManager.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PrefetchManager$startLoadingWithRetry$job$1$1$response$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchManager$startLoadingWithRetry$job$1$1$response$1(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PrefetchManager$startLoadingWithRetry$job$1$1$response$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PrefetchManager$startLoadingWithRetry$job$1$1$response$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        String str = this.$url;
        this.label = 1;
        Object c = aVar.c(str, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
