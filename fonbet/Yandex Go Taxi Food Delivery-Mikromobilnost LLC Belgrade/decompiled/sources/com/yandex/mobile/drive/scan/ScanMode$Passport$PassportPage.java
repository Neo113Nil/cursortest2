package com.yandex.mobile.drive.scan;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/mobile/drive/scan/ScanMode$Passport$PassportPage", "", "Lcom/yandex/mobile/drive/scan/ScanMode$Passport$PassportPage;", "Bio", "Registration", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScanMode$Passport$PassportPage {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScanMode$Passport$PassportPage[] $VALUES;
    public static final ScanMode$Passport$PassportPage Bio;
    public static final ScanMode$Passport$PassportPage Registration;

    static {
        ScanMode$Passport$PassportPage scanMode$Passport$PassportPage = new ScanMode$Passport$PassportPage("Bio", 0);
        Bio = scanMode$Passport$PassportPage;
        ScanMode$Passport$PassportPage scanMode$Passport$PassportPage2 = new ScanMode$Passport$PassportPage("Registration", 1);
        Registration = scanMode$Passport$PassportPage2;
        ScanMode$Passport$PassportPage[] scanMode$Passport$PassportPageArr = {scanMode$Passport$PassportPage, scanMode$Passport$PassportPage2};
        $VALUES = scanMode$Passport$PassportPageArr;
        $ENTRIES = kotlin.enums.a.a(scanMode$Passport$PassportPageArr);
    }

    public static ScanMode$Passport$PassportPage valueOf(String str) {
        return (ScanMode$Passport$PassportPage) Enum.valueOf(ScanMode$Passport$PassportPage.class, str);
    }

    public static ScanMode$Passport$PassportPage[] values() {
        return (ScanMode$Passport$PassportPage[]) $VALUES.clone();
    }
}
