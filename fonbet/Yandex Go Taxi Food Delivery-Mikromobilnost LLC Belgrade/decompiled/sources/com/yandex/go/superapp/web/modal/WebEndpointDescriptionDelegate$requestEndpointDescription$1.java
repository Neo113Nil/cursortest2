package com.yandex.go.superapp.web.modal;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q0o;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.web.modal.WebEndpointDescriptionDelegate$requestEndpointDescription$1", f = "WebEndpointDescriptionDelegate.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WebEndpointDescriptionDelegate$requestEndpointDescription$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ q0o $params;
    Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebEndpointDescriptionDelegate$requestEndpointDescription$1(gcn gcnVar, n nVar, q0o q0oVar, Continuation continuation) {
        super(2, continuation);
        this.$callback = gcnVar;
        this.this$0 = nVar;
        this.$params = q0oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebEndpointDescriptionDelegate$requestEndpointDescription$1(this.$callback, this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebEndpointDescriptionDelegate$requestEndpointDescription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gcn gcnVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gcn gcnVar2 = this.$callback;
            com.yandex.go.superapp.web.domain.a aVar = this.this$0.a;
            q0o q0oVar = this.$params;
            this.L$0 = gcnVar2;
            this.label = 1;
            Object a = aVar.a(q0oVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            gcnVar = gcnVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gcnVar = (gcn) this.L$0;
            kotlin.b.b(obj);
        }
        gcnVar.a((ck7) obj);
        return zy11.a;
    }
}
