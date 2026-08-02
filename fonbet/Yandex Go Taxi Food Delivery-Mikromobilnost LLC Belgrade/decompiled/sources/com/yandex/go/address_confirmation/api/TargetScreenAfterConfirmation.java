package com.yandex.go.address_confirmation.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/address_confirmation/api/TargetScreenAfterConfirmation;", "", "TAXI_MAIN", "SUMMARY", "go-client-android.features.address_confirmation:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TargetScreenAfterConfirmation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TargetScreenAfterConfirmation[] $VALUES;
    public static final TargetScreenAfterConfirmation SUMMARY;
    public static final TargetScreenAfterConfirmation TAXI_MAIN;

    static {
        TargetScreenAfterConfirmation targetScreenAfterConfirmation = new TargetScreenAfterConfirmation("TAXI_MAIN", 0);
        TAXI_MAIN = targetScreenAfterConfirmation;
        TargetScreenAfterConfirmation targetScreenAfterConfirmation2 = new TargetScreenAfterConfirmation("SUMMARY", 1);
        SUMMARY = targetScreenAfterConfirmation2;
        TargetScreenAfterConfirmation[] targetScreenAfterConfirmationArr = {targetScreenAfterConfirmation, targetScreenAfterConfirmation2};
        $VALUES = targetScreenAfterConfirmationArr;
        $ENTRIES = a.a(targetScreenAfterConfirmationArr);
    }

    public static TargetScreenAfterConfirmation valueOf(String str) {
        return (TargetScreenAfterConfirmation) Enum.valueOf(TargetScreenAfterConfirmation.class, str);
    }

    public static TargetScreenAfterConfirmation[] values() {
        return (TargetScreenAfterConfirmation[]) $VALUES.clone();
    }
}
