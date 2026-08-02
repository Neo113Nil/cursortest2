package com.yandex.go.domain.interactor;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.am.m;

/* loaded from: classes.dex */
public final class a implements jy60 {
    public final com.yandex.go.repositories.e a;
    public final m b;
    public final tt2 c;
    public final tse d;
    public final Lifecycle e;
    public final String f = a.class.getSimpleName();

    public a(com.yandex.go.repositories.e eVar, m mVar, tt2 tt2Var, tse tseVar, Lifecycle lifecycle) {
        this.a = eVar;
        this.b = mVar;
        this.c = tt2Var;
        this.d = tseVar;
        this.e = lifecycle;
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.f;
    }

    @Override // defpackage.jy60
    public final void h() {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.d, mdh.b, null, new PassportAvatarUpdatingInteractor$onFirstContentfulPaint$1(this, null), 2);
    }
}
