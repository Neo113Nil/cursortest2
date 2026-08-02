package com.yandex.go.routestops.v2.router;

import android.content.Context;
import com.yandex.go.routestops.v2.interactor.c;
import com.yandex.go.taxi.summary.routestops.e;
import defpackage.aye0;
import defpackage.dit0;
import defpackage.i130;
import defpackage.m950;
import defpackage.mu5;
import defpackage.ohk0;
import defpackage.pgd;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.wvb1;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class b extends pgd {
    public static final Object R = new Object();
    public final Context F;
    public final wvb1 G;
    public final ru.yandex.taxi.badge.b H;
    public final e I;
    public final c J;
    public final com.yandex.go.routestops.v2.interactor.b K;
    public final i130 L;
    public final dit0 M;
    public final com.yandex.go.routestops.v2.interactor.a N;
    public final aye0 O;
    public m950 P;
    public final mu5 Q;

    public b(Context context, wvb1 wvb1Var, ru.yandex.taxi.badge.b bVar, e eVar, c cVar, com.yandex.go.routestops.v2.interactor.b bVar2, i130 i130Var, dit0 dit0Var, com.yandex.go.routestops.v2.interactor.a aVar) {
        super(0);
        this.F = context;
        this.G = wvb1Var;
        this.H = bVar;
        this.I = eVar;
        this.J = cVar;
        this.K = bVar2;
        this.L = i130Var;
        this.M = dit0Var;
        this.N = aVar;
        this.O = new aye0(22, this);
        this.Q = new mu5(new ohk0(17, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        this.H.a(R);
        tje.N(o(), null, null, new RouteStopsV2Router$onAttach$1(this, null), 3);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((zy11) obj);
        this.H.c(R);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.Q;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final String R() {
        return "RouteStopsV2Router";
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.L.a();
    }
}
