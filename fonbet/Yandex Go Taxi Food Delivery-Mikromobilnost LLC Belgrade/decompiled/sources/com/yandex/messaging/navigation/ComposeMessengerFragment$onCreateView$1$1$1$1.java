package com.yandex.messaging.navigation;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s120;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhs31;", "<anonymous>", "()Lhs31;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.navigation.ComposeMessengerFragment$onCreateView$1$1$1$1", f = "ComposeMessengerFragment.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ComposeMessengerFragment$onCreateView$1$1$1$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ ComposeMessengerFragment<s120> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeMessengerFragment$onCreateView$1$1$1$1(ComposeMessengerFragment composeMessengerFragment, Continuation continuation) {
        super(1, continuation);
        this.this$0 = composeMessengerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ComposeMessengerFragment$onCreateView$1$1$1$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ComposeMessengerFragment$onCreateView$1$1$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ComposeMessengerFragment<s120> composeMessengerFragment = this.this$0;
        this.label = 1;
        Object viewModelFactory = composeMessengerFragment.getViewModelFactory(this);
        return viewModelFactory == coroutineSingletons ? coroutineSingletons : viewModelFactory;
    }
}
