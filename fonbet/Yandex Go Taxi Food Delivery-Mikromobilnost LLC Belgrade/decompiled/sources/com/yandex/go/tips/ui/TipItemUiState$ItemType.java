package com.yandex.go.tips.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/tips/ui/TipItemUiState$ItemType", "", "Lcom/yandex/go/tips/ui/TipItemUiState$ItemType;", "VALUE", "INPUT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipItemUiState$ItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TipItemUiState$ItemType[] $VALUES;
    public static final TipItemUiState$ItemType INPUT;
    public static final TipItemUiState$ItemType VALUE;

    static {
        TipItemUiState$ItemType tipItemUiState$ItemType = new TipItemUiState$ItemType("VALUE", 0);
        VALUE = tipItemUiState$ItemType;
        TipItemUiState$ItemType tipItemUiState$ItemType2 = new TipItemUiState$ItemType("INPUT", 1);
        INPUT = tipItemUiState$ItemType2;
        TipItemUiState$ItemType[] tipItemUiState$ItemTypeArr = {tipItemUiState$ItemType, tipItemUiState$ItemType2};
        $VALUES = tipItemUiState$ItemTypeArr;
        $ENTRIES = a.a(tipItemUiState$ItemTypeArr);
    }

    public static TipItemUiState$ItemType valueOf(String str) {
        return (TipItemUiState$ItemType) Enum.valueOf(TipItemUiState$ItemType.class, str);
    }

    public static TipItemUiState$ItemType[] values() {
        return (TipItemUiState$ItemType[]) $VALUES.clone();
    }
}
