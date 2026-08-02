package com.yandex.go.styling.router;

import android.app.Activity;
import defpackage.fvy0;
import defpackage.jc4;
import defpackage.lg21;
import defpackage.ny61;
import defpackage.pay0;
import defpackage.pz40;
import defpackage.qfg;
import defpackage.sk7;
import defpackage.w030;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.evgen.DarkThemeSwitcherAnalytics$Theme;
import ru.yandex.taxi.themes.evgen.DarkThemeSwitcherAnalytics$ThemeState;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;
import ru.yandex.taxi.themes.experiments.e;
import ru.yandex.taxi.themes.g;
import ru.yandex.taxi.themes.ui.DarkThemeModeModalView;

/* loaded from: classes6.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final Activity F;
    public final lg21 G;
    public final fvy0 H;
    public final w030 I;
    public final pay0 J;
    public final g K;
    public final e L;
    public final qfg M;

    public a(Activity activity, lg21 lg21Var, fvy0 fvy0Var, w030 w030Var, pay0 pay0Var, g gVar, e eVar, qfg qfgVar) {
        super(null);
        this.F = activity;
        this.G = lg21Var;
        this.H = fvy0Var;
        this.I = w030Var;
        this.J = pay0Var;
        this.K = gVar;
        this.L = eVar;
        this.M = qfgVar;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.I;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final /* bridge */ /* synthetic */ Object S(Object obj, Continuation continuation) {
        return T(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(Continuation continuation) {
        ChangeDarkThemeRouterImpl$provideModalView$1 changeDarkThemeRouterImpl$provideModalView$1;
        int i;
        DarkThemeSwitcherAnalytics$ThemeState b;
        DarkThemeSwitcherAnalytics$Theme a;
        if (continuation instanceof ChangeDarkThemeRouterImpl$provideModalView$1) {
            changeDarkThemeRouterImpl$provideModalView$1 = (ChangeDarkThemeRouterImpl$provideModalView$1) continuation;
            int i2 = changeDarkThemeRouterImpl$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeDarkThemeRouterImpl$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeDarkThemeRouterImpl$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeDarkThemeRouterImpl$provideModalView$1.label;
                if (i != 0) {
                    b.b(obj);
                    changeDarkThemeRouterImpl$provideModalView$1.L$0 = null;
                    changeDarkThemeRouterImpl$provideModalView$1.label = 1;
                    obj = this.L.a.b(changeDarkThemeRouterImpl$provideModalView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                DarkThemeSwitchExperiment darkThemeSwitchExperiment = (DarkThemeSwitchExperiment) obj;
                ThemeChangeMode themeChangeMode = (ThemeChangeMode) ((r0) ((pz40) this.J.d.getValue())).getValue();
                this.K.getClass();
                ThemeChangeMode b2 = g.b(darkThemeSwitchExperiment, themeChangeMode);
                Activity activity = this.F;
                DarkThemeModeModalView darkThemeModeModalView = new DarkThemeModeModalView(activity, b2, new sk7(8, this, activity, darkThemeSwitchExperiment), darkThemeSwitchExperiment.d, darkThemeSwitchExperiment.f);
                fvy0 fvy0Var = this.H;
                jc4 jc4Var = fvy0Var.d;
                b = fvy0.b(b2);
                a = fvy0Var.a();
                jc4Var.getClass();
                HashMap hashMap = new HashMap();
                if (a != null) {
                    hashMap.put("system_theme", a.getEventValue());
                }
                if (b != null) {
                    hashMap.put("theme_state", b.getEventValue());
                }
                jc4Var.a.a("DarkThemeSwitcher.Shown", hashMap, 1, new HashMap());
                return darkThemeModeModalView;
            }
        }
        changeDarkThemeRouterImpl$provideModalView$1 = new ChangeDarkThemeRouterImpl$provideModalView$1(this, (ContinuationImpl) continuation);
        Object obj2 = changeDarkThemeRouterImpl$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeDarkThemeRouterImpl$provideModalView$1.label;
        if (i != 0) {
        }
        DarkThemeSwitchExperiment darkThemeSwitchExperiment2 = (DarkThemeSwitchExperiment) obj2;
        ThemeChangeMode themeChangeMode2 = (ThemeChangeMode) ((r0) ((pz40) this.J.d.getValue())).getValue();
        this.K.getClass();
        ThemeChangeMode b22 = g.b(darkThemeSwitchExperiment2, themeChangeMode2);
        Activity activity2 = this.F;
        DarkThemeModeModalView darkThemeModeModalView2 = new DarkThemeModeModalView(activity2, b22, new sk7(8, this, activity2, darkThemeSwitchExperiment2), darkThemeSwitchExperiment2.d, darkThemeSwitchExperiment2.f);
        fvy0 fvy0Var2 = this.H;
        jc4 jc4Var2 = fvy0Var2.d;
        b = fvy0.b(b22);
        a = fvy0Var2.a();
        jc4Var2.getClass();
        HashMap hashMap2 = new HashMap();
        if (a != null) {
        }
        if (b != null) {
        }
        jc4Var2.a.a("DarkThemeSwitcher.Shown", hashMap2, 1, new HashMap());
        return darkThemeModeModalView2;
    }
}
