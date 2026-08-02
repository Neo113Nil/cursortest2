package defpackage;

import com.yandex.xplat.common.Encoding;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class pbh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Encoding.values().length];
        try {
            iArr[Encoding.Base64.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
