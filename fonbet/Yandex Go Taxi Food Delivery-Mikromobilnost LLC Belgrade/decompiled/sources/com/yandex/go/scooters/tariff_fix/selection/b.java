package com.yandex.go.scooters.tariff_fix.selection;

import com.yandex.go.scooters.domain.d;
import com.yandex.go.scooters.domain.e;
import com.yandex.go.scooters.domain.f0;
import com.yandex.go.scooters.domain.model.ScootersBookingFailedException;
import com.yandex.go.scooters.domain.w;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.b5p0;
import defpackage.cyx;
import defpackage.fcj0;
import defpackage.fon0;
import defpackage.j2n0;
import defpackage.k4p0;
import defpackage.n2n0;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.q1b1;
import defpackage.qgn0;
import defpackage.qwc;
import defpackage.r7p0;
import defpackage.t4p0;
import defpackage.tje;
import defpackage.vbn0;
import defpackage.wnt;
import defpackage.zgz;
import defpackage.zzs;

/* loaded from: classes13.dex */
public final class b extends ad5 {
    public final atd0 A;
    public final po21 B;
    public final d C;
    public final cyx D;
    public final w E;
    public final f0 F;
    public final e G;
    public final fon0 H;
    public final fcj0 I;
    public final qgn0 J;
    public final vbn0 K;
    public final r7p0 L;
    public final zzs M;
    public pzt0 N;
    public final wnt x;
    public final ah00 y;
    public final qwc z;

    public b(wnt wntVar, ah00 ah00Var, qwc qwcVar, atd0 atd0Var, po21 po21Var, d dVar, cyx cyxVar, w wVar, f0 f0Var, e eVar, fon0 fon0Var, fcj0 fcj0Var, qgn0 qgn0Var) {
        super(t4p0.class);
        this.x = wntVar;
        this.y = ah00Var;
        this.z = qwcVar;
        this.A = atd0Var;
        this.B = po21Var;
        this.C = dVar;
        this.D = cyxVar;
        this.E = wVar;
        this.F = f0Var;
        this.G = eVar;
        this.H = fon0Var;
        this.I = fcj0Var;
        this.J = qgn0Var;
        vbn0 vbn0Var = (vbn0) fcj0Var.e;
        this.K = vbn0Var;
        this.L = q1b1.d(vbn0Var).a;
        this.M = q1b1.d(vbn0Var).g;
    }

    public static final void Kg(b bVar, n2n0 n2n0Var, zzs zzsVar) {
        if (n2n0Var instanceof j2n0) {
            ((b5p0) bVar.J.b).r(new k4p0(((j2n0) n2n0Var).a, zzsVar, 1));
        } else {
            bVar.getClass();
            ScootersBookingFailedException scootersBookingFailedException = new ScootersBookingFailedException(null);
            zgz.a("Wrong book flow on fix tariff destination selection", scootersBookingFailedException);
            throw scootersBookingFailedException;
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((t4p0) Dg()).h0();
        super.Cg();
    }

    public final void Lg(zzs zzsVar, ScootersTariffFixSelectionPresenter$AddressType scootersTariffFixSelectionPresenter$AddressType) {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = tje.N(Jg(), null, null, new ScootersTariffFixSelectionPresenter$loadAddress$1(this, zzsVar, scootersTariffFixSelectionPresenter$AddressType, null), 3);
    }
}
