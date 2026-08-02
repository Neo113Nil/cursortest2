package com.yandex.go.inapp_calls.navigation;

import com.yandex.go.inapp_calls.api.navigation.ResumeInAppCallSource;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
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
@mvg(c = "com.yandex.go.inapp_calls.navigation.ResumeInAppCallRouterImpl$onLaunch$1", f = "ResumeInAppCallRouterImpl.kt", l = {26, 28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ResumeInAppCallRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ ResumeInAppCallSource $payload;
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResumeInAppCallRouterImpl$onLaunch$1(g gVar, ResumeInAppCallSource resumeInAppCallSource, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$payload = resumeInAppCallSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ResumeInAppCallRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResumeInAppCallRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (com.yandex.go.inapp_calls.navigation.g.P(r4, r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.inapp_calls.repository.c cVar = this.this$0.E;
            this.label = 1;
            obj = cVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) obj;
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State2 = InAppCallsFeatureWrapper$State.READY;
        g gVar = this.this$0;
        if (inAppCallsFeatureWrapper$State == inAppCallsFeatureWrapper$State2) {
            ResumeInAppCallSource resumeInAppCallSource = this.$payload;
            this.L$0 = null;
            this.label = 2;
        } else {
            gVar.r(new qu(9));
        }
        return zy11.a;
    }
}
