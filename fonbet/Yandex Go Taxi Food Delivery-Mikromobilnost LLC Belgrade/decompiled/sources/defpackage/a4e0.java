package defpackage;

import com.yandex.go.layers.api.model.Action;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.process.b;

/* loaded from: classes9.dex */
public final class a4e0 extends r8 {
    public final v65 A;
    public final x3e0 B;
    public final c4e0 c;
    public final mbp0 w;
    public final xm00 x;
    public final xm00 y;
    public CameraPosition z;

    /* JADX WARN: Type inference failed for: r2v5, types: [x3e0] */
    public a4e0(ah00 ah00Var, b bVar, c4e0 c4e0Var) {
        super(5, ah00Var);
        this.c = c4e0Var;
        this.w = new mbp0(bVar.a);
        this.x = ((gh00) ah00Var).i.p();
        this.y = ((gh00) ah00Var).i.p();
        this.A = new v65(3, this);
        this.B = new MapObjectTapListener() { // from class: x3e0
            @Override // com.yandex.mapkit.map.MapObjectTapListener
            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                el40 sharedMultiClickHandler;
                a4e0 a4e0Var = a4e0.this;
                TaxiMapView h = ((gh00) ((ah00) a4e0Var.b)).h();
                Object context = h != null ? h.getContext() : null;
                fl40 fl40Var = context instanceof fl40 ? (fl40) context : null;
                if (fl40Var != null && (sharedMultiClickHandler = fl40Var.sharedMultiClickHandler()) != null) {
                    if (!sharedMultiClickHandler.satisfiesClickDelay()) {
                        return false;
                    }
                    sharedMultiClickHandler.updateLastClickOnItemTimestamp();
                }
                Object userData = mapObject.getUserData();
                if (!(userData instanceof o3e0)) {
                    userData = null;
                }
                o3e0 o3e0Var = (o3e0) userData;
                if (o3e0Var == null) {
                    o3e0Var = new o3e0();
                    mapObject.setUserData(o3e0Var);
                }
                nm40 b = o3e0Var.b();
                if (b == null) {
                    return false;
                }
                Object userData2 = mapObject.getUserData();
                if (!(userData2 instanceof o3e0)) {
                    userData2 = null;
                }
                o3e0 o3e0Var2 = (o3e0) userData2;
                if (o3e0Var2 == null) {
                    o3e0Var2 = new o3e0();
                    mapObject.setUserData(o3e0Var2);
                }
                BoundingBox a = o3e0Var2.a();
                if (a == null) {
                    return false;
                }
                a4e0Var.Hg(b, a.E(a.h(a), null));
                return true;
            }
        };
    }

    public final void Hg(nm40 nm40Var, zzs zzsVar) {
        z2e0 z2e0Var = this.c.y;
        z2e0Var.b.g(new nm00(nm40Var.b(), zzsVar, nm40Var.c(), Action.TAP));
    }
}
