package com.ybsdk.feature.cashback.impl.entities.types;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;", "", "<init>", "(Ljava/lang/String;I)V", "SELECTABLE", "PREDEFINED", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CashbackSelectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackSelectionType[] $VALUES;
    public static final CashbackSelectionType SELECTABLE = new CashbackSelectionType("SELECTABLE", 0);
    public static final CashbackSelectionType PREDEFINED = new CashbackSelectionType("PREDEFINED", 1);

    private static final /* synthetic */ CashbackSelectionType[] $values() {
        return new CashbackSelectionType[]{SELECTABLE, PREDEFINED};
    }

    static {
        CashbackSelectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CashbackSelectionType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CashbackSelectionType valueOf(String str) {
        return (CashbackSelectionType) Enum.valueOf(CashbackSelectionType.class, str);
    }

    public static CashbackSelectionType[] values() {
        return (CashbackSelectionType[]) $VALUES.clone();
    }
}
