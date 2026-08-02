package com.vkontakte.android.actionlinks.views.holders.user;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemUser.kt */
/* loaded from: classes7.dex */
public final class ItemUser$OnlineStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemUser$OnlineStatus[] $VALUES;
    public static final ItemUser$OnlineStatus OFFLINE;
    public static final ItemUser$OnlineStatus ONLINE_MOBILE;
    public static final ItemUser$OnlineStatus ONLINE_WEB;

    static {
        ItemUser$OnlineStatus itemUser$OnlineStatus = new ItemUser$OnlineStatus("OFFLINE", 0);
        OFFLINE = itemUser$OnlineStatus;
        ItemUser$OnlineStatus itemUser$OnlineStatus2 = new ItemUser$OnlineStatus("ONLINE_MOBILE", 1);
        ONLINE_MOBILE = itemUser$OnlineStatus2;
        ItemUser$OnlineStatus itemUser$OnlineStatus3 = new ItemUser$OnlineStatus("ONLINE_WEB", 2);
        ONLINE_WEB = itemUser$OnlineStatus3;
        ItemUser$OnlineStatus[] itemUser$OnlineStatusArr = {itemUser$OnlineStatus, itemUser$OnlineStatus2, itemUser$OnlineStatus3};
        $VALUES = itemUser$OnlineStatusArr;
        $ENTRIES = new asp(itemUser$OnlineStatusArr);
    }

    public ItemUser$OnlineStatus() {
        throw null;
    }

    public static ItemUser$OnlineStatus valueOf(String str) {
        return (ItemUser$OnlineStatus) Enum.valueOf(ItemUser$OnlineStatus.class, str);
    }

    public static ItemUser$OnlineStatus[] values() {
        return (ItemUser$OnlineStatus[]) $VALUES.clone();
    }
}
