package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wu9;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsListResponse;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsListResponse {
    public static final c0 Companion = new c0();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(2)), null, null};
    public final FormattedText a;
    public final ChargersDiscountNotificationDto b;
    public final List c;
    public final ChargersDiscountsEmptyStateDto d;
    public final ChargersDiscountsButtonDto e;

    public /* synthetic */ ChargersDiscountsListResponse(int i, FormattedText formattedText, ChargersDiscountNotificationDto chargersDiscountNotificationDto, List list, ChargersDiscountsEmptyStateDto chargersDiscountsEmptyStateDto, ChargersDiscountsButtonDto chargersDiscountsButtonDto) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = chargersDiscountNotificationDto;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = chargersDiscountsEmptyStateDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = chargersDiscountsButtonDto;
        }
    }

    public ChargersDiscountsListResponse() {
        this.a = FormattedText.c;
        this.b = null;
        this.c = EmptyList.a;
        this.d = null;
        this.e = null;
    }
}
