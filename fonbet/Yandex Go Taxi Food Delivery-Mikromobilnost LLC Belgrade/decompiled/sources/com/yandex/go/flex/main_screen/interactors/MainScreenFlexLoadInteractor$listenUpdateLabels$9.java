package com.yandex.go.flex.main_screen.interactors;

import defpackage.i1m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li1m;", "strategy", "Lzy11;", "<anonymous>", "(Li1m;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.MainScreenFlexLoadInteractor$listenUpdateLabels$9", f = "MainScreenFlexLoadInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexLoadInteractor$listenUpdateLabels$9 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexLoadInteractor$listenUpdateLabels$9(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$9 mainScreenFlexLoadInteractor$listenUpdateLabels$9 = new MainScreenFlexLoadInteractor$listenUpdateLabels$9(this.this$0, continuation);
        mainScreenFlexLoadInteractor$listenUpdateLabels$9.L$0 = obj;
        return mainScreenFlexLoadInteractor$listenUpdateLabels$9;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenFlexLoadInteractor$listenUpdateLabels$9) create((i1m) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i1m i1mVar = (i1m) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            if (oVar.a(i1mVar, null, this) == coroutineSingletons) {
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
