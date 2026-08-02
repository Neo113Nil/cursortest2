package com.yandex.go.safety.center.instruction;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.zone.model.Zone;
import defpackage.csl0;
import defpackage.d0l0;
import defpackage.g92;
import defpackage.hrl0;
import defpackage.ia5;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.mo21;
import defpackage.ndl0;
import defpackage.ney;
import defpackage.p2y0;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.q3u0;
import defpackage.qu;
import defpackage.tje;
import defpackage.tt2;
import defpackage.vb3;
import defpackage.vrl0;
import defpackage.vxj0;
import defpackage.wrl0;
import defpackage.y50;
import defpackage.zgc0;
import defpackage.zzs;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class h extends ia5 {
    public final SafetyCenterExperiment A;
    public final j B;
    public final ru.yandex.taxi.h C;
    public final po21 D;
    public final y50 E;
    public final tt2 F;
    public final k7x0 G;
    public final pwy0 H;
    public final ney I;
    public final SafetyCenterExperiment.Instruction J;
    public final ndl0 K;
    public final com.yandex.go.safety.center.analytics.a L;
    public mo21 M;
    public TaxiOrder N;
    public boolean O;
    public final p2y0 z;

    public h(p2y0 p2y0Var, SafetyCenterExperiment safetyCenterExperiment, j jVar, ru.yandex.taxi.h hVar, po21 po21Var, y50 y50Var, tt2 tt2Var, k7x0 k7x0Var, pwy0 pwy0Var, ney neyVar, SafetyCenterExperiment.Instruction instruction, ndl0 ndl0Var, hrl0 hrl0Var, q3u0 q3u0Var, com.yandex.go.safety.center.analytics.a aVar) {
        super(vrl0.class, q3u0Var, hrl0Var);
        this.z = p2y0Var;
        this.A = safetyCenterExperiment;
        this.B = jVar;
        this.C = hVar;
        this.D = po21Var;
        this.E = y50Var;
        this.F = tt2Var;
        this.G = k7x0Var;
        this.H = pwy0Var;
        this.I = neyVar;
        this.J = instruction;
        this.K = ndl0Var;
        this.L = aVar;
    }

    @Override // defpackage.ia5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.I.d(this);
    }

    @Override // defpackage.ia5, defpackage.ad5, defpackage.zc5
    /* renamed from: Kg, reason: merged with bridge method [inline-methods] */
    public final void Bg(vrl0 vrl0Var) {
        super.Bg(vrl0Var);
        tje.N(Jg(), null, null, new SafetyCenterInstructionPresenter$tryToShowInstruction$$inlined$safeCollectIn$1(new m0(kotlinx.coroutines.flow.e.T(new g(this.B.o), 1), this.H.a(), new SafetyCenterInstructionPresenter$tryToShowInstruction$2(3, null)), null, this), 3);
        tje.N(Jg(), null, null, new SafetyCenterInstructionPresenter$updateLocation$1(this, null), 3);
        wrl0 wrl0Var = new wrl0(this, 0);
        hrl0 hrl0Var = this.y;
        hrl0Var.c(wrl0Var, false);
        hrl0Var.b(new wrl0(this, 1));
        this.I.b(this, new vb3(12, this));
    }

    public final String Lg(Map map) {
        SafetyCenterConfig d = this.B.d();
        if (d == null || map == null) {
            return null;
        }
        return (String) map.get(d.c);
    }

    public final jqr Mg(int i, boolean z) {
        return new jqr(com.yandex.go.coroutines.b.k(kotlinx.coroutines.flow.e.T(new c(new e(this.C.a()), z), 1), TimeUnit.SECONDS.toMillis(i), new g92(2, Boolean.valueOf(z))), new SafetyCenterInstructionPresenter$observeCallStateChanging$3(z, null), 3);
    }

    public final void Ng() {
        TaxiOrder taxiOrder = this.N;
        if (taxiOrder != null) {
            Preorder W = taxiOrder.W();
            mo21 mo21Var = this.M;
            if (mo21Var != null) {
                zgc0 zgc0Var = PlainAddress.Companion;
                zzs a = mo21Var.a();
                zgc0Var.getClass();
                W.o(new ZoneAddress(zgc0.a(a), (Zone) null));
            } else {
                W.l(new d0l0((ZoneAddress) null, W.G.b, W.G.c));
            }
            ndl0 ndl0Var = this.K;
            ((csl0) ndl0Var.b).r(new vxj0(19, ndl0Var, W));
        }
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        csl0 csl0Var = (csl0) this.K.b;
        if (csl0Var.u()) {
            csl0Var.r(new qu(9));
        }
    }
}
