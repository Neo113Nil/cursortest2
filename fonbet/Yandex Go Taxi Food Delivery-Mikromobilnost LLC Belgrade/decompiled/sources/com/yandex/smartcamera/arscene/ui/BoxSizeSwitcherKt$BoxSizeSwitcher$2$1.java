package com.yandex.smartcamera.arscene.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z69;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.smartcamera.arscene.ui.BoxSizeSwitcherKt$BoxSizeSwitcher$2$1", f = "BoxSizeSwitcher.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BoxSizeSwitcherKt$BoxSizeSwitcher$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $currentBoxIndex;
    final /* synthetic */ z69 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxSizeSwitcherKt$BoxSizeSwitcher$2$1(z69 z69Var, int i, Continuation continuation) {
        super(2, continuation);
        this.$state = z69Var;
        this.$currentBoxIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoxSizeSwitcherKt$BoxSizeSwitcher$2$1(this.$state, this.$currentBoxIndex, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BoxSizeSwitcherKt$BoxSizeSwitcher$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            z69 z69Var = this.$state;
            int i2 = this.$currentBoxIndex;
            this.label = 1;
            Object c = e.c(z69Var.a, i2, true, this);
            if (c != coroutineSingletons) {
                c = zy11Var;
            }
            if (c == coroutineSingletons) {
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
