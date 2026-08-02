package com.yandex.go.shortcuts.view.adapter.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/shortcuts/view/adapter/model/BaseShortcutModel$Source", "", "Lcom/yandex/go/shortcuts/view/adapter/model/BaseShortcutModel$Source;", IDialogId.INTENT_EXTRA_IN_HEADER, "ITEMS", "TURBO_BUTTONS", "TOP_ITEMS", "BOTTOM_ITEMS", "HORIZONTAL_STACK_ITEM", "LOCAL", "MAIN_SCREEN_PROMO", "VERTICAL_STACK_ITEM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BaseShortcutModel$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BaseShortcutModel$Source[] $VALUES;
    public static final BaseShortcutModel$Source BOTTOM_ITEMS;
    public static final BaseShortcutModel$Source HEADER;
    public static final BaseShortcutModel$Source HORIZONTAL_STACK_ITEM;
    public static final BaseShortcutModel$Source ITEMS;
    public static final BaseShortcutModel$Source LOCAL;
    public static final BaseShortcutModel$Source MAIN_SCREEN_PROMO;
    public static final BaseShortcutModel$Source TOP_ITEMS;
    public static final BaseShortcutModel$Source TURBO_BUTTONS;
    public static final BaseShortcutModel$Source VERTICAL_STACK_ITEM;

    static {
        BaseShortcutModel$Source baseShortcutModel$Source = new BaseShortcutModel$Source(IDialogId.INTENT_EXTRA_IN_HEADER, 0);
        HEADER = baseShortcutModel$Source;
        BaseShortcutModel$Source baseShortcutModel$Source2 = new BaseShortcutModel$Source("ITEMS", 1);
        ITEMS = baseShortcutModel$Source2;
        BaseShortcutModel$Source baseShortcutModel$Source3 = new BaseShortcutModel$Source("TURBO_BUTTONS", 2);
        TURBO_BUTTONS = baseShortcutModel$Source3;
        BaseShortcutModel$Source baseShortcutModel$Source4 = new BaseShortcutModel$Source("TOP_ITEMS", 3);
        TOP_ITEMS = baseShortcutModel$Source4;
        BaseShortcutModel$Source baseShortcutModel$Source5 = new BaseShortcutModel$Source("BOTTOM_ITEMS", 4);
        BOTTOM_ITEMS = baseShortcutModel$Source5;
        BaseShortcutModel$Source baseShortcutModel$Source6 = new BaseShortcutModel$Source("HORIZONTAL_STACK_ITEM", 5);
        HORIZONTAL_STACK_ITEM = baseShortcutModel$Source6;
        BaseShortcutModel$Source baseShortcutModel$Source7 = new BaseShortcutModel$Source("LOCAL", 6);
        LOCAL = baseShortcutModel$Source7;
        BaseShortcutModel$Source baseShortcutModel$Source8 = new BaseShortcutModel$Source("MAIN_SCREEN_PROMO", 7);
        MAIN_SCREEN_PROMO = baseShortcutModel$Source8;
        BaseShortcutModel$Source baseShortcutModel$Source9 = new BaseShortcutModel$Source("VERTICAL_STACK_ITEM", 8);
        VERTICAL_STACK_ITEM = baseShortcutModel$Source9;
        BaseShortcutModel$Source[] baseShortcutModel$SourceArr = {baseShortcutModel$Source, baseShortcutModel$Source2, baseShortcutModel$Source3, baseShortcutModel$Source4, baseShortcutModel$Source5, baseShortcutModel$Source6, baseShortcutModel$Source7, baseShortcutModel$Source8, baseShortcutModel$Source9};
        $VALUES = baseShortcutModel$SourceArr;
        $ENTRIES = a.a(baseShortcutModel$SourceArr);
    }

    public static BaseShortcutModel$Source valueOf(String str) {
        return (BaseShortcutModel$Source) Enum.valueOf(BaseShortcutModel$Source.class, str);
    }

    public static BaseShortcutModel$Source[] values() {
        return (BaseShortcutModel$Source[]) $VALUES.clone();
    }
}
