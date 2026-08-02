package com.yandex.go.scooters.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/api/domain/ScootersCompositePaymentInteractor$ScootersCompositePaymentState", "", "Lcom/yandex/go/scooters/api/domain/ScootersCompositePaymentInteractor$ScootersCompositePaymentState;", "ENABLED_CHECKED", "ENABLED_UNCHECKED", "DISABLED", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScootersCompositePaymentInteractor$ScootersCompositePaymentState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCompositePaymentInteractor$ScootersCompositePaymentState[] $VALUES;
    public static final ScootersCompositePaymentInteractor$ScootersCompositePaymentState DISABLED;
    public static final ScootersCompositePaymentInteractor$ScootersCompositePaymentState ENABLED_CHECKED;
    public static final ScootersCompositePaymentInteractor$ScootersCompositePaymentState ENABLED_UNCHECKED;

    static {
        ScootersCompositePaymentInteractor$ScootersCompositePaymentState scootersCompositePaymentInteractor$ScootersCompositePaymentState = new ScootersCompositePaymentInteractor$ScootersCompositePaymentState("ENABLED_CHECKED", 0);
        ENABLED_CHECKED = scootersCompositePaymentInteractor$ScootersCompositePaymentState;
        ScootersCompositePaymentInteractor$ScootersCompositePaymentState scootersCompositePaymentInteractor$ScootersCompositePaymentState2 = new ScootersCompositePaymentInteractor$ScootersCompositePaymentState("ENABLED_UNCHECKED", 1);
        ENABLED_UNCHECKED = scootersCompositePaymentInteractor$ScootersCompositePaymentState2;
        ScootersCompositePaymentInteractor$ScootersCompositePaymentState scootersCompositePaymentInteractor$ScootersCompositePaymentState3 = new ScootersCompositePaymentInteractor$ScootersCompositePaymentState("DISABLED", 2);
        DISABLED = scootersCompositePaymentInteractor$ScootersCompositePaymentState3;
        ScootersCompositePaymentInteractor$ScootersCompositePaymentState[] scootersCompositePaymentInteractor$ScootersCompositePaymentStateArr = {scootersCompositePaymentInteractor$ScootersCompositePaymentState, scootersCompositePaymentInteractor$ScootersCompositePaymentState2, scootersCompositePaymentInteractor$ScootersCompositePaymentState3};
        $VALUES = scootersCompositePaymentInteractor$ScootersCompositePaymentStateArr;
        $ENTRIES = a.a(scootersCompositePaymentInteractor$ScootersCompositePaymentStateArr);
    }

    public static ScootersCompositePaymentInteractor$ScootersCompositePaymentState valueOf(String str) {
        return (ScootersCompositePaymentInteractor$ScootersCompositePaymentState) Enum.valueOf(ScootersCompositePaymentInteractor$ScootersCompositePaymentState.class, str);
    }

    public static ScootersCompositePaymentInteractor$ScootersCompositePaymentState[] values() {
        return (ScootersCompositePaymentInteractor$ScootersCompositePaymentState[]) $VALUES.clone();
    }
}
