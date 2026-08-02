package com.yandex.go.pickup_from_photo.navigation;

import android.content.Context;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSource;
import com.yandex.go.pickup_from_photo.domain.j;
import defpackage.ah00;
import defpackage.an8;
import defpackage.enb0;
import defpackage.epb0;
import defpackage.jqr;
import defpackage.mu5;
import defpackage.n5g;
import defpackage.pgd;
import defpackage.tnb0;
import defpackage.tpr;
import defpackage.umb0;
import defpackage.w030;
import defpackage.wfd;
import defpackage.yvf0;
import defpackage.zuj0;
import defpackage.zxb;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final zxb H;
    public final an8 I;
    public final zuj0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final j M;
    public final ah00 N;
    public final i O;
    public final epb0 P;
    public final umb0 Q;
    public final tnb0 R;
    public final mu5 S;

    public b(Context context, w030 w030Var, zxb zxbVar, an8 an8Var, zuj0 zuj0Var, n5g n5gVar, n5g n5gVar2, j jVar, ah00 ah00Var, i iVar, epb0 epb0Var, umb0 umb0Var, tnb0 tnb0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = zxbVar;
        this.I = an8Var;
        this.J = zuj0Var;
        this.K = n5gVar;
        this.L = n5gVar2;
        this.M = jVar;
        this.N = ah00Var;
        this.O = iVar;
        this.P = epb0Var;
        this.Q = umb0Var;
        this.R = tnb0Var;
        this.S = new mu5(new enb0(this, 0));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tpr k;
        this.P.e = PhotoPickUpAnalytics$PhotoPickUpSource.Clarify;
        k = this.O.k(RoutePointType.POINT_A, false);
        e.H(o(), new jqr(k, new PickupFromPhotoClarifyPointRouter$onLaunch$1(this, null), 3));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.S;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return false;
    }
}
