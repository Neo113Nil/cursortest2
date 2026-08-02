package com.yandex.go.chargers.discounts.api.data.model;

import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/api/data/model/ChargersSelectedDiscountDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/api/data/model/c", "go-client-android.features.chargers.discounts:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersSelectedDiscountDto {
    public static final c Companion = new c();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(11)), null, null, null};
    public final ChargersDiscountTypeDto a;
    public final String b;
    public final Date c;
    public final Date d;

    public /* synthetic */ ChargersSelectedDiscountDto(int i, ChargersDiscountTypeDto chargersDiscountTypeDto, String str, Date date, Date date2) {
        if (4 != (i & 4)) {
            qje.Z(i, 4, ChargersSelectedDiscountDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? ChargersDiscountTypeDto.EMPTY : chargersDiscountTypeDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = date;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = date2;
        }
    }

    public ChargersSelectedDiscountDto(ChargersDiscountTypeDto chargersDiscountTypeDto, String str, Date date, Date date2) {
        this.a = chargersDiscountTypeDto;
        this.b = str;
        this.c = date;
        this.d = date2;
    }
}
