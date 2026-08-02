package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.layers.presentation.optimalview.MapObservationPresenter$trackWhenNoPointsOnMap$$inlined$safeCollectIn$1;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes5.dex */
public final class oq00 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ oq00(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        List list;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        c cVar = this.b;
        switch (i) {
            case 0:
                kq00 kq00Var = (kq00) obj;
                if (cVar.J || !kq00Var.d.isEmpty()) {
                    uc4 uc4Var = kq00Var.a;
                    if (uc4Var != null) {
                        zzs zzsVar = uc4Var.a;
                        Polyline polyline = a.b;
                        Point point = new Point(zzsVar.a, zzsVar.b);
                        zzs zzsVar2 = kq00Var.a.b;
                        BoundingBox boundingBox = new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b));
                        if (cVar.J || cVar.Kg(kq00Var)) {
                            ((gh00) cVar.x).B(boundingBox, new cy0(i2, cVar, kq00Var), cVar.L, null);
                        }
                    }
                } else {
                    ((mq00) cVar.Dg()).showMessage(kq00Var.b, kq00Var.c);
                }
                tje.N(cVar.Jg(), null, null, new MapObservationPresenter$trackWhenNoPointsOnMap$$inlined$safeCollectIn$1(cVar.y.a, null, cVar), 3);
                break;
            default:
                cq60 cq60Var = (cq60) obj;
                if (cq60Var.f != null && (list = cq60Var.g) != null && list.isEmpty()) {
                    kgx[] kgxVarArr = c.M;
                    mq00 mq00Var = (mq00) cVar.Dg();
                    cd70 cd70Var = cq60Var.f;
                    String str = cd70Var.b;
                    if (str == null) {
                        str = "";
                    }
                    mq00Var.showMessage(str, cd70Var.c);
                    break;
                } else {
                    kgx[] kgxVarArr2 = c.M;
                    ((mq00) cVar.Dg()).hideMessage();
                    break;
                }
        }
        return zy11Var;
    }
}
