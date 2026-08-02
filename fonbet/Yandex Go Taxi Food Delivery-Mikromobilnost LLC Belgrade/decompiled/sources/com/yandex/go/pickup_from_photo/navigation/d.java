package com.yandex.go.pickup_from_photo.navigation;

import android.content.Context;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSource;
import com.yandex.go.pickup_from_photo.domain.j;
import com.yandex.go.pickup_from_photo.domain.s;
import defpackage.ah00;
import defpackage.epb0;
import defpackage.jqr;
import defpackage.mu5;
import defpackage.n5g;
import defpackage.pgd;
import defpackage.thi0;
import defpackage.tnb0;
import defpackage.tpr;
import defpackage.uhi0;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xv10;
import defpackage.yvf0;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class d extends pgd {
    public final Context F;
    public final w030 G;
    public final s H;
    public final xv10 I;
    public final zuj0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final j M;
    public final ah00 N;
    public final i O;
    public final epb0 P;
    public final tnb0 Q;
    public final mu5 R;

    public d(Context context, w030 w030Var, s sVar, xv10 xv10Var, zuj0 zuj0Var, n5g n5gVar, n5g n5gVar2, j jVar, ah00 ah00Var, i iVar, epb0 epb0Var, tnb0 tnb0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = sVar;
        this.I = xv10Var;
        this.J = zuj0Var;
        this.K = n5gVar;
        this.L = n5gVar2;
        this.M = jVar;
        this.N = ah00Var;
        this.O = iVar;
        this.P = epb0Var;
        this.Q = tnb0Var;
        this.R = new mu5(new uhi0(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        tpr k;
        super.G((thi0) obj);
        this.P.e = PhotoPickUpAnalytics$PhotoPickUpSource.FoundModal;
        k = this.O.k(RoutePointType.POINT_A, false);
        e.H(o(), new jqr(k, new RecognitionSuccessScreenRouter$onAttach$1(this, null), 3));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.R;
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
