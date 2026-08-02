package com.yandex.mobile.drive.wallet;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/mobile/drive/wallet/DriveWalletGoErrorCode;", "", "", "raw", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MissingArguments", "MissingDelegate", "drive_wallet_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DriveWalletGoErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DriveWalletGoErrorCode[] $VALUES;
    public static final DriveWalletGoErrorCode MissingArguments;
    public static final DriveWalletGoErrorCode MissingDelegate;
    private final String raw;

    static {
        DriveWalletGoErrorCode driveWalletGoErrorCode = new DriveWalletGoErrorCode("MissingArguments", 0, "missing_argument");
        MissingArguments = driveWalletGoErrorCode;
        DriveWalletGoErrorCode driveWalletGoErrorCode2 = new DriveWalletGoErrorCode("MissingDelegate", 1, "missing_delegate");
        MissingDelegate = driveWalletGoErrorCode2;
        DriveWalletGoErrorCode[] driveWalletGoErrorCodeArr = {driveWalletGoErrorCode, driveWalletGoErrorCode2};
        $VALUES = driveWalletGoErrorCodeArr;
        $ENTRIES = a.a(driveWalletGoErrorCodeArr);
    }

    public DriveWalletGoErrorCode(String str, int i, String str2) {
        this.raw = str2;
    }

    public static DriveWalletGoErrorCode valueOf(String str) {
        return (DriveWalletGoErrorCode) Enum.valueOf(DriveWalletGoErrorCode.class, str);
    }

    public static DriveWalletGoErrorCode[] values() {
        return (DriveWalletGoErrorCode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRaw() {
        return this.raw;
    }
}
