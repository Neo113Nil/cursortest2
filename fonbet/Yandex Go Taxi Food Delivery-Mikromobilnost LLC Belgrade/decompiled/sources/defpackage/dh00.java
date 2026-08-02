package defpackage;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;

/* loaded from: classes12.dex */
public abstract class dh00 {
    public static void a(ah00 ah00Var, Point point, float f, Animation.Type type, tls tlsVar, int i) {
        if ((i & 2) != 0) {
            f = ((gh00) ah00Var).e.c.getZoom();
        }
        float azimuth = (i & 4) != 0 ? ((gh00) ah00Var).e.c.getAzimuth() : 0.0f;
        float tilt = ((gh00) ah00Var).e.c.getTilt();
        if ((i & 32) != 0) {
            type = Animation.Type.SMOOTH;
        }
        if ((i & 64) != 0) {
            tlsVar = null;
        }
        ((gh00) ah00Var).g.k(new CameraPosition(point, f, azimuth, tilt), 400.0f, type, tlsVar != null ? new ch00(0, tlsVar) : null);
    }
}
