package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class fbm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayoutDirection.values().length];
        try {
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
