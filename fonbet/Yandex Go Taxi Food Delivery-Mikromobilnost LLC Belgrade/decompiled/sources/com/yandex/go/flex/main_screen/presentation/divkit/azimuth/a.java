package com.yandex.go.flex.main_screen.presentation.divkit.azimuth;

import com.yandex.go.flex.common.api.FeedSdkTheme;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ SuperappAzimuthRotatableIconView b;

    public a(vpr vprVar, SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView) {
        this.a = vprVar;
        this.b = superappAzimuthRotatableIconView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1 superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        boolean isDark;
        if (continuation instanceof SuperappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1) {
            superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1 = (SuperappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    isDark = this.b.isDark((FeedSdkTheme) obj);
                    Boolean valueOf = Boolean.valueOf(isDark);
                    superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1 = new SuperappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappAzimuthRotatableIconView$observeThemeChanges$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
