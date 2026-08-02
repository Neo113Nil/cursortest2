package defpackage;

import com.yandex.go.layers.api.model.Action;
import com.yandex.go.navigation.base.a;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.map_object.r;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class og9 implements xsd0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public og9(an8 an8Var) {
        this.a = 0;
        this.b = an8Var;
        this.c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                an8 an8Var = (an8) obj;
                if (((c) an8Var.c).d() != Screen.MOBILITY_HUB || !(wsd0Var instanceof pm00) || ((pm00) wsd0Var).g != Action.SERVER_SELECTION) {
                    String str = ((r) wsd0Var.getAction()).a;
                    pex0 m = ((k) ((wiq0) an8Var.x)).m();
                    if (!jl40.l(str, m != null ? m.b : null)) {
                        mi31 d = b8r.d((b8r) an8Var.w, ((r) wsd0Var.getAction()).a, null, 6);
                        if (d == null) {
                            jst.e.k(new IllegalStateException(), "Car with id " + ((r) wsd0Var.getAction()).a + " exists on map, but is not represented by tariff");
                        } else {
                            ((c4r0) an8Var.b).a(new gnx0(new fnx0(d, SelectionOrigin.USER), true));
                        }
                    }
                }
                Object y = e.y((n0) obj2, continuation);
                return y == CoroutineSingletons.COROUTINE_SUSPENDED ? y : zy11.a;
            default:
                ru.yandex.taxi.scooters.presentation.detailed_order.e eVar = (ru.yandex.taxi.scooters.presentation.detailed_order.e) obj2;
                zzs position = wsd0Var.getPosition();
                return a.a(eVar, (m950) eVar.G.get(), new tbo0(position, ((ru.yandex.taxi.common_models.net.map_object.n0) wsd0Var.getAction()).a, ParkingCardOpenReason.MAP_ON_ORDER, ParkingButtonAction.BUILD_ROUTE, new Integer(kyh0.scooters_parking_pano_build_route)), new jan0(eVar, position, (zuo0) obj, i2), p1j0.a, (ContinuationImpl) continuation);
        }
    }

    public og9(ru.yandex.taxi.scooters.presentation.detailed_order.e eVar, zuo0 zuo0Var) {
        this.a = 1;
        this.c = eVar;
        this.b = zuo0Var;
    }
}
