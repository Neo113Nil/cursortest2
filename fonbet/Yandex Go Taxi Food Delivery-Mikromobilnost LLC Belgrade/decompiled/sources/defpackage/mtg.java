package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.taxi.order.map.overlay.recenter.b;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.VisibleRegion;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes14.dex */
public final class mtg implements hr7 {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public mtg(b bVar) {
        this.a = 1;
        this.c = bVar;
        this.b = new Handler(Looper.getMainLooper());
    }

    public boolean a(RecenterType recenterType) {
        BoundingBox a;
        fi6 fi6Var = new fi6();
        b bVar = (b) this.c;
        ah00 ah00Var = bVar.b;
        bVar.l(recenterType).f(fi6Var, bVar.w);
        if (fi6Var.i()) {
            return false;
        }
        BoundingBox g = fi6Var.g();
        he61 he61Var = bVar.h;
        VisibleRegion f = ((gh00) ah00Var).e.f();
        VisibleRegion a2 = ((gh00) ah00Var).e.a();
        he61Var.getClass();
        Point topLeft = f.getTopLeft();
        Point topLeft2 = a2.getTopLeft();
        Polyline polyline = a.b;
        double longitude = topLeft2.getLongitude() - topLeft.getLongitude();
        if (longitude < -180.0d) {
            longitude += 360.0d;
        }
        Polyline l = k.l(scc.g(f.getTopLeft(), new Point(a2.getBottomRight().getLatitude() - Math.abs(longitude), f.getBottomRight().getLongitude())));
        if (l == null || (a = k.a(new pu8(l, 2))) == null) {
            return false;
        }
        return a.s(g, a);
    }

    @Override // defpackage.hr7
    public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        switch (this.a) {
            case 0:
                otg otgVar = (otg) this.c;
                if (z) {
                    CameraPosition cameraPosition2 = (CameraPosition) this.b;
                    Polyline polyline = a.b;
                    boolean z2 = false;
                    if (cameraPosition2 != null && cameraPosition != null) {
                        Point target = cameraPosition2.getTarget();
                        Point target2 = cameraPosition.getTarget();
                        if (Double.compare(target.getLatitude(), target2.getLatitude()) == 0 && Double.compare(target.getLongitude(), target2.getLongitude()) == 0 && Float.compare(cameraPosition2.getZoom(), cameraPosition.getZoom()) == 0 && Float.compare(cameraPosition2.getAzimuth(), cameraPosition.getAzimuth()) == 0 && Float.compare(cameraPosition2.getTilt(), cameraPosition.getTilt()) == 0) {
                            z2 = true;
                        }
                    }
                    if ((cameraUpdateReason == CameraUpdateReason.GESTURES || otgVar.f) && !z2) {
                        jst.e.getClass();
                        otgVar.b();
                    }
                    this.b = cameraPosition;
                    break;
                }
                break;
            default:
                Handler handler = (Handler) this.b;
                if (z) {
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new oxe0(20, this), 500L);
                    break;
                }
                break;
        }
    }

    public mtg(otg otgVar) {
        this.a = 0;
        this.c = otgVar;
    }
}
