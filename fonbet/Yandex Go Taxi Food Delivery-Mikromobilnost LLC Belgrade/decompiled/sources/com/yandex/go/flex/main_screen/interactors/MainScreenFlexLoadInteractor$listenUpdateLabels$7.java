package com.yandex.go.flex.main_screen.interactors;

import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lb5q0;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.MainScreenFlexLoadInteractor$listenUpdateLabels$7", f = "MainScreenFlexLoadInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexLoadInteractor$listenUpdateLabels$7 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$7 mainScreenFlexLoadInteractor$listenUpdateLabels$7 = new MainScreenFlexLoadInteractor$listenUpdateLabels$7(2, continuation);
        mainScreenFlexLoadInteractor$listenUpdateLabels$7.L$0 = obj;
        return mainScreenFlexLoadInteractor$listenUpdateLabels$7;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$7 mainScreenFlexLoadInteractor$listenUpdateLabels$7 = (MainScreenFlexLoadInteractor$listenUpdateLabels$7) create((Set) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mainScreenFlexLoadInteractor$listenUpdateLabels$7.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hst hstVar = jst.e;
        Objects.toString(set);
        hstVar.getClass();
        return zy11.a;
    }
}
