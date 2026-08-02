package defpackage;

import com.yandex.plus.pay.common.api.model.PlusPayPlatform;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class mbd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayPlatform.values().length];
        try {
            iArr[PlusPayPlatform.ANDROID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayPlatform.ANDROID_TV.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
