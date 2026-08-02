package androidx.emoji2.emojipicker;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EmojiPickerPopupView$Companion$Layout.values().length];
        try {
            iArr[EmojiPickerPopupView$Companion$Layout.FLAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EmojiPickerPopupView$Companion$Layout.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EmojiPickerPopupView$Companion$Layout.SQUARE_WITH_SKIN_TONE_CIRCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EmojiPickerPopupView$Companion$Layout.BIDIRECTIONAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
