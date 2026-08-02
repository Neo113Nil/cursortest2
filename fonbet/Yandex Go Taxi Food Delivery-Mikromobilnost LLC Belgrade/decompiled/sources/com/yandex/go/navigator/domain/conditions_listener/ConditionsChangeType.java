package com.yandex.go.navigator.domain.conditions_listener;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/domain/conditions_listener/ConditionsChangeType;", "", "UPDATED", "OUTDATED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConditionsChangeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConditionsChangeType[] $VALUES;
    public static final ConditionsChangeType OUTDATED;
    public static final ConditionsChangeType UPDATED;

    static {
        ConditionsChangeType conditionsChangeType = new ConditionsChangeType("UPDATED", 0);
        UPDATED = conditionsChangeType;
        ConditionsChangeType conditionsChangeType2 = new ConditionsChangeType("OUTDATED", 1);
        OUTDATED = conditionsChangeType2;
        ConditionsChangeType[] conditionsChangeTypeArr = {conditionsChangeType, conditionsChangeType2};
        $VALUES = conditionsChangeTypeArr;
        $ENTRIES = a.a(conditionsChangeTypeArr);
    }

    public static ConditionsChangeType valueOf(String str) {
        return (ConditionsChangeType) Enum.valueOf(ConditionsChangeType.class, str);
    }

    public static ConditionsChangeType[] values() {
        return (ConditionsChangeType[]) $VALUES.clone();
    }
}
