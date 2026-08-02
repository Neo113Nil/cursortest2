package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl70;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderCommitResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCommitResponse {
    public static final d1 Companion = new d1();
    public static final i3y[] e;
    public final String a;
    public final String b;
    public final DriveState c;
    public final CanMakeMoreOrders d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new jl70(14)), kotlin.a.b(lazyThreadSafetyMode, new jl70(15))};
    }

    public /* synthetic */ OrderCommitResponse(int i, String str, String str2, DriveState driveState, CanMakeMoreOrders canMakeMoreOrders) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = driveState;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = canMakeMoreOrders;
        }
    }

    public OrderCommitResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
