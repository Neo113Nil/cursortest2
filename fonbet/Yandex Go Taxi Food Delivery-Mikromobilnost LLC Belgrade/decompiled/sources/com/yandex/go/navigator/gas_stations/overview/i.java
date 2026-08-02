package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.mapkit.GeoObject;
import defpackage.kl80;
import defpackage.qoh;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class i extends kl80 {
    public final String b;
    public final qoh c;
    public final GeoObject w;
    public final /* synthetic */ j x;

    public i(j jVar, String str, qoh qohVar, GeoObject geoObject) {
        this.x = jVar;
        this.b = str;
        this.c = qohVar;
        this.w = geoObject;
    }

    @Override // defpackage.sy60
    public final void a() {
        com.yandex.go.navigator.gas_stations.repositories.c cVar = this.x.O;
        cVar.g.l(this.w);
        this.c.a(null);
    }

    @Override // defpackage.kl80
    public final void n1(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
        j jVar = this.x;
        tje.N(jVar.o(), null, null, new GasStationsOverviewRouter$OrganisationCardExitListener$openNavigator$1(this, jVar, openNavigatorActionSubtype, null), 3);
    }
}
