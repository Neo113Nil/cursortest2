package com.yandex.messaging.isolated;

import android.view.View;
import defpackage.kp50;
import defpackage.l4b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lp4b;", "chatList", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.isolated.IsolatedChatListBrick$launchChatListUpdates$1", f = "IsolatedChatListBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class IsolatedChatListBrick$launchChatListUpdates$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedChatListBrick$launchChatListUpdates$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IsolatedChatListBrick$launchChatListUpdates$1 isolatedChatListBrick$launchChatListUpdates$1 = new IsolatedChatListBrick$launchChatListUpdates$1(this.this$0, continuation);
        isolatedChatListBrick$launchChatListUpdates$1.L$0 = obj;
        return isolatedChatListBrick$launchChatListUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        IsolatedChatListBrick$launchChatListUpdates$1 isolatedChatListBrick$launchChatListUpdates$1 = (IsolatedChatListBrick$launchChatListUpdates$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        isolatedChatListBrick$launchChatListUpdates$1.invokeSuspend(zy11Var);
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
        List list = (List) this.L$0;
        int K1 = this.this$0.H.K1();
        View X = this.this$0.H.X(K1);
        int n0 = X != null ? this.this$0.H.n0(X) : 0;
        c cVar = this.this$0;
        l4b l4bVar = cVar.a.c;
        l4bVar.b = l4bVar.c;
        l4bVar.c = list;
        kp50.f(l4bVar, true).b(l4bVar.a);
        cVar.H.r(K1, n0);
        return zy11.a;
    }
}
