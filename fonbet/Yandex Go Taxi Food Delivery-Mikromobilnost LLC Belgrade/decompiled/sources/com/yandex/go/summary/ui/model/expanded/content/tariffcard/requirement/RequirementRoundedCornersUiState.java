package com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/summary/ui/model/expanded/content/tariffcard/requirement/RequirementRoundedCornersUiState;", "", "TOP", "BOTTOM", "BOTH", JCP.RAW_PREFIX, "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequirementRoundedCornersUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementRoundedCornersUiState[] $VALUES;
    public static final RequirementRoundedCornersUiState BOTH;
    public static final RequirementRoundedCornersUiState BOTTOM;
    public static final RequirementRoundedCornersUiState NONE;
    public static final RequirementRoundedCornersUiState TOP;

    static {
        RequirementRoundedCornersUiState requirementRoundedCornersUiState = new RequirementRoundedCornersUiState("TOP", 0);
        TOP = requirementRoundedCornersUiState;
        RequirementRoundedCornersUiState requirementRoundedCornersUiState2 = new RequirementRoundedCornersUiState("BOTTOM", 1);
        BOTTOM = requirementRoundedCornersUiState2;
        RequirementRoundedCornersUiState requirementRoundedCornersUiState3 = new RequirementRoundedCornersUiState("BOTH", 2);
        BOTH = requirementRoundedCornersUiState3;
        RequirementRoundedCornersUiState requirementRoundedCornersUiState4 = new RequirementRoundedCornersUiState(JCP.RAW_PREFIX, 3);
        NONE = requirementRoundedCornersUiState4;
        RequirementRoundedCornersUiState[] requirementRoundedCornersUiStateArr = {requirementRoundedCornersUiState, requirementRoundedCornersUiState2, requirementRoundedCornersUiState3, requirementRoundedCornersUiState4};
        $VALUES = requirementRoundedCornersUiStateArr;
        $ENTRIES = a.a(requirementRoundedCornersUiStateArr);
    }

    public static RequirementRoundedCornersUiState valueOf(String str) {
        return (RequirementRoundedCornersUiState) Enum.valueOf(RequirementRoundedCornersUiState.class, str);
    }

    public static RequirementRoundedCornersUiState[] values() {
        return (RequirementRoundedCornersUiState[]) $VALUES.clone();
    }
}
