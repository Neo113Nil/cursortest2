package com.yandex.go.scooters.misc.common_dialog;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/misc/common_dialog/ScootersCommonDialogAnalytics$CloseReason", "", "Lcom/yandex/go/scooters/misc/common_dialog/ScootersCommonDialogAnalytics$CloseReason;", "", "closeReasonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BUTTON", "TOUCH_OUTSIDE", "BACK_PRESSED", "SLIDE_OUT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCommonDialogAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCommonDialogAnalytics$CloseReason[] $VALUES;
    public static final ScootersCommonDialogAnalytics$CloseReason BACK_PRESSED;
    public static final ScootersCommonDialogAnalytics$CloseReason BUTTON;
    public static final ScootersCommonDialogAnalytics$CloseReason SLIDE_OUT;
    public static final ScootersCommonDialogAnalytics$CloseReason TOUCH_OUTSIDE;
    private final String closeReasonName;

    static {
        ScootersCommonDialogAnalytics$CloseReason scootersCommonDialogAnalytics$CloseReason = new ScootersCommonDialogAnalytics$CloseReason("BUTTON", 0, "button");
        BUTTON = scootersCommonDialogAnalytics$CloseReason;
        ScootersCommonDialogAnalytics$CloseReason scootersCommonDialogAnalytics$CloseReason2 = new ScootersCommonDialogAnalytics$CloseReason("TOUCH_OUTSIDE", 1, "touch_outside");
        TOUCH_OUTSIDE = scootersCommonDialogAnalytics$CloseReason2;
        ScootersCommonDialogAnalytics$CloseReason scootersCommonDialogAnalytics$CloseReason3 = new ScootersCommonDialogAnalytics$CloseReason("BACK_PRESSED", 2, "back_pressed");
        BACK_PRESSED = scootersCommonDialogAnalytics$CloseReason3;
        ScootersCommonDialogAnalytics$CloseReason scootersCommonDialogAnalytics$CloseReason4 = new ScootersCommonDialogAnalytics$CloseReason("SLIDE_OUT", 3, "slide_out");
        SLIDE_OUT = scootersCommonDialogAnalytics$CloseReason4;
        ScootersCommonDialogAnalytics$CloseReason[] scootersCommonDialogAnalytics$CloseReasonArr = {scootersCommonDialogAnalytics$CloseReason, scootersCommonDialogAnalytics$CloseReason2, scootersCommonDialogAnalytics$CloseReason3, scootersCommonDialogAnalytics$CloseReason4};
        $VALUES = scootersCommonDialogAnalytics$CloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(scootersCommonDialogAnalytics$CloseReasonArr);
    }

    public ScootersCommonDialogAnalytics$CloseReason(String str, int i, String str2) {
        this.closeReasonName = str2;
    }

    public static ScootersCommonDialogAnalytics$CloseReason valueOf(String str) {
        return (ScootersCommonDialogAnalytics$CloseReason) Enum.valueOf(ScootersCommonDialogAnalytics$CloseReason.class, str);
    }

    public static ScootersCommonDialogAnalytics$CloseReason[] values() {
        return (ScootersCommonDialogAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCloseReasonName() {
        return this.closeReasonName;
    }
}
