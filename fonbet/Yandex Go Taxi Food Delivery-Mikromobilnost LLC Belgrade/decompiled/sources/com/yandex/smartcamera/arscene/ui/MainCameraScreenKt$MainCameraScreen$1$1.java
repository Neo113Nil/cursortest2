package com.yandex.smartcamera.arscene.ui;

import defpackage.g400;
import defpackage.m33;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s33;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.smartcamera.arscene.ui.MainCameraScreenKt$MainCameraScreen$1$1", f = "MainCameraScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainCameraScreenKt$MainCameraScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ s33 $renderer;
    final /* synthetic */ g400 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCameraScreenKt$MainCameraScreen$1$1(s33 s33Var, g400 g400Var, Continuation continuation) {
        super(2, continuation);
        this.$renderer = s33Var;
        this.$state = g400Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainCameraScreenKt$MainCameraScreen$1$1(this.$renderer, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MainCameraScreenKt$MainCameraScreen$1$1 mainCameraScreenKt$MainCameraScreen$1$1 = (MainCameraScreenKt$MainCameraScreen$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mainCameraScreenKt$MainCameraScreen$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s33 s33Var = this.$renderer;
        m33 m33Var = this.$state.a;
        s33Var.L = true;
        s33Var.M = m33Var;
        com.yandex.smartcamera.arscene.ar_core.helpers.b bVar = s33Var.c0;
        bVar.c = m33Var;
        bVar.c();
        return zy11.a;
    }
}
