package com.yandex.go.taxi.auction.domain;

import com.yandex.go.coroutines.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.dqe0;
import defpackage.ge3;
import defpackage.jqr;
import defpackage.pd3;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a {
    public final ge3 a;
    public final dqe0 b;
    public final wiq0 c;
    public final pd3 d;

    public a(ge3 ge3Var, dqe0 dqe0Var, wiq0 wiq0Var, pd3 pd3Var) {
        this.a = ge3Var;
        this.b = dqe0Var;
        this.c = wiq0Var;
        this.d = pd3Var;
    }

    public final tpr a(tpr tprVar) {
        ge3 ge3Var = this.a;
        ge3Var.getClass();
        tpr t = e.t(e.n(new jqr(e.t(tprVar), new AuctionStateRepositoryImpl$auctionUiStateFlow$1(ge3Var, null), 3), ((k) ge3Var.e).j.a(), b.d(ge3Var.i, new AuctionStateRepositoryImpl$auctionUiStateFlow$$inlined$start$1(zy11.a, null)), new AuctionStateRepositoryImpl$auctionUiStateFlow$2(ge3Var, null)));
        ge3Var.b.getClass();
        return e.F(t, uyj.a);
    }
}
