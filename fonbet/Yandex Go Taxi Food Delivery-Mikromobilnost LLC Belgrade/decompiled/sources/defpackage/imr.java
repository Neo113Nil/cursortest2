package defpackage;

import com.yandex.payment.sdk.transportcards.ui.FlexDefaultTheme;
import com.yandex.payment.sdk.ui.DefaultTheme;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class imr {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DefaultTheme.values().length];
        try {
            iArr[DefaultTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DefaultTheme.SYSTEM_DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[FlexDefaultTheme.values().length];
        try {
            iArr2[FlexDefaultTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FlexDefaultTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
