package com.yandex.go.design.compose.platform.statusbar;

import defpackage.dhd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.platform.statusbar.StatusBarControllerKt$forceStatusBarColors$1$1", f = "StatusBarController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class StatusBarControllerKt$forceStatusBarColors$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ dhd $controller;
    final /* synthetic */ boolean $isLight;
    final /* synthetic */ Object $key;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarControllerKt$forceStatusBarColors$1$1(dhd dhdVar, Object obj, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$controller = dhdVar;
        this.$key = obj;
        this.$isLight = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatusBarControllerKt$forceStatusBarColors$1$1(this.$controller, this.$key, this.$isLight, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StatusBarControllerKt$forceStatusBarColors$1$1 statusBarControllerKt$forceStatusBarColors$1$1 = (StatusBarControllerKt$forceStatusBarColors$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        statusBarControllerKt$forceStatusBarColors$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$controller.b(this.$key, this.$isLight);
        return zy11.a;
    }
}
