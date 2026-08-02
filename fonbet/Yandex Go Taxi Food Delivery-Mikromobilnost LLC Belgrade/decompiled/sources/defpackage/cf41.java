package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class cf41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayWebCollectContactsParams.PageTheme.values().length];
        try {
            iArr[PlusPayWebCollectContactsParams.PageTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayWebCollectContactsParams.PageTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
