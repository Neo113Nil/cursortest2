package com.yandex.go.scooters.bdui;

import com.yandex.go.scooters.bdui.view.ScootersComposeToDivkitCompatFrameLayout;
import defpackage.hzk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pjr;
import defpackage.r0n0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xhr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.bdui.ScootersBduiScreenKt$DivKitLifecycle$1$1", f = "ScootersBduiScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBduiScreenKt$DivKitLifecycle$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersComposeToDivkitCompatFrameLayout $container;
    final /* synthetic */ xhr $flexController;
    final /* synthetic */ pjr $flexInsetsDelegate;
    final /* synthetic */ r0n0 $flexView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBduiScreenKt$DivKitLifecycle$1$1(pjr pjrVar, xhr xhrVar, ScootersComposeToDivkitCompatFrameLayout scootersComposeToDivkitCompatFrameLayout, r0n0 r0n0Var, Continuation continuation) {
        super(2, continuation);
        this.$flexInsetsDelegate = pjrVar;
        this.$flexController = xhrVar;
        this.$container = scootersComposeToDivkitCompatFrameLayout;
        this.$flexView = r0n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersBduiScreenKt$DivKitLifecycle$1$1(this.$flexInsetsDelegate, this.$flexController, this.$container, this.$flexView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersBduiScreenKt$DivKitLifecycle$1$1 scootersBduiScreenKt$DivKitLifecycle$1$1 = (ScootersBduiScreenKt$DivKitLifecycle$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersBduiScreenKt$DivKitLifecycle$1$1.invokeSuspend(zy11Var);
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
        pjr pjrVar = this.$flexInsetsDelegate;
        if (pjrVar != null) {
            ((hzk) pjrVar).s();
        }
        ((com.yandex.go.flex.common.facade.b) this.$flexController).b(this.$container, this.$flexView);
        return zy11.a;
    }
}
