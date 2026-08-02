package com.yandex.go.image.internal.coil.fetcher;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sci0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqci0;", "<anonymous>", "()Lqci0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.RemoteImageNetworkFetcher$fetch$snapshot$1", f = "RemoteImageNetworkFetcher.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RemoteImageNetworkFetcher$fetch$snapshot$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageNetworkFetcher$fetch$snapshot$1(e eVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RemoteImageNetworkFetcher$fetch$snapshot$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RemoteImageNetworkFetcher$fetch$snapshot$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sci0 sci0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        if (!eVar.b.g.getReadEnabled() || (sci0Var = (sci0) eVar.d.getValue()) == null) {
            return null;
        }
        eVar.b.getClass();
        return sci0Var.a(eVar.a.getKey());
    }
}
