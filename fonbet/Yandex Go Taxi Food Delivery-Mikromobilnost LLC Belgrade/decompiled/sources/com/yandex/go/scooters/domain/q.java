package com.yandex.go.scooters.domain;

import defpackage.jl40;
import defpackage.mxn0;
import defpackage.nxn0;
import defpackage.oxn0;
import defpackage.pgn;
import defpackage.pvn;
import defpackage.pxn0;
import defpackage.rol0;
import defpackage.rxn0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.yxn0;

/* loaded from: classes13.dex */
public final class q implements pgn {
    public final ru.yandex.taxi.layers.presentation.walkroute.simple.b a;
    public final rxn0 b;

    public q(ru.yandex.taxi.layers.presentation.walkroute.simple.b bVar, rxn0 rxn0Var) {
        this.a = bVar;
        this.b = rxn0Var;
    }

    @Override // defpackage.pgn
    public final tpr a(Object obj) {
        pxn0 pxn0Var = (pxn0) obj;
        if (pxn0Var instanceof yxn0) {
            return new kotlinx.coroutines.flow.k(new rol0(new ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1(null, this, pxn0Var)), new ScootersEboksObjectsActionHandler$listenToMapSelection$2(3, null));
        }
        if (pxn0Var instanceof mxn0) {
            return new kotlinx.coroutines.flow.k(new rol0(new ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$2(null, this, pxn0Var)), new ScootersEboksObjectsActionHandler$listenToMapSelection$2(3, null));
        }
        if (pxn0Var instanceof oxn0) {
            return new rol0(new ScootersEboksObjectsActionHandler$handleWalkRoute$1(this, (oxn0) pxn0Var, null));
        }
        if (jl40.l(pxn0Var, nxn0.a)) {
            return pvn.a;
        }
        w511.b();
        return null;
    }
}
