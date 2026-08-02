package com.yandex.passport.internal.ui.util;

import android.app.Activity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.util.ForegroundDetector$onActivityPaused$2", f = "ForegroundDetector.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class ForegroundDetector$onActivityPaused$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ForegroundDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundDetector$onActivityPaused$2(ForegroundDetector foregroundDetector, Continuation continuation) {
        super(2, continuation);
        this.this$0 = foregroundDetector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForegroundDetector$onActivityPaused$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForegroundDetector$onActivityPaused$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 foregroundActivityMutableFlow;
        Activity foregroundActivity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            foregroundActivityMutableFlow = this.this$0.getForegroundActivityMutableFlow();
            foregroundActivity = this.this$0.getForegroundActivity();
            this.label = 1;
            ((r0) foregroundActivityMutableFlow).emit(foregroundActivity, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
