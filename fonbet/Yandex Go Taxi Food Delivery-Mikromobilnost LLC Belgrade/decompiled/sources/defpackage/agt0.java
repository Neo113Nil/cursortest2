package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public final class agt0 {
    public final ah00 a;
    public final fu00 b;

    public agt0(ah00 ah00Var, fu00 fu00Var) {
        this.a = ah00Var;
        this.b = fu00Var;
    }

    public final void a(zzs zzsVar, BiConsumer biConsumer) {
        Point F = a.F(zzsVar);
        gh00 gh00Var = (gh00) this.a;
        gh00Var.D(F, Math.max(gh00Var.j(), this.b.b), 300.0f, new mx0(12, biConsumer));
    }

    public final void b(zzs zzsVar, zzs zzsVar2, Consumer consumer) {
        gh00 gh00Var = (gh00) this.a;
        wjm i = gh00Var.i();
        if (i.e(zzsVar) && i.e(zzsVar2)) {
            consumer.accept(Boolean.FALSE);
            return;
        }
        List g = scc.g(a.F(zzsVar), a.F(zzsVar2));
        Point point = new Point(zzsVar.a, zzsVar.b);
        BoundingBox e = a.e(0, g);
        Point southWest = e.getSouthWest();
        Point w = a.w(southWest, point);
        Point northEast = e.getNorthEast();
        BoundingBox e2 = a.e(0, scc.g(southWest, w, northEast, a.w(northEast, point)));
        final float j = gh00Var.j();
        gh00Var.B(e2, new mx0(16, consumer), 500.0f, new Function() { // from class: zft0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CameraPosition cameraPosition = (CameraPosition) obj;
                fu00 fu00Var = agt0.this.b;
                float zoom = cameraPosition.getZoom();
                float f = j;
                if (zoom > f) {
                    zoom = f;
                }
                return new CameraPosition(cameraPosition.getTarget(), Math.max(Math.min(zoom, fu00Var.a), fu00Var.b), cameraPosition.getAzimuth(), cameraPosition.getTilt());
            }
        });
    }
}
