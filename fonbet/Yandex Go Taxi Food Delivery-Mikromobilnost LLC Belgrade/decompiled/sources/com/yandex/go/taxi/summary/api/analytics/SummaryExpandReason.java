package com.yandex.go.taxi.summary.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/taxi/summary/api/analytics/SummaryExpandReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PULL", "HANDLER_TAP", "SELECTOR_TAP", "OPTIONS_TAP", "AUTO_REDIRECT", "AUTO_UNAVAILABLE_TARIFF_ON_ORDER", "AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER", "AUTO_GLUED_REQUIREMENT_ON_ORDER", "AUTO_MULTICLASS_ON_ORDER", "AUTO_SHUTTLE_ON_ORDER", "AUTO_ROUTE_DEEPLINK", "AUTO_REQUIREMENT_DEEPLINK", "AUTO_REMOVE_ALT_CHOICE_BUBBLE_CLICK", "AUTO_DELIVERY_REDIRECT_ACTION", "AUTO_SHORTCUT_REDIRECT_ACTION", "AUTO_SUMMARY_ORDER_BUTTON_EXPERIMENT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryExpandReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryExpandReason[] $VALUES;
    public static final SummaryExpandReason AUTO_DELIVERY_REDIRECT_ACTION;
    public static final SummaryExpandReason AUTO_GLUED_REQUIREMENT_ON_ORDER;
    public static final SummaryExpandReason AUTO_MULTICLASS_ON_ORDER;
    public static final SummaryExpandReason AUTO_REDIRECT;
    public static final SummaryExpandReason AUTO_REMOVE_ALT_CHOICE_BUBBLE_CLICK;
    public static final SummaryExpandReason AUTO_REQUIREMENT_DEEPLINK;
    public static final SummaryExpandReason AUTO_ROUTE_DEEPLINK;
    public static final SummaryExpandReason AUTO_SHORTCUT_REDIRECT_ACTION;
    public static final SummaryExpandReason AUTO_SHUTTLE_ON_ORDER;
    public static final SummaryExpandReason AUTO_SUMMARY_ORDER_BUTTON_EXPERIMENT;
    public static final SummaryExpandReason AUTO_UNAVAILABLE_TARIFF_ON_ORDER;
    public static final SummaryExpandReason AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER;
    public static final SummaryExpandReason HANDLER_TAP;
    public static final SummaryExpandReason OPTIONS_TAP;
    public static final SummaryExpandReason PULL;
    public static final SummaryExpandReason SELECTOR_TAP;
    private final String analyticsName;

    static {
        SummaryExpandReason summaryExpandReason = new SummaryExpandReason("PULL", 0, "pull");
        PULL = summaryExpandReason;
        SummaryExpandReason summaryExpandReason2 = new SummaryExpandReason("HANDLER_TAP", 1, "handler_tap");
        HANDLER_TAP = summaryExpandReason2;
        SummaryExpandReason summaryExpandReason3 = new SummaryExpandReason("SELECTOR_TAP", 2, "selector_tap");
        SELECTOR_TAP = summaryExpandReason3;
        SummaryExpandReason summaryExpandReason4 = new SummaryExpandReason("OPTIONS_TAP", 3, "options_tap");
        OPTIONS_TAP = summaryExpandReason4;
        SummaryExpandReason summaryExpandReason5 = new SummaryExpandReason("AUTO_REDIRECT", 4, "auto_redirect");
        AUTO_REDIRECT = summaryExpandReason5;
        SummaryExpandReason summaryExpandReason6 = new SummaryExpandReason("AUTO_UNAVAILABLE_TARIFF_ON_ORDER", 5, "auto_unavailable_tariff_on_order");
        AUTO_UNAVAILABLE_TARIFF_ON_ORDER = summaryExpandReason6;
        SummaryExpandReason summaryExpandReason7 = new SummaryExpandReason("AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER", 6, "auto_unsupported_requirement_on_order");
        AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER = summaryExpandReason7;
        SummaryExpandReason summaryExpandReason8 = new SummaryExpandReason("AUTO_GLUED_REQUIREMENT_ON_ORDER", 7, "auto_glued_requirement_on_order");
        AUTO_GLUED_REQUIREMENT_ON_ORDER = summaryExpandReason8;
        SummaryExpandReason summaryExpandReason9 = new SummaryExpandReason("AUTO_MULTICLASS_ON_ORDER", 8, "auto_multiclass_on_order");
        AUTO_MULTICLASS_ON_ORDER = summaryExpandReason9;
        SummaryExpandReason summaryExpandReason10 = new SummaryExpandReason("AUTO_SHUTTLE_ON_ORDER", 9, "auto_shuttle_on_order");
        AUTO_SHUTTLE_ON_ORDER = summaryExpandReason10;
        SummaryExpandReason summaryExpandReason11 = new SummaryExpandReason("AUTO_ROUTE_DEEPLINK", 10, "auto_route_deeplink");
        AUTO_ROUTE_DEEPLINK = summaryExpandReason11;
        SummaryExpandReason summaryExpandReason12 = new SummaryExpandReason("AUTO_REQUIREMENT_DEEPLINK", 11, "auto_requirement_deeplink");
        AUTO_REQUIREMENT_DEEPLINK = summaryExpandReason12;
        SummaryExpandReason summaryExpandReason13 = new SummaryExpandReason("AUTO_REMOVE_ALT_CHOICE_BUBBLE_CLICK", 12, "auto_remove_alt_choice_bubble_click");
        AUTO_REMOVE_ALT_CHOICE_BUBBLE_CLICK = summaryExpandReason13;
        SummaryExpandReason summaryExpandReason14 = new SummaryExpandReason("AUTO_DELIVERY_REDIRECT_ACTION", 13, "auto_delivery_redirect_action");
        AUTO_DELIVERY_REDIRECT_ACTION = summaryExpandReason14;
        SummaryExpandReason summaryExpandReason15 = new SummaryExpandReason("AUTO_SHORTCUT_REDIRECT_ACTION", 14, "auto_shortcut_redirect_action");
        AUTO_SHORTCUT_REDIRECT_ACTION = summaryExpandReason15;
        SummaryExpandReason summaryExpandReason16 = new SummaryExpandReason("AUTO_SUMMARY_ORDER_BUTTON_EXPERIMENT", 15, "auto_summary_order_button_experiment");
        AUTO_SUMMARY_ORDER_BUTTON_EXPERIMENT = summaryExpandReason16;
        SummaryExpandReason[] summaryExpandReasonArr = {summaryExpandReason, summaryExpandReason2, summaryExpandReason3, summaryExpandReason4, summaryExpandReason5, summaryExpandReason6, summaryExpandReason7, summaryExpandReason8, summaryExpandReason9, summaryExpandReason10, summaryExpandReason11, summaryExpandReason12, summaryExpandReason13, summaryExpandReason14, summaryExpandReason15, summaryExpandReason16};
        $VALUES = summaryExpandReasonArr;
        $ENTRIES = a.a(summaryExpandReasonArr);
    }

    public SummaryExpandReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static SummaryExpandReason valueOf(String str) {
        return (SummaryExpandReason) Enum.valueOf(SummaryExpandReason.class, str);
    }

    public static SummaryExpandReason[] values() {
        return (SummaryExpandReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
