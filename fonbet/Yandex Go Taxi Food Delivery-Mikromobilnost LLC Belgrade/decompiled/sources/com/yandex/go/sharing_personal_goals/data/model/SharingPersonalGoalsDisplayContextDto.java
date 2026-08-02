package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mkr0;
import defpackage.mrr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsDisplayContextDto;", "", "Companion", "mrr0", "OFFER_CARD", "RIDE_FINISH", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsDisplayContextDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharingPersonalGoalsDisplayContextDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final mrr0 Companion;
    public static final SharingPersonalGoalsDisplayContextDto NONE;
    public static final SharingPersonalGoalsDisplayContextDto OFFER_CARD;
    public static final SharingPersonalGoalsDisplayContextDto RIDE_FINISH;

    static {
        SharingPersonalGoalsDisplayContextDto sharingPersonalGoalsDisplayContextDto = new SharingPersonalGoalsDisplayContextDto("OFFER_CARD", 0);
        OFFER_CARD = sharingPersonalGoalsDisplayContextDto;
        SharingPersonalGoalsDisplayContextDto sharingPersonalGoalsDisplayContextDto2 = new SharingPersonalGoalsDisplayContextDto("RIDE_FINISH", 1);
        RIDE_FINISH = sharingPersonalGoalsDisplayContextDto2;
        SharingPersonalGoalsDisplayContextDto sharingPersonalGoalsDisplayContextDto3 = new SharingPersonalGoalsDisplayContextDto(JCP.RAW_PREFIX, 2);
        NONE = sharingPersonalGoalsDisplayContextDto3;
        SharingPersonalGoalsDisplayContextDto[] sharingPersonalGoalsDisplayContextDtoArr = {sharingPersonalGoalsDisplayContextDto, sharingPersonalGoalsDisplayContextDto2, sharingPersonalGoalsDisplayContextDto3};
        $VALUES = sharingPersonalGoalsDisplayContextDtoArr;
        $ENTRIES = kotlin.enums.a.a(sharingPersonalGoalsDisplayContextDtoArr);
        Companion = new mrr0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(16));
    }

    public static SharingPersonalGoalsDisplayContextDto valueOf(String str) {
        return (SharingPersonalGoalsDisplayContextDto) Enum.valueOf(SharingPersonalGoalsDisplayContextDto.class, str);
    }

    public static SharingPersonalGoalsDisplayContextDto[] values() {
        return (SharingPersonalGoalsDisplayContextDto[]) $VALUES.clone();
    }
}
