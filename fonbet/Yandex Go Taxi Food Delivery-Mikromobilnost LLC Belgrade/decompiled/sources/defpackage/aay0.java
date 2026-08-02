package defpackage;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse$DriverRouteGeometry$Updated;
import com.yandex.go.taxi.order.net.taxi.dto.response.e;
import com.yandex.go.taxi.order.net.taxi.dto.response.f;
import java.util.Arrays;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes14.dex */
public final class aay0 extends xqt {
    public static final aay0 e = new aay0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, f.INSTANCE.serializer(), qoi0.a(f.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return ACSPConstants.STATUS;
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(CacheStatus.SERIAL_UPDATED, TaxiRouteResponse$DriverRouteGeometry$Updated.Companion.serializer(), qoi0.a(TaxiRouteResponse$DriverRouteGeometry$Updated.class)), new f9("previous", e.INSTANCE.serializer(), qoi0.a(e.class)));
    }
}
