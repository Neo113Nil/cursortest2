package com.yandex.go.rida.bids.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.utils.LaunchedDisposableEffectKt$LaunchedDisposableEffect$2$1", f = "LaunchedDisposableEffect.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LaunchedDisposableEffectKt$LaunchedDisposableEffect$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $isEnabled;
    final /* synthetic */ wls $launchedEffect;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchedDisposableEffectKt$LaunchedDisposableEffect$2$1(sls slsVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$isEnabled = slsVar;
        this.$launchedEffect = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LaunchedDisposableEffectKt$LaunchedDisposableEffect$2$1 launchedDisposableEffectKt$LaunchedDisposableEffect$2$1 = new LaunchedDisposableEffectKt$LaunchedDisposableEffect$2$1(this.$isEnabled, this.$launchedEffect, continuation);
        launchedDisposableEffectKt$LaunchedDisposableEffect$2$1.L$0 = obj;
        return launchedDisposableEffectKt$LaunchedDisposableEffect$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchedDisposableEffectKt$LaunchedDisposableEffect$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!((Boolean) this.$isEnabled.invoke()).booleanValue()) {
                return zy11Var;
            }
            wls wlsVar = this.$launchedEffect;
            this.L$0 = null;
            this.label = 1;
            if (wlsVar.invoke(tseVar, this) == coroutineSingletons) {
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
