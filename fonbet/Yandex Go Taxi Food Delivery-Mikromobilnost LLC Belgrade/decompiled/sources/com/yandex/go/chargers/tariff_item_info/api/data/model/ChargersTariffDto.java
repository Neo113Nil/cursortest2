package com.yandex.go.chargers.tariff_item_info.api.data.model;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/tariff_item_info/api/data/model/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersTariffDto {
    public static final g Companion = new g();
    public static final i3y[] d;
    public final FormattedText a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new eua(13)), kotlin.a.b(lazyThreadSafetyMode, new eua(14))};
    }

    public /* synthetic */ ChargersTariffDto(int i, FormattedText formattedText, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list2;
        }
    }

    public ChargersTariffDto() {
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
    }
}
