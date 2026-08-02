package com.yandex.go.chargers.push.domain;

import defpackage.em9;
import defpackage.ffx;
import defpackage.k20;
import defpackage.tpr;
import defpackage.y4g0;
import defpackage.ysa;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class c {
    public final em9 a;
    public final y4g0 b;
    public final ysa c;
    public final n0 d;
    public k20 e;
    public Boolean f;

    public c(em9 em9Var, y4g0 y4g0Var, ysa ysaVar) {
        this.a = em9Var;
        this.b = y4g0Var;
        this.c = ysaVar;
        n0 c = ffx.c(1, 1, null, 4);
        this.d = c;
        c.g(zy11.a);
        this.f = Boolean.valueOf(y4g0Var.c("chargers-low-battery-local-notification"));
    }

    public final tpr a() {
        return e.t(new b(new n(this.d, new ChargersLowBatterySettingsInteractor$isLowBatterySettingEnabledFlow$1(2, null)), this));
    }
}
