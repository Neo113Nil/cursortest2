package com.yandex.quark.webchat.observers;

import androidx.lifecycle.g;
import defpackage.g721;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pey;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.observers.WebViewLifecycleAwareObserver$onCreate$1", f = "WebViewLifecycleAwareObserver.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebViewLifecycleAwareObserver$onCreate$1 extends SuspendLambda implements wls {
    final /* synthetic */ pey $owner;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLifecycleAwareObserver$onCreate$1(b bVar, pey peyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$owner = peyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewLifecycleAwareObserver$onCreate$1(this.this$0, this.$owner, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewLifecycleAwareObserver$onCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(g.a(this.this$0.b, this.$owner.getLifecycle(), this.this$0.c));
            g721 g721Var = new g721(12, this.this$0);
            this.label = 1;
            if (t.collect(g721Var, this) == coroutineSingletons) {
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
