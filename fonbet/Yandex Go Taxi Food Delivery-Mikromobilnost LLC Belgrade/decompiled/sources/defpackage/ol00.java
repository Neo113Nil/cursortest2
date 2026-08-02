package defpackage;

import com.yandex.go.layers.api.presentation.mapkit.MapKitObjectType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final /* synthetic */ class ol00 implements GeoObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.layers.GeoObjectTapListener
    public final boolean onObjectTap(GeoObjectTapEvent geoObjectTapEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rl00 rl00Var = ((ql00) obj).c;
                rl00Var.x.getClass();
                Optional b = il00.b(geoObjectTapEvent);
                if (!xvz.D(b)) {
                    hl00 hl00Var = (hl00) b.get();
                    ml00 ml00Var = rl00Var.w;
                    ml00Var.getClass();
                    int i2 = ll00.a[hl00Var.c().ordinal()];
                    if (i2 == 1) {
                        Consumer consumer = (Consumer) ml00Var.b.get(MapKitObjectType.MASS_TRANSIT_STOP);
                        if (consumer != null) {
                            wnt wntVar = ml00Var.a;
                            String b2 = hl00Var.b();
                            Point a = hl00Var.a();
                            consumer.accept(new p3w(((xnt) wntVar).a(new bv00(b2, a != null ? new mv00(a.getLatitude(), a.getLongitude()) : null), bv00.Companion.serializer())));
                        }
                    } else if (i2 != 2) {
                        jst.e.getClass();
                    } else {
                        jst.e.getClass();
                    }
                }
                return true;
            default:
                Iterator it = ((CopyOnWriteArraySet) ((t300) obj).k).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    z |= ((GeoObjectTapListener) it.next()).onObjectTap(geoObjectTapEvent);
                }
                return z;
        }
    }
}
