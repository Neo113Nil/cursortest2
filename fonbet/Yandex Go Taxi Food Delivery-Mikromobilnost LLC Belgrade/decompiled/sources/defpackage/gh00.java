package defpackage;

import android.graphics.Rect;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.Sublayer;
import com.yandex.mapkit.map.SublayerFeatureFilter;
import com.yandex.mapkit.map.SublayerFeatureFilterType;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.mapkit.map.SublayerManager;
import com.yandex.mapkit.map.VisibleRegion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Function;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes9.dex */
public final class gh00 implements ah00 {
    public static final /* synthetic */ kgx[] j = {new MutablePropertyReference1Impl("mapView", 0, "getMapView()Lru/yandex/taxi/map_common/map/TaxiMapView;", gh00.class)};
    public final rq7 a;
    public Map b;
    public boolean c;
    public final au50 d;
    public final es00 e;
    public final t300 f;
    public final ut7 g;
    public final ArrayList h;
    public final xm00 i;

    public gh00(int i) {
        this.a = new rq7();
        this.d = new au50(20);
        es00 es00Var = new es00();
        this.e = es00Var;
        this.f = new t300(es00Var);
        this.g = new ut7(es00Var);
        this.h = new ArrayList();
        this.i = new xm00();
    }

    public final void A(BoundingBox boundingBox, Map.CameraCallback cameraCallback) {
        this.g.g(boundingBox, cameraCallback, 400.0f, null);
    }

    public final void B(BoundingBox boundingBox, Map.CameraCallback cameraCallback, float f, Function function) {
        this.g.g(boundingBox, cameraCallback, f, function);
    }

    public final void C(Point point) {
        this.g.j(point, 200.0f, null);
    }

    public final void D(Point point, float f, float f2, Map.CameraCallback cameraCallback) {
        this.g.i(point, f, f2, cameraCallback);
    }

    public final void E(Point point, float f, Map.CameraCallback cameraCallback) {
        this.g.j(point, f, cameraCallback);
    }

    public final void F(BoundingBox boundingBox) {
        this.g.h(boundingBox, null, null, null);
    }

    public final void G(zzs zzsVar) {
        q(new eh00(this, zzsVar, 1));
    }

    public final void H(CameraPosition cameraPosition) {
        q(new vmz(5, this, cameraPosition));
    }

    public final void I(boolean z) {
        Map map = this.b;
        if (map != null) {
            map.setRotateGesturesEnabled(z);
        }
    }

    public final void J(float f) {
        this.g.e(f, 0.0f);
    }

    public final void K(float f) {
        kgx[] kgxVarArr = ut7.d;
        this.g.e(f, 200.0f);
    }

    public final void L(zzs zzsVar) {
        q(new eh00(this, zzsVar, 0));
    }

    public final void c(GeoObjectTapListener geoObjectTapListener) {
        ((CopyOnWriteArraySet) this.f.k).add(geoObjectTapListener);
    }

    public final void d(zzv zzvVar) {
        ((CopyOnWriteArraySet) this.f.h).add(zzvVar);
    }

    public final void e(hr7 hr7Var) {
        ((CopyOnWriteArraySet) this.f.i).add(hr7Var);
    }

    public final double f(Point point, Point point2) {
        es00 es00Var = this.g.a;
        ScreenPoint e = es00Var.e(point);
        ScreenPoint e2 = es00Var.e(point2);
        if (e == null || e2 == null) {
            return 0.0d;
        }
        return Math.hypot(e.getX() - e2.getX(), e.getY() - e2.getY());
    }

    public final Rect g() {
        es00 es00Var = this.e;
        es00Var.getClass();
        TaxiMapView c = es00Var.c();
        int width = c != null ? c.getWidth() : 0;
        TaxiMapView c2 = es00Var.c();
        return new Rect(0, 0, width, c2 != null ? c2.getHeight() : 0);
    }

    public final TaxiMapView h() {
        return (TaxiMapView) this.d.getValue(this, j[0]);
    }

    public final wjm i() {
        VisibleRegion f = this.e.f();
        return new wjm(a.E(f.getTopLeft(), null), a.E(f.getBottomRight(), null));
    }

    public final float j() {
        return this.e.c.getZoom();
    }

    public final r5c k() {
        Map map = this.b;
        return map != null ? new r5c(map.getCameraBounds().getMinZoom(), map.getCameraBounds().getMaxZoom()) : new r5c(0.0f, 0.0f);
    }

    public final void l() {
        List<String> singletonList = Collections.singletonList("transport");
        Map map = this.b;
        SublayerManager sublayerManager = map != null ? map.getSublayerManager() : null;
        String r = k.r();
        if (r == null) {
            return;
        }
        Integer findFirstOf = sublayerManager != null ? sublayerManager.findFirstOf(r, SublayerFeatureType.PLACEMARKS_AND_LABELS) : null;
        Sublayer sublayer = findFirstOf != null ? sublayerManager.get(findFirstOf.intValue()) : null;
        if (sublayer != null) {
            SublayerFeatureFilter filter = sublayer.getFilter();
            filter.setType(SublayerFeatureFilterType.EXCLUDE);
            filter.setTags(singletonList);
        }
    }

    public final boolean m(BoundingBox boundingBox) {
        BoundingBox a;
        VisibleRegion a2 = this.e.a();
        Polyline l = k.l(scc.g(a2.getTopLeft(), a2.getBottomRight()));
        if (l == null || (a = k.a(new pu8(l, 1))) == null) {
            return false;
        }
        return a.s(boundingBox, a);
    }

    public final boolean n() {
        TaxiMapView h = h();
        return h != null && h.isMapTouched;
    }

    public final boolean o() {
        Map map = this.b;
        return map != null && map.isRotateGesturesEnabled();
    }

    public final void p(Object obj) {
        rq7 rq7Var = this.a;
        rq7Var.b = obj;
        rq7Var.h();
    }

    public final void q(tls tlsVar) {
        TaxiMapView h = h();
        if (h != null) {
            tlsVar.invoke(h);
        } else {
            this.h.add(tlsVar);
        }
    }

    public final void r(Object obj) {
        rq7 rq7Var = this.a;
        if (rq7Var.e(obj)) {
            rq7Var.h();
        }
        if (rq7Var.g(obj, null, true, 200L)) {
            rq7Var.b = null;
        }
    }

    public final void s(GeoObjectTapListener geoObjectTapListener) {
        ((CopyOnWriteArraySet) this.f.k).remove(geoObjectTapListener);
    }

    public final void t(zzv zzvVar) {
        ((CopyOnWriteArraySet) this.f.h).remove(zzvVar);
    }

    public final void u(hr7 hr7Var) {
        ((CopyOnWriteArraySet) this.f.i).remove(hr7Var);
    }

    public final void v() {
        q(new k200(5, this));
    }

    public final void w() {
        ut7 ut7Var = this.g;
        CameraPosition cameraPosition = ut7Var.a.c;
        ut7Var.k(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, cameraPosition.getTilt()), 200.0f, Animation.Type.LINEAR, null);
    }

    public final void x(ScreenPoint screenPoint) {
        q(new vmz(6, this, screenPoint));
    }

    public final boolean y(Object obj, ScreenRect screenRect) {
        rq7 rq7Var = this.a;
        rq7Var.getClass();
        return rq7Var.g(obj, screenRect, false, 200L);
    }

    public final boolean z(Object obj, ScreenRect screenRect, boolean z, long j2) {
        return this.a.g(obj, screenRect, z, j2);
    }

    public gh00() {
        this(0);
    }
}
