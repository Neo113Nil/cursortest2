package com.yandex.go.settings.presentation;

import defpackage.ghe;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qwd;
import defpackage.rzx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.presentation.SettingsVisibilityTrackingKt$trackVisibilityIn$1$1", f = "SettingsVisibilityTracking.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SettingsVisibilityTrackingKt$trackVisibilityIn$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ghe $contentPadding;
    final /* synthetic */ m3u0 $currentItem$delegate;
    final /* synthetic */ m3u0 $currentOnItemShown$delegate;
    final /* synthetic */ oz40 $itemCoordinates$delegate;
    final /* synthetic */ float $minVisibleFraction;
    final /* synthetic */ rzx $viewportCoordinates;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsVisibilityTrackingKt$trackVisibilityIn$1$1(oz40 oz40Var, rzx rzxVar, ghe gheVar, float f, m3u0 m3u0Var, m3u0 m3u0Var2, Continuation continuation) {
        super(2, continuation);
        this.$itemCoordinates$delegate = oz40Var;
        this.$viewportCoordinates = rzxVar;
        this.$contentPadding = gheVar;
        this.$minVisibleFraction = f;
        this.$currentOnItemShown$delegate = m3u0Var;
        this.$currentItem$delegate = m3u0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsVisibilityTrackingKt$trackVisibilityIn$1$1(this.$itemCoordinates$delegate, this.$viewportCoordinates, this.$contentPadding, this.$minVisibleFraction, this.$currentOnItemShown$delegate, this.$currentItem$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SettingsVisibilityTrackingKt$trackVisibilityIn$1$1 settingsVisibilityTrackingKt$trackVisibilityIn$1$1 = (SettingsVisibilityTrackingKt$trackVisibilityIn$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        settingsVisibilityTrackingKt$trackVisibilityIn$1$1.invokeSuspend(zy11Var);
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
        rzx rzxVar = this.$viewportCoordinates;
        ghe gheVar = this.$contentPadding;
        float f = this.$minVisibleFraction;
        m3u0 m3u0Var = this.$currentOnItemShown$delegate;
        m3u0 m3u0Var2 = this.$currentItem$delegate;
        oz40 oz40Var = this.$itemCoordinates$delegate;
        qwd qwdVar = c.a;
        c.b(rzxVar, gheVar, f, m3u0Var, m3u0Var2, (rzx) oz40Var.getValue());
        return zy11.a;
    }
}
