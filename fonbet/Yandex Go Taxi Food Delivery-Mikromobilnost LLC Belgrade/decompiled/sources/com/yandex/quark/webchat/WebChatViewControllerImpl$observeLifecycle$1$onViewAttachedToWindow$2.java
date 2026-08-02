package com.yandex.quark.webchat;

import defpackage.eci0;
import defpackage.g721;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.se41;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$2", f = "WebChatViewControllerImpl.kt", l = {316}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ se41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$2(se41 se41Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = se41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            se41 se41Var = this.this$0;
            eci0 eci0Var = se41Var.j.B.b;
            g721 g721Var = new g721(11, se41Var);
            this.label = 1;
            if (eci0Var.a.collect(g721Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
