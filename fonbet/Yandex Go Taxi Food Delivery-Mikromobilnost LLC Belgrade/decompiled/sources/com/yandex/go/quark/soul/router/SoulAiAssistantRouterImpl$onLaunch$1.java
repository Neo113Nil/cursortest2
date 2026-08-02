package com.yandex.go.quark.soul.router;

import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;
import defpackage.g9t0;
import defpackage.i9t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.soul.router.SoulAiAssistantRouterImpl$onLaunch$1", f = "SoulAiAssistantRouterImpl.kt", l = {25, 30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SoulAiAssistantRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ i9t0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoulAiAssistantRouterImpl$onLaunch$1(a aVar, i9t0 i9t0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = i9t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SoulAiAssistantRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SoulAiAssistantRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            g9t0 g9t0Var = this.this$0.G;
            this.label = 1;
            obj = g9t0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        SoulAiAssistantExperiment soulAiAssistantExperiment = (SoulAiAssistantExperiment) obj;
        boolean z = soulAiAssistantExperiment.c;
        a aVar = this.this$0;
        if (!z) {
            aVar.r(new qu(9));
            return zy11Var;
        }
        i9t0 i9t0Var = this.$payload;
        SoulAiAssistantExperiment.Navbar.Mode mode = soulAiAssistantExperiment.g.a;
        this.L$0 = null;
        this.label = 2;
        return a.P(aVar, i9t0Var, mode, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
