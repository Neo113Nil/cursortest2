package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class mh4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayoutDirection.values().length];
        try {
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
