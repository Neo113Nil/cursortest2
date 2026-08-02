package com.yandex.go.masstransit.sdk.ble.impl.fullscreen;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.masstransit.sdk.ble.impl.modal.e;
import defpackage.b36;
import defpackage.d010;
import defpackage.ft20;
import defpackage.i3y;
import defpackage.m950;
import defpackage.mu5;
import defpackage.nk30;
import defpackage.pgd;
import defpackage.pk30;
import defpackage.pzt0;
import defpackage.st0;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xrr;

/* loaded from: classes12.dex */
public final class d extends pgd implements m950 {
    public final Context F;
    public final w030 G;
    public final st0 H;
    public final Lifecycle I;
    public final xrr J;
    public final b36 K;
    public final i3y L;
    public final i3y M;
    public final pk30 N;
    public final mu5 O;

    public d(Context context, w030 w030Var, st0 st0Var, Lifecycle lifecycle, xrr xrrVar, b36 b36Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = st0Var;
        this.I = lifecycle;
        this.J = xrrVar;
        this.K = b36Var;
        this.L = kotlin.a.a(new d010(this, 1));
        this.M = kotlin.a.a(new d010(this, 2));
        this.N = new pk30(this, 0);
        this.O = new mu5(new ft20(15, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        nk30 nk30Var = (nk30) obj;
        super.G(nk30Var);
        this.J.b = false;
        b36 b36Var = this.K;
        b36Var.b.clear();
        tje.N(o(), null, null, new BleVehiclesPermissionAnalyticsObserver$bind$1(((e) this.L.getValue()).c, b36Var, null), 3);
        tje.N(o(), null, null, new MtGeoPaymentFullscreenRouterImpl$onAttach$1(this, nk30Var, null), 3);
        ((com.yandex.go.masstransit.sdk.ble.impl.modal.d) this.M.getValue()).a(nk30Var.a, o());
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((nk30) obj);
        com.yandex.go.masstransit.sdk.ble.impl.repository.b bVar = ((com.yandex.go.masstransit.sdk.ble.impl.domain.a) this.H.c).a;
        pzt0 pzt0Var = bVar.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.n = null;
        bVar.c.a();
        bVar.i.clear();
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.O;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
