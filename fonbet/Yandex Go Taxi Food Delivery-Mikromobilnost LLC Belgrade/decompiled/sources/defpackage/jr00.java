package defpackage;

import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$BezierRoute;
import com.yandex.go.taxi.order.models.api.route.e;
import com.yandex.go.taxi.order.models.api.route.f;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class jr00 extends xqt {
    public static final jr00 e = new jr00();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("bezier", MapRouteAppearance$BezierRoute.Companion.serializer(), qoi0.a(MapRouteAppearance$BezierRoute.class)), new f9("walk_route", f.INSTANCE.serializer(), qoi0.a(f.class)));
    }
}
