package com.yandex.go.chargers.push;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.chargers.data.g;
import com.yandex.go.chargers.push.domain.c;
import defpackage.a3a;
import defpackage.em9;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.z2a;
import ru.yandex.taxi.jobs.b;

/* loaded from: classes.dex */
public final class a implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final b c;
    public final em9 d;
    public final g e;
    public final a3a f;
    public final c g;
    public final z2a h;

    public a(Lifecycle lifecycle, tse tseVar, b bVar, em9 em9Var, g gVar, a3a a3aVar, c cVar, z2a z2aVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = bVar;
        this.d = em9Var;
        this.e = gVar;
        this.f = a3aVar;
        this.g = cVar;
        this.h = z2aVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ChargersLowBatteryPushLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new ChargersLowBatteryPushLifecycleListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
