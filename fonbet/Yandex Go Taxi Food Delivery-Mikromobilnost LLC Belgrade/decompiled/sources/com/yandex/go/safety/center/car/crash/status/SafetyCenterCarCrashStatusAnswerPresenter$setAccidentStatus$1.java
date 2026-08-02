package com.yandex.go.safety.center.car.crash.status;

import defpackage.fql0;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.car.crash.status.SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1", f = "SafetyCenterCarCrashStatusAnswerPresenter.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $failCallback;
    final /* synthetic */ boolean $happened;
    final /* synthetic */ Runnable $successCallback;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1(a aVar, Runnable runnable, boolean z, Runnable runnable2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$successCallback = runnable;
        this.$happened = z;
        this.$failCallback = runnable2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1(this.this$0, this.$successCallback, this.$happened, this.$failCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Runnable runnable;
        Runnable runnable2;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                aVar = this.this$0;
                Runnable runnable3 = this.$successCallback;
                boolean z = this.$happened;
                Runnable runnable4 = this.$failCallback;
                try {
                    aVar.y.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1$1$1 safetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1$1$1 = new SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1$1$1(aVar, z, null);
                    this.L$0 = aVar;
                    this.L$1 = runnable3;
                    this.L$2 = aVar;
                    this.L$3 = runnable4;
                    this.label = 1;
                    if (tje.k0(mdhVar, safetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    runnable2 = runnable3;
                    aVar2 = aVar;
                    runnable = runnable4;
                } catch (Throwable th) {
                    th = th;
                    runnable = runnable4;
                    jst.e.k(th, "Can not set accident status");
                    ((fql0) aVar.Dg()).finishProgress();
                    runnable.run();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                runnable = (Runnable) this.L$3;
                aVar = (a) this.L$2;
                runnable2 = (Runnable) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "Can not set accident status");
                    ((fql0) aVar.Dg()).finishProgress();
                    runnable.run();
                    return zy11.a;
                }
            }
            ((fql0) aVar2.Dg()).finishProgress();
            runnable2.run();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
