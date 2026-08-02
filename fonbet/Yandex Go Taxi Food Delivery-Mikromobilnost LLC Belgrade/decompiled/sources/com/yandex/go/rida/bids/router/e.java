package com.yandex.go.rida.bids.router;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.rida.bids.interactor.j;
import com.yandex.go.rida.bids.interactor.m;
import com.yandex.go.rida.bids.interactor.t;
import defpackage.br5;
import defpackage.cey;
import defpackage.i130;
import defpackage.j24;
import defpackage.lyh;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.tje;
import defpackage.vpr0;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xr5;
import defpackage.yq5;
import defpackage.zuj0;
import ru.yandex.taxi.order.l;

/* loaded from: classes13.dex */
public final class e extends pgd {
    public final Context F;
    public final zuj0 G;
    public final t H;
    public final m I;
    public final j J;
    public final xr5 K;
    public final l L;
    public final lyh M;
    public final i130 N;
    public final com.yandex.go.rida.bids.interactor.f O;
    public final vpr0 P;
    public final br5 Q;
    public final d R;
    public final mu5 S;

    public e(Context context, zuj0 zuj0Var, t tVar, m mVar, j jVar, xr5 xr5Var, l lVar, lyh lyhVar, i130 i130Var, com.yandex.go.rida.bids.interactor.f fVar, vpr0 vpr0Var, br5 br5Var) {
        super(0);
        this.F = context;
        this.G = zuj0Var;
        this.H = tVar;
        this.I = mVar;
        this.J = jVar;
        this.K = xr5Var;
        this.L = lVar;
        this.M = lyhVar;
        this.N = i130Var;
        this.O = fVar;
        this.P = vpr0Var;
        this.Q = br5Var;
        this.R = new d(this);
        this.S = new mu5(new j24(27, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((yq5) obj);
        l lVar = this.L;
        lVar.e = true;
        lVar.a();
        tje.N(o(), null, null, new BidsModalRouter$onAttach$1(this, null), 3);
        cey.c(getLifecycle(), Lifecycle.State.STARTED, new Runnable() { // from class: com.yandex.go.rida.bids.router.a
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                tje.N(eVar.o(), null, null, new BidsModalRouter$onAttach$2$1(eVar, null), 3);
            }
        });
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((yq5) obj);
        l lVar = this.L;
        lVar.e = false;
        lVar.a();
        t tVar = this.H;
        tVar.c.a0(tVar.e);
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        this.P.a(this.Q);
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.P.b(this.Q);
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
        return this.N.a();
    }
}
