package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes5.dex */
public final class gz1 {
    public final OrderStatusInfo a;
    public final DriveState b;
    public final OrderStatusInfo.AlternativeDestination c;
    public final boolean d;
    public final boolean e;

    public gz1(OrderStatusInfo orderStatusInfo, DriveState driveState, OrderStatusInfo.AlternativeDestination alternativeDestination, boolean z, boolean z2) {
        this.a = orderStatusInfo;
        this.b = driveState;
        this.c = alternativeDestination;
        this.d = z;
        this.e = z2;
    }
}
