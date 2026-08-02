package com.vkontakte.android.actionlinks.views.selection;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionActionType.kt */
/* loaded from: classes7.dex */
public final class SelectionActionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SelectionActionType[] $VALUES;
    public static final SelectionActionType ADD_GOOD;
    public static final SelectionActionType LINK;
    public static final SelectionActionType POLL;
    public static final SelectionActionType POST;
    private final int iconResId;
    private final int titleResId;

    static {
        SelectionActionType selectionActionType = new SelectionActionType("LINK", 0, R.drawable.vk_icon_chain_outline_28, R.string.collection_add_link_short);
        LINK = selectionActionType;
        SelectionActionType selectionActionType2 = new SelectionActionType("POST", 1, R.drawable.vk_icon_newsfeed_outline_28, R.string.collection_add_post_short);
        POST = selectionActionType2;
        SelectionActionType selectionActionType3 = new SelectionActionType("POLL", 2, R.drawable.vk_icon_poll_square_outline_28, R.string.collection_add_poll_short);
        POLL = selectionActionType3;
        SelectionActionType selectionActionType4 = new SelectionActionType("ADD_GOOD", 3, R.drawable.vk_icon_market_outline_28, R.string.collection_add_good_short);
        ADD_GOOD = selectionActionType4;
        SelectionActionType[] selectionActionTypeArr = {selectionActionType, selectionActionType2, selectionActionType3, selectionActionType4};
        $VALUES = selectionActionTypeArr;
        $ENTRIES = new asp(selectionActionTypeArr);
    }

    public SelectionActionType(String str, int i, int i2, int i3) {
        this.iconResId = i2;
        this.titleResId = i3;
    }

    public static SelectionActionType valueOf(String str) {
        return (SelectionActionType) Enum.valueOf(SelectionActionType.class, str);
    }

    public static SelectionActionType[] values() {
        return (SelectionActionType[]) $VALUES.clone();
    }

    public final int h() {
        return this.iconResId;
    }

    public final int i() {
        return this.titleResId;
    }
}
