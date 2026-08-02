package com.yandex.plus.core.network.okhttp.call;

import defpackage.ah7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq50;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\n"}, d2 = {"", "Dto", "Source", "Lsq50;", "context", "Lkotlin/Pair;", "Lah7;", "Lcom/yandex/plus/core/network/okhttp/client/NetworkClientSource;", "<destruct>", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.call.NetworkCallWithContextProvider$getCallWithContext$call$1", f = "NetworkCallWithContextProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NetworkCallWithContextProvider$getCallWithContext$call$1 extends SuspendLambda implements zls {
    final /* synthetic */ zls $get;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkCallWithContextProvider$getCallWithContext$call$1(zls zlsVar, Continuation continuation) {
        super(3, continuation);
        this.$get = zlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NetworkCallWithContextProvider$getCallWithContext$call$1 networkCallWithContextProvider$getCallWithContext$call$1 = new NetworkCallWithContextProvider$getCallWithContext$call$1(this.$get, (Continuation) obj3);
        networkCallWithContextProvider$getCallWithContext$call$1.L$0 = (sq50) obj;
        networkCallWithContextProvider$getCallWithContext$call$1.L$1 = (Pair) obj2;
        return networkCallWithContextProvider$getCallWithContext$call$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sq50 sq50Var = (sq50) this.L$0;
        Pair pair = (Pair) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return ((ah7) pair.getSecond()).a(sq50Var, new NetworkCallWithContextProvider$getCallWithContext$call$1$result$1(this.$get, sq50Var, pair.getFirst(), null));
    }
}
