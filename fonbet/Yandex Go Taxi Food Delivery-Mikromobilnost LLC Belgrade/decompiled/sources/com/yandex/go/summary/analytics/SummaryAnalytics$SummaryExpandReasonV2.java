package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$SummaryExpandReasonV2", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$SummaryExpandReasonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Pull", "HandlerTap", "SelectorTap", "OptionsTap", "AutoRedirect", "AutoUnavailableTariffOnOrder", "AutoUnsupportedRequirementOnOrder", "AutoGluedRequirementOnOrder", "AutoMulticlassOnOrder", "AutoSummaryOrderButtonExperiment", "AutoRouteDeeplink", "AutoRequirementDeeplink", "AutoRemoveAltChoiceBubbleClick", "AutoDeliveryRedirectAction", "AutoShortcutRedirectAction", "OpenRequirement", "OldVerticalsOnOrder", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$SummaryExpandReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$SummaryExpandReasonV2[] $VALUES;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoDeliveryRedirectAction;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoGluedRequirementOnOrder;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoMulticlassOnOrder;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoRedirect;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoRemoveAltChoiceBubbleClick;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoRequirementDeeplink;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoRouteDeeplink;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoShortcutRedirectAction;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoSummaryOrderButtonExperiment;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoUnavailableTariffOnOrder;
    public static final SummaryAnalytics$SummaryExpandReasonV2 AutoUnsupportedRequirementOnOrder;
    public static final SummaryAnalytics$SummaryExpandReasonV2 HandlerTap;
    public static final SummaryAnalytics$SummaryExpandReasonV2 OldVerticalsOnOrder;
    public static final SummaryAnalytics$SummaryExpandReasonV2 OpenRequirement;
    public static final SummaryAnalytics$SummaryExpandReasonV2 OptionsTap;
    public static final SummaryAnalytics$SummaryExpandReasonV2 Pull;
    public static final SummaryAnalytics$SummaryExpandReasonV2 SelectorTap;
    private final String eventValue;

    static {
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV2 = new SummaryAnalytics$SummaryExpandReasonV2("Pull", 0, "pull");
        Pull = summaryAnalytics$SummaryExpandReasonV2;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV22 = new SummaryAnalytics$SummaryExpandReasonV2("HandlerTap", 1, "handler_tap");
        HandlerTap = summaryAnalytics$SummaryExpandReasonV22;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV23 = new SummaryAnalytics$SummaryExpandReasonV2("SelectorTap", 2, "selector_tap");
        SelectorTap = summaryAnalytics$SummaryExpandReasonV23;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV24 = new SummaryAnalytics$SummaryExpandReasonV2("OptionsTap", 3, "options_tap");
        OptionsTap = summaryAnalytics$SummaryExpandReasonV24;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV25 = new SummaryAnalytics$SummaryExpandReasonV2("AutoRedirect", 4, "auto_redirect");
        AutoRedirect = summaryAnalytics$SummaryExpandReasonV25;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV26 = new SummaryAnalytics$SummaryExpandReasonV2("AutoUnavailableTariffOnOrder", 5, "auto_unavailable_tariff_on_order");
        AutoUnavailableTariffOnOrder = summaryAnalytics$SummaryExpandReasonV26;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV27 = new SummaryAnalytics$SummaryExpandReasonV2("AutoUnsupportedRequirementOnOrder", 6, "auto_unsupported_requirement_on_order");
        AutoUnsupportedRequirementOnOrder = summaryAnalytics$SummaryExpandReasonV27;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV28 = new SummaryAnalytics$SummaryExpandReasonV2("AutoGluedRequirementOnOrder", 7, "auto_glued_requirement_on_order");
        AutoGluedRequirementOnOrder = summaryAnalytics$SummaryExpandReasonV28;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV29 = new SummaryAnalytics$SummaryExpandReasonV2("AutoMulticlassOnOrder", 8, "auto_multiclass_on_order");
        AutoMulticlassOnOrder = summaryAnalytics$SummaryExpandReasonV29;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV210 = new SummaryAnalytics$SummaryExpandReasonV2("AutoSummaryOrderButtonExperiment", 9, "auto_summary_order_button_experiment");
        AutoSummaryOrderButtonExperiment = summaryAnalytics$SummaryExpandReasonV210;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV211 = new SummaryAnalytics$SummaryExpandReasonV2("AutoRouteDeeplink", 10, "auto_route_deeplink");
        AutoRouteDeeplink = summaryAnalytics$SummaryExpandReasonV211;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV212 = new SummaryAnalytics$SummaryExpandReasonV2("AutoRequirementDeeplink", 11, "auto_requirement_deeplink");
        AutoRequirementDeeplink = summaryAnalytics$SummaryExpandReasonV212;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV213 = new SummaryAnalytics$SummaryExpandReasonV2("AutoRemoveAltChoiceBubbleClick", 12, "auto_remove_alt_choice_bubble_click");
        AutoRemoveAltChoiceBubbleClick = summaryAnalytics$SummaryExpandReasonV213;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV214 = new SummaryAnalytics$SummaryExpandReasonV2("AutoDeliveryRedirectAction", 13, "auto_delivery_redirect_action");
        AutoDeliveryRedirectAction = summaryAnalytics$SummaryExpandReasonV214;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV215 = new SummaryAnalytics$SummaryExpandReasonV2("AutoShortcutRedirectAction", 14, "auto_shortcut_redirect_action");
        AutoShortcutRedirectAction = summaryAnalytics$SummaryExpandReasonV215;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV216 = new SummaryAnalytics$SummaryExpandReasonV2("OpenRequirement", 15, "open_requirement");
        OpenRequirement = summaryAnalytics$SummaryExpandReasonV216;
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV217 = new SummaryAnalytics$SummaryExpandReasonV2("OldVerticalsOnOrder", 16, "old_verticals_on_order");
        OldVerticalsOnOrder = summaryAnalytics$SummaryExpandReasonV217;
        SummaryAnalytics$SummaryExpandReasonV2[] summaryAnalytics$SummaryExpandReasonV2Arr = {summaryAnalytics$SummaryExpandReasonV2, summaryAnalytics$SummaryExpandReasonV22, summaryAnalytics$SummaryExpandReasonV23, summaryAnalytics$SummaryExpandReasonV24, summaryAnalytics$SummaryExpandReasonV25, summaryAnalytics$SummaryExpandReasonV26, summaryAnalytics$SummaryExpandReasonV27, summaryAnalytics$SummaryExpandReasonV28, summaryAnalytics$SummaryExpandReasonV29, summaryAnalytics$SummaryExpandReasonV210, summaryAnalytics$SummaryExpandReasonV211, summaryAnalytics$SummaryExpandReasonV212, summaryAnalytics$SummaryExpandReasonV213, summaryAnalytics$SummaryExpandReasonV214, summaryAnalytics$SummaryExpandReasonV215, summaryAnalytics$SummaryExpandReasonV216, summaryAnalytics$SummaryExpandReasonV217};
        $VALUES = summaryAnalytics$SummaryExpandReasonV2Arr;
        $ENTRIES = a.a(summaryAnalytics$SummaryExpandReasonV2Arr);
    }

    public SummaryAnalytics$SummaryExpandReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$SummaryExpandReasonV2 valueOf(String str) {
        return (SummaryAnalytics$SummaryExpandReasonV2) Enum.valueOf(SummaryAnalytics$SummaryExpandReasonV2.class, str);
    }

    public static SummaryAnalytics$SummaryExpandReasonV2[] values() {
        return (SummaryAnalytics$SummaryExpandReasonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
