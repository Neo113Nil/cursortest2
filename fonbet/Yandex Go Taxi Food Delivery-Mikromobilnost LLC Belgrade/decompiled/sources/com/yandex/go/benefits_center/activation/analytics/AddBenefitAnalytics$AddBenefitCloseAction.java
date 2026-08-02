package com.yandex.go.benefits_center.activation.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/benefits_center/activation/analytics/AddBenefitAnalytics$AddBenefitCloseAction", "", "Lcom/yandex/go/benefits_center/activation/analytics/AddBenefitAnalytics$AddBenefitCloseAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BackButton", "Swipe", "ApplyButton", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddBenefitAnalytics$AddBenefitCloseAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddBenefitAnalytics$AddBenefitCloseAction[] $VALUES;
    public static final AddBenefitAnalytics$AddBenefitCloseAction ApplyButton;
    public static final AddBenefitAnalytics$AddBenefitCloseAction BackButton;
    public static final AddBenefitAnalytics$AddBenefitCloseAction Swipe;
    private final String eventValue;

    static {
        AddBenefitAnalytics$AddBenefitCloseAction addBenefitAnalytics$AddBenefitCloseAction = new AddBenefitAnalytics$AddBenefitCloseAction("BackButton", 0, "back_button");
        BackButton = addBenefitAnalytics$AddBenefitCloseAction;
        AddBenefitAnalytics$AddBenefitCloseAction addBenefitAnalytics$AddBenefitCloseAction2 = new AddBenefitAnalytics$AddBenefitCloseAction("Swipe", 1, "swipe");
        Swipe = addBenefitAnalytics$AddBenefitCloseAction2;
        AddBenefitAnalytics$AddBenefitCloseAction addBenefitAnalytics$AddBenefitCloseAction3 = new AddBenefitAnalytics$AddBenefitCloseAction("ApplyButton", 2, "apply_button");
        ApplyButton = addBenefitAnalytics$AddBenefitCloseAction3;
        AddBenefitAnalytics$AddBenefitCloseAction[] addBenefitAnalytics$AddBenefitCloseActionArr = {addBenefitAnalytics$AddBenefitCloseAction, addBenefitAnalytics$AddBenefitCloseAction2, addBenefitAnalytics$AddBenefitCloseAction3};
        $VALUES = addBenefitAnalytics$AddBenefitCloseActionArr;
        $ENTRIES = a.a(addBenefitAnalytics$AddBenefitCloseActionArr);
    }

    public AddBenefitAnalytics$AddBenefitCloseAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AddBenefitAnalytics$AddBenefitCloseAction valueOf(String str) {
        return (AddBenefitAnalytics$AddBenefitCloseAction) Enum.valueOf(AddBenefitAnalytics$AddBenefitCloseAction.class, str);
    }

    public static AddBenefitAnalytics$AddBenefitCloseAction[] values() {
        return (AddBenefitAnalytics$AddBenefitCloseAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
