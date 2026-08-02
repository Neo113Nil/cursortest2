package com.yandex.go.summary.ui.model.expanded.content.tariffcard.divider;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/summary/ui/model/expanded/content/tariffcard/divider/DividerUiState$CustomGroupTitleUiState$TextStyleUiState", "", "Lcom/yandex/go/summary/ui/model/expanded/content/tariffcard/divider/DividerUiState$CustomGroupTitleUiState$TextStyleUiState;", "MULTI_TARIFF_OPTIONS_TEXT_STYLE", "GLUED_REQUIREMENTS_TEXT_STYLE", "RULES_TEXT_STYLE", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DividerUiState$CustomGroupTitleUiState$TextStyleUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DividerUiState$CustomGroupTitleUiState$TextStyleUiState[] $VALUES;
    public static final DividerUiState$CustomGroupTitleUiState$TextStyleUiState GLUED_REQUIREMENTS_TEXT_STYLE;
    public static final DividerUiState$CustomGroupTitleUiState$TextStyleUiState MULTI_TARIFF_OPTIONS_TEXT_STYLE;
    public static final DividerUiState$CustomGroupTitleUiState$TextStyleUiState RULES_TEXT_STYLE;

    static {
        DividerUiState$CustomGroupTitleUiState$TextStyleUiState dividerUiState$CustomGroupTitleUiState$TextStyleUiState = new DividerUiState$CustomGroupTitleUiState$TextStyleUiState("MULTI_TARIFF_OPTIONS_TEXT_STYLE", 0);
        MULTI_TARIFF_OPTIONS_TEXT_STYLE = dividerUiState$CustomGroupTitleUiState$TextStyleUiState;
        DividerUiState$CustomGroupTitleUiState$TextStyleUiState dividerUiState$CustomGroupTitleUiState$TextStyleUiState2 = new DividerUiState$CustomGroupTitleUiState$TextStyleUiState("GLUED_REQUIREMENTS_TEXT_STYLE", 1);
        GLUED_REQUIREMENTS_TEXT_STYLE = dividerUiState$CustomGroupTitleUiState$TextStyleUiState2;
        DividerUiState$CustomGroupTitleUiState$TextStyleUiState dividerUiState$CustomGroupTitleUiState$TextStyleUiState3 = new DividerUiState$CustomGroupTitleUiState$TextStyleUiState("RULES_TEXT_STYLE", 2);
        RULES_TEXT_STYLE = dividerUiState$CustomGroupTitleUiState$TextStyleUiState3;
        DividerUiState$CustomGroupTitleUiState$TextStyleUiState[] dividerUiState$CustomGroupTitleUiState$TextStyleUiStateArr = {dividerUiState$CustomGroupTitleUiState$TextStyleUiState, dividerUiState$CustomGroupTitleUiState$TextStyleUiState2, dividerUiState$CustomGroupTitleUiState$TextStyleUiState3};
        $VALUES = dividerUiState$CustomGroupTitleUiState$TextStyleUiStateArr;
        $ENTRIES = a.a(dividerUiState$CustomGroupTitleUiState$TextStyleUiStateArr);
    }

    public static DividerUiState$CustomGroupTitleUiState$TextStyleUiState valueOf(String str) {
        return (DividerUiState$CustomGroupTitleUiState$TextStyleUiState) Enum.valueOf(DividerUiState$CustomGroupTitleUiState$TextStyleUiState.class, str);
    }

    public static DividerUiState$CustomGroupTitleUiState$TextStyleUiState[] values() {
        return (DividerUiState$CustomGroupTitleUiState$TextStyleUiState[]) $VALUES.clone();
    }
}
