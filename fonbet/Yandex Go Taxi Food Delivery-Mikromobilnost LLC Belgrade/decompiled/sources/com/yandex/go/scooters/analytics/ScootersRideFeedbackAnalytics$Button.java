package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersRideFeedbackAnalytics$Button", "", "Lcom/yandex/go/scooters/analytics/ScootersRideFeedbackAnalytics$Button;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Done", "Charity", "Dialog", "NewbieHelpItem", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersRideFeedbackAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersRideFeedbackAnalytics$Button[] $VALUES;
    public static final ScootersRideFeedbackAnalytics$Button Charity;
    public static final ScootersRideFeedbackAnalytics$Button Dialog;
    public static final ScootersRideFeedbackAnalytics$Button Done;
    public static final ScootersRideFeedbackAnalytics$Button NewbieHelpItem;
    private final String eventValue;

    static {
        ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button = new ScootersRideFeedbackAnalytics$Button("Done", 0, "done");
        Done = scootersRideFeedbackAnalytics$Button;
        ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button2 = new ScootersRideFeedbackAnalytics$Button("Charity", 1, "charity");
        Charity = scootersRideFeedbackAnalytics$Button2;
        ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button3 = new ScootersRideFeedbackAnalytics$Button("Dialog", 2, "dialog");
        Dialog = scootersRideFeedbackAnalytics$Button3;
        ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button4 = new ScootersRideFeedbackAnalytics$Button("NewbieHelpItem", 3, "newbie_help_item");
        NewbieHelpItem = scootersRideFeedbackAnalytics$Button4;
        ScootersRideFeedbackAnalytics$Button[] scootersRideFeedbackAnalytics$ButtonArr = {scootersRideFeedbackAnalytics$Button, scootersRideFeedbackAnalytics$Button2, scootersRideFeedbackAnalytics$Button3, scootersRideFeedbackAnalytics$Button4};
        $VALUES = scootersRideFeedbackAnalytics$ButtonArr;
        $ENTRIES = a.a(scootersRideFeedbackAnalytics$ButtonArr);
    }

    public ScootersRideFeedbackAnalytics$Button(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersRideFeedbackAnalytics$Button valueOf(String str) {
        return (ScootersRideFeedbackAnalytics$Button) Enum.valueOf(ScootersRideFeedbackAnalytics$Button.class, str);
    }

    public static ScootersRideFeedbackAnalytics$Button[] values() {
        return (ScootersRideFeedbackAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
