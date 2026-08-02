package com.yandex.go.yb.domain;

import androidx.lifecycle.Lifecycle;
import com.ybsdk.api.entities.YBSdkTheme;
import defpackage.gci0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.pwy0;
import defpackage.r2u0;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zdi0;

/* loaded from: classes8.dex */
public final class f {
    public final Lifecycle a;
    public final ike b;
    public final pwy0 c;

    public f(Lifecycle lifecycle, ike ikeVar, pwy0 pwy0Var) {
        this.a = lifecycle;
        this.b = ikeVar;
        this.c = pwy0Var;
    }

    public final gci0 a() {
        YBSdkTheme yBSdkTheme;
        pwy0 pwy0Var = this.c;
        jqr jqrVar = new jqr(new e(pwy0Var.a(), this), new RealYbAppThemeInteractor$provideAppThemeFlow$2(this, null), 3);
        xsr0.a.getClass();
        r2u0 r2u0Var = wsr0.c;
        int i = zdi0.a[pwy0Var.getThemeType().ordinal()];
        if (i == 1) {
            yBSdkTheme = YBSdkTheme.LIGHT;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            yBSdkTheme = YBSdkTheme.DARK;
        }
        return kotlinx.coroutines.flow.e.R(jqrVar, this.b, r2u0Var, yBSdkTheme);
    }
}
