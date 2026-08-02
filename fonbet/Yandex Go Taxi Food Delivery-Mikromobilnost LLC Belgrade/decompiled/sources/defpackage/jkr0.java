package defpackage;

import com.yandex.go.safety.center.share.notification.ShareStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class jkr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShareStatus.values().length];
        try {
            iArr[ShareStatus.PREPARING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShareStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShareStatus.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShareStatus.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ShareStatus.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
