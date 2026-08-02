package defpackage;

import com.yandex.mapkit.geometry.Point;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

/* loaded from: classes15.dex */
public final /* synthetic */ class a0w implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Point b;

    public /* synthetic */ a0w(Point point, int i) {
        this.a = i;
        this.b = point;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Point point = this.b;
        switch (i) {
            case 0:
                return b.i(new Pair("type", "map_long_tap"), new Pair(IssuingDistributionPointExtension.POINT, b.i(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude())))));
            default:
                return b.i(new Pair("type", "map_tap"), new Pair(IssuingDistributionPointExtension.POINT, b.i(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude())))));
        }
    }
}
