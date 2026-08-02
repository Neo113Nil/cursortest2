package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gsq0;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountStationsRequestDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountStationsRequestDto {
    public static final c Companion = new c();
    public final ChargersDiscountDto a;
    public final zzs b;
    public final int c;
    public final int d;

    public /* synthetic */ ChargersDiscountStationsRequestDto(int i, ChargersDiscountDto chargersDiscountDto, zzs zzsVar, int i2, int i3) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ChargersDiscountStationsRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = chargersDiscountDto;
        this.b = zzsVar;
        this.c = i2;
        this.d = i3;
    }

    public ChargersDiscountStationsRequestDto(ChargersDiscountDto chargersDiscountDto, zzs zzsVar, int i) {
        this.a = chargersDiscountDto;
        this.b = zzsVar;
        this.c = 50;
        this.d = i;
    }
}
