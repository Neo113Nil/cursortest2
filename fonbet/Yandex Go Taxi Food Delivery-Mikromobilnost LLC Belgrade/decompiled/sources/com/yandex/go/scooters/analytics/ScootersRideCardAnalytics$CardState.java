package com.yandex.go.scooters.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersRideCardAnalytics$CardState", "", "Lcom/yandex/go/scooters/analytics/ScootersRideCardAnalytics$CardState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Normal", "Detailed", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersRideCardAnalytics$CardState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersRideCardAnalytics$CardState[] $VALUES;
    public static final ScootersRideCardAnalytics$CardState Detailed;
    public static final ScootersRideCardAnalytics$CardState Normal;
    private final String eventValue;

    static {
        ScootersRideCardAnalytics$CardState scootersRideCardAnalytics$CardState = new ScootersRideCardAnalytics$CardState("Normal", 0, Constants.NORMAL);
        Normal = scootersRideCardAnalytics$CardState;
        ScootersRideCardAnalytics$CardState scootersRideCardAnalytics$CardState2 = new ScootersRideCardAnalytics$CardState("Detailed", 1, "detailed");
        Detailed = scootersRideCardAnalytics$CardState2;
        ScootersRideCardAnalytics$CardState[] scootersRideCardAnalytics$CardStateArr = {scootersRideCardAnalytics$CardState, scootersRideCardAnalytics$CardState2};
        $VALUES = scootersRideCardAnalytics$CardStateArr;
        $ENTRIES = a.a(scootersRideCardAnalytics$CardStateArr);
    }

    public ScootersRideCardAnalytics$CardState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersRideCardAnalytics$CardState valueOf(String str) {
        return (ScootersRideCardAnalytics$CardState) Enum.valueOf(ScootersRideCardAnalytics$CardState.class, str);
    }

    public static ScootersRideCardAnalytics$CardState[] values() {
        return (ScootersRideCardAnalytics$CardState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
