package com.yandex.go.scooters.qr.analytics;

import com.yandex.go.scooters.analytics.ScootersQrCardAnalytics$CloseReason;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/scooters/qr/analytics/ScootersQrAnalytics$CloseReason", "", "Lcom/yandex/go/scooters/qr/analytics/ScootersQrAnalytics$CloseReason;", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$CloseReason;", "evgenValue", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$CloseReason;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$CloseReason;", "QR_SCANNED", "ENTERED_NUMBER", "ORDER_CREATED", "ANDROID_BACK_BUTTON", "ROLL_OFF", "BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrAnalytics$CloseReason[] $VALUES;
    public static final ScootersQrAnalytics$CloseReason ANDROID_BACK_BUTTON;
    public static final ScootersQrAnalytics$CloseReason BUTTON;
    public static final ScootersQrAnalytics$CloseReason ENTERED_NUMBER;
    public static final ScootersQrAnalytics$CloseReason ORDER_CREATED;
    public static final ScootersQrAnalytics$CloseReason QR_SCANNED;
    public static final ScootersQrAnalytics$CloseReason ROLL_OFF;
    private final ScootersQrCardAnalytics$CloseReason evgenValue;

    static {
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason = new ScootersQrAnalytics$CloseReason("QR_SCANNED", 0, ScootersQrCardAnalytics$CloseReason.QrScanned);
        QR_SCANNED = scootersQrAnalytics$CloseReason;
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason2 = new ScootersQrAnalytics$CloseReason("ENTERED_NUMBER", 1, ScootersQrCardAnalytics$CloseReason.EnteredNumber);
        ENTERED_NUMBER = scootersQrAnalytics$CloseReason2;
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason3 = new ScootersQrAnalytics$CloseReason("ORDER_CREATED", 2, ScootersQrCardAnalytics$CloseReason.OrderCreated);
        ORDER_CREATED = scootersQrAnalytics$CloseReason3;
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason4 = new ScootersQrAnalytics$CloseReason("ANDROID_BACK_BUTTON", 3, ScootersQrCardAnalytics$CloseReason.AndroidBackButton);
        ANDROID_BACK_BUTTON = scootersQrAnalytics$CloseReason4;
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason5 = new ScootersQrAnalytics$CloseReason("ROLL_OFF", 4, ScootersQrCardAnalytics$CloseReason.RollOff);
        ROLL_OFF = scootersQrAnalytics$CloseReason5;
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason6 = new ScootersQrAnalytics$CloseReason("BUTTON", 5, ScootersQrCardAnalytics$CloseReason.Button);
        BUTTON = scootersQrAnalytics$CloseReason6;
        ScootersQrAnalytics$CloseReason[] scootersQrAnalytics$CloseReasonArr = {scootersQrAnalytics$CloseReason, scootersQrAnalytics$CloseReason2, scootersQrAnalytics$CloseReason3, scootersQrAnalytics$CloseReason4, scootersQrAnalytics$CloseReason5, scootersQrAnalytics$CloseReason6};
        $VALUES = scootersQrAnalytics$CloseReasonArr;
        $ENTRIES = a.a(scootersQrAnalytics$CloseReasonArr);
    }

    public ScootersQrAnalytics$CloseReason(String str, int i, ScootersQrCardAnalytics$CloseReason scootersQrCardAnalytics$CloseReason) {
        this.evgenValue = scootersQrCardAnalytics$CloseReason;
    }

    public static ScootersQrAnalytics$CloseReason valueOf(String str) {
        return (ScootersQrAnalytics$CloseReason) Enum.valueOf(ScootersQrAnalytics$CloseReason.class, str);
    }

    public static ScootersQrAnalytics$CloseReason[] values() {
        return (ScootersQrAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersQrCardAnalytics$CloseReason getEvgenValue() {
        return this.evgenValue;
    }
}
