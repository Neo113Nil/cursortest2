package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsEmptyStateDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsEmptyStateDto {
    public static final s Companion = new s();
    public final String a;
    public final FormattedText b;

    public /* synthetic */ ChargersDiscountsEmptyStateDto(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
    }

    public ChargersDiscountsEmptyStateDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = formattedText;
    }
}
