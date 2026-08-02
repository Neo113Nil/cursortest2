package com.yandex.go.chargers.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/chargers/domain/ChargersCompositePaymentInteractor$ChargersCompositePaymentState", "", "Lcom/yandex/go/chargers/domain/ChargersCompositePaymentInteractor$ChargersCompositePaymentState;", "ENABLED_CHECKED", "ENABLED_UNCHECKED", "DISABLED", "go-client-android.features.chargers:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersCompositePaymentInteractor$ChargersCompositePaymentState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersCompositePaymentInteractor$ChargersCompositePaymentState[] $VALUES;
    public static final ChargersCompositePaymentInteractor$ChargersCompositePaymentState DISABLED;
    public static final ChargersCompositePaymentInteractor$ChargersCompositePaymentState ENABLED_CHECKED;
    public static final ChargersCompositePaymentInteractor$ChargersCompositePaymentState ENABLED_UNCHECKED;

    static {
        ChargersCompositePaymentInteractor$ChargersCompositePaymentState chargersCompositePaymentInteractor$ChargersCompositePaymentState = new ChargersCompositePaymentInteractor$ChargersCompositePaymentState("ENABLED_CHECKED", 0);
        ENABLED_CHECKED = chargersCompositePaymentInteractor$ChargersCompositePaymentState;
        ChargersCompositePaymentInteractor$ChargersCompositePaymentState chargersCompositePaymentInteractor$ChargersCompositePaymentState2 = new ChargersCompositePaymentInteractor$ChargersCompositePaymentState("ENABLED_UNCHECKED", 1);
        ENABLED_UNCHECKED = chargersCompositePaymentInteractor$ChargersCompositePaymentState2;
        ChargersCompositePaymentInteractor$ChargersCompositePaymentState chargersCompositePaymentInteractor$ChargersCompositePaymentState3 = new ChargersCompositePaymentInteractor$ChargersCompositePaymentState("DISABLED", 2);
        DISABLED = chargersCompositePaymentInteractor$ChargersCompositePaymentState3;
        ChargersCompositePaymentInteractor$ChargersCompositePaymentState[] chargersCompositePaymentInteractor$ChargersCompositePaymentStateArr = {chargersCompositePaymentInteractor$ChargersCompositePaymentState, chargersCompositePaymentInteractor$ChargersCompositePaymentState2, chargersCompositePaymentInteractor$ChargersCompositePaymentState3};
        $VALUES = chargersCompositePaymentInteractor$ChargersCompositePaymentStateArr;
        $ENTRIES = kotlin.enums.a.a(chargersCompositePaymentInteractor$ChargersCompositePaymentStateArr);
    }

    public static ChargersCompositePaymentInteractor$ChargersCompositePaymentState valueOf(String str) {
        return (ChargersCompositePaymentInteractor$ChargersCompositePaymentState) Enum.valueOf(ChargersCompositePaymentInteractor$ChargersCompositePaymentState.class, str);
    }

    public static ChargersCompositePaymentInteractor$ChargersCompositePaymentState[] values() {
        return (ChargersCompositePaymentInteractor$ChargersCompositePaymentState[]) $VALUES.clone();
    }
}
