package defpackage;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes13.dex */
public final class ktj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ktj(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final uc4 a(TaxiMapView taxiMapView) {
        float f = this.a;
        float f2 = this.b;
        ScreenPoint screenPoint = new ScreenPoint(f, f2);
        float f3 = this.c;
        ScreenPoint screenPoint2 = new ScreenPoint(f3, f2);
        float f4 = this.d;
        List g = scc.g(screenPoint, screenPoint2, new ScreenPoint(f3, f4), new ScreenPoint(f, f4));
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            Point screenToWorld = taxiMapView.screenToWorld((ScreenPoint) it.next());
            if (screenToWorld == null) {
                return null;
            }
            arrayList.add(screenToWorld);
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            ny61.p();
            return null;
        }
        double longitude = ((Point) it2.next()).getLongitude();
        while (it2.hasNext()) {
            longitude = Math.min(longitude, ((Point) it2.next()).getLongitude());
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            ny61.p();
            return null;
        }
        double latitude = ((Point) it3.next()).getLatitude();
        while (it3.hasNext()) {
            latitude = Math.min(latitude, ((Point) it3.next()).getLatitude());
        }
        zzs zzsVar = new zzs(latitude, longitude, 0, null, null, 28);
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            ny61.p();
            return null;
        }
        double longitude2 = ((Point) it4.next()).getLongitude();
        while (it4.hasNext()) {
            longitude2 = Math.max(longitude2, ((Point) it4.next()).getLongitude());
        }
        Iterator it5 = arrayList.iterator();
        if (!it5.hasNext()) {
            ny61.p();
            return null;
        }
        double latitude2 = ((Point) it5.next()).getLatitude();
        while (it5.hasNext()) {
            latitude2 = Math.max(latitude2, ((Point) it5.next()).getLatitude());
        }
        return new uc4(zzsVar, new zzs(latitude2, longitude2, 0, null, null, 28));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktj)) {
            return false;
        }
        ktj ktjVar = (ktj) obj;
        return Float.compare(this.a, ktjVar.a) == 0 && Float.compare(this.b, ktjVar.b) == 0 && Float.compare(this.c, ktjVar.c) == 0 && Float.compare(this.d, ktjVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.q(oo31.k("Rect(left=", this.a, ", top=", this.b, ", right="), this.c, ", bottom=", this.d, Extension.C_BRAKE);
    }
}
