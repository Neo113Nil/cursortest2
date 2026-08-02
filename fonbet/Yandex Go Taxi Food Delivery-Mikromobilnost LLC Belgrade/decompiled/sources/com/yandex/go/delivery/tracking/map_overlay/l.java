package com.yandex.go.delivery.tracking.map_overlay;

import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import defpackage.ad5;
import defpackage.bvf0;
import defpackage.jst;
import defpackage.odi;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.vth;
import defpackage.yth;
import defpackage.yvf0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class l extends ad5 {
    public final yvf0 A;
    public final odi B;
    public final r0 C;
    public final r0 D;
    public final LinkedHashMap E;
    public final tpr F;
    public final ru.yandex.taxi.logistics.sdk.management.f x;
    public final yvf0 y;
    public final tt2 z;

    public l(ru.yandex.taxi.logistics.sdk.management.f fVar, yvf0 yvf0Var, tt2 tt2Var, yvf0 yvf0Var2, odi odiVar) {
        super(vth.class);
        this.x = fVar;
        this.y = yvf0Var;
        this.z = tt2Var;
        this.A = yvf0Var2;
        this.B = odiVar;
        r0 c = bvf0.c(Boolean.FALSE);
        this.C = c;
        r0 c2 = bvf0.c(kotlin.collections.b.f());
        this.D = c2;
        this.E = new LinkedHashMap();
        this.F = kotlinx.coroutines.flow.e.t(new m0(c, c2, new DeliveriesMapPresenter$modeFlow$1(3, null)));
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        LinkedHashMap linkedHashMap = this.E;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((q) it.next()).a();
        }
        linkedHashMap.clear();
        odi odiVar = this.B;
        bvf0.j(odiVar.c, null);
        yth ythVar = odiVar.a;
        ythVar.getClass();
        ythVar.a.c(SuperAppRecenterPointRepository$Type.LOGISTICS, EmptyList.a);
        jst.e.getClass();
    }
}
