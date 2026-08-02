package com.yandex.go.yb.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.RealYbOAuthTokenLoader$getUidFlow$2", f = "RealYbOAuthTokenLoader.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class RealYbOAuthTokenLoader$getUidFlow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealYbOAuthTokenLoader$getUidFlow$2(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealYbOAuthTokenLoader$getUidFlow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RealYbOAuthTokenLoader$getUidFlow$2) create((Long) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Lifecycle lifecycle = this.this$0.a;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            this.label = 1;
            if (ru.yandex.taxi.lifecycle.c.e(lifecycle, event, this) == coroutineSingletons) {
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
