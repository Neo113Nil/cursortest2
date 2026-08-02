package com.yandex.go.scooters.promotions.domain;

import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import defpackage.bg5;
import defpackage.pwy0;
import defpackage.zno0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class a {
    public final pwy0 a;
    public final bg5 b;
    public final com.yandex.go.scooters.promotions.data.mapper.a c;
    public final zno0 d;
    public final com.yandex.go.scooters.promotions.data.a e;

    public a(pwy0 pwy0Var, bg5 bg5Var, com.yandex.go.scooters.promotions.data.mapper.a aVar, zno0 zno0Var, com.yandex.go.scooters.promotions.data.a aVar2) {
        this.a = pwy0Var;
        this.b = bg5Var;
        this.c = aVar;
        this.d = zno0Var;
        this.e = aVar2;
    }

    public final m0 a(ScootersPromotionsScreen scootersPromotionsScreen) {
        return new m0(e.t(this.b.b), this.a.a(), new ScootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1(this, scootersPromotionsScreen, null));
    }
}
