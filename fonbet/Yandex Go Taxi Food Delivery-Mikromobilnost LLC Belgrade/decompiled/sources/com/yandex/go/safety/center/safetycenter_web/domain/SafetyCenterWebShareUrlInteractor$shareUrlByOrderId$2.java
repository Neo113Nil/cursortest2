package com.yandex.go.safety.center.safetycenter_web.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.domain.SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2", f = "SafetyCenterWebShareUrlInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $routeSharingTemplate;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
        this.$routeSharingTemplate = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2(this.this$0, this.$url, this.$routeSharingTemplate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2 safetyCenterWebShareUrlInteractor$shareUrlByOrderId$2 = (SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        safetyCenterWebShareUrlInteractor$shareUrlByOrderId$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.a(this.$url, this.$routeSharingTemplate);
        return zy11.a;
    }
}
