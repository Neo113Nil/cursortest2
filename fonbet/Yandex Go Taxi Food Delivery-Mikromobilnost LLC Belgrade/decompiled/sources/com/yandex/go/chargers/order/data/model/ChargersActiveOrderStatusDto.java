package com.yandex.go.chargers.order.data.model;

import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wk9;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderStatusDto;", "", "Companion", "wk9", "CREATED", "RESERVATION", "EXECUTION", "LEASING", "CANCELED", TlsConstants.TLS_FINISHED, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersActiveOrderStatusDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ChargersActiveOrderStatusDto CANCELED;
    public static final ChargersActiveOrderStatusDto CREATED;
    public static final wk9 Companion;
    public static final ChargersActiveOrderStatusDto EXECUTION;
    public static final ChargersActiveOrderStatusDto FINISHED;
    public static final ChargersActiveOrderStatusDto LEASING;
    public static final ChargersActiveOrderStatusDto RESERVATION;

    static {
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto = new ChargersActiveOrderStatusDto("CREATED", 0);
        CREATED = chargersActiveOrderStatusDto;
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto2 = new ChargersActiveOrderStatusDto("RESERVATION", 1);
        RESERVATION = chargersActiveOrderStatusDto2;
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto3 = new ChargersActiveOrderStatusDto("EXECUTION", 2);
        EXECUTION = chargersActiveOrderStatusDto3;
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto4 = new ChargersActiveOrderStatusDto("LEASING", 3);
        LEASING = chargersActiveOrderStatusDto4;
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto5 = new ChargersActiveOrderStatusDto("CANCELED", 4);
        CANCELED = chargersActiveOrderStatusDto5;
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto6 = new ChargersActiveOrderStatusDto(TlsConstants.TLS_FINISHED, 5);
        FINISHED = chargersActiveOrderStatusDto6;
        ChargersActiveOrderStatusDto[] chargersActiveOrderStatusDtoArr = {chargersActiveOrderStatusDto, chargersActiveOrderStatusDto2, chargersActiveOrderStatusDto3, chargersActiveOrderStatusDto4, chargersActiveOrderStatusDto5, chargersActiveOrderStatusDto6};
        $VALUES = chargersActiveOrderStatusDtoArr;
        $ENTRIES = kotlin.enums.a.a(chargersActiveOrderStatusDtoArr);
        Companion = new wk9();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(15));
    }

    public static ChargersActiveOrderStatusDto valueOf(String str) {
        return (ChargersActiveOrderStatusDto) Enum.valueOf(ChargersActiveOrderStatusDto.class, str);
    }

    public static ChargersActiveOrderStatusDto[] values() {
        return (ChargersActiveOrderStatusDto[]) $VALUES.clone();
    }
}
