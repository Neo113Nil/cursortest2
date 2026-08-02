package defpackage;

import com.yandex.go.plus.api.model.PlusBrandType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ij41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusBrandType.values().length];
        try {
            iArr[PlusBrandType.YANDEX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusBrandType.YANGO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusBrandType.HAYYA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
