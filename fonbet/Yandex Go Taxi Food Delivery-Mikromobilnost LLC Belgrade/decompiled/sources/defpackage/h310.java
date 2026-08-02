package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.f;
import java.util.Map;

/* loaded from: classes12.dex */
public final class h310 implements i310 {
    public final MasstransitOrderDto a;
    public final Map b;
    public final boolean c;

    static {
        f fVar = MasstransitOrderDto.Companion;
    }

    public h310(MasstransitOrderDto masstransitOrderDto, Map map, boolean z) {
        this.a = masstransitOrderDto;
        this.b = map;
        this.c = z;
    }
}
