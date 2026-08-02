package com.yandex.go.quark.ai_assistant.impl.router;

import defpackage.fhg0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.vgg0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.ai_assistant.impl.router.AiAssistantDynamicFeatureRouter$onLaunch$1", f = "AiAssistantDynamicFeatureRouter.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AiAssistantDynamicFeatureRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ fhg0 $payload;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiAssistantDynamicFeatureRouter$onLaunch$1(b bVar, fhg0 fhg0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = fhg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiAssistantDynamicFeatureRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiAssistantDynamicFeatureRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vgg0 vgg0Var = this.this$0.E;
            this.label = 1;
            obj = vgg0Var.a.b.b(this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b bVar = this.this$0;
        zy11 zy11Var = zy11.a;
        if (booleanValue) {
            bVar.A((m950) bVar.F.get(), this.$payload, new a(this.this$0));
            return zy11Var;
        }
        bVar.r(new qu(9));
        return zy11Var;
    }
}
