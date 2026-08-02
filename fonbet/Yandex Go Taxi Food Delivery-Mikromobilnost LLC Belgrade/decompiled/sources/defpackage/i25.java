package defpackage;

import com.yandex.fintechsdk.entities.theme.Theme;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class i25 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Theme.values().length];
        try {
            iArr[Theme.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Theme.NIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
