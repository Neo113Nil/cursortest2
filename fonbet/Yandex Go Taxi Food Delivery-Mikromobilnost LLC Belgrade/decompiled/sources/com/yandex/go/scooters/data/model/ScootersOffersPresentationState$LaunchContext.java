package com.yandex.go.scooters.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/data/model/ScootersOffersPresentationState$LaunchContext", "", "Lcom/yandex/go/scooters/data/model/ScootersOffersPresentationState$LaunchContext;", "ON_MAP", "ON_CAMERA", "ON_MAP_AFTER_QR_SCAN", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOffersPresentationState$LaunchContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOffersPresentationState$LaunchContext[] $VALUES;
    public static final ScootersOffersPresentationState$LaunchContext ON_CAMERA;
    public static final ScootersOffersPresentationState$LaunchContext ON_MAP;
    public static final ScootersOffersPresentationState$LaunchContext ON_MAP_AFTER_QR_SCAN;

    static {
        ScootersOffersPresentationState$LaunchContext scootersOffersPresentationState$LaunchContext = new ScootersOffersPresentationState$LaunchContext("ON_MAP", 0);
        ON_MAP = scootersOffersPresentationState$LaunchContext;
        ScootersOffersPresentationState$LaunchContext scootersOffersPresentationState$LaunchContext2 = new ScootersOffersPresentationState$LaunchContext("ON_CAMERA", 1);
        ON_CAMERA = scootersOffersPresentationState$LaunchContext2;
        ScootersOffersPresentationState$LaunchContext scootersOffersPresentationState$LaunchContext3 = new ScootersOffersPresentationState$LaunchContext("ON_MAP_AFTER_QR_SCAN", 2);
        ON_MAP_AFTER_QR_SCAN = scootersOffersPresentationState$LaunchContext3;
        ScootersOffersPresentationState$LaunchContext[] scootersOffersPresentationState$LaunchContextArr = {scootersOffersPresentationState$LaunchContext, scootersOffersPresentationState$LaunchContext2, scootersOffersPresentationState$LaunchContext3};
        $VALUES = scootersOffersPresentationState$LaunchContextArr;
        $ENTRIES = kotlin.enums.a.a(scootersOffersPresentationState$LaunchContextArr);
    }

    public static ScootersOffersPresentationState$LaunchContext valueOf(String str) {
        return (ScootersOffersPresentationState$LaunchContext) Enum.valueOf(ScootersOffersPresentationState$LaunchContext.class, str);
    }

    public static ScootersOffersPresentationState$LaunchContext[] values() {
        return (ScootersOffersPresentationState$LaunchContext[]) $VALUES.clone();
    }
}
