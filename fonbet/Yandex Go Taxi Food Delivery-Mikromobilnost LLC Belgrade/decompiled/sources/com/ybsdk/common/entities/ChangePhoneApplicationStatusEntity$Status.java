package com.ybsdk.common.entities;

import defpackage.k4o;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/ybsdk/common/entities/ChangePhoneApplicationStatusEntity$Status", "", "Lcom/ybsdk/common/entities/ChangePhoneApplicationStatusEntity$Status;", "", ACSPConstants.STATUS, "", "terminated", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "Z", "getTerminated", "()Z", "UNKNOWN", "PROCESSING", "FAILED", "SUCCESS", "READY_FOR_CONFIRMATION", "SMS_VERIFIED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangePhoneApplicationStatusEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangePhoneApplicationStatusEntity$Status[] $VALUES;
    private final String status;
    private final boolean terminated;
    public static final ChangePhoneApplicationStatusEntity$Status UNKNOWN = new ChangePhoneApplicationStatusEntity$Status("UNKNOWN", 0, "UNKNOWN", false);
    public static final ChangePhoneApplicationStatusEntity$Status PROCESSING = new ChangePhoneApplicationStatusEntity$Status("PROCESSING", 1, "PROCESSING", false);
    public static final ChangePhoneApplicationStatusEntity$Status FAILED = new ChangePhoneApplicationStatusEntity$Status("FAILED", 2, "FAILED", true);
    public static final ChangePhoneApplicationStatusEntity$Status SUCCESS = new ChangePhoneApplicationStatusEntity$Status("SUCCESS", 3, "SUCCESS", true);
    public static final ChangePhoneApplicationStatusEntity$Status READY_FOR_CONFIRMATION = new ChangePhoneApplicationStatusEntity$Status("READY_FOR_CONFIRMATION", 4, "READY_FOR_CONFIRMATION", true);
    public static final ChangePhoneApplicationStatusEntity$Status SMS_VERIFIED = new ChangePhoneApplicationStatusEntity$Status("SMS_VERIFIED", 5, "SMS_VERIFIED", false);

    private static final /* synthetic */ ChangePhoneApplicationStatusEntity$Status[] $values() {
        return new ChangePhoneApplicationStatusEntity$Status[]{UNKNOWN, PROCESSING, FAILED, SUCCESS, READY_FOR_CONFIRMATION, SMS_VERIFIED};
    }

    static {
        ChangePhoneApplicationStatusEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ChangePhoneApplicationStatusEntity$Status(String str, int i, String str2, boolean z) {
        this.status = str2;
        this.terminated = z;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ChangePhoneApplicationStatusEntity$Status valueOf(String str) {
        return (ChangePhoneApplicationStatusEntity$Status) Enum.valueOf(ChangePhoneApplicationStatusEntity$Status.class, str);
    }

    public static ChangePhoneApplicationStatusEntity$Status[] values() {
        return (ChangePhoneApplicationStatusEntity$Status[]) $VALUES.clone();
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getTerminated() {
        return this.terminated;
    }
}
