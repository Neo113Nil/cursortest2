package com.yandex.go.chargers.station.data.model;

import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsRequestParam;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationDetailsRequestParam {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(19))};
    public final String a;
    public final String b;
    public final OrderContext c;
    public final ChargersSelectedDiscountDto d;
    public final List e;

    public /* synthetic */ ChargersStationDetailsRequestParam(int i, String str, String str2, OrderContext orderContext, ChargersSelectedDiscountDto chargersSelectedDiscountDto, List list) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, ChargersStationDetailsRequestParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = orderContext;
        this.d = chargersSelectedDiscountDto;
        this.e = list;
    }

    public ChargersStationDetailsRequestParam(String str, String str2, OrderContext orderContext, ChargersSelectedDiscountDto chargersSelectedDiscountDto, List list) {
        this.a = str;
        this.b = str2;
        this.c = orderContext;
        this.d = chargersSelectedDiscountDto;
        this.e = list;
    }
}
