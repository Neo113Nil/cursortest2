package com.yandex.go.delivery.rental_duration_selector;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ad5;
import defpackage.amh;
import defpackage.bzi0;
import defpackage.gmi;
import defpackage.i3y;
import defpackage.jmi;
import defpackage.kmi;
import defpackage.n3h;
import defpackage.uze0;
import defpackage.vni;
import defpackage.wiq0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class e extends ad5 implements vni {
    public final gmi A;
    public final i3y B;
    public final b C;
    public final d D;
    public final kmi x;
    public final bzi0 y;
    public final n3h z;

    public e(kmi kmiVar, bzi0 bzi0Var, n3h n3hVar, gmi gmiVar, wiq0 wiq0Var, uze0 uze0Var) {
        super(jmi.class);
        this.x = kmiVar;
        this.y = bzi0Var;
        this.z = n3hVar;
        this.A = gmiVar;
        this.B = kotlin.a.a(new amh(14, this));
        k kVar = (k) wiq0Var;
        this.C = new b(new m0(kVar.j.b(), ((k) uze0Var).j.a(), new DeliveryRentalDurationPresenter$timeDetailsFlow$1(3, null)));
        this.D = new d(kVar.j.b(), this);
    }
}
