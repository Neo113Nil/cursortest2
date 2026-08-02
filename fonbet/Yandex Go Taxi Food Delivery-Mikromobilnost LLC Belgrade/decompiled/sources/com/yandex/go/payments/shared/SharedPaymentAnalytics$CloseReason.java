package com.yandex.go.payments.shared;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/yandex/go/payments/shared/SharedPaymentAnalytics$CloseReason", "", "Lcom/yandex/go/payments/shared/SharedPaymentAnalytics$CloseReason;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BACK", "PARTICIPANT_SELECTED", "ADD_PARTICIPANT", "OUT_CARD", "ACTION_BUTTON", "DONE_BUTTON", "NO_BUTTON", "ANDROID_BACK_BUTTON", "OUT_ALERT", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharedPaymentAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharedPaymentAnalytics$CloseReason[] $VALUES;
    public static final SharedPaymentAnalytics$CloseReason ACTION_BUTTON;
    public static final SharedPaymentAnalytics$CloseReason ADD_PARTICIPANT;
    public static final SharedPaymentAnalytics$CloseReason ANDROID_BACK_BUTTON;
    public static final SharedPaymentAnalytics$CloseReason BACK;
    public static final SharedPaymentAnalytics$CloseReason DONE_BUTTON;
    public static final SharedPaymentAnalytics$CloseReason ERROR;
    public static final SharedPaymentAnalytics$CloseReason NO_BUTTON;
    public static final SharedPaymentAnalytics$CloseReason OUT_ALERT;
    public static final SharedPaymentAnalytics$CloseReason OUT_CARD;
    public static final SharedPaymentAnalytics$CloseReason PARTICIPANT_SELECTED;
    private final String analyticsName;

    static {
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason = new SharedPaymentAnalytics$CloseReason("BACK", 0, "back");
        BACK = sharedPaymentAnalytics$CloseReason;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason2 = new SharedPaymentAnalytics$CloseReason("PARTICIPANT_SELECTED", 1, "participant_selected");
        PARTICIPANT_SELECTED = sharedPaymentAnalytics$CloseReason2;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason3 = new SharedPaymentAnalytics$CloseReason("ADD_PARTICIPANT", 2, "add_participant");
        ADD_PARTICIPANT = sharedPaymentAnalytics$CloseReason3;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason4 = new SharedPaymentAnalytics$CloseReason("OUT_CARD", 3, "out_card");
        OUT_CARD = sharedPaymentAnalytics$CloseReason4;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason5 = new SharedPaymentAnalytics$CloseReason("ACTION_BUTTON", 4, "action_button");
        ACTION_BUTTON = sharedPaymentAnalytics$CloseReason5;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason6 = new SharedPaymentAnalytics$CloseReason("DONE_BUTTON", 5, "done_button");
        DONE_BUTTON = sharedPaymentAnalytics$CloseReason6;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason7 = new SharedPaymentAnalytics$CloseReason("NO_BUTTON", 6, "no_button");
        NO_BUTTON = sharedPaymentAnalytics$CloseReason7;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason8 = new SharedPaymentAnalytics$CloseReason("ANDROID_BACK_BUTTON", 7, "android_back_button");
        ANDROID_BACK_BUTTON = sharedPaymentAnalytics$CloseReason8;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason9 = new SharedPaymentAnalytics$CloseReason("OUT_ALERT", 8, "out_alert");
        OUT_ALERT = sharedPaymentAnalytics$CloseReason9;
        SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason10 = new SharedPaymentAnalytics$CloseReason("ERROR", 9, "error");
        ERROR = sharedPaymentAnalytics$CloseReason10;
        SharedPaymentAnalytics$CloseReason[] sharedPaymentAnalytics$CloseReasonArr = {sharedPaymentAnalytics$CloseReason, sharedPaymentAnalytics$CloseReason2, sharedPaymentAnalytics$CloseReason3, sharedPaymentAnalytics$CloseReason4, sharedPaymentAnalytics$CloseReason5, sharedPaymentAnalytics$CloseReason6, sharedPaymentAnalytics$CloseReason7, sharedPaymentAnalytics$CloseReason8, sharedPaymentAnalytics$CloseReason9, sharedPaymentAnalytics$CloseReason10};
        $VALUES = sharedPaymentAnalytics$CloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(sharedPaymentAnalytics$CloseReasonArr);
    }

    public SharedPaymentAnalytics$CloseReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static SharedPaymentAnalytics$CloseReason valueOf(String str) {
        return (SharedPaymentAnalytics$CloseReason) Enum.valueOf(SharedPaymentAnalytics$CloseReason.class, str);
    }

    public static SharedPaymentAnalytics$CloseReason[] values() {
        return (SharedPaymentAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
