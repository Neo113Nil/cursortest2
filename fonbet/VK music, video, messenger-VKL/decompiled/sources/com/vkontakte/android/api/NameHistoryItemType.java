package com.vkontakte.android.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NameHistory.kt */
/* loaded from: classes7.dex */
public final class NameHistoryItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NameHistoryItemType[] $VALUES;
    public static final NameHistoryItemType COLLAPSE;
    public static final NameHistoryItemType CREATE;
    public static final a Companion;
    public static final NameHistoryItemType RENAME;
    private final String value;

    /* compiled from: NameHistory.kt */
    public static final class a {
    }

    static {
        NameHistoryItemType nameHistoryItemType = new NameHistoryItemType("RENAME", 0, "rename");
        RENAME = nameHistoryItemType;
        NameHistoryItemType nameHistoryItemType2 = new NameHistoryItemType("CREATE", 1, "create");
        CREATE = nameHistoryItemType2;
        NameHistoryItemType nameHistoryItemType3 = new NameHistoryItemType("COLLAPSE", 2, "collapse");
        COLLAPSE = nameHistoryItemType3;
        NameHistoryItemType[] nameHistoryItemTypeArr = {nameHistoryItemType, nameHistoryItemType2, nameHistoryItemType3};
        $VALUES = nameHistoryItemTypeArr;
        $ENTRIES = new asp(nameHistoryItemTypeArr);
        Companion = new a();
    }

    public NameHistoryItemType(String str, int i, String str2) {
        this.value = str2;
    }

    public static NameHistoryItemType valueOf(String str) {
        return (NameHistoryItemType) Enum.valueOf(NameHistoryItemType.class, str);
    }

    public static NameHistoryItemType[] values() {
        return (NameHistoryItemType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
