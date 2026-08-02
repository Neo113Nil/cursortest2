package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/yandex/go/analytics/ApplicationAnalytics$OrderAddressMethodV4", "", "Lcom/yandex/go/analytics/ApplicationAnalytics$OrderAddressMethodV4;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Expecteddestinations", "Nearestposition", "NearestpositionErrorFallback", "NearestpositionBlockedzonePoint", "Suggestedpositions", "Suggesteddestinations", "Userplaces", "Geosearch", "Routestats", "Geosuggest", "Suggest", "SuggestZeroSuggest", "SuggestErrorFallback", "Taxiontheway", "PinDrop", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApplicationAnalytics$OrderAddressMethodV4 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplicationAnalytics$OrderAddressMethodV4[] $VALUES;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Expecteddestinations;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Geosearch;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Geosuggest;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Nearestposition;
    public static final ApplicationAnalytics$OrderAddressMethodV4 NearestpositionBlockedzonePoint;
    public static final ApplicationAnalytics$OrderAddressMethodV4 NearestpositionErrorFallback;
    public static final ApplicationAnalytics$OrderAddressMethodV4 PinDrop;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Routestats;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Suggest;
    public static final ApplicationAnalytics$OrderAddressMethodV4 SuggestErrorFallback;
    public static final ApplicationAnalytics$OrderAddressMethodV4 SuggestZeroSuggest;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Suggesteddestinations;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Suggestedpositions;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Taxiontheway;
    public static final ApplicationAnalytics$OrderAddressMethodV4 Userplaces;
    private final String eventValue;

    static {
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV4 = new ApplicationAnalytics$OrderAddressMethodV4("Expecteddestinations", 0, "expecteddestinations");
        Expecteddestinations = applicationAnalytics$OrderAddressMethodV4;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV42 = new ApplicationAnalytics$OrderAddressMethodV4("Nearestposition", 1, "nearestposition");
        Nearestposition = applicationAnalytics$OrderAddressMethodV42;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV43 = new ApplicationAnalytics$OrderAddressMethodV4("NearestpositionErrorFallback", 2, "nearestposition.error.fallback");
        NearestpositionErrorFallback = applicationAnalytics$OrderAddressMethodV43;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV44 = new ApplicationAnalytics$OrderAddressMethodV4("NearestpositionBlockedzonePoint", 3, "nearestposition.blockedzone.point");
        NearestpositionBlockedzonePoint = applicationAnalytics$OrderAddressMethodV44;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV45 = new ApplicationAnalytics$OrderAddressMethodV4("Suggestedpositions", 4, "suggestedpositions");
        Suggestedpositions = applicationAnalytics$OrderAddressMethodV45;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV46 = new ApplicationAnalytics$OrderAddressMethodV4("Suggesteddestinations", 5, "suggesteddestinations");
        Suggesteddestinations = applicationAnalytics$OrderAddressMethodV46;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV47 = new ApplicationAnalytics$OrderAddressMethodV4("Userplaces", 6, "userplaces");
        Userplaces = applicationAnalytics$OrderAddressMethodV47;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV48 = new ApplicationAnalytics$OrderAddressMethodV4("Geosearch", 7, "geosearch");
        Geosearch = applicationAnalytics$OrderAddressMethodV48;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV49 = new ApplicationAnalytics$OrderAddressMethodV4("Routestats", 8, "routestats");
        Routestats = applicationAnalytics$OrderAddressMethodV49;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV410 = new ApplicationAnalytics$OrderAddressMethodV4("Geosuggest", 9, "geosuggest");
        Geosuggest = applicationAnalytics$OrderAddressMethodV410;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV411 = new ApplicationAnalytics$OrderAddressMethodV4("Suggest", 10, "suggest");
        Suggest = applicationAnalytics$OrderAddressMethodV411;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV412 = new ApplicationAnalytics$OrderAddressMethodV4("SuggestZeroSuggest", 11, "suggest.zero_suggest");
        SuggestZeroSuggest = applicationAnalytics$OrderAddressMethodV412;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV413 = new ApplicationAnalytics$OrderAddressMethodV4("SuggestErrorFallback", 12, "suggest.error.fallback");
        SuggestErrorFallback = applicationAnalytics$OrderAddressMethodV413;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV414 = new ApplicationAnalytics$OrderAddressMethodV4("Taxiontheway", 13, "taxiontheway");
        Taxiontheway = applicationAnalytics$OrderAddressMethodV414;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV415 = new ApplicationAnalytics$OrderAddressMethodV4("PinDrop", 14, "pin_drop");
        PinDrop = applicationAnalytics$OrderAddressMethodV415;
        ApplicationAnalytics$OrderAddressMethodV4[] applicationAnalytics$OrderAddressMethodV4Arr = {applicationAnalytics$OrderAddressMethodV4, applicationAnalytics$OrderAddressMethodV42, applicationAnalytics$OrderAddressMethodV43, applicationAnalytics$OrderAddressMethodV44, applicationAnalytics$OrderAddressMethodV45, applicationAnalytics$OrderAddressMethodV46, applicationAnalytics$OrderAddressMethodV47, applicationAnalytics$OrderAddressMethodV48, applicationAnalytics$OrderAddressMethodV49, applicationAnalytics$OrderAddressMethodV410, applicationAnalytics$OrderAddressMethodV411, applicationAnalytics$OrderAddressMethodV412, applicationAnalytics$OrderAddressMethodV413, applicationAnalytics$OrderAddressMethodV414, applicationAnalytics$OrderAddressMethodV415};
        $VALUES = applicationAnalytics$OrderAddressMethodV4Arr;
        $ENTRIES = kotlin.enums.a.a(applicationAnalytics$OrderAddressMethodV4Arr);
    }

    public ApplicationAnalytics$OrderAddressMethodV4(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ApplicationAnalytics$OrderAddressMethodV4 valueOf(String str) {
        return (ApplicationAnalytics$OrderAddressMethodV4) Enum.valueOf(ApplicationAnalytics$OrderAddressMethodV4.class, str);
    }

    public static ApplicationAnalytics$OrderAddressMethodV4[] values() {
        return (ApplicationAnalytics$OrderAddressMethodV4[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
