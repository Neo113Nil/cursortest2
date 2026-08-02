package com.yandex.mobile.drive.scan;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/mobile/drive/scan/ScanMode$Selfie$SelfieWith", "", "Lcom/yandex/mobile/drive/scan/ScanMode$Selfie$SelfieWith;", "License", "Passport", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScanMode$Selfie$SelfieWith {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScanMode$Selfie$SelfieWith[] $VALUES;
    public static final ScanMode$Selfie$SelfieWith License;
    public static final ScanMode$Selfie$SelfieWith Passport;

    static {
        ScanMode$Selfie$SelfieWith scanMode$Selfie$SelfieWith = new ScanMode$Selfie$SelfieWith("License", 0);
        License = scanMode$Selfie$SelfieWith;
        ScanMode$Selfie$SelfieWith scanMode$Selfie$SelfieWith2 = new ScanMode$Selfie$SelfieWith("Passport", 1);
        Passport = scanMode$Selfie$SelfieWith2;
        ScanMode$Selfie$SelfieWith[] scanMode$Selfie$SelfieWithArr = {scanMode$Selfie$SelfieWith, scanMode$Selfie$SelfieWith2};
        $VALUES = scanMode$Selfie$SelfieWithArr;
        $ENTRIES = kotlin.enums.a.a(scanMode$Selfie$SelfieWithArr);
    }

    public static ScanMode$Selfie$SelfieWith valueOf(String str) {
        return (ScanMode$Selfie$SelfieWith) Enum.valueOf(ScanMode$Selfie$SelfieWith.class, str);
    }

    public static ScanMode$Selfie$SelfieWith[] values() {
        return (ScanMode$Selfie$SelfieWith[]) $VALUES.clone();
    }
}
