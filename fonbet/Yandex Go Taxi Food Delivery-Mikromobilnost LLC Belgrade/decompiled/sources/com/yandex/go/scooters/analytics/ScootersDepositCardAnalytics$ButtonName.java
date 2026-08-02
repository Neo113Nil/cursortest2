package com.yandex.go.scooters.analytics;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/scooters/analytics/ScootersDepositCardAnalytics$ButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersDepositCardAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ok", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDepositCardAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDepositCardAnalytics$ButtonName[] $VALUES;
    public static final ScootersDepositCardAnalytics$ButtonName Ok;
    private final String eventValue = WriteBlocks.OK;

    static {
        ScootersDepositCardAnalytics$ButtonName scootersDepositCardAnalytics$ButtonName = new ScootersDepositCardAnalytics$ButtonName();
        Ok = scootersDepositCardAnalytics$ButtonName;
        ScootersDepositCardAnalytics$ButtonName[] scootersDepositCardAnalytics$ButtonNameArr = {scootersDepositCardAnalytics$ButtonName};
        $VALUES = scootersDepositCardAnalytics$ButtonNameArr;
        $ENTRIES = a.a(scootersDepositCardAnalytics$ButtonNameArr);
    }

    public static ScootersDepositCardAnalytics$ButtonName valueOf(String str) {
        return (ScootersDepositCardAnalytics$ButtonName) Enum.valueOf(ScootersDepositCardAnalytics$ButtonName.class, str);
    }

    public static ScootersDepositCardAnalytics$ButtonName[] values() {
        return (ScootersDepositCardAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
