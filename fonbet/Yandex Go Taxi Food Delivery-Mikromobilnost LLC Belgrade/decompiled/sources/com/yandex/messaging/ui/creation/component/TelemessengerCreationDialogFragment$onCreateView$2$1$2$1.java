package com.yandex.messaging.ui.creation.component;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc020;", "<anonymous>", "()Lc020;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.creation.component.TelemessengerCreationDialogFragment$onCreateView$2$1$2$1", f = "TelemessengerCreationDialogFragment.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TelemessengerCreationDialogFragment$onCreateView$2$1$2$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ TelemessengerCreationDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemessengerCreationDialogFragment$onCreateView$2$1$2$1(TelemessengerCreationDialogFragment telemessengerCreationDialogFragment, Continuation continuation) {
        super(1, continuation);
        this.this$0 = telemessengerCreationDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TelemessengerCreationDialogFragment$onCreateView$2$1$2$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TelemessengerCreationDialogFragment$onCreateView$2$1$2$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh activityComponentAsync;
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
        activityComponentAsync = this.this$0.getActivityComponentAsync();
        this.label = 1;
        Object k = activityComponentAsync.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
