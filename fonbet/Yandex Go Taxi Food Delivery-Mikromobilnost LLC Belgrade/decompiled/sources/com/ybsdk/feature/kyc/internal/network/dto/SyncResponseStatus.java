package com.ybsdk.feature.kyc.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/SyncResponseStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILED", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SyncResponseStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SyncResponseStatus[] $VALUES;
    public static final SyncResponseStatus SUCCESS = new SyncResponseStatus("SUCCESS", 0);
    public static final SyncResponseStatus FAILED = new SyncResponseStatus("FAILED", 1);

    private static final /* synthetic */ SyncResponseStatus[] $values() {
        return new SyncResponseStatus[]{SUCCESS, FAILED};
    }

    static {
        SyncResponseStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SyncResponseStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SyncResponseStatus valueOf(String str) {
        return (SyncResponseStatus) Enum.valueOf(SyncResponseStatus.class, str);
    }

    public static SyncResponseStatus[] values() {
        return (SyncResponseStatus[]) $VALUES.clone();
    }
}
