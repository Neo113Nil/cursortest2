package com.ybsdk.common.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/ybsdk/common/entities/ApplicationStatusEntity$Status", "", "Lcom/ybsdk/common/entities/ApplicationStatusEntity$Status;", "", "networkStatus", "", "terminated", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Ljava/lang/String;", "getNetworkStatus", "()Ljava/lang/String;", "Z", "getTerminated", "()Z", "UNKNOWN", "PROCESSING", "FAILED", "SUCCESS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplicationStatusEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplicationStatusEntity$Status[] $VALUES;
    private final String networkStatus;
    private final boolean terminated;
    public static final ApplicationStatusEntity$Status UNKNOWN = new ApplicationStatusEntity$Status("UNKNOWN", 0, "UNKNOWN", false);
    public static final ApplicationStatusEntity$Status PROCESSING = new ApplicationStatusEntity$Status("PROCESSING", 1, "PROCESSING", false);
    public static final ApplicationStatusEntity$Status FAILED = new ApplicationStatusEntity$Status("FAILED", 2, "FAILED", true);
    public static final ApplicationStatusEntity$Status SUCCESS = new ApplicationStatusEntity$Status("SUCCESS", 3, "SUCCESS", true);

    private static final /* synthetic */ ApplicationStatusEntity$Status[] $values() {
        return new ApplicationStatusEntity$Status[]{UNKNOWN, PROCESSING, FAILED, SUCCESS};
    }

    static {
        ApplicationStatusEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ApplicationStatusEntity$Status(String str, int i, String str2, boolean z) {
        this.networkStatus = str2;
        this.terminated = z;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ApplicationStatusEntity$Status valueOf(String str) {
        return (ApplicationStatusEntity$Status) Enum.valueOf(ApplicationStatusEntity$Status.class, str);
    }

    public static ApplicationStatusEntity$Status[] values() {
        return (ApplicationStatusEntity$Status[]) $VALUES.clone();
    }

    public final String getNetworkStatus() {
        return this.networkStatus;
    }

    public final boolean getTerminated() {
        return this.terminated;
    }
}
