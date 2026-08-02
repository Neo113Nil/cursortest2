package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class mfh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkMethod.values().length];
        try {
            iArr[NetworkMethod.get.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkMethod.post.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
