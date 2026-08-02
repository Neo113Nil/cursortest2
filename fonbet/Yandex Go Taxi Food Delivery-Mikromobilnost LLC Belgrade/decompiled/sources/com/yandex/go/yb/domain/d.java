package com.yandex.go.yb.domain;

import com.ybsdk.api.entities.YBSdkTheme;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zdi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RealYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1 realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1;
        int i;
        YBSdkTheme yBSdkTheme;
        if (continuation instanceof RealYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1) {
            realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1 = (RealYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1) continuation;
            int i2 = realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    int i3 = zdi0.a[((ThemeType) obj).ordinal()];
                    if (i3 == 1) {
                        yBSdkTheme = YBSdkTheme.LIGHT;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        yBSdkTheme = YBSdkTheme.DARK;
                    }
                    realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.L$0 = null;
                    realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.L$1 = null;
                    realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.L$2 = null;
                    realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.L$3 = null;
                    realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yBSdkTheme, realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1 = new RealYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realYbAppThemeInteractor$provideAppThemeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
