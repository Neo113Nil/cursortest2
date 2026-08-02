package com.yandex.go.quark.soul.router;

import com.yandex.go.quark.api.router.QuarkDynamicFeatureRouter$Payload$DisplayMode;
import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;
import defpackage.fhg0;
import defpackage.g9t0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n9t0;
import defpackage.ny61;
import defpackage.o9t0;
import defpackage.qu;
import defpackage.tse;
import defpackage.vgg0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xgg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.soul.router.SoulAiAssistantWarmUpRouterImpl$onLaunch$1", f = "SoulAiAssistantWarmUpRouterImpl.kt", l = {37, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SoulAiAssistantWarmUpRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ n9t0 $payload;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoulAiAssistantWarmUpRouterImpl$onLaunch$1(c cVar, n9t0 n9t0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = n9t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SoulAiAssistantWarmUpRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SoulAiAssistantWarmUpRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r8 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        QuarkDynamicFeatureRouter$Payload$DisplayMode quarkDynamicFeatureRouter$Payload$DisplayMode;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vgg0 vgg0Var = this.this$0.E;
            this.label = 1;
            obj = vgg0Var.a.b.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i2 = o9t0.a[((SoulAiAssistantExperiment) obj).g.a.ordinal()];
                if (i2 == 1) {
                    quarkDynamicFeatureRouter$Payload$DisplayMode = QuarkDynamicFeatureRouter$Payload$DisplayMode.Headerless;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    quarkDynamicFeatureRouter$Payload$DisplayMode = QuarkDynamicFeatureRouter$Payload$DisplayMode.Default;
                }
                c cVar = this.this$0;
                m950 m950Var = (m950) cVar.F.get();
                n9t0 n9t0Var = this.$payload;
                cVar.D(m950Var, new fhg0(n9t0Var.a, xgg0.c, quarkDynamicFeatureRouter$Payload$DisplayMode), new b(this.this$0, n9t0Var));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c cVar2 = this.this$0;
        if (!booleanValue) {
            cVar2.r(new qu(9));
            return zy11Var;
        }
        g9t0 g9t0Var = cVar2.G;
        this.label = 2;
        obj = g9t0Var.a.b(this);
    }
}
