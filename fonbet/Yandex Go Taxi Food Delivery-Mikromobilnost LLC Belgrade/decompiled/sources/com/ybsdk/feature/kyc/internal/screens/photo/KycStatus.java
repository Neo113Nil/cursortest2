package com.ybsdk.feature.kyc.internal.screens.photo;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/KycStatus;", "", "<init>", "(Ljava/lang/String;I)V", "LOCATION_DEMAND", "LOCATION_DEADEND", "UPLOAD_IN_PROGRESS", "UPLOAD_IN_PROGRESS_TOO_LONG", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KycStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ KycStatus[] $VALUES;
    public static final KycStatus LOCATION_DEMAND = new KycStatus("LOCATION_DEMAND", 0);
    public static final KycStatus LOCATION_DEADEND = new KycStatus("LOCATION_DEADEND", 1);
    public static final KycStatus UPLOAD_IN_PROGRESS = new KycStatus("UPLOAD_IN_PROGRESS", 2);
    public static final KycStatus UPLOAD_IN_PROGRESS_TOO_LONG = new KycStatus("UPLOAD_IN_PROGRESS_TOO_LONG", 3);

    private static final /* synthetic */ KycStatus[] $values() {
        return new KycStatus[]{LOCATION_DEMAND, LOCATION_DEADEND, UPLOAD_IN_PROGRESS, UPLOAD_IN_PROGRESS_TOO_LONG};
    }

    static {
        KycStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private KycStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static KycStatus valueOf(String str) {
        return (KycStatus) Enum.valueOf(KycStatus.class, str);
    }

    public static KycStatus[] values() {
        return (KycStatus[]) $VALUES.clone();
    }
}
