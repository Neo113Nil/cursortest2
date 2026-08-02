package defpackage;

import com.yandex.plus.ui.core.theme.PlusTheme;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d4v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusTheme.values().length];
        try {
            iArr[PlusTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusTheme.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
