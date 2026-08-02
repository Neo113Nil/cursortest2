package com.yandex.passport.internal.ui.bouncer.fallback;

import com.yandex.passport.internal.report.reporters.n;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yd00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.fallback.FallbackContentKt$FallbackContent$1$1", f = "FallbackContent.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FallbackContentKt$FallbackContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ w1 $data;
    final /* synthetic */ yd00 $fallbackLauncher;
    final /* synthetic */ n $reporter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackContentKt$FallbackContent$1$1(n nVar, w1 w1Var, yd00 yd00Var, Continuation continuation) {
        super(2, continuation);
        this.$reporter = nVar;
        this.$data = w1Var;
        this.$fallbackLauncher = yd00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FallbackContentKt$FallbackContent$1$1(this.$reporter, this.$data, this.$fallbackLauncher, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FallbackContentKt$FallbackContent$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, 120L);
            this.label = 1;
            if (kotlinx.coroutines.a.i(b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$reporter.j(this.$data);
        this.$fallbackLauncher.a(this.$data);
        return zy11.a;
    }
}
