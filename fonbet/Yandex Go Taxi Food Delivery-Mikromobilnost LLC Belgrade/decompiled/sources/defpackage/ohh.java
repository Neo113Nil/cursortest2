package defpackage;

import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapWindow;
import ru.yandex.yandexmaps.multiplatform.pin.war.c;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.b;

/* loaded from: classes13.dex */
public final class ohh {
    public static c a(ohh ohhVar, Map map, MapWindow mapWindow, i5c0 i5c0Var, l2c0 l2c0Var, fdc0 fdc0Var, float f, b bVar, n1c0 n1c0Var, s1c0 s1c0Var, int i) {
        MapObjectCollection addCollection = map.getMapObjects().addCollection();
        b bVar2 = (i & 128) != 0 ? null : bVar;
        ohhVar.getClass();
        k8c k8cVar = new k8c(map);
        y1c0 y1c0Var = new y1c0(mapWindow);
        aq80 aq80Var = new aq80(addCollection);
        new b2c0();
        return b2c0.a(k8cVar, y1c0Var, f, new nw70(21, i5c0Var), l2c0Var, new w1c0(6), fdc0Var, aq80Var, bVar2, n1c0Var, null, s1c0Var);
    }
}
