package com.yandex.go.address.search.common.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/address/search/common/analytics/SuggestionsAnalytics$Type", "", "Lcom/yandex/go/address/search/common/analytics/SuggestionsAnalytics$Type;", "DEFAULT_SUGGEST", "SUGGEST", "SKIP_BUTTON", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestionsAnalytics$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestionsAnalytics$Type[] $VALUES;
    public static final SuggestionsAnalytics$Type DEFAULT_SUGGEST;
    public static final SuggestionsAnalytics$Type SKIP_BUTTON;
    public static final SuggestionsAnalytics$Type SUGGEST;

    static {
        SuggestionsAnalytics$Type suggestionsAnalytics$Type = new SuggestionsAnalytics$Type("DEFAULT_SUGGEST", 0);
        DEFAULT_SUGGEST = suggestionsAnalytics$Type;
        SuggestionsAnalytics$Type suggestionsAnalytics$Type2 = new SuggestionsAnalytics$Type("SUGGEST", 1);
        SUGGEST = suggestionsAnalytics$Type2;
        SuggestionsAnalytics$Type suggestionsAnalytics$Type3 = new SuggestionsAnalytics$Type("SKIP_BUTTON", 2);
        SKIP_BUTTON = suggestionsAnalytics$Type3;
        SuggestionsAnalytics$Type[] suggestionsAnalytics$TypeArr = {suggestionsAnalytics$Type, suggestionsAnalytics$Type2, suggestionsAnalytics$Type3};
        $VALUES = suggestionsAnalytics$TypeArr;
        $ENTRIES = a.a(suggestionsAnalytics$TypeArr);
    }

    public static SuggestionsAnalytics$Type valueOf(String str) {
        return (SuggestionsAnalytics$Type) Enum.valueOf(SuggestionsAnalytics$Type.class, str);
    }

    public static SuggestionsAnalytics$Type[] values() {
        return (SuggestionsAnalytics$Type[]) $VALUES.clone();
    }
}
