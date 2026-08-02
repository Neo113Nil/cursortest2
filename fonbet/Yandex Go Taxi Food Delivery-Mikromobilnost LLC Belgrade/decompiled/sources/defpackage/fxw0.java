package defpackage;

import androidx.compose.ui.input.pointer.PointerEventPass;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class fxw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointerEventPass.values().length];
        try {
            iArr[PointerEventPass.Initial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointerEventPass.Final.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointerEventPass.Main.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
