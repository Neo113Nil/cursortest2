package com.ybsdk.navigation;

import com.ybsdk.api.entities.YBSdkTheme;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.jx81;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1 navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof NavigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1) {
            navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1 = (NavigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ThemeType K = jx81.K((YBSdkTheme) obj);
                    navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(K, navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1 = new NavigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationFragment$observeThemeChanging$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
