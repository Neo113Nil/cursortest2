package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.go.places.impl.ui.common.map.location.a;
import com.yandex.go.walking.navigation.impl.ui.overlay.WaypointType;
import com.yandex.go.walking.navigation.impl.ui.overlay.e;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class i541 extends bhf implements g541 {
    public final e A;
    public final a B;
    public final pwy0 C;
    public final hbp0 D;
    public final xm00 E;
    public final ImageProvider F;
    public final Context z;

    public i541(Context context, e eVar, a aVar, pwy0 pwy0Var, ah00 ah00Var, sgu0 sgu0Var, no21 no21Var) {
        super(ah00Var, no21Var);
        this.z = context;
        this.A = eVar;
        this.B = aVar;
        this.C = pwy0Var;
        this.D = new hbp0(new czo0(14), "WalkNavPlacemarksOverlay", null);
        this.E = new xm00();
        this.F = ImageProvider.fromBitmap(((ugu0) sgu0Var).a(-1));
    }

    @Override // defpackage.bhf
    public final ugf Jg() {
        return new mgc0(this.z, this.E, this.D, this.B, this.C, 1);
    }

    @Override // defpackage.bhf
    public final ScreenPoint Kg() {
        es00 es00Var = ((gh00) ((ah00) this.b)).e;
        return es00Var.e(ru.yandex.taxi.map.utils.a.F(es00Var.b()));
    }

    public final void Og(Point point, WaypointType waypointType, ImageProvider imageProvider, IconStyle iconStyle) {
        f4c0 f4c0Var = new f4c0(point, null, 6);
        f4c0Var.z(imageProvider, iconStyle);
        f4c0Var.C(Collections.singletonList(new PointF(1.0f, 0.85f)));
        f4c0Var.h(new h541(waypointType));
        f4c0Var.b(this.E);
    }

    @Override // defpackage.g541
    public final void P0(Location location) {
        double latitude = location.getPosition().getLatitude();
        double longitude = location.getPosition().getLongitude();
        Double accuracy = location.getAccuracy();
        Ng(latitude, longitude, accuracy != null ? (float) accuracy.doubleValue() : 0.0f);
        Double heading = location.getHeading();
        if (heading != null) {
            updateAzimuth((float) heading.doubleValue());
        }
    }

    @Override // defpackage.g541
    public final void o4(WaypointType waypointType, boolean z) {
        Iterator it = this.E.n().iterator();
        while (it.hasNext()) {
            ap00 ap00Var = (ap00) it.next();
            Object obj = ap00Var.d;
            h541 h541Var = obj instanceof h541 ? (h541) obj : null;
            if ((h541Var != null ? h541Var.a : null) != waypointType) {
                ap00Var = null;
            }
            if (ap00Var != null) {
                ap00Var.i(z);
            }
        }
    }

    @Override // defpackage.g541
    public final void xc(Point point, ImageProvider imageProvider, WaypointType waypointType) {
        Iterator it = this.E.n().iterator();
        while (true) {
            if (!it.hasNext()) {
                Og(point, waypointType, imageProvider, new IconStyle().setAnchor(new PointF(0.5f, 0.87f)));
                Og(point, waypointType, this.F, null);
                return;
            }
            ap00 ap00Var = (ap00) it.next();
            Object obj = ap00Var.d;
            h541 h541Var = obj instanceof h541 ? (h541) obj : null;
            ap00 ap00Var2 = (h541Var != null ? h541Var.a : null) == waypointType ? ap00Var : null;
            if (ap00Var2 != null) {
                ap00Var2.d();
            }
        }
    }
}
