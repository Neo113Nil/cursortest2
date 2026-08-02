package androidx.emoji2.emojipicker;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"androidx/emoji2/emojipicker/EmojiPickerPopupView$Companion$Layout", "", "Landroidx/emoji2/emojipicker/EmojiPickerPopupView$Companion$Layout;", "FLAT", "SQUARE", "SQUARE_WITH_SKIN_TONE_CIRCLE", "BIDIRECTIONAL", "emoji2-emojipicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmojiPickerPopupView$Companion$Layout {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EmojiPickerPopupView$Companion$Layout[] $VALUES;
    public static final EmojiPickerPopupView$Companion$Layout BIDIRECTIONAL;
    public static final EmojiPickerPopupView$Companion$Layout FLAT;
    public static final EmojiPickerPopupView$Companion$Layout SQUARE;
    public static final EmojiPickerPopupView$Companion$Layout SQUARE_WITH_SKIN_TONE_CIRCLE;

    static {
        EmojiPickerPopupView$Companion$Layout emojiPickerPopupView$Companion$Layout = new EmojiPickerPopupView$Companion$Layout("FLAT", 0);
        FLAT = emojiPickerPopupView$Companion$Layout;
        EmojiPickerPopupView$Companion$Layout emojiPickerPopupView$Companion$Layout2 = new EmojiPickerPopupView$Companion$Layout("SQUARE", 1);
        SQUARE = emojiPickerPopupView$Companion$Layout2;
        EmojiPickerPopupView$Companion$Layout emojiPickerPopupView$Companion$Layout3 = new EmojiPickerPopupView$Companion$Layout("SQUARE_WITH_SKIN_TONE_CIRCLE", 2);
        SQUARE_WITH_SKIN_TONE_CIRCLE = emojiPickerPopupView$Companion$Layout3;
        EmojiPickerPopupView$Companion$Layout emojiPickerPopupView$Companion$Layout4 = new EmojiPickerPopupView$Companion$Layout("BIDIRECTIONAL", 3);
        BIDIRECTIONAL = emojiPickerPopupView$Companion$Layout4;
        EmojiPickerPopupView$Companion$Layout[] emojiPickerPopupView$Companion$LayoutArr = {emojiPickerPopupView$Companion$Layout, emojiPickerPopupView$Companion$Layout2, emojiPickerPopupView$Companion$Layout3, emojiPickerPopupView$Companion$Layout4};
        $VALUES = emojiPickerPopupView$Companion$LayoutArr;
        $ENTRIES = kotlin.enums.a.a(emojiPickerPopupView$Companion$LayoutArr);
    }

    public static EmojiPickerPopupView$Companion$Layout valueOf(String str) {
        return (EmojiPickerPopupView$Companion$Layout) Enum.valueOf(EmojiPickerPopupView$Companion$Layout.class, str);
    }

    public static EmojiPickerPopupView$Companion$Layout[] values() {
        return (EmojiPickerPopupView$Companion$Layout[]) $VALUES.clone();
    }
}
