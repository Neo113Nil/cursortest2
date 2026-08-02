package com.yandex.go.flex.main_screen.presentation;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.xby;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1", f = "MainScreenFlexSdkPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1 extends SuspendLambda implements zls {
    final /* synthetic */ tse $$this$launch$inlined;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1(tse tseVar, Continuation continuation) {
        super(3, continuation);
        this.$$this$launch$inlined = tseVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1 mainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1 = new MainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1(this.$$this$launch$inlined, (Continuation) obj3);
        mainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        mainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xby.l(jst.e, "MainScreenFlexSdkPresenter", null, th, "MainScreenFlexSdkPresenter failed load document in " + this.$$this$launch$inlined.getCoroutineContext(), 2);
        return zy11.a;
    }
}
