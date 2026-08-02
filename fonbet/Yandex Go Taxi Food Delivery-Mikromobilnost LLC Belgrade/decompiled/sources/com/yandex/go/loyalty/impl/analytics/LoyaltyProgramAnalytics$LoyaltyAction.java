package com.yandex.go.loyalty.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/loyalty/impl/analytics/LoyaltyProgramAnalytics$LoyaltyAction", "", "Lcom/yandex/go/loyalty/impl/analytics/LoyaltyProgramAnalytics$LoyaltyAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Select", "SignIn", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyProgramAnalytics$LoyaltyAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoyaltyProgramAnalytics$LoyaltyAction[] $VALUES;
    public static final LoyaltyProgramAnalytics$LoyaltyAction Select;
    public static final LoyaltyProgramAnalytics$LoyaltyAction SignIn;
    private final String eventValue;

    static {
        LoyaltyProgramAnalytics$LoyaltyAction loyaltyProgramAnalytics$LoyaltyAction = new LoyaltyProgramAnalytics$LoyaltyAction("Select", 0, "select");
        Select = loyaltyProgramAnalytics$LoyaltyAction;
        LoyaltyProgramAnalytics$LoyaltyAction loyaltyProgramAnalytics$LoyaltyAction2 = new LoyaltyProgramAnalytics$LoyaltyAction("SignIn", 1, "sign_in");
        SignIn = loyaltyProgramAnalytics$LoyaltyAction2;
        LoyaltyProgramAnalytics$LoyaltyAction[] loyaltyProgramAnalytics$LoyaltyActionArr = {loyaltyProgramAnalytics$LoyaltyAction, loyaltyProgramAnalytics$LoyaltyAction2};
        $VALUES = loyaltyProgramAnalytics$LoyaltyActionArr;
        $ENTRIES = a.a(loyaltyProgramAnalytics$LoyaltyActionArr);
    }

    public LoyaltyProgramAnalytics$LoyaltyAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static LoyaltyProgramAnalytics$LoyaltyAction valueOf(String str) {
        return (LoyaltyProgramAnalytics$LoyaltyAction) Enum.valueOf(LoyaltyProgramAnalytics$LoyaltyAction.class, str);
    }

    public static LoyaltyProgramAnalytics$LoyaltyAction[] values() {
        return (LoyaltyProgramAnalytics$LoyaltyAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
