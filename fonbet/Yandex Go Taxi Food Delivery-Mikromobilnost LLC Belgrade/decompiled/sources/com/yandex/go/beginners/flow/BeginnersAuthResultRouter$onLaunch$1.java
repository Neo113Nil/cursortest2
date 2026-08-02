package com.yandex.go.beginners.flow;

import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import defpackage.gk5;
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
@mvg(c = "com.yandex.go.beginners.flow.BeginnersAuthResultRouter$onLaunch$1", f = "BeginnersAuthResultRouter.kt", l = {31, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BeginnersAuthResultRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ gk5 $payload;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersAuthResultRouter$onLaunch$1(gk5 gk5Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = gk5Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersAuthResultRouter$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersAuthResultRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (com.yandex.go.beginners.flow.a.Q(r6, r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (com.yandex.go.beginners.flow.a.P(r6, r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            beginnersAuthPostloadExperiment = this.$payload.a;
            a aVar = this.this$0;
            this.L$0 = beginnersAuthPostloadExperiment;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.D.a();
                this.this$0.r(new qu(9));
                return zy11.a;
            }
            beginnersAuthPostloadExperiment = (BeginnersAuthPostloadExperiment) this.L$0;
            kotlin.b.b(obj);
        }
        a aVar2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
    }
}
