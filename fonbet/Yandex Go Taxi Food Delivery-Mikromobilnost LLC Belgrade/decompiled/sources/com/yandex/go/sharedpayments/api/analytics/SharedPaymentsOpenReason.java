package com.yandex.go.sharedpayments.api.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/sharedpayments/api/analytics/SharedPaymentsOpenReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BUSINESS_ACCOUNT", "MENU", "PAYMENT_MENU", "PAYMENT_SUMMARY", "GROUP_ACCOUNT_SCREEN", "PARTICIPANTS_LIST_CARD", "LIMITS_CARD", "SETTINGS", "OLD_ONBOARDING_SCREEN", "PARTICIPANT_CARD", "CREATE_CORP", "AB_CHOOSER", "DEEPLINK", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SharedPaymentsOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharedPaymentsOpenReason[] $VALUES;
    public static final SharedPaymentsOpenReason AB_CHOOSER;
    public static final SharedPaymentsOpenReason BUSINESS_ACCOUNT;
    public static final SharedPaymentsOpenReason CREATE_CORP;
    public static final SharedPaymentsOpenReason DEEPLINK;
    public static final SharedPaymentsOpenReason GROUP_ACCOUNT_SCREEN;
    public static final SharedPaymentsOpenReason LIMITS_CARD;
    public static final SharedPaymentsOpenReason MENU;
    public static final SharedPaymentsOpenReason OLD_ONBOARDING_SCREEN;
    public static final SharedPaymentsOpenReason PARTICIPANTS_LIST_CARD;
    public static final SharedPaymentsOpenReason PARTICIPANT_CARD;
    public static final SharedPaymentsOpenReason PAYMENT_MENU;
    public static final SharedPaymentsOpenReason PAYMENT_SUMMARY;
    public static final SharedPaymentsOpenReason SETTINGS;
    public static final SharedPaymentsOpenReason UNKNOWN;
    private final String analyticsName;

    static {
        SharedPaymentsOpenReason sharedPaymentsOpenReason = new SharedPaymentsOpenReason("BUSINESS_ACCOUNT", 0, "business_account");
        BUSINESS_ACCOUNT = sharedPaymentsOpenReason;
        SharedPaymentsOpenReason sharedPaymentsOpenReason2 = new SharedPaymentsOpenReason("MENU", 1, "menu");
        MENU = sharedPaymentsOpenReason2;
        SharedPaymentsOpenReason sharedPaymentsOpenReason3 = new SharedPaymentsOpenReason("PAYMENT_MENU", 2, "payment_menu");
        PAYMENT_MENU = sharedPaymentsOpenReason3;
        SharedPaymentsOpenReason sharedPaymentsOpenReason4 = new SharedPaymentsOpenReason("PAYMENT_SUMMARY", 3, "payment_summary");
        PAYMENT_SUMMARY = sharedPaymentsOpenReason4;
        SharedPaymentsOpenReason sharedPaymentsOpenReason5 = new SharedPaymentsOpenReason("GROUP_ACCOUNT_SCREEN", 4, "group_account_screen");
        GROUP_ACCOUNT_SCREEN = sharedPaymentsOpenReason5;
        SharedPaymentsOpenReason sharedPaymentsOpenReason6 = new SharedPaymentsOpenReason("PARTICIPANTS_LIST_CARD", 5, "participants_list_card");
        PARTICIPANTS_LIST_CARD = sharedPaymentsOpenReason6;
        SharedPaymentsOpenReason sharedPaymentsOpenReason7 = new SharedPaymentsOpenReason("LIMITS_CARD", 6, "limits_card");
        LIMITS_CARD = sharedPaymentsOpenReason7;
        SharedPaymentsOpenReason sharedPaymentsOpenReason8 = new SharedPaymentsOpenReason("SETTINGS", 7, "settings");
        SETTINGS = sharedPaymentsOpenReason8;
        SharedPaymentsOpenReason sharedPaymentsOpenReason9 = new SharedPaymentsOpenReason("OLD_ONBOARDING_SCREEN", 8, "old_onboarding_screen");
        OLD_ONBOARDING_SCREEN = sharedPaymentsOpenReason9;
        SharedPaymentsOpenReason sharedPaymentsOpenReason10 = new SharedPaymentsOpenReason("PARTICIPANT_CARD", 9, "participant_card");
        PARTICIPANT_CARD = sharedPaymentsOpenReason10;
        SharedPaymentsOpenReason sharedPaymentsOpenReason11 = new SharedPaymentsOpenReason("CREATE_CORP", 10, "create_corp");
        CREATE_CORP = sharedPaymentsOpenReason11;
        SharedPaymentsOpenReason sharedPaymentsOpenReason12 = new SharedPaymentsOpenReason("AB_CHOOSER", 11, "ab_chooser");
        AB_CHOOSER = sharedPaymentsOpenReason12;
        SharedPaymentsOpenReason sharedPaymentsOpenReason13 = new SharedPaymentsOpenReason("DEEPLINK", 12, Constants.DEEPLINK);
        DEEPLINK = sharedPaymentsOpenReason13;
        SharedPaymentsOpenReason sharedPaymentsOpenReason14 = new SharedPaymentsOpenReason("UNKNOWN", 13, "unknown");
        UNKNOWN = sharedPaymentsOpenReason14;
        SharedPaymentsOpenReason[] sharedPaymentsOpenReasonArr = {sharedPaymentsOpenReason, sharedPaymentsOpenReason2, sharedPaymentsOpenReason3, sharedPaymentsOpenReason4, sharedPaymentsOpenReason5, sharedPaymentsOpenReason6, sharedPaymentsOpenReason7, sharedPaymentsOpenReason8, sharedPaymentsOpenReason9, sharedPaymentsOpenReason10, sharedPaymentsOpenReason11, sharedPaymentsOpenReason12, sharedPaymentsOpenReason13, sharedPaymentsOpenReason14};
        $VALUES = sharedPaymentsOpenReasonArr;
        $ENTRIES = a.a(sharedPaymentsOpenReasonArr);
    }

    public SharedPaymentsOpenReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static SharedPaymentsOpenReason valueOf(String str) {
        return (SharedPaymentsOpenReason) Enum.valueOf(SharedPaymentsOpenReason.class, str);
    }

    public static SharedPaymentsOpenReason[] values() {
        return (SharedPaymentsOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
