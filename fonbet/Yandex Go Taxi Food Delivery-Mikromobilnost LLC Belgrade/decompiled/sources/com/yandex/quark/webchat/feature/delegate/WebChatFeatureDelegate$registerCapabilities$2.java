package com.yandex.quark.webchat.feature.delegate;

import defpackage.c38;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rd41;
import defpackage.tse;
import defpackage.u28;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.feature.delegate.WebChatFeatureDelegate$registerCapabilities$2", f = "WebChatFeatureDelegate.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebChatFeatureDelegate$registerCapabilities$2 extends SuspendLambda implements wls {
    final /* synthetic */ rd41 $initializationStateProvider;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatFeatureDelegate$registerCapabilities$2(rd41 rd41Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$initializationStateProvider = rd41Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebChatFeatureDelegate$registerCapabilities$2(this.$initializationStateProvider, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebChatFeatureDelegate$registerCapabilities$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rd41 rd41Var = this.$initializationStateProvider;
            this.label = 1;
            if (((com.yandex.quark.webchat.feature.dependencies.a) rd41Var).a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Iterator it = this.this$0.n.values().iterator();
        while (it.hasNext()) {
            this.this$0.d.w.c(new c38((u28) it.next()));
        }
        return zy11.a;
    }
}
