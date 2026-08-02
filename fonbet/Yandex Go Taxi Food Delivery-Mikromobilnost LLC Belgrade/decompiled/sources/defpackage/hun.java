package defpackage;

import androidx.emoji2.emojipicker.ItemType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class hun {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ItemType.values().length];
        try {
            iArr[ItemType.CATEGORY_TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ItemType.PLACEHOLDER_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
