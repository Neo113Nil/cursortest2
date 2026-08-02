package defpackage;

import android.util.SparseArray;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mobile.drive.sdk.map.b;

/* loaded from: classes10.dex */
public final class i4n {
    public int a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public Object h;
    public Object i;

    public i4n(int i, int i2, int i3) {
        switch (i3) {
            case 2:
                this.a = i;
                this.b = i2;
                this.c = new SparseArray();
                this.d = new SparseArray();
                this.e = new SparseArray();
                this.f = new SparseArray();
                this.g = new SparseArray();
                break;
            default:
                this.a = i;
                this.b = i2;
                this.c = new SparseArray();
                this.d = new SparseArray();
                this.e = new SparseArray();
                this.f = new SparseArray();
                this.g = new SparseArray();
                break;
        }
    }

    public void a() {
        b bVar = (b) this.i;
        bVar.c.removeCameraListener(bVar.h);
        bVar.b.removeSizeChangedListener(bVar.g);
        ((qyx) this.d).b(((MapWindow) this.c).getMap(), (fzu0) this.g);
    }

    public i4n(MapWindow mapWindow, qyx qyxVar, bxl bxlVar, int i, int i2) {
        this.c = mapWindow;
        this.d = qyxVar;
        this.e = bxlVar;
        mapWindow.addSizeChangedListener(new ox0(2, this));
        this.a = i;
        this.b = i2;
        fzu0 a = qyxVar.a(mapWindow.getMap());
        this.g = a;
        this.h = a.a;
        b bVar = new b(this);
        this.i = bVar;
        Map map = bVar.c;
        map.setRotateGesturesEnabled(true);
        map.setTiltGesturesEnabled(false);
        map.setModelsEnabled(false);
        map.addCameraListener(bVar.h);
        bVar.b.addSizeChangedListener(bVar.g);
    }
}
