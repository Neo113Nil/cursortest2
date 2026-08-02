package com.ybsdk.feature.kyc.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/kyc/api/KycGeoRequest;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "OPTIONAL", "MANDATORY", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KycGeoRequest {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ KycGeoRequest[] $VALUES;
    public static final KycGeoRequest DISABLED = new KycGeoRequest("DISABLED", 0);
    public static final KycGeoRequest OPTIONAL = new KycGeoRequest("OPTIONAL", 1);
    public static final KycGeoRequest MANDATORY = new KycGeoRequest("MANDATORY", 2);

    private static final /* synthetic */ KycGeoRequest[] $values() {
        return new KycGeoRequest[]{DISABLED, OPTIONAL, MANDATORY};
    }

    static {
        KycGeoRequest[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KycGeoRequest(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static KycGeoRequest valueOf(String str) {
        return (KycGeoRequest) Enum.valueOf(KycGeoRequest.class, str);
    }

    public static KycGeoRequest[] values() {
        return (KycGeoRequest[]) $VALUES.clone();
    }
}
