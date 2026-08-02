package com.yandex.go.safety.center.safetycenter_web;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sul0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.SafetyCenterWebFeatureRouter$FailureScreenCallbacks$shareUrl$1", f = "SafetyCenterWebFeatureRouter.kt", l = {311}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterWebFeatureRouter$FailureScreenCallbacks$shareUrl$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;
    final /* synthetic */ a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebFeatureRouter$FailureScreenCallbacks$shareUrl$1(b bVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.this$1 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterWebFeatureRouter$FailureScreenCallbacks$shareUrl$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterWebFeatureRouter$FailureScreenCallbacks$shareUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            com.yandex.go.safety.center.safetycenter_web.domain.a aVar = bVar.M;
            sul0 sul0Var = this.this$1.a;
            String str2 = sul0Var.a;
            if (str2 != null && !sul0Var.b) {
                str = str2;
            }
            bVar.getClass();
            String a = sul0Var.c.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_SEND_OTHER_SMS_TEMPLATE);
            this.label = 1;
            if (aVar.b(str, a, this) == coroutineSingletons) {
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
