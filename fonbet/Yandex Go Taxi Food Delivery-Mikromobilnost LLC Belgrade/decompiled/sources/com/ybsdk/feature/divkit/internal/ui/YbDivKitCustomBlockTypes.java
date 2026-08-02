package com.ybsdk.feature.divkit.internal.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/YbDivKitCustomBlockTypes;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "SPOILER_BLOCK_TYPE", "SPINNER_BLOCK_TYPE", "SWITCH_BLOCK_TYPE", "TICKER_BLOCK_TYPE", "PLUS_BADGE_BLOCK_TYPE", "COLLAPSING_TOOLBAR_LAYOUT_TYPE", "CARD_INPUT_TYPE", "NUMBER_KEYBOARD_TYPE", "GRADIENT_PILL_TYPE", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YbDivKitCustomBlockTypes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbDivKitCustomBlockTypes[] $VALUES;
    private final String type;
    public static final YbDivKitCustomBlockTypes SPOILER_BLOCK_TYPE = new YbDivKitCustomBlockTypes("SPOILER_BLOCK_TYPE", 0, "spoiler_block");
    public static final YbDivKitCustomBlockTypes SPINNER_BLOCK_TYPE = new YbDivKitCustomBlockTypes("SPINNER_BLOCK_TYPE", 1, "spinner");
    public static final YbDivKitCustomBlockTypes SWITCH_BLOCK_TYPE = new YbDivKitCustomBlockTypes("SWITCH_BLOCK_TYPE", 2, "switch_block");
    public static final YbDivKitCustomBlockTypes TICKER_BLOCK_TYPE = new YbDivKitCustomBlockTypes("TICKER_BLOCK_TYPE", 3, "ticker_block");
    public static final YbDivKitCustomBlockTypes PLUS_BADGE_BLOCK_TYPE = new YbDivKitCustomBlockTypes("PLUS_BADGE_BLOCK_TYPE", 4, "plus_badge_block");
    public static final YbDivKitCustomBlockTypes COLLAPSING_TOOLBAR_LAYOUT_TYPE = new YbDivKitCustomBlockTypes("COLLAPSING_TOOLBAR_LAYOUT_TYPE", 5, "collapsing_toolbar_layout");
    public static final YbDivKitCustomBlockTypes CARD_INPUT_TYPE = new YbDivKitCustomBlockTypes("CARD_INPUT_TYPE", 6, "card_input");
    public static final YbDivKitCustomBlockTypes NUMBER_KEYBOARD_TYPE = new YbDivKitCustomBlockTypes("NUMBER_KEYBOARD_TYPE", 7, "number_keyboard");
    public static final YbDivKitCustomBlockTypes GRADIENT_PILL_TYPE = new YbDivKitCustomBlockTypes("GRADIENT_PILL_TYPE", 8, "gradient_pill");

    private static final /* synthetic */ YbDivKitCustomBlockTypes[] $values() {
        return new YbDivKitCustomBlockTypes[]{SPOILER_BLOCK_TYPE, SPINNER_BLOCK_TYPE, SWITCH_BLOCK_TYPE, TICKER_BLOCK_TYPE, PLUS_BADGE_BLOCK_TYPE, COLLAPSING_TOOLBAR_LAYOUT_TYPE, CARD_INPUT_TYPE, NUMBER_KEYBOARD_TYPE, GRADIENT_PILL_TYPE};
    }

    static {
        YbDivKitCustomBlockTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YbDivKitCustomBlockTypes(String str, int i, String str2) {
        this.type = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YbDivKitCustomBlockTypes valueOf(String str) {
        return (YbDivKitCustomBlockTypes) Enum.valueOf(YbDivKitCustomBlockTypes.class, str);
    }

    public static YbDivKitCustomBlockTypes[] values() {
        return (YbDivKitCustomBlockTypes[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
