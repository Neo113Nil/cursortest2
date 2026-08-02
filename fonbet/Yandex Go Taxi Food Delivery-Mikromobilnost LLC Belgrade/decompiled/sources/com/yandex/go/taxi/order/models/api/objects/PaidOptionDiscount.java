package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/PaidOptionDiscount;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/s0", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaidOptionDiscount {
    public static final s0 Companion = new s0();
    public static final PaidOptionDiscount b = new PaidOptionDiscount(0);
    public final Dialog a;

    public /* synthetic */ PaidOptionDiscount(int i, Dialog dialog) {
        if ((i & 1) == 0) {
            this.a = new Dialog(0);
        } else {
            this.a = dialog;
        }
    }

    public PaidOptionDiscount() {
        this(0);
    }

    public PaidOptionDiscount(int i) {
        this.a = new Dialog(0);
    }
}
