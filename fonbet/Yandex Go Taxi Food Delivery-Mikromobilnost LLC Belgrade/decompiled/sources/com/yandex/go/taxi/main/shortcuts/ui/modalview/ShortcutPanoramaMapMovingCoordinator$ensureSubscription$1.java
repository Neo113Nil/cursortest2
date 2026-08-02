package com.yandex.go.taxi.main.shortcuts.ui.modalview;

import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.x0s0;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutPanoramaMapMovingCoordinator$ensureSubscription$1", f = "ShortcutPanoramaMapMovingCoordinator.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ShortcutPanoramaMapMovingCoordinator$ensureSubscription$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onMapMoving;
    final /* synthetic */ sls $scheduleReplay;
    int label;
    final /* synthetic */ x0s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutPanoramaMapMovingCoordinator$ensureSubscription$1(x0s0 x0s0Var, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = x0s0Var;
        this.$onMapMoving = slsVar;
        this.$scheduleReplay = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutPanoramaMapMovingCoordinator$ensureSubscription$1(this.this$0, this.$onMapMoving, this.$scheduleReplay, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutPanoramaMapMovingCoordinator$ensureSubscription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            x0s0 x0s0Var = this.this$0;
            gci0 gci0Var = x0s0Var.a.c;
            ye yeVar = new ye(20, this.$onMapMoving, x0s0Var, this.$scheduleReplay);
            this.label = 1;
            if (gci0Var.a.collect(yeVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
