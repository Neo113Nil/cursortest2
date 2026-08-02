package com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/summary/ui/model/expanded/content/tariffcard/requirement/RequirementTypeUiState;", "", "UNSUPPORTED", "COUPON", "DEFAULT", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequirementTypeUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementTypeUiState[] $VALUES;
    public static final RequirementTypeUiState COUPON;
    public static final RequirementTypeUiState DEFAULT;
    public static final RequirementTypeUiState UNSUPPORTED;

    static {
        RequirementTypeUiState requirementTypeUiState = new RequirementTypeUiState("UNSUPPORTED", 0);
        UNSUPPORTED = requirementTypeUiState;
        RequirementTypeUiState requirementTypeUiState2 = new RequirementTypeUiState("COUPON", 1);
        COUPON = requirementTypeUiState2;
        RequirementTypeUiState requirementTypeUiState3 = new RequirementTypeUiState("DEFAULT", 2);
        DEFAULT = requirementTypeUiState3;
        RequirementTypeUiState[] requirementTypeUiStateArr = {requirementTypeUiState, requirementTypeUiState2, requirementTypeUiState3};
        $VALUES = requirementTypeUiStateArr;
        $ENTRIES = a.a(requirementTypeUiStateArr);
    }

    public static RequirementTypeUiState valueOf(String str) {
        return (RequirementTypeUiState) Enum.valueOf(RequirementTypeUiState.class, str);
    }

    public static RequirementTypeUiState[] values() {
        return (RequirementTypeUiState[]) $VALUES.clone();
    }
}
