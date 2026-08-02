package com.yandex.go.quark.ai_assistant.impl.router;

import defpackage.bb0;
import defpackage.hm1;
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
@mvg(c = "com.yandex.go.quark.ai_assistant.impl.router.AiAssistantRootRouter$onLaunch$1", f = "AiAssistantRootRouter.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AiAssistantRootRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ hm1 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiAssistantRootRouter$onLaunch$1(d dVar, hm1 hm1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = hm1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiAssistantRootRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiAssistantRootRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        d dVar = this.this$0;
        zy11 zy11Var = zy11.a;
        if (booleanValue) {
            dVar.A((m950) dVar.D.get(), this.$payload, new bb0(this.this$0, 6));
            return zy11Var;
        }
        dVar.r(new qu(9));
        return zy11Var;
    }
}
