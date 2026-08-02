package com.yandex.go.navigator.gas_stations;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.search.Response;
import com.yandex.mapkit.search.Session;
import com.yandex.runtime.Error;
import defpackage.pws;
import defpackage.tje;
import defpackage.u6v;

/* loaded from: classes12.dex */
public final class a implements Session.SearchListener {
    public final GasStationSearchType a;
    public final /* synthetic */ b b;

    public a(b bVar, GasStationSearchType gasStationSearchType) {
        this.b = bVar;
        this.a = gasStationSearchType;
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchError(Error error) {
        this.b.h.a(new pws(new u6v(this.a)));
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchResponse(Response response) {
        b bVar = this.b;
        tje.N(bVar.o.c(), null, null, new GasStationsSearchManager$SearchListenerImpl$onSearchResponse$1(bVar, response, this, null), 3);
    }
}
