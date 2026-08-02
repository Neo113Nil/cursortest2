package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import ru.yandex.taxi.preorder.source.routeoverlay.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class h6l0 implements MapObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ int c;

    public /* synthetic */ h6l0(a aVar, int i, int i2) {
        this.a = i2;
        this.b = aVar;
        this.c = i;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        int i = this.a;
        int i2 = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                lft0 lft0Var = aVar.c0;
                if (lft0Var != null) {
                    lft0Var.I(i2);
                    break;
                }
                break;
            default:
                lft0 lft0Var2 = aVar.c0;
                if (lft0Var2 != null) {
                    lft0Var2.I(i2);
                    break;
                }
                break;
        }
        return true;
    }
}
