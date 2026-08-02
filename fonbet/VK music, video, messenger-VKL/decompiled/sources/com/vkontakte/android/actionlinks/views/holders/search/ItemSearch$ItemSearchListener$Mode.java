package com.vkontakte.android.actionlinks.views.holders.search;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemSearch.kt */
/* loaded from: classes7.dex */
public final class ItemSearch$ItemSearchListener$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemSearch$ItemSearchListener$Mode[] $VALUES;
    public static final ItemSearch$ItemSearchListener$Mode LINK;
    public static final ItemSearch$ItemSearchListener$Mode USER;

    static {
        ItemSearch$ItemSearchListener$Mode itemSearch$ItemSearchListener$Mode = new ItemSearch$ItemSearchListener$Mode("USER", 0);
        USER = itemSearch$ItemSearchListener$Mode;
        ItemSearch$ItemSearchListener$Mode itemSearch$ItemSearchListener$Mode2 = new ItemSearch$ItemSearchListener$Mode("LINK", 1);
        LINK = itemSearch$ItemSearchListener$Mode2;
        ItemSearch$ItemSearchListener$Mode[] itemSearch$ItemSearchListener$ModeArr = {itemSearch$ItemSearchListener$Mode, itemSearch$ItemSearchListener$Mode2};
        $VALUES = itemSearch$ItemSearchListener$ModeArr;
        $ENTRIES = new asp(itemSearch$ItemSearchListener$ModeArr);
    }

    public ItemSearch$ItemSearchListener$Mode() {
        throw null;
    }

    public static ItemSearch$ItemSearchListener$Mode valueOf(String str) {
        return (ItemSearch$ItemSearchListener$Mode) Enum.valueOf(ItemSearch$ItemSearchListener$Mode.class, str);
    }

    public static ItemSearch$ItemSearchListener$Mode[] values() {
        return (ItemSearch$ItemSearchListener$Mode[]) $VALUES.clone();
    }
}
