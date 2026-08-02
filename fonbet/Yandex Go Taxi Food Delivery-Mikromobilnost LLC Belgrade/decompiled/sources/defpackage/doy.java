package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;

/* loaded from: classes14.dex */
public final /* synthetic */ class doy implements MapObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ doy(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                break;
        }
        return ((Boolean) slsVar.invoke()).booleanValue();
    }
}
