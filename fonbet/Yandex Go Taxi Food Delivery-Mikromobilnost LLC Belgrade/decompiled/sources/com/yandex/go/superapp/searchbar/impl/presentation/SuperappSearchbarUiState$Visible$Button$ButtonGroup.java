package com.yandex.go.superapp.searchbar.impl.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/superapp/searchbar/impl/presentation/SuperappSearchbarUiState$Visible$Button$ButtonGroup", "", "Lcom/yandex/go/superapp/searchbar/impl/presentation/SuperappSearchbarUiState$Visible$Button$ButtonGroup;", "Lead", "Trail", "Collapsed", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSearchbarUiState$Visible$Button$ButtonGroup {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappSearchbarUiState$Visible$Button$ButtonGroup[] $VALUES;
    public static final SuperappSearchbarUiState$Visible$Button$ButtonGroup Collapsed;
    public static final SuperappSearchbarUiState$Visible$Button$ButtonGroup Lead;
    public static final SuperappSearchbarUiState$Visible$Button$ButtonGroup Trail;

    static {
        SuperappSearchbarUiState$Visible$Button$ButtonGroup superappSearchbarUiState$Visible$Button$ButtonGroup = new SuperappSearchbarUiState$Visible$Button$ButtonGroup("Lead", 0);
        Lead = superappSearchbarUiState$Visible$Button$ButtonGroup;
        SuperappSearchbarUiState$Visible$Button$ButtonGroup superappSearchbarUiState$Visible$Button$ButtonGroup2 = new SuperappSearchbarUiState$Visible$Button$ButtonGroup("Trail", 1);
        Trail = superappSearchbarUiState$Visible$Button$ButtonGroup2;
        SuperappSearchbarUiState$Visible$Button$ButtonGroup superappSearchbarUiState$Visible$Button$ButtonGroup3 = new SuperappSearchbarUiState$Visible$Button$ButtonGroup("Collapsed", 2);
        Collapsed = superappSearchbarUiState$Visible$Button$ButtonGroup3;
        SuperappSearchbarUiState$Visible$Button$ButtonGroup[] superappSearchbarUiState$Visible$Button$ButtonGroupArr = {superappSearchbarUiState$Visible$Button$ButtonGroup, superappSearchbarUiState$Visible$Button$ButtonGroup2, superappSearchbarUiState$Visible$Button$ButtonGroup3};
        $VALUES = superappSearchbarUiState$Visible$Button$ButtonGroupArr;
        $ENTRIES = kotlin.enums.a.a(superappSearchbarUiState$Visible$Button$ButtonGroupArr);
    }

    public static SuperappSearchbarUiState$Visible$Button$ButtonGroup valueOf(String str) {
        return (SuperappSearchbarUiState$Visible$Button$ButtonGroup) Enum.valueOf(SuperappSearchbarUiState$Visible$Button$ButtonGroup.class, str);
    }

    public static SuperappSearchbarUiState$Visible$Button$ButtonGroup[] values() {
        return (SuperappSearchbarUiState$Visible$Button$ButtonGroup[]) $VALUES.clone();
    }
}
