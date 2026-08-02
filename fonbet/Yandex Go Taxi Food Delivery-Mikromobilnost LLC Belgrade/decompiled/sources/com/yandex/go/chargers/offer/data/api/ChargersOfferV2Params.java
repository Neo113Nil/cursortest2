package com.yandex.go.chargers.offer.data.api;

import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.z1a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferV2Params;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferV2Params {
    public static final s Companion = new s();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(26))};
    public final ChargersSelectedDiscountDto a;
    public final ChargersStationDto b;
    public final List c;

    public /* synthetic */ ChargersOfferV2Params(int i, ChargersSelectedDiscountDto chargersSelectedDiscountDto, ChargersStationDto chargersStationDto, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ChargersOfferV2Params$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = chargersSelectedDiscountDto;
        this.b = chargersStationDto;
        this.c = list;
    }

    public ChargersOfferV2Params(ChargersSelectedDiscountDto chargersSelectedDiscountDto, ChargersStationDto chargersStationDto, List list) {
        this.a = chargersSelectedDiscountDto;
        this.b = chargersStationDto;
        this.c = list;
    }
}
