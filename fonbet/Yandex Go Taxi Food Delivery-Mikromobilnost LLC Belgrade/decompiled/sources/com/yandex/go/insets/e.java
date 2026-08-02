package com.yandex.go.insets;

import androidx.lifecycle.Lifecycle;
import defpackage.a2f0;
import defpackage.c2x0;
import defpackage.g2x0;
import defpackage.mhf;
import defpackage.pwy0;
import defpackage.tje;
import defpackage.tse;
import defpackage.y3u0;

/* loaded from: classes.dex */
public final class e implements a2f0 {
    public final tse a;
    public final Lifecycle b;
    public final c2x0 c;
    public final mhf d;
    public final ru.yandex.taxi.statebar.a e;
    public final y3u0 f;
    public final g2x0 g;
    public final pwy0 h;

    public e(tse tseVar, Lifecycle lifecycle, c2x0 c2x0Var, mhf mhfVar, ru.yandex.taxi.statebar.a aVar, y3u0 y3u0Var, g2x0 g2x0Var, pwy0 pwy0Var) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = c2x0Var;
        this.d = mhfVar;
        this.e = aVar;
        this.f = y3u0Var;
        this.g = g2x0Var;
        this.h = pwy0Var;
    }

    @Override // defpackage.a2f0
    public final void c() {
        tje.N(this.a, null, null, new SystemBarsInsetsListener$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SystemBarsInsetsListener";
    }
}
