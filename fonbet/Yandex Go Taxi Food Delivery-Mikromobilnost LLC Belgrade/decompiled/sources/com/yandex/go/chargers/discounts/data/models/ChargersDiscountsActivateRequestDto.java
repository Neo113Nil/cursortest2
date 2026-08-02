package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsActivateRequestDto;", "", "Companion", "ChargersDiscountsActivateStationInfo", "$serializer", "com/yandex/go/chargers/discounts/data/models/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsActivateRequestDto {
    public static final k Companion = new k();
    public final String a;
    public final String b;
    public final ChargersDiscountsActivateStationInfo c;
    public final zzs d;

    public /* synthetic */ ChargersDiscountsActivateRequestDto(int i, String str, String str2, ChargersDiscountsActivateStationInfo chargersDiscountsActivateStationInfo, zzs zzsVar) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ChargersDiscountsActivateRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = chargersDiscountsActivateStationInfo;
        this.d = zzsVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsActivateRequestDto$ChargersDiscountsActivateStationInfo;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersDiscountsActivateStationInfo {
        public static final j Companion = new j();
        public final String a;
        public final String b;

        public /* synthetic */ ChargersDiscountsActivateStationInfo(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, ChargersDiscountsActivateRequestDto$ChargersDiscountsActivateStationInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public ChargersDiscountsActivateStationInfo(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public ChargersDiscountsActivateRequestDto(String str, String str2, ChargersDiscountsActivateStationInfo chargersDiscountsActivateStationInfo, zzs zzsVar) {
        this.a = str;
        this.b = str2;
        this.c = chargersDiscountsActivateStationInfo;
        this.d = zzsVar;
    }
}
