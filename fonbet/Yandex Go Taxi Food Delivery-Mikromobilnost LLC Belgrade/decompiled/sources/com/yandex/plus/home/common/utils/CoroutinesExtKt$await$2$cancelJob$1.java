package com.yandex.plus.home.common.utils;

import defpackage.dvw;
import defpackage.j1;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.common.utils.CoroutinesExtKt$await$2$cancelJob$1", f = "CoroutinesExt.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoroutinesExtKt$await$2$cancelJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ Future<Object> $this_await;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtKt$await$2$cancelJob$1(Future future, Continuation continuation) {
        super(2, continuation);
        this.$this_await = future;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutinesExtKt$await$2$cancelJob$1(this.$this_await, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesExtKt$await$2$cancelJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Future<Object> future = this.$this_await;
            this.L$0 = future;
            this.I$0 = 0;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            j18Var.w(new j1(8, future));
            if (j18Var.s() == coroutineSingletons) {
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
