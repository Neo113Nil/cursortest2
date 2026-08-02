package com.yandex.go.styling.interactor;

import android.content.res.Configuration;
import android.os.Looper;
import com.yandex.go.design.compose.theme.AppThemeType;
import defpackage.avj0;
import defpackage.bsq0;
import defpackage.eja1;
import defpackage.exu0;
import defpackage.fvy0;
import defpackage.gjx0;
import defpackage.h3y;
import defpackage.i2t0;
import defpackage.i3y;
import defpackage.m3x0;
import defpackage.mz40;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.pz40;
import defpackage.q2t0;
import defpackage.qay0;
import defpackage.qbs;
import defpackage.qje;
import defpackage.say0;
import defpackage.sy2;
import defpackage.tje;
import defpackage.w511;
import defpackage.whf;
import defpackage.xng0;
import defpackage.y5e;
import defpackage.zz2;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.lifecycle.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.themes.ThemeChangeMode;

/* loaded from: classes8.dex */
public final class b {
    public final MainActivity a;
    public final fvy0 b;
    public final say0 c;
    public final whf d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final h3y h;
    public Integer i;
    public final i3y j = kotlin.a.a(new gjx0(18));

    public b(MainActivity mainActivity, fvy0 fvy0Var, say0 say0Var, whf whfVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = mainActivity;
        this.b = fvy0Var;
        this.c = say0Var;
        this.d = whfVar;
        this.e = h3yVar;
        this.f = h3yVar2;
        this.g = h3yVar3;
        this.h = h3yVar4;
    }

    public final void a() {
        ThemeType themeType;
        int i = qay0.a[this.d.a().ordinal()];
        say0 say0Var = this.c;
        MainActivity mainActivity = this.a;
        if (i == 1) {
            themeType = ThemeType.DARK;
        } else if (i == 2) {
            themeType = ThemeType.LIGHT;
        } else if (i == 3) {
            themeType = say0Var.getThemeType();
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            themeType = qje.s(xng0.themeDarkMode, mainActivity) ? ThemeType.DARK : ThemeType.LIGHT;
        }
        ((r0) ((pz40) say0Var.b.getValue())).l(themeType);
        say0Var.a.setValue(say0Var, say0.c[0], Integer.valueOf(themeType.ordinal()));
        qbs qbsVar = new qbs(2, this);
        m3x0 m3x0Var = (m3x0) this.f.get();
        Configuration configuration = mainActivity.getResources().getConfiguration();
        m3x0Var.getClass();
        boolean z = (configuration.uiMode & 48) == 32;
        r0 r0Var = m3x0Var.a;
        Boolean valueOf = Boolean.valueOf(z);
        r0Var.getClass();
        r0Var.m(null, valueOf);
        mainActivity.addOnConfigurationChangedListener(qbsVar);
        c.a(mainActivity.getLifecycle(), new bsq0(3, this, qbsVar));
        tje.N(eja1.s(mainActivity), null, null, new TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2(this, null), 3);
        b(themeType);
        fvy0 fvy0Var = this.b;
        zz2 zz2Var = fvy0Var.a;
        String name = themeType.name();
        ThemeChangeMode themeChangeMode = (ThemeChangeMode) ((r0) ((pz40) fvy0Var.c.d.getValue())).getValue();
        zz2Var.b("Application.Theme.Launch", name, fvy0Var.a().getEventValue(), themeChangeMode != null ? themeChangeMode.getId() : null);
    }

    public final boolean b(ThemeType themeType) {
        mz40 C;
        Integer num = this.i;
        h3y h3yVar = this.e;
        MainActivity mainActivity = this.a;
        if (num == null) {
            this.i = Integer.valueOf(((exu0) h3yVar.get()).a(qje.s(xng0.themeDarkMode, mainActivity) ? ThemeType.DARK : ThemeType.LIGHT).b);
        }
        int i = ((exu0) h3yVar.get()).a(themeType).b;
        AppThemeType appThemeType = themeType == ThemeType.LIGHT ? AppThemeType.Light : AppThemeType.Dark;
        oz40 oz40Var = sy2.c;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            oz40Var.setValue(appThemeType);
        } else {
            i2t0 j = q2t0.j();
            mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
            if (mz40Var == null || (C = mz40Var.C(null, null)) == null) {
                ny61.r("Cannot create a mutable snapshot of an read-only snapshot");
                return false;
            }
            try {
                i2t0 j2 = C.j();
                try {
                    oz40Var.setValue(appThemeType);
                    C.w().g();
                } finally {
                    i2t0.q(j2);
                }
            } finally {
            }
        }
        Integer num2 = this.i;
        h3y h3yVar2 = this.h;
        if (num2 != null && num2.intValue() == i) {
            y5e.Q(((avj0) h3yVar2.get()).a, i);
            return false;
        }
        this.i = Integer.valueOf(i);
        y5e.Q(mainActivity, i);
        Configuration configuration = new Configuration(mainActivity.getResources().getConfiguration());
        configuration.uiMode = themeType == ThemeType.DARK ? 32 : 16;
        mainActivity.getResources().updateConfiguration(configuration, mainActivity.getResources().getDisplayMetrics());
        y5e.Q(((avj0) h3yVar2.get()).a, i);
        return true;
    }
}
