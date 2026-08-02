package com.yandex.go.address.search.common.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/address/search/common/analytics/SuggestionsAnalytics$DefaultSuggestType", "", "Lcom/yandex/go/address/search/common/analytics/SuggestionsAnalytics$DefaultSuggestType;", "", "analyticType", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "analyticName", "a", "ADDRESS", "FAVORITE", "ASK_DRIVER", "SUGGESTED_TO_SAVE_ADDRESS", "SKIP_BUTTON", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestionsAnalytics$DefaultSuggestType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestionsAnalytics$DefaultSuggestType[] $VALUES;
    public static final SuggestionsAnalytics$DefaultSuggestType ADDRESS;
    public static final SuggestionsAnalytics$DefaultSuggestType ASK_DRIVER;
    public static final SuggestionsAnalytics$DefaultSuggestType FAVORITE;
    public static final SuggestionsAnalytics$DefaultSuggestType SKIP_BUTTON;
    public static final SuggestionsAnalytics$DefaultSuggestType SUGGESTED_TO_SAVE_ADDRESS;
    private final String analyticName;
    private final String analyticType;

    static {
        SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType = new SuggestionsAnalytics$DefaultSuggestType("ADDRESS", 0, "type", "address");
        ADDRESS = suggestionsAnalytics$DefaultSuggestType;
        SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType2 = new SuggestionsAnalytics$DefaultSuggestType("FAVORITE", 1, "type", "favorite");
        FAVORITE = suggestionsAnalytics$DefaultSuggestType2;
        SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType3 = new SuggestionsAnalytics$DefaultSuggestType("ASK_DRIVER", 2, "type", "withoutb");
        ASK_DRIVER = suggestionsAnalytics$DefaultSuggestType3;
        SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType4 = new SuggestionsAnalytics$DefaultSuggestType("SUGGESTED_TO_SAVE_ADDRESS", 3, "type", "suggested_to_save_address");
        SUGGESTED_TO_SAVE_ADDRESS = suggestionsAnalytics$DefaultSuggestType4;
        SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType5 = new SuggestionsAnalytics$DefaultSuggestType("SKIP_BUTTON", 4, "button_type", "AddressSelectionSkipButtonTap");
        SKIP_BUTTON = suggestionsAnalytics$DefaultSuggestType5;
        SuggestionsAnalytics$DefaultSuggestType[] suggestionsAnalytics$DefaultSuggestTypeArr = {suggestionsAnalytics$DefaultSuggestType, suggestionsAnalytics$DefaultSuggestType2, suggestionsAnalytics$DefaultSuggestType3, suggestionsAnalytics$DefaultSuggestType4, suggestionsAnalytics$DefaultSuggestType5};
        $VALUES = suggestionsAnalytics$DefaultSuggestTypeArr;
        $ENTRIES = a.a(suggestionsAnalytics$DefaultSuggestTypeArr);
    }

    public SuggestionsAnalytics$DefaultSuggestType(String str, int i, String str2, String str3) {
        this.analyticType = str2;
        this.analyticName = str3;
    }

    public static SuggestionsAnalytics$DefaultSuggestType valueOf(String str) {
        return (SuggestionsAnalytics$DefaultSuggestType) Enum.valueOf(SuggestionsAnalytics$DefaultSuggestType.class, str);
    }

    public static SuggestionsAnalytics$DefaultSuggestType[] values() {
        return (SuggestionsAnalytics$DefaultSuggestType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticName() {
        return this.analyticName;
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticType() {
        return this.analyticType;
    }
}
