package com.yandex.go.chargers;

import com.yandex.go.chargers.offer.ChargersOfferStationOpenReason;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import defpackage.a9a;
import defpackage.pca;
import defpackage.s2a;
import defpackage.tje;
import defpackage.tsa;

/* loaded from: classes12.dex */
public final class c implements a9a {
    public final /* synthetic */ e a;
    public final /* synthetic */ s2a b;
    public final /* synthetic */ tsa c;

    public c(e eVar, s2a s2aVar, tsa tsaVar) {
        this.a = eVar;
        this.b = s2aVar;
        this.c = tsaVar;
    }

    @Override // defpackage.a9a
    public final void J(String str) {
        this.a.d0(this.b, new pca(str));
    }

    @Override // defpackage.sy60
    public final void a() {
        tsa tsaVar = this.c;
        e eVar = this.a;
        s2a s2aVar = this.b;
        if (tsaVar != null) {
            eVar.Z(s2aVar, tsaVar, ChargersStationOpenReason.Map);
        } else {
            eVar.V(s2aVar);
        }
    }

    @Override // defpackage.a9a
    public final void m0(tsa tsaVar, ChargersOfferStationOpenReason chargersOfferStationOpenReason) {
        e eVar = this.a;
        tje.N(eVar.o(), null, null, new ChargersRouterImpl$startOfferRouter$1$onOpenStationDetails$1(eVar, this.b, tsaVar, chargersOfferStationOpenReason, null), 3);
    }
}
