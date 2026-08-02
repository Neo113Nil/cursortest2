package defpackage;

import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.gas_stations.overview.h;
import com.yandex.go.preorder.map.a;
import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;

/* loaded from: classes5.dex */
public final /* synthetic */ class mx0 implements Map.CameraCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mx0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        z1e0 z1e0Var;
        Double speed;
        sls slsVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((AddressMapFragment) obj).invalidatePickupPoints();
                break;
            case 1:
                j0 j0Var = (j0) obj;
                if (z) {
                    j0Var.invoke();
                    break;
                }
                break;
            case 2:
                ((zvs) obj).invoke(Boolean.valueOf(z));
                break;
            case 3:
                ((xyz) obj).invoke();
                break;
            case 4:
                ((h) obj).L.g(Boolean.TRUE);
                break;
            case 5:
                c cVar = (c) obj;
                if (cVar.Eg() && (z1e0Var = cVar.Q) != null) {
                    ((nnz) cVar.Dg()).D0(z1e0Var);
                    break;
                }
                break;
            case 6:
                zb00 zb00Var = (zb00) obj;
                Location a = zb00Var.c.a();
                if (((a == null || (speed = a.getSpeed()) == null) ? 0 : xk91.c(speed.doubleValue())) > 10) {
                    zb00Var.d.a(FocusMode.FOLLOWING);
                    zb00Var.e.a();
                    break;
                }
                break;
            case 7:
                m110 m110Var = (m110) obj;
                if (z && (slsVar = m110Var.e.a) != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 8:
                uq40 uq40Var = (uq40) obj;
                if (z) {
                    uq40Var.z.g();
                    uq40Var.E.a = null;
                    if (uq40Var.k.c().b() != null) {
                        uq40Var.y.b();
                        break;
                    }
                }
                break;
            case 9:
                ((th50) obj).onComplete();
                break;
            case 10:
                a aVar = (a) obj;
                r0 r0Var = aVar.l;
                do {
                } while (!r0Var.k(r0Var.getValue(), Integer.valueOf(((Number) r3).intValue() - 1)));
                aVar.p = z;
                aVar.f.g();
                break;
            case 11:
                ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.c cVar2 = (ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.c) obj;
                if (z) {
                    cVar2.b.invoke(Boolean.TRUE);
                    break;
                }
                break;
            case 12:
                BiConsumer biConsumer = (BiConsumer) obj;
                if (biConsumer != null) {
                    biConsumer.accept(Boolean.valueOf(z), CameraAnimationUpdateType.ANIMATE_TO_PICKUP_POINT);
                    break;
                }
                break;
            case 13:
                ((x5s0) obj).accept(CameraAnimationUpdateType.ANIMATE_TO_USER_POSITION);
                break;
            case 14:
                ((r7v) obj).run();
                break;
            case 15:
                ((let0) obj).accept(CameraAnimationUpdateType.ANIMATE_TO_POINT);
                break;
            default:
                ((Consumer) obj).accept(Boolean.valueOf(z));
                break;
        }
    }
}
