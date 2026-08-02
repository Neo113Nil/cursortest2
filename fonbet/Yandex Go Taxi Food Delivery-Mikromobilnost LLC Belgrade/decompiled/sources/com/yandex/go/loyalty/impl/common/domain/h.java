package com.yandex.go.loyalty.impl.common.domain;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import com.yandex.go.zone.repository.o;
import defpackage.acz;
import defpackage.b2k;
import defpackage.gci0;
import defpackage.mth;
import defpackage.n20;
import defpackage.q2u0;
import defpackage.tse;
import defpackage.uzs;
import defpackage.vng;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zuz;
import defpackage.zzs;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class h {
    public final n20 a;
    public final com.yandex.go.route.interactor.b b;
    public final com.yandex.go.navigation.screen.c c;
    public final gci0 d;

    public h(acz aczVar, tse tseVar, o oVar, n20 n20Var, com.yandex.go.route.interactor.b bVar, com.yandex.go.navigation.screen.c cVar) {
        this.a = n20Var;
        this.b = bVar;
        this.c = cVar;
        b2k l = vng.l(new m0(aczVar.b, kotlinx.coroutines.flow.e.t(new mth(new m0(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new e(cVar.c(), this)), new LoyaltyGeoStateRepository$special$$inlined$flatMapLatest$1(this, null)), 700L), new g(oVar.c()), new LoyaltyGeoStateRepository$addressFlow$2(this, null)), 6)), new LoyaltyGeoStateRepository$geoLocationStateFlow$1(3, this, h.class, "toGeoState", "toGeoState(Landroid/location/Location;Lcom/yandex/go/loyalty/impl/common/domain/LoyaltyGeoStateRepository$Address;)Lcom/yandex/go/loyalty/impl/selector/data/model/GeoState;", 4)), LoyaltyGeoStateRepository$geoLocationStateFlow$2.b, vng.c);
        xsr0.a.getClass();
        q2u0 q2u0Var = wsr0.b;
        Location a = aczVar.a();
        Address h = bVar.c().h();
        this.d = kotlinx.coroutines.flow.e.R(l, tseVar, q2u0Var, b(a, h != null ? new zuz(h.B(), h.getZoneName()) : null));
    }

    public static GeoState b(Location location, zuz zuzVar) {
        zzs zzsVar;
        if (location != null) {
            zzs.Companion.getClass();
            zzsVar = uzs.b(location);
        } else {
            zzsVar = null;
        }
        return new GeoState(location != null ? Float.valueOf(location.getAccuracy()) : null, zuzVar != null ? zuzVar.b : null, zzsVar);
    }

    public final Object a(ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.flow.e.x(this.d, new LoyaltyGeoStateRepository$awaitActualGeoState$2(), continuationImpl);
    }
}
