package defpackage;

import androidx.compose.material3.SheetValue;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class hsm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SheetValue.values().length];
        try {
            iArr[SheetValue.Hidden.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SheetValue.Expanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SheetValue.PartiallyExpanded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
