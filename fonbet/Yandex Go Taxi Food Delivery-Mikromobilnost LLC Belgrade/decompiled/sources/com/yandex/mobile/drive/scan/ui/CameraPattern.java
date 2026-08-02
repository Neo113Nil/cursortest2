package com.yandex.mobile.drive.scan.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/drive/scan/ui/CameraPattern;", "", "Passport", "License", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CameraPattern {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CameraPattern[] $VALUES;
    public static final CameraPattern License;
    public static final CameraPattern Passport;

    static {
        CameraPattern cameraPattern = new CameraPattern("Passport", 0);
        Passport = cameraPattern;
        CameraPattern cameraPattern2 = new CameraPattern("License", 1);
        License = cameraPattern2;
        CameraPattern[] cameraPatternArr = {cameraPattern, cameraPattern2};
        $VALUES = cameraPatternArr;
        $ENTRIES = kotlin.enums.a.a(cameraPatternArr);
    }

    public static CameraPattern valueOf(String str) {
        return (CameraPattern) Enum.valueOf(CameraPattern.class, str);
    }

    public static CameraPattern[] values() {
        return (CameraPattern[]) $VALUES.clone();
    }
}
