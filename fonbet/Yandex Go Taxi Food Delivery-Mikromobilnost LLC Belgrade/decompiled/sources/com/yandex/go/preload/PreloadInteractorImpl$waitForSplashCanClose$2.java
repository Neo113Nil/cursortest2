package com.yandex.go.preload;

import defpackage.ape0;
import defpackage.fpe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preload.PreloadInteractorImpl$waitForSplashCanClose$2", f = "PreloadInteractorImpl.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreloadInteractorImpl$waitForSplashCanClose$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadInteractorImpl$waitForSplashCanClose$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreloadInteractorImpl$waitForSplashCanClose$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreloadInteractorImpl$waitForSplashCanClose$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Double valueOf;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.e.a.c(PreloadAnalytics$EventMarker.WAITING_FOR_SPLASH_CAN_CLOSE);
            PreloadInteractorImpl$waitForSplashCanClose$2$state$1 preloadInteractorImpl$waitForSplashCanClose$2$state$1 = new PreloadInteractorImpl$waitForSplashCanClose$2$state$1(this.this$0, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(3000L, preloadInteractorImpl$waitForSplashCanClose$2$state$1, this);
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
        ape0 ape0Var = (ape0) obj;
        e eVar = this.this$0;
        if (ape0Var == null) {
            a aVar = eVar.e;
            fpe0 fpe0Var = aVar.b;
            valueOf = aVar.a.b(PreloadAnalytics$EventMarker.WAITING_FOR_SPLASH_CAN_CLOSE) != null ? Double.valueOf(r6.floatValue()) : null;
            fpe0Var.getClass();
            HashMap hashMap = new HashMap();
            if (valueOf != null) {
                hashMap.put("duration", valueOf);
            }
            x4e.B(fpe0Var.a, "PreloadSplash.WaitingForSplashCanClose.Timeout", hashMap, 1);
        } else {
            a aVar2 = eVar.e;
            fpe0 fpe0Var2 = aVar2.b;
            valueOf = aVar2.a.b(PreloadAnalytics$EventMarker.WAITING_FOR_SPLASH_CAN_CLOSE) != null ? Double.valueOf(r6.floatValue()) : null;
            fpe0Var2.getClass();
            HashMap hashMap2 = new HashMap();
            if (valueOf != null) {
                hashMap2.put("duration", valueOf);
            }
            x4e.B(fpe0Var2.a, "PreloadSplash.WaitingForSplashCanClose.Complete", hashMap2, 1);
        }
        return zy11.a;
    }
}
