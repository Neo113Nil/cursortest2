package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import android.content.Context;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.s930;
import defpackage.t930;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.x830;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a H;
    public final c I;
    public final ru.yandex.taxi.masstransit.domain.h J;
    public final x830 K;
    public final t930 L;
    public final p1b M;

    public b(Context context, w030 w030Var, com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a aVar, h hVar, c cVar, ru.yandex.taxi.masstransit.domain.h hVar2, x830 x830Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = aVar;
        this.I = cVar;
        this.J = hVar2;
        this.K = x830Var;
        this.L = new t930(this);
        this.M = new p1b(hVar, new s930(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        tje.N(o(), null, null, new MosmetroOtpRouter$onAttach$1(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
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
