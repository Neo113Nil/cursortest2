package com.yandex.go.external_service.auth;

import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.superapp.f;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public final m a;
    public final tse b;
    public final f c;
    public final tt2 d;

    public a(m mVar, tse tseVar, f fVar, tt2 tt2Var) {
        this.a = mVar;
        this.b = tseVar;
        this.c = fVar;
        this.d = tt2Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        this.d.getClass();
        tje.N(this.b, uyj.a, null, new SuperappAuthInfoActivityListener$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SuperappAuthInfoActivityListener";
    }
}
