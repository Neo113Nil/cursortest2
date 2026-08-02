package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.gsq0;
import defpackage.pl50;
import defpackage.ql50;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/NeedActivationDescriptionDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NeedActivationDescriptionDto {
    public static final m Companion = new m();
    public final FormattedText a;
    public final ql50 b;

    public /* synthetic */ NeedActivationDescriptionDto(int i, FormattedText formattedText, ql50 ql50Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = pl50.INSTANCE;
        } else {
            this.b = ql50Var;
        }
    }

    public NeedActivationDescriptionDto() {
        this(0);
    }

    public NeedActivationDescriptionDto(int i) {
        FormattedText formattedText = FormattedText.c;
        pl50 pl50Var = pl50.INSTANCE;
        this.a = formattedText;
        this.b = pl50Var;
    }
}
