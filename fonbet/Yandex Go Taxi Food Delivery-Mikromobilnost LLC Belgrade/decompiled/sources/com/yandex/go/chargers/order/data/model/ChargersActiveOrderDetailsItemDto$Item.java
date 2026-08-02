package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersActiveOrderDetailsItemDto$Item", "Lcom/yandex/go/chargers/order/data/model/w;", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderDetailsItemDto$Item extends w {
    public static final u Companion = new u();
    public final FormattedText a;
    public final FormattedText b;

    public ChargersActiveOrderDetailsItemDto$Item(int i, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    public ChargersActiveOrderDetailsItemDto$Item() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
    }
}
