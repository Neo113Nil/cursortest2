package defpackage;

import android.content.Context;
import com.yandex.mapkit.geometry.Point;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes6.dex */
public final class jyb0 {
    public final Context a;
    public TaxiMapView b;

    public jyb0(Context context) {
        this.a = context;
    }

    public final void a(f4c0 f4c0Var, Point point) {
        TaxiMapView taxiMapView = this.b;
        if (taxiMapView == null || f4c0Var.r == null) {
            return;
        }
        f4c0Var.F(taxiMapView.worldToScreen(point));
    }
}
