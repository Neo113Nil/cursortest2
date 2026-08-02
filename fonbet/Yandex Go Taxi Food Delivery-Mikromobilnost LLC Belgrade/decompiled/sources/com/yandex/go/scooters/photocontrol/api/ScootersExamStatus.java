package com.yandex.go.scooters.photocontrol.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/api/ScootersExamStatus;", "", "IN_PROGRESS", "SUCCESS", "FAILED", "IMPOSSIBLE", "NOT_REQUIRED", "go-client-android.features.scooters.photocontrol:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersExamStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersExamStatus[] $VALUES;
    public static final ScootersExamStatus FAILED;
    public static final ScootersExamStatus IMPOSSIBLE;
    public static final ScootersExamStatus IN_PROGRESS;
    public static final ScootersExamStatus NOT_REQUIRED;
    public static final ScootersExamStatus SUCCESS;

    static {
        ScootersExamStatus scootersExamStatus = new ScootersExamStatus("IN_PROGRESS", 0);
        IN_PROGRESS = scootersExamStatus;
        ScootersExamStatus scootersExamStatus2 = new ScootersExamStatus("SUCCESS", 1);
        SUCCESS = scootersExamStatus2;
        ScootersExamStatus scootersExamStatus3 = new ScootersExamStatus("FAILED", 2);
        FAILED = scootersExamStatus3;
        ScootersExamStatus scootersExamStatus4 = new ScootersExamStatus("IMPOSSIBLE", 3);
        IMPOSSIBLE = scootersExamStatus4;
        ScootersExamStatus scootersExamStatus5 = new ScootersExamStatus("NOT_REQUIRED", 4);
        NOT_REQUIRED = scootersExamStatus5;
        ScootersExamStatus[] scootersExamStatusArr = {scootersExamStatus, scootersExamStatus2, scootersExamStatus3, scootersExamStatus4, scootersExamStatus5};
        $VALUES = scootersExamStatusArr;
        $ENTRIES = a.a(scootersExamStatusArr);
    }

    public static ScootersExamStatus valueOf(String str) {
        return (ScootersExamStatus) Enum.valueOf(ScootersExamStatus.class, str);
    }

    public static ScootersExamStatus[] values() {
        return (ScootersExamStatus[]) $VALUES.clone();
    }
}
