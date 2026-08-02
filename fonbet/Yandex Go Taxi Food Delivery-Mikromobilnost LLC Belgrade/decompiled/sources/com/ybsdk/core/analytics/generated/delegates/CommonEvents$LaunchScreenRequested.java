package com.ybsdk.core.analytics.generated.delegates;

import com.adjust.sdk.Constants;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CommonEvents$LaunchScreenRequested", "", "Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$LaunchScreenRequested;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "TOPUP", "HOME", "REGISTRATION", "PRO", "DEEPLINK", "CHECK_CARD", "CREATE_CARD", "CREDIT_LIMIT_DASHBOARD", "CREATE_REBIND_PAYMENT_METHOD", "SPLIT_CONTRACT_DRAFT_FLOW", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonEvents$LaunchScreenRequested {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommonEvents$LaunchScreenRequested[] $VALUES;
    private final String originalValue;
    public static final CommonEvents$LaunchScreenRequested TOPUP = new CommonEvents$LaunchScreenRequested("TOPUP", 0, TopupFragment.WEBVIEW_NAME);
    public static final CommonEvents$LaunchScreenRequested HOME = new CommonEvents$LaunchScreenRequested("HOME", 1, "home");
    public static final CommonEvents$LaunchScreenRequested REGISTRATION = new CommonEvents$LaunchScreenRequested("REGISTRATION", 2, "registration");
    public static final CommonEvents$LaunchScreenRequested PRO = new CommonEvents$LaunchScreenRequested("PRO", 3, "pro");
    public static final CommonEvents$LaunchScreenRequested DEEPLINK = new CommonEvents$LaunchScreenRequested("DEEPLINK", 4, Constants.DEEPLINK);
    public static final CommonEvents$LaunchScreenRequested CHECK_CARD = new CommonEvents$LaunchScreenRequested("CHECK_CARD", 5, "check_card");
    public static final CommonEvents$LaunchScreenRequested CREATE_CARD = new CommonEvents$LaunchScreenRequested("CREATE_CARD", 6, "create_card");
    public static final CommonEvents$LaunchScreenRequested CREDIT_LIMIT_DASHBOARD = new CommonEvents$LaunchScreenRequested("CREDIT_LIMIT_DASHBOARD", 7, "credit_limit_dashboard");
    public static final CommonEvents$LaunchScreenRequested CREATE_REBIND_PAYMENT_METHOD = new CommonEvents$LaunchScreenRequested("CREATE_REBIND_PAYMENT_METHOD", 8, "create_rebind_payment_method");
    public static final CommonEvents$LaunchScreenRequested SPLIT_CONTRACT_DRAFT_FLOW = new CommonEvents$LaunchScreenRequested("SPLIT_CONTRACT_DRAFT_FLOW", 9, "split_contract_draft_flow");

    private static final /* synthetic */ CommonEvents$LaunchScreenRequested[] $values() {
        return new CommonEvents$LaunchScreenRequested[]{TOPUP, HOME, REGISTRATION, PRO, DEEPLINK, CHECK_CARD, CREATE_CARD, CREDIT_LIMIT_DASHBOARD, CREATE_REBIND_PAYMENT_METHOD, SPLIT_CONTRACT_DRAFT_FLOW};
    }

    static {
        CommonEvents$LaunchScreenRequested[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommonEvents$LaunchScreenRequested(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CommonEvents$LaunchScreenRequested valueOf(String str) {
        return (CommonEvents$LaunchScreenRequested) Enum.valueOf(CommonEvents$LaunchScreenRequested.class, str);
    }

    public static CommonEvents$LaunchScreenRequested[] values() {
        return (CommonEvents$LaunchScreenRequested[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
