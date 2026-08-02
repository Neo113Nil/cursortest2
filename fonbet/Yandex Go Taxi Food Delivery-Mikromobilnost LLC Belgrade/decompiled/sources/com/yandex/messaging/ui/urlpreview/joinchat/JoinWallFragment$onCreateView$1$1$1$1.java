package com.yandex.messaging.ui.urlpreview.joinchat;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhs31;", "<anonymous>", "()Lhs31;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.urlpreview.joinchat.JoinWallFragment$onCreateView$1$1$1$1", f = "JoinWallFragment.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class JoinWallFragment$onCreateView$1$1$1$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ JoinWallFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinWallFragment$onCreateView$1$1$1$1(JoinWallFragment joinWallFragment, Continuation continuation) {
        super(1, continuation);
        this.this$0 = joinWallFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new JoinWallFragment$onCreateView$1$1$1$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((JoinWallFragment$onCreateView$1$1$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object viewModelFactory;
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
        JoinWallFragment joinWallFragment = this.this$0;
        this.label = 1;
        viewModelFactory = joinWallFragment.getViewModelFactory(this);
        return viewModelFactory == coroutineSingletons ? coroutineSingletons : viewModelFactory;
    }
}
