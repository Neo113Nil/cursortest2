package com.yandex.go.navigator.map_interactions;

import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import defpackage.ah00;
import defpackage.d240;
import defpackage.ffx;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.tt2;
import defpackage.wa50;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class c implements GeoObjectTapListener, wa50 {
    public final ah00 a;
    public final com.yandex.go.navigator.map_interactions.experiment.a b;
    public final tt2 c;
    public final hbp0 d = new hbp0(new d240(13, this), c.class.getSimpleName(), null, 4);
    public final n0 e;
    public final n0 f;

    public c(ah00 ah00Var, com.yandex.go.navigator.map_interactions.experiment.a aVar, tt2 tt2Var) {
        this.a = ah00Var;
        this.b = aVar;
        this.c = tt2Var;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.e = b;
        this.f = b;
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void a(NavigationLayer navigationLayer) {
        this.d.a();
        ((gh00) this.a).c(this);
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void b(NavigationLayer navigationLayer) {
        this.d.b();
        ((gh00) this.a).s(this);
    }

    @Override // com.yandex.mapkit.layers.GeoObjectTapListener
    public final boolean onObjectTap(GeoObjectTapEvent geoObjectTapEvent) {
        hbp0.e(this.d, null, null, new NavigatorGeoObjectsTapListener$onObjectTap$1(this, geoObjectTapEvent.getGeoObject(), null), 3);
        return true;
    }
}
