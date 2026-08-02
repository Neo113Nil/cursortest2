package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/tariffs/internal/repository/SelectionChangeRuleController$ChangeRule", "", "Lcom/yandex/go/taxi/tariffs/internal/repository/SelectionChangeRuleController$ChangeRule;", "NOT_ALLOWED", "ALLOWED", "ONLY_CAN_BE_DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SelectionChangeRuleController$ChangeRule {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectionChangeRuleController$ChangeRule[] $VALUES;
    public static final SelectionChangeRuleController$ChangeRule ALLOWED;
    public static final SelectionChangeRuleController$ChangeRule NOT_ALLOWED;
    public static final SelectionChangeRuleController$ChangeRule ONLY_CAN_BE_DEFAULT;

    static {
        SelectionChangeRuleController$ChangeRule selectionChangeRuleController$ChangeRule = new SelectionChangeRuleController$ChangeRule("NOT_ALLOWED", 0);
        NOT_ALLOWED = selectionChangeRuleController$ChangeRule;
        SelectionChangeRuleController$ChangeRule selectionChangeRuleController$ChangeRule2 = new SelectionChangeRuleController$ChangeRule("ALLOWED", 1);
        ALLOWED = selectionChangeRuleController$ChangeRule2;
        SelectionChangeRuleController$ChangeRule selectionChangeRuleController$ChangeRule3 = new SelectionChangeRuleController$ChangeRule("ONLY_CAN_BE_DEFAULT", 2);
        ONLY_CAN_BE_DEFAULT = selectionChangeRuleController$ChangeRule3;
        SelectionChangeRuleController$ChangeRule[] selectionChangeRuleController$ChangeRuleArr = {selectionChangeRuleController$ChangeRule, selectionChangeRuleController$ChangeRule2, selectionChangeRuleController$ChangeRule3};
        $VALUES = selectionChangeRuleController$ChangeRuleArr;
        $ENTRIES = kotlin.enums.a.a(selectionChangeRuleController$ChangeRuleArr);
    }

    public static SelectionChangeRuleController$ChangeRule valueOf(String str) {
        return (SelectionChangeRuleController$ChangeRule) Enum.valueOf(SelectionChangeRuleController$ChangeRule.class, str);
    }

    public static SelectionChangeRuleController$ChangeRule[] values() {
        return (SelectionChangeRuleController$ChangeRule[]) $VALUES.clone();
    }
}
