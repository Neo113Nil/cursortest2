package com.yandex.go.places.impl.ui.main.map.filters.overlay;

import android.content.Context;
import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.places.map.domain.entities.PinLayer;
import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.d30;
import defpackage.e2c0;
import defpackage.fdc0;
import defpackage.gdc0;
import defpackage.gh00;
import defpackage.go10;
import defpackage.hdc0;
import defpackage.ike;
import defpackage.l050;
import defpackage.odc0;
import defpackage.ohh;
import defpackage.pwy0;
import defpackage.qdc0;
import defpackage.tje;
import defpackage.tzb0;
import defpackage.u050;
import defpackage.x43;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.yandexmaps.multiplatform.pin.war.c;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public final f A;
    public final com.yandex.go.places.map.ui.pinwar.a B;
    public final gdc0 C;
    public final ah00 D;
    public final pwy0 E;
    public final u050 F;
    public final ohh G;
    public final d30 H;
    public final qdc0 I;
    public final go10 J;
    public final e2c0 K;
    public final Context x;
    public final odc0 y;
    public final i z;

    public a(Context context, odc0 odc0Var, i iVar, f fVar, com.yandex.go.places.map.ui.pinwar.a aVar, gdc0 gdc0Var, ah00 ah00Var, pwy0 pwy0Var, u050 u050Var, ohh ohhVar, d30 d30Var, qdc0 qdc0Var, go10 go10Var) {
        super(l050.class);
        this.x = context;
        this.y = odc0Var;
        this.z = iVar;
        this.A = fVar;
        this.B = aVar;
        this.C = gdc0Var;
        this.D = ah00Var;
        this.E = pwy0Var;
        this.F = u050Var;
        this.G = ohhVar;
        this.H = d30Var;
        this.I = qdc0Var;
        this.J = go10Var;
        this.K = new e2c0();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        MapWindow mapWindow;
        super.Bg(l050Var);
        PinLayer pinLayer = PinLayer.SOCIAL;
        d30 d30Var = this.H;
        x43 x43Var = d30Var.a;
        x43Var.addLast(pinLayer);
        d30Var.b.l(x43Var.h());
        this.B.b();
        e2c0 e2c0Var = this.K;
        c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.o();
        }
        e2c0Var.a = null;
        tzb0 tzb0Var = e2c0Var.b;
        tzb0Var.a.clear();
        tzb0Var.b.clear();
        if (e2c0Var.a == null) {
            TaxiMapView h = ((gh00) this.D).h();
            if (h == null || (mapWindow = h.getMapWindow()) == null) {
                return;
            }
            Map map = mapWindow.getMap();
            Context context = this.x;
            float f = context.getResources().getDisplayMetrics().density;
            float o = this.C.o();
            odc0 odc0Var = this.y;
            fdc0 fdc0Var = new fdc0(f, o, odc0Var);
            float f2 = context.getResources().getDisplayMetrics().density;
            hdc0 hdc0Var = odc0Var.i;
            this.I.getClass();
            c a = ohh.a(this.G, map, mapWindow, this.C, this.J, fdc0Var, f2, null, qdc0.a(hdc0Var), qdc0.b(odc0Var.j), 192);
            a.x.i.add(new PlacesCategoryFiltersMapPresenter$attachPins$1$1(1, this, a.class, "pinTapListener", "pinTapListener(Lru/yandex/yandexmaps/multiplatform/pin/war/PinId;)Z", 0));
            e2c0Var.a = a;
        }
        e2c0Var.a((ike) Jg(), this.E.a());
        e2c0.d((ike) Jg(), this.z.i, new PlacesCategoryFiltersMapPresenter$attachPins$2(1, this, a.class, "renderPins", "renderPins(Lcom/yandex/go/places/map/domain/entities/SocialPinsUpdateInfo;)V", 0));
        tje.N(Jg(), null, null, new PlacesCategoryFiltersMapPresenter$attachPins$3(this, null), 3);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.z.k();
        e2c0 e2c0Var = this.K;
        c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.o();
        }
        e2c0Var.a = null;
        tzb0 tzb0Var = e2c0Var.b;
        tzb0Var.a.clear();
        tzb0Var.b.clear();
        com.yandex.go.places.map.ui.pinwar.a aVar = this.B;
        aVar.c.b();
        ConflictResolutionMode conflictResolutionMode = aVar.d;
        if (conflictResolutionMode != null) {
            aVar.c(conflictResolutionMode);
        }
        aVar.d = null;
        PinLayer pinLayer = PinLayer.SOCIAL;
        d30 d30Var = this.H;
        x43 x43Var = d30Var.a;
        x43Var.remove(pinLayer);
        d30Var.b.l(x43Var.h());
    }
}
