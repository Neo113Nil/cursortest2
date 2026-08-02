package com.yandex.go.drive.unifiedpolling.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iem;
import defpackage.jbm;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/drive/unifiedpolling/dto/DriveOrderStatusDto;", "", "Companion", "iem", "RESERVATION_FREE", "RESERVATION_PAID", "ACCEPTANCE_FREE", "ACCEPTANCE_PAID", "RIDING", "PARKING", "UNRECOGNIZED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DriveOrderStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DriveOrderStatusDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final DriveOrderStatusDto ACCEPTANCE_FREE;
    public static final DriveOrderStatusDto ACCEPTANCE_PAID;
    public static final iem Companion;
    public static final DriveOrderStatusDto PARKING;
    public static final DriveOrderStatusDto RESERVATION_FREE;
    public static final DriveOrderStatusDto RESERVATION_PAID;
    public static final DriveOrderStatusDto RIDING;
    public static final DriveOrderStatusDto UNRECOGNIZED;

    static {
        DriveOrderStatusDto driveOrderStatusDto = new DriveOrderStatusDto("RESERVATION_FREE", 0);
        RESERVATION_FREE = driveOrderStatusDto;
        DriveOrderStatusDto driveOrderStatusDto2 = new DriveOrderStatusDto("RESERVATION_PAID", 1);
        RESERVATION_PAID = driveOrderStatusDto2;
        DriveOrderStatusDto driveOrderStatusDto3 = new DriveOrderStatusDto("ACCEPTANCE_FREE", 2);
        ACCEPTANCE_FREE = driveOrderStatusDto3;
        DriveOrderStatusDto driveOrderStatusDto4 = new DriveOrderStatusDto("ACCEPTANCE_PAID", 3);
        ACCEPTANCE_PAID = driveOrderStatusDto4;
        DriveOrderStatusDto driveOrderStatusDto5 = new DriveOrderStatusDto("RIDING", 4);
        RIDING = driveOrderStatusDto5;
        DriveOrderStatusDto driveOrderStatusDto6 = new DriveOrderStatusDto("PARKING", 5);
        PARKING = driveOrderStatusDto6;
        DriveOrderStatusDto driveOrderStatusDto7 = new DriveOrderStatusDto("UNRECOGNIZED", 6);
        UNRECOGNIZED = driveOrderStatusDto7;
        DriveOrderStatusDto[] driveOrderStatusDtoArr = {driveOrderStatusDto, driveOrderStatusDto2, driveOrderStatusDto3, driveOrderStatusDto4, driveOrderStatusDto5, driveOrderStatusDto6, driveOrderStatusDto7};
        $VALUES = driveOrderStatusDtoArr;
        $ENTRIES = kotlin.enums.a.a(driveOrderStatusDtoArr);
        Companion = new iem();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jbm(5));
    }

    public static DriveOrderStatusDto valueOf(String str) {
        return (DriveOrderStatusDto) Enum.valueOf(DriveOrderStatusDto.class, str);
    }

    public static DriveOrderStatusDto[] values() {
        return (DriveOrderStatusDto[]) $VALUES.clone();
    }
}
