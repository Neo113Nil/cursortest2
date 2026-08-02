package com.yandex.go.scooters.analytics;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersDepositCardAnalytics$CloseReason", "", "Lcom/yandex/go/scooters/analytics/ScootersDepositCardAnalytics$CloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", PlusPayUiKitInflaterFactory.NAME_BUTTON, "TouchOutside", "BackPressed", "SlideOut", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDepositCardAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDepositCardAnalytics$CloseReason[] $VALUES;
    public static final ScootersDepositCardAnalytics$CloseReason BackPressed;
    public static final ScootersDepositCardAnalytics$CloseReason Button;
    public static final ScootersDepositCardAnalytics$CloseReason SlideOut;
    public static final ScootersDepositCardAnalytics$CloseReason TouchOutside;
    private final String eventValue;

    static {
        ScootersDepositCardAnalytics$CloseReason scootersDepositCardAnalytics$CloseReason = new ScootersDepositCardAnalytics$CloseReason(PlusPayUiKitInflaterFactory.NAME_BUTTON, 0, "button");
        Button = scootersDepositCardAnalytics$CloseReason;
        ScootersDepositCardAnalytics$CloseReason scootersDepositCardAnalytics$CloseReason2 = new ScootersDepositCardAnalytics$CloseReason("TouchOutside", 1, "touch_outside");
        TouchOutside = scootersDepositCardAnalytics$CloseReason2;
        ScootersDepositCardAnalytics$CloseReason scootersDepositCardAnalytics$CloseReason3 = new ScootersDepositCardAnalytics$CloseReason("BackPressed", 2, "back_pressed");
        BackPressed = scootersDepositCardAnalytics$CloseReason3;
        ScootersDepositCardAnalytics$CloseReason scootersDepositCardAnalytics$CloseReason4 = new ScootersDepositCardAnalytics$CloseReason("SlideOut", 3, "slide_out");
        SlideOut = scootersDepositCardAnalytics$CloseReason4;
        ScootersDepositCardAnalytics$CloseReason[] scootersDepositCardAnalytics$CloseReasonArr = {scootersDepositCardAnalytics$CloseReason, scootersDepositCardAnalytics$CloseReason2, scootersDepositCardAnalytics$CloseReason3, scootersDepositCardAnalytics$CloseReason4};
        $VALUES = scootersDepositCardAnalytics$CloseReasonArr;
        $ENTRIES = a.a(scootersDepositCardAnalytics$CloseReasonArr);
    }

    public ScootersDepositCardAnalytics$CloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersDepositCardAnalytics$CloseReason valueOf(String str) {
        return (ScootersDepositCardAnalytics$CloseReason) Enum.valueOf(ScootersDepositCardAnalytics$CloseReason.class, str);
    }

    public static ScootersDepositCardAnalytics$CloseReason[] values() {
        return (ScootersDepositCardAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
