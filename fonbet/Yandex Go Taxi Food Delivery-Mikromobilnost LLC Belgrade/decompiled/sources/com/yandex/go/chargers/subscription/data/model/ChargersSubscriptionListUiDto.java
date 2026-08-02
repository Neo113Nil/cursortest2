package com.yandex.go.chargers.subscription.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionListUiDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersSubscriptionListUiDto {
    public static final m Companion = new m();
    public final FormattedText a;

    public /* synthetic */ ChargersSubscriptionListUiDto(int i, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = FormattedText.c;
        } else {
            this.a = formattedText;
        }
    }

    public ChargersSubscriptionListUiDto() {
        this.a = FormattedText.c;
    }
}
