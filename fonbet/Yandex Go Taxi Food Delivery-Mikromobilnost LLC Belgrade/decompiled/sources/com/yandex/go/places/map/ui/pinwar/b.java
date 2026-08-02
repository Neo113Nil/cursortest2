package com.yandex.go.places.map.ui.pinwar;

import android.content.Context;
import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.map.domain.entities.PinLayer;
import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.d30;
import defpackage.e2c0;
import defpackage.e3n;
import defpackage.fdc0;
import defpackage.gdc0;
import defpackage.gh00;
import defpackage.go10;
import defpackage.go80;
import defpackage.hdc0;
import defpackage.ike;
import defpackage.in00;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.mth;
import defpackage.n1c0;
import defpackage.o430;
import defpackage.odc0;
import defpackage.ohh;
import defpackage.pwy0;
import defpackage.qdc0;
import defpackage.s1c0;
import defpackage.tbc0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tzb0;
import defpackage.u050;
import defpackage.x43;
import defpackage.yac0;
import defpackage.z2c0;
import defpackage.z65;
import java.util.Collections;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.yandexmaps.multiplatform.pin.war.c;

/* loaded from: classes13.dex */
public final class b extends ad5 {
    public final h A;
    public final go80 B;
    public final a C;
    public final gdc0 D;
    public final pwy0 E;
    public final ohh F;
    public final d30 G;
    public final qdc0 H;
    public final go10 I;
    public final u050 J;
    public final f K;
    public final yac0 L;
    public final tbc0 M;
    public final e2c0 N;
    public in00 O;
    public final Context x;
    public final ah00 y;
    public final odc0 z;

    public b(Context context, ah00 ah00Var, odc0 odc0Var, h hVar, go80 go80Var, a aVar, gdc0 gdc0Var, pwy0 pwy0Var, ohh ohhVar, d30 d30Var, qdc0 qdc0Var, go10 go10Var, u050 u050Var, f fVar, yac0 yac0Var, tbc0 tbc0Var, tse tseVar) {
        super(z2c0.class);
        this.x = context;
        this.y = ah00Var;
        this.z = odc0Var;
        this.A = hVar;
        this.B = go80Var;
        this.C = aVar;
        this.D = gdc0Var;
        this.E = pwy0Var;
        this.F = ohhVar;
        this.G = d30Var;
        this.H = qdc0Var;
        this.I = go10Var;
        this.J = u050Var;
        this.K = fVar;
        this.L = yac0Var;
        this.M = tbc0Var;
        this.N = new e2c0();
        tje.N(tseVar, null, null, new PinsMapPresenterV2$special$$inlined$safeCollectIn$1(e.t(e.p(new mth(go80Var.d, 6), 400L)), null, this), 3);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((z2c0) Dg()).m("", "");
        super.Cg();
        this.B.a();
        this.A.b();
        e2c0 e2c0Var = this.N;
        c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.o();
        }
        e2c0Var.a = null;
        tzb0 tzb0Var = e2c0Var.b;
        tzb0Var.a.clear();
        tzb0Var.b.clear();
        this.O = null;
        a aVar = this.C;
        aVar.c.b();
        ConflictResolutionMode conflictResolutionMode = aVar.d;
        if (conflictResolutionMode != null) {
            aVar.c(conflictResolutionMode);
        }
        aVar.d = null;
        PinLayer pinLayer = PinLayer.MAIN;
        d30 d30Var = this.G;
        x43 x43Var = d30Var.a;
        x43Var.remove(pinLayer);
        d30Var.b.l(x43Var.h());
    }

    public final void Kg(z65 z65Var) {
        MapWindow mapWindow;
        Bg(z65Var);
        PinLayer pinLayer = PinLayer.MAIN;
        d30 d30Var = this.G;
        x43 x43Var = d30Var.a;
        x43Var.addLast(pinLayer);
        d30Var.b.l(x43Var.h());
        this.C.b();
        e2c0 e2c0Var = this.N;
        c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.o();
        }
        e2c0Var.a = null;
        tzb0 tzb0Var = e2c0Var.b;
        tzb0Var.a.clear();
        tzb0Var.b.clear();
        this.O = null;
        if (e2c0Var.a == null) {
            TaxiMapView h = ((gh00) this.y).h();
            if (h == null || (mapWindow = h.getMapWindow()) == null) {
                return;
            }
            Map map = mapWindow.getMap();
            Context context = this.x;
            float f = context.getResources().getDisplayMetrics().density;
            float o = this.D.o();
            odc0 odc0Var = this.z;
            fdc0 fdc0Var = new fdc0(f, o, odc0Var);
            float f2 = context.getResources().getDisplayMetrics().density;
            hdc0 hdc0Var = odc0Var.i;
            this.H.getClass();
            n1c0 a = qdc0.a(hdc0Var);
            s1c0 b = qdc0.b(odc0Var.j);
            ru.yandex.yandexmaps.multiplatform.pin.war.callback.a aVar = new ru.yandex.yandexmaps.multiplatform.pin.war.callback.a(new PinsMapPresenterV2$makePinWarInvalidationCallback$1(this, null));
            o430 o430Var = e3n.b;
            c a2 = ohh.a(this.F, map, mapWindow, this.D, this.I, fdc0Var, f2, new ru.yandex.yandexmaps.multiplatform.pin.war.callback.b(kp50.U(1, DurationUnit.SECONDS), aVar), a, b, 64);
            a2.x.i.add(new PinsMapPresenterV2$attachPins$1$1(1, this, b.class, "pinTapListener", "pinTapListener(Lru/yandex/yandexmaps/multiplatform/pin/war/PinId;)Z", 0));
            e2c0Var.a = a2;
        }
        e2c0Var.a((ike) Jg(), this.E.a());
        e2c0.d((ike) Jg(), this.A.i, new PinsMapPresenterV2$attachPins$2(1, this, b.class, "renderPins", "renderPins(Lcom/yandex/go/places/map/domain/entities/MapObjectsUpdateInfo;)V", 0));
        tje.N(Jg(), null, null, new PinsMapPresenterV2$attachPins$3(this, null), 3);
    }

    public final void Lg(String str) {
        in00 in00Var = this.O;
        if (in00Var == null || jl40.l(in00Var.getId(), str)) {
            return;
        }
        e2c0 e2c0Var = this.N;
        c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.n(Collections.singletonList(e2c0Var.b.a(in00Var)));
        }
        this.O = null;
    }
}
