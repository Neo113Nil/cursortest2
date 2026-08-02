package com.yandex.go.preload;

import defpackage.ape0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lape0;", "<anonymous>", "(Ltse;)Lape0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preload.PreloadInteractorImpl$waitForSplashCanClose$2$state$1", f = "PreloadInteractorImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreloadInteractorImpl$waitForSplashCanClose$2$state$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lape0;", "it", "", "<anonymous>", "(Lape0;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.preload.PreloadInteractorImpl$waitForSplashCanClose$2$state$1$1", f = "PreloadInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.preload.PreloadInteractorImpl$waitForSplashCanClose$2$state$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ape0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ape0 ape0Var = (ape0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(ape0Var.b || ape0Var.a);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadInteractorImpl$waitForSplashCanClose$2$state$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreloadInteractorImpl$waitForSplashCanClose$2$state$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreloadInteractorImpl$waitForSplashCanClose$2$state$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = this.this$0.c.c;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
        this.label = 1;
        Object z = kotlinx.coroutines.flow.e.z(r0Var, anonymousClass1, this);
        return z == coroutineSingletons ? coroutineSingletons : z;
    }
}
