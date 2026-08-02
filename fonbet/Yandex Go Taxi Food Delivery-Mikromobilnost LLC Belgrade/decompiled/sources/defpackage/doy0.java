package defpackage;

import androidx.compose.foundation.text.Handle;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class doy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Handle.values().length];
        try {
            iArr[Handle.Cursor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Handle.SelectionStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Handle.SelectionEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
