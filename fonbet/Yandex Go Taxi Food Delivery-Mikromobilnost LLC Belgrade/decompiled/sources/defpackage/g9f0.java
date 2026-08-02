package defpackage;

import com.yandex.plus.core.strings.PlusSdkBrandType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class g9f0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusSdkBrandType.values().length];
        try {
            iArr[PlusSdkBrandType.YANDEX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusSdkBrandType.YANGO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
