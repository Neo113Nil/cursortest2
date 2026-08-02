package com.yandex.go.payments.addmethod.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1", f = "AddFastshiftAccountBaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AddFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AddFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1 addFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1 = (AddFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        addFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.V(this.$url);
        return zy11.a;
    }
}
