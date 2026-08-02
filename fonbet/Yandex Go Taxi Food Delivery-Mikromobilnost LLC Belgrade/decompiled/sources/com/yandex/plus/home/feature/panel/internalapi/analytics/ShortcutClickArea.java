package com.yandex.plus.home.feature.panel.internalapi.analytics;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/analytics/ShortcutClickArea;", "", PlusPayUiKitInflaterFactory.NAME_BUTTON, "Image", "Shortcut", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShortcutClickArea {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutClickArea[] $VALUES;
    public static final ShortcutClickArea Button;
    public static final ShortcutClickArea Image;
    public static final ShortcutClickArea Shortcut;

    static {
        ShortcutClickArea shortcutClickArea = new ShortcutClickArea(PlusPayUiKitInflaterFactory.NAME_BUTTON, 0);
        Button = shortcutClickArea;
        ShortcutClickArea shortcutClickArea2 = new ShortcutClickArea("Image", 1);
        Image = shortcutClickArea2;
        ShortcutClickArea shortcutClickArea3 = new ShortcutClickArea("Shortcut", 2);
        Shortcut = shortcutClickArea3;
        ShortcutClickArea[] shortcutClickAreaArr = {shortcutClickArea, shortcutClickArea2, shortcutClickArea3};
        $VALUES = shortcutClickAreaArr;
        $ENTRIES = a.a(shortcutClickAreaArr);
    }

    public static ShortcutClickArea valueOf(String str) {
        return (ShortcutClickArea) Enum.valueOf(ShortcutClickArea.class, str);
    }

    public static ShortcutClickArea[] values() {
        return (ShortcutClickArea[]) $VALUES.clone();
    }
}
