package defpackage;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.mapkit.geometry.Point;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map.overlay.RecenterType;

/* loaded from: classes14.dex */
public interface cgi0 {
    Point a(WalkRouteOrderExperiment.OrderStatusRule.PointType pointType);

    boolean b();

    void c();

    void d();

    Object e(RecenterType recenterType, boolean z, Continuation continuation);

    boolean f();

    void g(List list);

    Object h(Continuation continuation);

    Object i(boolean z, boolean z2, Continuation continuation);

    void j();

    Object k(SuspendLambda suspendLambda);

    void onPause();

    void onResume();
}
