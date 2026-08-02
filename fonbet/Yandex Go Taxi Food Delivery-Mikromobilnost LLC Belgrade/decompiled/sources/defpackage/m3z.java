package defpackage;

import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.RootMapObjectCollection;
import com.yandex.mapkit.map.SublayerManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public final class m3z implements qyx {
    public final HashMap a = new HashMap();

    @Override // defpackage.qyx
    public final fzu0 a(Map map) {
        SublayerManager sublayerManager = map.getSublayerManager();
        RootMapObjectCollection addMapObjectLayer = map.addMapObjectLayer("drive_main");
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((fzu0) entry.getValue()).getClass();
            ((fzu0) entry.getValue()).getClass();
            Integer findFirstOf = sublayerManager.findFirstOf("drive_main");
            if (findFirstOf != null) {
                sublayerManager.moveToEnd(findFirstOf.intValue());
            }
        }
        fzu0 fzu0Var = new fzu0(addMapObjectLayer);
        hashMap.put("drive_main", fzu0Var);
        return fzu0Var;
    }

    @Override // defpackage.qyx
    public final void b(com.yandex.mapkit.map.Map map, fzu0 fzu0Var) {
        MapObjectCollection mapObjectCollection = fzu0Var.a;
        if (mapObjectCollection.isValid()) {
            mapObjectCollection.clear();
        } else {
            l0b1.h(new AssertionError("map_layer_invalid", null));
        }
        SublayerManager sublayerManager = map.getSublayerManager();
        if (sublayerManager.isValid()) {
            while (true) {
                Integer findFirstOf = sublayerManager.findFirstOf("drive_main");
                if (findFirstOf == null) {
                    break;
                } else {
                    sublayerManager.remove(findFirstOf.intValue());
                }
            }
        } else {
            l0b1.h(new AssertionError("map_layer_invalid", null));
        }
        this.a.remove("drive_main");
    }
}
