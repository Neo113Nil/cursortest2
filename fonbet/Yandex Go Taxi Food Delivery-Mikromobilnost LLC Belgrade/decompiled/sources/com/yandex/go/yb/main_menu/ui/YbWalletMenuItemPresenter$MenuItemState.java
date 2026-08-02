package com.yandex.go.yb.main_menu.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/yb/main_menu/ui/YbWalletMenuItemPresenter$MenuItemState", "", "Lcom/yandex/go/yb/main_menu/ui/YbWalletMenuItemPresenter$MenuItemState;", "HIDDEN", "DISPLAYED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbWalletMenuItemPresenter$MenuItemState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbWalletMenuItemPresenter$MenuItemState[] $VALUES;
    public static final YbWalletMenuItemPresenter$MenuItemState DISPLAYED;
    public static final YbWalletMenuItemPresenter$MenuItemState HIDDEN;

    static {
        YbWalletMenuItemPresenter$MenuItemState ybWalletMenuItemPresenter$MenuItemState = new YbWalletMenuItemPresenter$MenuItemState("HIDDEN", 0);
        HIDDEN = ybWalletMenuItemPresenter$MenuItemState;
        YbWalletMenuItemPresenter$MenuItemState ybWalletMenuItemPresenter$MenuItemState2 = new YbWalletMenuItemPresenter$MenuItemState("DISPLAYED", 1);
        DISPLAYED = ybWalletMenuItemPresenter$MenuItemState2;
        YbWalletMenuItemPresenter$MenuItemState[] ybWalletMenuItemPresenter$MenuItemStateArr = {ybWalletMenuItemPresenter$MenuItemState, ybWalletMenuItemPresenter$MenuItemState2};
        $VALUES = ybWalletMenuItemPresenter$MenuItemStateArr;
        $ENTRIES = kotlin.enums.a.a(ybWalletMenuItemPresenter$MenuItemStateArr);
    }

    public static YbWalletMenuItemPresenter$MenuItemState valueOf(String str) {
        return (YbWalletMenuItemPresenter$MenuItemState) Enum.valueOf(YbWalletMenuItemPresenter$MenuItemState.class, str);
    }

    public static YbWalletMenuItemPresenter$MenuItemState[] values() {
        return (YbWalletMenuItemPresenter$MenuItemState[]) $VALUES.clone();
    }
}
