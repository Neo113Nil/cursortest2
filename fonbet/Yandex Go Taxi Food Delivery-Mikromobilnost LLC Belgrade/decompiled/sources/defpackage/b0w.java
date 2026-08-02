package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.InputListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mobile.drive.sdk.map.handlers.a;

/* loaded from: classes15.dex */
public final class b0w implements InputListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b0w(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Map map, Point point) {
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapLongTap(Map map, Point point) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((mmj) obj).c(new a0w(point, 0));
                break;
            default:
                ((a) obj).c.u("map/long_tap", fib1.j(point));
                break;
        }
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapTap(Map map, Point point) {
        switch (this.a) {
            case 0:
                ((mmj) this.b).c(new a0w(point, 1));
                break;
        }
    }
}
