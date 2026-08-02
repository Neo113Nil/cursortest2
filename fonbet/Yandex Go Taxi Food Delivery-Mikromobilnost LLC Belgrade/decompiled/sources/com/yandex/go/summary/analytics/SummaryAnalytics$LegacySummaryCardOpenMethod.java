package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$LegacySummaryCardOpenMethod", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$LegacySummaryCardOpenMethod;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Pull", "HandlerTap", "SelectorTap", "OptionsTap", "AutoRedirect", "AutoUnavailableTariffOnOrder", "AutoUnsupportedRequirementOnOrder", "AutoGluedRequirementOnOrder", "AutoMulticlassOnOrder", "AutoShuttleOnOrder", "AutoRouteDeeplink", "AutoRequirementDeeplink", "AutoRemoveAltChoiceBubbleClick", "AutoDeliveryRedirectAction", "AutoShortcutRedirectAction", "AutoSummaryOrderButtonExperiment", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$LegacySummaryCardOpenMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$LegacySummaryCardOpenMethod[] $VALUES;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoDeliveryRedirectAction;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoGluedRequirementOnOrder;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoMulticlassOnOrder;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoRedirect;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoRemoveAltChoiceBubbleClick;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoRequirementDeeplink;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoRouteDeeplink;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoShortcutRedirectAction;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoShuttleOnOrder;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoSummaryOrderButtonExperiment;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoUnavailableTariffOnOrder;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod AutoUnsupportedRequirementOnOrder;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod HandlerTap;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod OptionsTap;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod Pull;
    public static final SummaryAnalytics$LegacySummaryCardOpenMethod SelectorTap;
    private final String eventValue;

    static {
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod = new SummaryAnalytics$LegacySummaryCardOpenMethod("Pull", 0, "pull");
        Pull = summaryAnalytics$LegacySummaryCardOpenMethod;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod2 = new SummaryAnalytics$LegacySummaryCardOpenMethod("HandlerTap", 1, "handler_tap");
        HandlerTap = summaryAnalytics$LegacySummaryCardOpenMethod2;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod3 = new SummaryAnalytics$LegacySummaryCardOpenMethod("SelectorTap", 2, "selector_tap");
        SelectorTap = summaryAnalytics$LegacySummaryCardOpenMethod3;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod4 = new SummaryAnalytics$LegacySummaryCardOpenMethod("OptionsTap", 3, "options_tap");
        OptionsTap = summaryAnalytics$LegacySummaryCardOpenMethod4;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod5 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoRedirect", 4, "auto_redirect");
        AutoRedirect = summaryAnalytics$LegacySummaryCardOpenMethod5;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod6 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoUnavailableTariffOnOrder", 5, "auto_unavailable_tariff_on_order");
        AutoUnavailableTariffOnOrder = summaryAnalytics$LegacySummaryCardOpenMethod6;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod7 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoUnsupportedRequirementOnOrder", 6, "auto_unsupported_requirement_on_order");
        AutoUnsupportedRequirementOnOrder = summaryAnalytics$LegacySummaryCardOpenMethod7;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod8 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoGluedRequirementOnOrder", 7, "auto_glued_requirement_on_order");
        AutoGluedRequirementOnOrder = summaryAnalytics$LegacySummaryCardOpenMethod8;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod9 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoMulticlassOnOrder", 8, "auto_multiclass_on_order");
        AutoMulticlassOnOrder = summaryAnalytics$LegacySummaryCardOpenMethod9;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod10 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoShuttleOnOrder", 9, "auto_shuttle_on_order");
        AutoShuttleOnOrder = summaryAnalytics$LegacySummaryCardOpenMethod10;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod11 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoRouteDeeplink", 10, "auto_route_deeplink");
        AutoRouteDeeplink = summaryAnalytics$LegacySummaryCardOpenMethod11;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod12 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoRequirementDeeplink", 11, "auto_requirement_deeplink");
        AutoRequirementDeeplink = summaryAnalytics$LegacySummaryCardOpenMethod12;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod13 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoRemoveAltChoiceBubbleClick", 12, "auto_remove_alt_choice_bubble_click");
        AutoRemoveAltChoiceBubbleClick = summaryAnalytics$LegacySummaryCardOpenMethod13;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod14 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoDeliveryRedirectAction", 13, "auto_delivery_redirect_action");
        AutoDeliveryRedirectAction = summaryAnalytics$LegacySummaryCardOpenMethod14;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod15 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoShortcutRedirectAction", 14, "auto_shortcut_redirect_action");
        AutoShortcutRedirectAction = summaryAnalytics$LegacySummaryCardOpenMethod15;
        SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod16 = new SummaryAnalytics$LegacySummaryCardOpenMethod("AutoSummaryOrderButtonExperiment", 15, "auto_summary_order_button_experiment");
        AutoSummaryOrderButtonExperiment = summaryAnalytics$LegacySummaryCardOpenMethod16;
        SummaryAnalytics$LegacySummaryCardOpenMethod[] summaryAnalytics$LegacySummaryCardOpenMethodArr = {summaryAnalytics$LegacySummaryCardOpenMethod, summaryAnalytics$LegacySummaryCardOpenMethod2, summaryAnalytics$LegacySummaryCardOpenMethod3, summaryAnalytics$LegacySummaryCardOpenMethod4, summaryAnalytics$LegacySummaryCardOpenMethod5, summaryAnalytics$LegacySummaryCardOpenMethod6, summaryAnalytics$LegacySummaryCardOpenMethod7, summaryAnalytics$LegacySummaryCardOpenMethod8, summaryAnalytics$LegacySummaryCardOpenMethod9, summaryAnalytics$LegacySummaryCardOpenMethod10, summaryAnalytics$LegacySummaryCardOpenMethod11, summaryAnalytics$LegacySummaryCardOpenMethod12, summaryAnalytics$LegacySummaryCardOpenMethod13, summaryAnalytics$LegacySummaryCardOpenMethod14, summaryAnalytics$LegacySummaryCardOpenMethod15, summaryAnalytics$LegacySummaryCardOpenMethod16};
        $VALUES = summaryAnalytics$LegacySummaryCardOpenMethodArr;
        $ENTRIES = a.a(summaryAnalytics$LegacySummaryCardOpenMethodArr);
    }

    public SummaryAnalytics$LegacySummaryCardOpenMethod(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SummaryAnalytics$LegacySummaryCardOpenMethod valueOf(String str) {
        return (SummaryAnalytics$LegacySummaryCardOpenMethod) Enum.valueOf(SummaryAnalytics$LegacySummaryCardOpenMethod.class, str);
    }

    public static SummaryAnalytics$LegacySummaryCardOpenMethod[] values() {
        return (SummaryAnalytics$LegacySummaryCardOpenMethod[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
