package defpackage;

import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.walkroute.WalkRouteRepository$getWalkRoute$2$invokeSuspend$$inlined$suspendCallbackApi$2;

/* loaded from: classes6.dex */
public final class k641 implements Session.RouteListener {
    public final WalkRouteRepository$getWalkRoute$2$invokeSuspend$$inlined$suspendCallbackApi$2 a;

    public k641(WalkRouteRepository$getWalkRoute$2$invokeSuspend$$inlined$suspendCallbackApi$2 walkRouteRepository$getWalkRoute$2$invokeSuspend$$inlined$suspendCallbackApi$2) {
        this.a = walkRouteRepository$getWalkRoute$2$invokeSuspend$$inlined$suspendCallbackApi$2;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        this.a.invoke(list);
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        jst.e.j(new RuntimeException(error.toString()));
        this.a.invoke(EmptyList.a);
    }
}
