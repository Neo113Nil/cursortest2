package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersDebtAnalytics$CloseReason", "", "Lcom/yandex/go/scooters/analytics/ScootersDebtAnalytics$CloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "DebtPaid", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDebtAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDebtAnalytics$CloseReason[] $VALUES;
    public static final ScootersDebtAnalytics$CloseReason Back;
    public static final ScootersDebtAnalytics$CloseReason DebtPaid;
    private final String eventValue;

    static {
        ScootersDebtAnalytics$CloseReason scootersDebtAnalytics$CloseReason = new ScootersDebtAnalytics$CloseReason("Back", 0, "back");
        Back = scootersDebtAnalytics$CloseReason;
        ScootersDebtAnalytics$CloseReason scootersDebtAnalytics$CloseReason2 = new ScootersDebtAnalytics$CloseReason("DebtPaid", 1, "debt_paid");
        DebtPaid = scootersDebtAnalytics$CloseReason2;
        ScootersDebtAnalytics$CloseReason[] scootersDebtAnalytics$CloseReasonArr = {scootersDebtAnalytics$CloseReason, scootersDebtAnalytics$CloseReason2};
        $VALUES = scootersDebtAnalytics$CloseReasonArr;
        $ENTRIES = a.a(scootersDebtAnalytics$CloseReasonArr);
    }

    public ScootersDebtAnalytics$CloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersDebtAnalytics$CloseReason valueOf(String str) {
        return (ScootersDebtAnalytics$CloseReason) Enum.valueOf(ScootersDebtAnalytics$CloseReason.class, str);
    }

    public static ScootersDebtAnalytics$CloseReason[] values() {
        return (ScootersDebtAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
