package com.yandex.go.places.impl.ui.main.map.overlay;

import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import defpackage.gh00;
import defpackage.kn00;
import defpackage.oac0;
import defpackage.tje;
import defpackage.uac0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class h implements vpr {
    public final /* synthetic */ uac0 a;

    public h(uac0 uac0Var) {
        this.a = uac0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Pair pair = (Pair) obj;
        kn00 kn00Var = (kn00) pair.getFirst();
        GeoObjectSelectionMetadata geoObjectSelectionMetadata = (GeoObjectSelectionMetadata) pair.getSecond();
        uac0 uac0Var = this.a;
        if (geoObjectSelectionMetadata != null) {
            tje.N(uac0Var.Jg(), null, null, new PlacesMainMapPresenter$deselectMyPlacesPin$1(uac0Var, null), 3);
            ((oac0) uac0Var.Dg()).selectGeoObject(geoObjectSelectionMetadata);
            uac0Var.x.b(kn00Var.getGeometry(), ((gh00) uac0Var.C).j());
        } else {
            uac0Var.Kg();
        }
        return zy11.a;
    }
}
