package com.yandex.passport.internal.ui.util;

import android.app.Activity;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.util.ForegroundDetector$onActivityDestroyed$1", f = "ForegroundDetector.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class ForegroundDetector$onActivityDestroyed$1 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ ForegroundDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundDetector$onActivityDestroyed$1(ForegroundDetector foregroundDetector, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = foregroundDetector;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForegroundDetector$onActivityDestroyed$1(this.this$0, this.$activity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForegroundDetector$onActivityDestroyed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lz40 destroyedActivityMutableFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            destroyedActivityMutableFlow = this.this$0.getDestroyedActivityMutableFlow();
            Activity activity = this.$activity;
            this.label = 1;
            if (destroyedActivityMutableFlow.emit(activity, this) == coroutineSingletons) {
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
