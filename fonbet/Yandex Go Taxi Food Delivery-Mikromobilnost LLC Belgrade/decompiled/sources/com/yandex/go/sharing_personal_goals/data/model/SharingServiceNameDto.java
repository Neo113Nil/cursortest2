package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mkr0;
import defpackage.vsr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingServiceNameDto;", "", "Companion", "vsr0", "SCOOTERS", "CHARGERS", "DRIVE", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingServiceNameDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharingServiceNameDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SharingServiceNameDto CHARGERS;
    public static final vsr0 Companion;
    public static final SharingServiceNameDto DRIVE;
    public static final SharingServiceNameDto NONE;
    public static final SharingServiceNameDto SCOOTERS;

    static {
        SharingServiceNameDto sharingServiceNameDto = new SharingServiceNameDto("SCOOTERS", 0);
        SCOOTERS = sharingServiceNameDto;
        SharingServiceNameDto sharingServiceNameDto2 = new SharingServiceNameDto("CHARGERS", 1);
        CHARGERS = sharingServiceNameDto2;
        SharingServiceNameDto sharingServiceNameDto3 = new SharingServiceNameDto("DRIVE", 2);
        DRIVE = sharingServiceNameDto3;
        SharingServiceNameDto sharingServiceNameDto4 = new SharingServiceNameDto(JCP.RAW_PREFIX, 3);
        NONE = sharingServiceNameDto4;
        SharingServiceNameDto[] sharingServiceNameDtoArr = {sharingServiceNameDto, sharingServiceNameDto2, sharingServiceNameDto3, sharingServiceNameDto4};
        $VALUES = sharingServiceNameDtoArr;
        $ENTRIES = kotlin.enums.a.a(sharingServiceNameDtoArr);
        Companion = new vsr0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(25));
    }

    public static SharingServiceNameDto valueOf(String str) {
        return (SharingServiceNameDto) Enum.valueOf(SharingServiceNameDto.class, str);
    }

    public static SharingServiceNameDto[] values() {
        return (SharingServiceNameDto[]) $VALUES.clone();
    }
}
