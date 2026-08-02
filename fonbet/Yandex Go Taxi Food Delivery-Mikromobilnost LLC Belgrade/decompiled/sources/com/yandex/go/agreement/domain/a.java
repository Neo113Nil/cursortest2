package com.yandex.go.agreement.domain;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.agreement.repository.g;
import com.yandex.go.preload.e;
import defpackage.d9;
import defpackage.i3y;
import defpackage.jk0;
import defpackage.oep0;
import defpackage.tse;
import defpackage.vw60;

/* loaded from: classes.dex */
public final class a implements vw60 {
    public final e a;
    public final oep0 b;
    public final Lifecycle c;
    public final tse d;
    public final jk0 e;
    public final g f;
    public final i3y g = kotlin.a.a(new d9(9, this));

    public a(e eVar, oep0 oep0Var, Lifecycle lifecycle, tse tseVar, jk0 jk0Var, g gVar) {
        this.a = eVar;
        this.b = oep0Var;
        this.c = lifecycle;
        this.d = tseVar;
        this.e = jk0Var;
        this.f = gVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        com.yandex.go.coroutines.b.g(this.d, null, null, new AgreementOnActivityCreateListener$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "agreement-on-activity-create";
    }
}
