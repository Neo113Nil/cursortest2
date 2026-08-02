package com.yandex.mobile.drive.scan;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/drive/scan/ScanReason;", "", "Registration", "Verification", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScanReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScanReason[] $VALUES;
    public static final ScanReason Registration;
    public static final ScanReason Verification;

    static {
        ScanReason scanReason = new ScanReason("Registration", 0);
        Registration = scanReason;
        ScanReason scanReason2 = new ScanReason("Verification", 1);
        Verification = scanReason2;
        ScanReason[] scanReasonArr = {scanReason, scanReason2};
        $VALUES = scanReasonArr;
        $ENTRIES = kotlin.enums.a.a(scanReasonArr);
    }

    public static ScanReason valueOf(String str) {
        return (ScanReason) Enum.valueOf(ScanReason.class, str);
    }

    public static ScanReason[] values() {
        return (ScanReason[]) $VALUES.clone();
    }
}
