package com.yandex.mobile.drive.account_manager;

import com.adjust.sdk.AdjustConfig;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/mobile/drive/account_manager/DrivePassportEnvironment;", "", "", "raw", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Production", "Testing", "drive_account_manager_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DrivePassportEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DrivePassportEnvironment[] $VALUES;
    public static final DrivePassportEnvironment Production;
    public static final DrivePassportEnvironment Testing;
    private final String raw;

    static {
        DrivePassportEnvironment drivePassportEnvironment = new DrivePassportEnvironment("Production", 0, AdjustConfig.ENVIRONMENT_PRODUCTION);
        Production = drivePassportEnvironment;
        DrivePassportEnvironment drivePassportEnvironment2 = new DrivePassportEnvironment("Testing", 1, "testing");
        Testing = drivePassportEnvironment2;
        DrivePassportEnvironment[] drivePassportEnvironmentArr = {drivePassportEnvironment, drivePassportEnvironment2};
        $VALUES = drivePassportEnvironmentArr;
        $ENTRIES = kotlin.enums.a.a(drivePassportEnvironmentArr);
    }

    public DrivePassportEnvironment(String str, int i, String str2) {
        this.raw = str2;
    }

    public static DrivePassportEnvironment valueOf(String str) {
        return (DrivePassportEnvironment) Enum.valueOf(DrivePassportEnvironment.class, str);
    }

    public static DrivePassportEnvironment[] values() {
        return (DrivePassportEnvironment[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRaw() {
        return this.raw;
    }
}
