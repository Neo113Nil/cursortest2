package com.yandex.go.zone.interactors;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.zone.repository.o;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;

/* loaded from: classes8.dex */
public final class d implements jy60 {
    public final o a;
    public final ru.yandex.taxi.launch.c b;
    public final tt2 c;
    public final tse d;
    public final Lifecycle e;

    public d(o oVar, ru.yandex.taxi.launch.c cVar, tt2 tt2Var, tse tseVar, Lifecycle lifecycle) {
        this.a = oVar;
        this.b = cVar;
        this.c = tt2Var;
        this.d = tseVar;
        this.e = lifecycle;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LaunchIdChangedZoneLifecycleInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.d, null, null, new LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
