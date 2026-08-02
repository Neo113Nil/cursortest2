package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.InputListener;
import com.yandex.mapkit.map.Map;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class ds00 implements InputListener {
    public final /* synthetic */ t300 a;

    public ds00(t300 t300Var) {
        this.a = t300Var;
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapLongTap(Map map, Point point) {
        Iterator it = ((CopyOnWriteArraySet) this.a.h).iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).c(point);
        }
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapTap(Map map, Point point) {
        Iterator it = ((CopyOnWriteArraySet) this.a.h).iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).d(point);
        }
    }
}
