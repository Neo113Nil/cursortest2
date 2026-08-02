package com.yandex.go.chargers.tariff_item_info.api.data.model;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffBlockDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/tariff_item_info/api/data/model/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersTariffBlockDto {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final ChargersTariffDetailHeaderDto a;
    public final List b;

    static {
        d dVar = ChargersTariffDetailItemDto.Companion;
        c = new i3y[]{null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(7))};
    }

    public /* synthetic */ ChargersTariffBlockDto(int i, ChargersTariffDetailHeaderDto chargersTariffDetailHeaderDto, List list) {
        this.a = (i & 1) == 0 ? null : chargersTariffDetailHeaderDto;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ChargersTariffBlockDto() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
