package defpackage;

import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.InertiaMoveListener;
import com.yandex.mapkit.map.Map;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class cs00 implements InertiaMoveListener {
    public final /* synthetic */ t300 a;

    public cs00(t300 t300Var) {
        this.a = t300Var;
    }

    @Override // com.yandex.mapkit.map.InertiaMoveListener
    public final void onCancel(Map map, CameraPosition cameraPosition) {
        Iterator it = ((CopyOnWriteArraySet) this.a.j).iterator();
        while (it.hasNext()) {
            ((jft0) it.next()).getClass();
        }
    }

    @Override // com.yandex.mapkit.map.InertiaMoveListener
    public final void onFinish(Map map, CameraPosition cameraPosition) {
        Iterator it = ((CopyOnWriteArraySet) this.a.j).iterator();
        while (it.hasNext()) {
            ((jft0) it.next()).getClass();
        }
    }

    @Override // com.yandex.mapkit.map.InertiaMoveListener
    public final void onStart(Map map, CameraPosition cameraPosition) {
        Iterator it = ((CopyOnWriteArraySet) this.a.j).iterator();
        while (it.hasNext()) {
            ((jft0) it.next()).a(cameraPosition);
        }
    }
}
