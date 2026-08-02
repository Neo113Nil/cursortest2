package com.yandex.go.summary.interactor.core;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1", f = "SummaryLifecycleActionsInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1 extends SuspendLambda implements zls {
    final /* synthetic */ wls $onError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1(wls wlsVar, Continuation continuation) {
        super(3, continuation);
        this.$onError = wlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1 summaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1 = new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1(this.$onError, (Continuation) obj3);
        summaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1.L$0 = (Throwable) obj2;
        return summaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wls wlsVar = this.$onError;
            this.L$0 = null;
            this.label = 1;
            if (wlsVar.invoke(th, this) == coroutineSingletons) {
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
