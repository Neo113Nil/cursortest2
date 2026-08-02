package com.yandex.go.flex.common.descriptors.action;

import defpackage.hxl;
import defpackage.mvg;
import defpackage.n6u;
import defpackage.ny61;
import defpackage.tls;
import defpackage.u1m;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.descriptors.action.GoLoadDocumentActionDescriptorFactoryImpl$ActionHandlerImpl$handle$1", f = "GoLoadDocumentActionDescriptorFactoryImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GoLoadDocumentActionDescriptorFactoryImpl$ActionHandlerImpl$handle$1 extends SuspendLambda implements tls {
    final /* synthetic */ n6u $context;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoLoadDocumentActionDescriptorFactoryImpl$ActionHandlerImpl$handle$1(c cVar, n6u n6uVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$context = n6uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GoLoadDocumentActionDescriptorFactoryImpl$ActionHandlerImpl$handle$1(this.this$0, this.$context, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((GoLoadDocumentActionDescriptorFactoryImpl$ActionHandlerImpl$handle$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tls tlsVar = this.this$0.b;
            this.label = 1;
            obj = tlsVar.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$context.d.a(new hxl(null, (u1m) obj));
        return zy11.a;
    }
}
