package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto;
import com.yandex.go.taxi.order.models.api.objects.l0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class nr00 extends xqt {
    public static final nr00 e = new nr00();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, l0.INSTANCE.serializer(), qoi0.a(l0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("driving", MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.Companion.serializer(), qoi0.a(MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.class)), new f9("bezier", MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.Companion.serializer(), qoi0.a(MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.class)));
    }
}
