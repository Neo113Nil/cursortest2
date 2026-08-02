package defpackage;

import com.yandex.go.safety.center.share.notification.ShareStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class gkr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShareStatus.values().length];
        try {
            iArr[ShareStatus.PREPARING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShareStatus.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
