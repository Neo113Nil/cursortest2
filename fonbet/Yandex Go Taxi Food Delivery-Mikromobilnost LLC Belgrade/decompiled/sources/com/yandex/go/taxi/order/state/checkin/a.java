package com.yandex.go.taxi.order.state.checkin;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.taxi.order.state.o;
import com.yandex.go.taxi.order.superapp.orders.h;
import defpackage.ci70;
import defpackage.d980;
import defpackage.dgb;
import defpackage.fh70;
import defpackage.jqr;
import defpackage.kz8;
import defpackage.n0g;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.qyy0;
import defpackage.tje;
import defpackage.tt;
import defpackage.zfb;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.checkin.CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.checkin.d;
import ru.yandex.taxi.order.state.checkin.CheckInStateView;

/* loaded from: classes14.dex */
public final class a extends o {
    public final d980 R;
    public final c S;
    public final ci70 T;
    public final tt U;
    public final ru.yandex.taxi.styling.c V;
    public final ru.yandex.taxi.checkin.a W;
    public final fh70 Z;

    public a(n0g n0gVar, ney neyVar, d980 d980Var, c cVar, ci70 ci70Var, tt ttVar, ru.yandex.taxi.styling.c cVar2, ru.yandex.taxi.checkin.a aVar) {
        super(n0gVar, zfb.class, neyVar);
        this.R = d980Var;
        this.S = cVar;
        this.T = ci70Var;
        this.U = ttVar;
        this.V = cVar2;
        this.W = aVar;
        this.Z = (fh70) n0gVar.c.om.get();
    }

    @Override // com.yandex.go.taxi.order.state.o, defpackage.l780, defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.R.e();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        tje.N(Kg(), null, null, new CheckInStateViewPresenter$onResume$$inlined$safeCollectIn$1(((h) this.Z).d(this.A, OrderScreen.ORDER_DETAILS), null, this), 3);
    }

    public final void Rg(CheckInStateView checkInStateView) {
        Ng(checkInStateView);
        d980 d980Var = this.R;
        d980Var.p = new dgb(0, this);
        boolean z = true;
        d980Var.u = true;
        d980Var.x = true;
        qyy0.c(new kz8(2, d980Var, z, z));
        c cVar = this.S;
        o2y0 o2y0Var = this.A;
        jqr b = cVar.b(o2y0Var);
        d dVar = this.W.a;
        dVar.getClass();
        tje.N(Jg(), null, null, new CheckInStateViewPresenter$attachView$$inlined$safeCollectIn$1(new m0(b, e.X(o2y0Var.a(), new CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1(null, dVar)), new CheckInStateViewPresenter$attachView$2(this, null)), null, checkInStateView), 3);
    }
}
