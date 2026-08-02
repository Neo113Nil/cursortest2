package com.yandex.go.mainscreen.superapp.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$SearchBarTapSource", "", "Lcom/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$SearchBarTapSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ExpandedSearchBar", "ExpandedLeadButtons", "ExpandedTrailButtons", "CollapsedButton", "go-client-android.features.superapp.mainscreen:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuperappMainAnalytics$SearchBarTapSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappMainAnalytics$SearchBarTapSource[] $VALUES;
    public static final SuperappMainAnalytics$SearchBarTapSource CollapsedButton;
    public static final SuperappMainAnalytics$SearchBarTapSource ExpandedLeadButtons;
    public static final SuperappMainAnalytics$SearchBarTapSource ExpandedSearchBar;
    public static final SuperappMainAnalytics$SearchBarTapSource ExpandedTrailButtons;
    private final String eventValue;

    static {
        SuperappMainAnalytics$SearchBarTapSource superappMainAnalytics$SearchBarTapSource = new SuperappMainAnalytics$SearchBarTapSource("ExpandedSearchBar", 0, "expanded_search_bar");
        ExpandedSearchBar = superappMainAnalytics$SearchBarTapSource;
        SuperappMainAnalytics$SearchBarTapSource superappMainAnalytics$SearchBarTapSource2 = new SuperappMainAnalytics$SearchBarTapSource("ExpandedLeadButtons", 1, "expanded_lead_buttons");
        ExpandedLeadButtons = superappMainAnalytics$SearchBarTapSource2;
        SuperappMainAnalytics$SearchBarTapSource superappMainAnalytics$SearchBarTapSource3 = new SuperappMainAnalytics$SearchBarTapSource("ExpandedTrailButtons", 2, "expanded_trail_buttons");
        ExpandedTrailButtons = superappMainAnalytics$SearchBarTapSource3;
        SuperappMainAnalytics$SearchBarTapSource superappMainAnalytics$SearchBarTapSource4 = new SuperappMainAnalytics$SearchBarTapSource("CollapsedButton", 3, "collapsed_button");
        CollapsedButton = superappMainAnalytics$SearchBarTapSource4;
        SuperappMainAnalytics$SearchBarTapSource[] superappMainAnalytics$SearchBarTapSourceArr = {superappMainAnalytics$SearchBarTapSource, superappMainAnalytics$SearchBarTapSource2, superappMainAnalytics$SearchBarTapSource3, superappMainAnalytics$SearchBarTapSource4};
        $VALUES = superappMainAnalytics$SearchBarTapSourceArr;
        $ENTRIES = a.a(superappMainAnalytics$SearchBarTapSourceArr);
    }

    public SuperappMainAnalytics$SearchBarTapSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappMainAnalytics$SearchBarTapSource valueOf(String str) {
        return (SuperappMainAnalytics$SearchBarTapSource) Enum.valueOf(SuperappMainAnalytics$SearchBarTapSource.class, str);
    }

    public static SuperappMainAnalytics$SearchBarTapSource[] values() {
        return (SuperappMainAnalytics$SearchBarTapSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
