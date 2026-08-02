package com.yandex.mobile.drive.scan;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/mobile/drive/scan/ScanMode$DriverLicense$LicenseSide", "", "Lcom/yandex/mobile/drive/scan/ScanMode$DriverLicense$LicenseSide;", "Front", "Back", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScanMode$DriverLicense$LicenseSide {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScanMode$DriverLicense$LicenseSide[] $VALUES;
    public static final ScanMode$DriverLicense$LicenseSide Back;
    public static final ScanMode$DriverLicense$LicenseSide Front;

    static {
        ScanMode$DriverLicense$LicenseSide scanMode$DriverLicense$LicenseSide = new ScanMode$DriverLicense$LicenseSide("Front", 0);
        Front = scanMode$DriverLicense$LicenseSide;
        ScanMode$DriverLicense$LicenseSide scanMode$DriverLicense$LicenseSide2 = new ScanMode$DriverLicense$LicenseSide("Back", 1);
        Back = scanMode$DriverLicense$LicenseSide2;
        ScanMode$DriverLicense$LicenseSide[] scanMode$DriverLicense$LicenseSideArr = {scanMode$DriverLicense$LicenseSide, scanMode$DriverLicense$LicenseSide2};
        $VALUES = scanMode$DriverLicense$LicenseSideArr;
        $ENTRIES = kotlin.enums.a.a(scanMode$DriverLicense$LicenseSideArr);
    }

    public static ScanMode$DriverLicense$LicenseSide valueOf(String str) {
        return (ScanMode$DriverLicense$LicenseSide) Enum.valueOf(ScanMode$DriverLicense$LicenseSide.class, str);
    }

    public static ScanMode$DriverLicense$LicenseSide[] values() {
        return (ScanMode$DriverLicense$LicenseSide[]) $VALUES.clone();
    }
}
