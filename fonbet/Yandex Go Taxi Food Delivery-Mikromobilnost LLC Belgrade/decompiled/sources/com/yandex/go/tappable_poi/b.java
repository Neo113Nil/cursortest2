package com.yandex.go.tappable_poi;

import com.yandex.go.tappable_poi.experiments.c;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import defpackage.aax0;
import defpackage.ah00;
import defpackage.bt00;
import defpackage.eax0;
import defpackage.gax0;
import defpackage.gcc0;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hcc0;
import defpackage.hl00;
import defpackage.il00;
import defpackage.jl40;
import defpackage.p2y0;
import defpackage.tt2;
import defpackage.yzv;
import java.util.List;
import java.util.Optional;

/* loaded from: classes14.dex */
public final class b implements yzv, GeoObjectTapListener {
    public final ah00 a;
    public final gax0 b;
    public final c c;
    public final eax0 d;
    public final h3y e;
    public final com.yandex.go.navigation.screen.c f;
    public final bt00 g;
    public final p2y0 h;
    public final tt2 i;
    public final hbp0 j;
    public final il00 k = new il00();
    public String l;
    public boolean m;
    public String n;
    public volatile aax0 o;

    /* JADX WARN: Multi-variable type inference failed */
    public b(ah00 ah00Var, gax0 gax0Var, c cVar, eax0 eax0Var, h3y h3yVar, com.yandex.go.navigation.screen.c cVar2, bt00 bt00Var, p2y0 p2y0Var, tt2 tt2Var) {
        this.a = ah00Var;
        this.b = gax0Var;
        this.c = cVar;
        this.d = eax0Var;
        this.e = h3yVar;
        this.f = cVar2;
        this.g = bt00Var;
        this.h = p2y0Var;
        this.i = tt2Var;
        this.j = new hbp0(new TappablePoiController$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    public final void a(aax0 aax0Var) {
        this.o = aax0Var;
        this.j.a();
        ((gh00) this.a).d(this);
        ((gh00) this.a).c(this);
        hbp0.e(this.j, null, null, new TappablePoiController$observeScreenToApplyMapStyle$1(this, null), 3);
    }

    @Override // defpackage.zzv
    public final void d(Point point) {
        aax0 aax0Var = this.o;
        if (aax0Var != null) {
            aax0Var.i(ru.yandex.taxi.map.utils.a.E(point, null));
        }
        ((hcc0) ((gcc0) this.e.get())).a();
    }

    @Override // com.yandex.mapkit.layers.GeoObjectTapListener
    public final boolean onObjectTap(GeoObjectTapEvent geoObjectTapEvent) {
        List<Geometry> geometry;
        Geometry geometry2;
        this.k.getClass();
        Optional b = il00.b(geoObjectTapEvent);
        if (jl40.l(this.n, b.isPresent() ? ((hl00) b.get()).a : null)) {
            return false;
        }
        ((hcc0) ((gcc0) this.e.get())).a();
        GeoObject geoObject = geoObjectTapEvent.getGeoObject();
        hbp0.e(this.j, null, null, new TappablePoiController$onObjectTap$1(this, b, (geoObject == null || (geometry = geoObject.getGeometry()) == null || (geometry2 = (Geometry) kotlin.collections.a.R(geometry)) == null) ? null : geometry2.getPoint(), null), 3);
        return false;
    }
}
