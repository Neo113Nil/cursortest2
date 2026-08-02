package com.yandex.plus.home.api.prefetch;

import defpackage.cma1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.tls;
import defpackage.zy11;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.api.prefetch.PrefetchManager$loadPrefetch$1$1$1", f = "PrefetchManager.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PrefetchManager$loadPrefetch$1$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $userAgent;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchManager$loadPrefetch$1$1$1(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$userAgent = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PrefetchManager$loadPrefetch$1$1$1(this.this$0, this.$userAgent, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PrefetchManager$loadPrefetch$1$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Reader charStream;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            PrefetchApi prefetchApi = this.this$0.a;
            String str = this.$userAgent;
            this.label = 1;
            obj = prefetchApi.b(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        rvj0 rvj0Var = (rvj0) ((Response) obj).b;
        if (rvj0Var != null && (charStream = rvj0Var.charStream()) != null) {
            return cma1.t0(charStream);
        }
        ny61.v("Received unsuccessful response for prefetch.txt");
        return null;
    }
}
